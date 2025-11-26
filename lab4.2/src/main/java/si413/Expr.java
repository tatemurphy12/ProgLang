package si413;

import java.util.List;
import java.util.ArrayList;

/** AST nodes for expressions.
 * Expressions can be evaluated and return a value.
 */
public interface Expr {
    /** Evaluates this AST node and returns the result. */
    Value eval(Interpreter interp);

    record StringLit(String value) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return new Value.Str(value);
        }
    }

    record Param(String name, String type) implements Expr
    {
        public Value eval(Interpreter interp)
        {
            return new Value.Str(name);
        }
    }

    record Arg(Expr arg, String type) implements Expr
	{
		//change so that it works basically
		//also change all function calls
		public Value eval(Interpreter interp)
		{
			return arg.eval(interp);
		}
	}


    record ExprList(List<Expr> children) implements Expr
    {

        public Value eval(Interpreter interp)
        {
            List<Value> valList = new ArrayList<>();
            for (Expr child : children)
            {
				valList.add(child.eval(interp));
            }
            return new Value.ValueList(valList);

        }
    }

    record Var(String name) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return interp.getEnv().lookup(name);
        }
    }

    record FuncVar(String name) implements Expr
    {
	    @Override
	    public Value eval(Interpreter interp)
	    {
		    return new Value.Str(name);
	    }
    }

    record Concat(Expr lhs, Expr rhs) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            String lval = lhs.eval(interp).str();
            String rval = rhs.eval(interp).str();
            return new Value.Str(lval + rval);
        }
    }

    record Reverse(Expr child) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            String childVal = child.eval(interp).str();
            return new Value.Str(new StringBuilder(childVal).reverse().toString());
        }
    }

    record Input() implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return new Value.Str(interp.readInputLine());
        }
    }

    record BInput(String trueString) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return new Value.Bool(interp.readInputLine().equals(trueString));
        }
    }

    // ******* AST node types for expressions that return a Boolean ******** //

    record BoolLit(Boolean value) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return new Value.Bool(value);
        }
    }

    record StrLess(Expr lhs, Expr rhs) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            String lval = lhs.eval(interp).str();
            String rval = rhs.eval(interp).str();
            return new Value.Bool(lval.compareTo(rval) < 0);
        }
    }

    record Contains(Expr lhs, Expr rhs) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            String lval = lhs.eval(interp).str();
            String rval = rhs.eval(interp).str();
            return new Value.Bool(lval.contains(rval));
        }
    }

    record And(Expr lhs, Expr rhs) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            Value left = lhs.eval(interp);
            if (left.bool()) return rhs.eval(interp);
            else return left;
        }
    }

    record Or(Expr lhs, Expr rhs) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            Value left = lhs.eval(interp);
            if (left.bool()) return left;
            else return rhs.eval(interp);
        }
    }

    record Not(Expr child) implements Expr {
        @Override
        public Value eval(Interpreter interp) {
            return new Value.Bool(!child.eval(interp).bool());
        }
    }

	record FunCall(Expr name, Expr.ExprList args) implements Expr
    {
      @Override
      public Value eval(Interpreter interp)
      {
			Value fname = name.eval(interp);
			Value closure;
			if (fname instanceof Value.Str)
				closure = interp.getEnv().lookup(fname.str());
			else
				closure = fname;
			Frame fFrame = new Frame();
			Frame parentEnv = closure.getDefinedEnv();
			fFrame.setParent(parentEnv);
			Value vList = args.eval(interp);
            List<String> parameters = closure.parameters();
			interp.addFrame(fFrame);
			List<Value> argList = vList.getList();
			for (int i = 0; i < argList.size(); i++)
			{
				fFrame.assign(parameters.get(i), argList.get(i));
				//System.out.println("Arg");
				//System.out.println(argList.get(i));
			}
			Stmt.Block code = closure.functionCode();
			code.exec(interp);
			Expr retVal = closure.returnValue();
			Value v = retVal.eval(interp);
			interp.removeFrame();
			return v;
      }
    }

	record FunFunCall(Expr name, Expr.ExprList args) implements Expr
    {
      @Override
      public Value eval(Interpreter interp)
      {
			Value fname = name.eval(interp);
			Value closure;
			if (fname instanceof Value.Str)
				closure = interp.getEnv().lookup(fname.str());
			else
				closure = fname;
			Frame fFrame = new Frame();
			Frame parentEnv = closure.getDefinedEnv();
			fFrame.setParent(parentEnv);
			Value vList = args.eval(interp);
            List<String> parameters = closure.parameters();
			List<Value> argList = vList.getList();
			interp.addFrame(fFrame);
			for (int i = 0; i < argList.size(); i++)
			{
				fFrame.assign(parameters.get(i), argList.get(i));
				//System.out.println("Arg");
				//System.out.println(argList.get(i));
			}
			Stmt.Block code = closure.functionCode();
			code.exec(interp);
			Expr retVal = closure.returnValue(); 
			Value v = retVal.eval(interp);
			if (retVal instanceof Expr.FuncVar)
			{
				Value innerClosure = interp.getEnv().lookup(v.str());
				interp.removeFrame();
				return innerClosure;
			}
			interp.removeFrame();
			return v;
      }
    }

}
