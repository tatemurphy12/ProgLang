package si413;

import java.util.*;

/** AST nodes for statements.
 * Statements can be executed but do not return a value.
 */
public interface Stmt {
    /** Executes this AST node in an interpreter. */
    void exec(Interpreter interp);

    // ******** AST Node types for statements ******** //

    record Block(List<Stmt> children) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
			//System.out.println("Executing stmtList");
            for (Stmt child : children) {
				//System.out.println(child.toString());
                child.exec(interp);
            }
            //System.out.println();
			//interp.getEnv().printBinds();
            //System.out.println();
        }
    }


    record ExprStmt(Expr child) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            child.eval(interp);
        }
    }

	record FuncDef(String fname, Expr.ExprList params, Stmt.Block code, Expr retVal) implements Stmt
	{
		public void exec(Interpreter interp)
		{
            List<String> parameters = new ArrayList<>();
            Value intermed = params.eval(interp);
            List<Value> hooyah = intermed.getList();
            for (Value i : hooyah)
            {
			    parameters.add(i.str());
				//System.out.println("param: "+i.str());
            }
			Value closure = new Value.Closure(interp.getEnv(), parameters, code, retVal, interp.getEnv());
			interp.getEnv().assign(fname, closure);
			//System.out.print("Defined " + fname);
		}
	}

    record VoidFuncDef(String fname, Expr.ExprList params, Stmt.Block code) implements Stmt {
        @Override
        public void exec(Interpreter interp)
        {
            List<String> parameters = new ArrayList<>();
            Value intermed = params.eval(interp);
            List<Value> hooyah = intermed.getList();
            for (Value i : hooyah)
            {
			    parameters.add(i.str());
				//System.out.println(i.str());
            }
            Value closure = new Value.Closure(interp.getEnv(), parameters, code, null, interp.getEnv());
            interp.getEnv().assign(fname, closure);
        }
    }

    record VoidFunCall(Expr name, Expr.ExprList args) implements Stmt
    {
      @Override
      public void exec(Interpreter interp)
      {			
			Value fname = name.eval(interp);
			Value closure = interp.getEnv().lookup(fname.str());
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
			}
			Stmt.Block code = closure.functionCode();
			code.exec(interp);
			interp.removeFrame();
      }
    }

    record Assign(String name, Expr child) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            Value val = child.eval(interp);
            interp.getEnv().assign(name, val);
			//System.out.println("Assigned "+ name);
        }
    }

    record Print(Expr child) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            System.out.println(child.eval(interp));
        }
    }

    record IfElse(Expr condition, Stmt ifBody, Stmt elseBody) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            if (condition.eval(interp).bool()) {
                ifBody.exec(interp);
            }
            else {
                elseBody.exec(interp);
            }
        }
    }

    record While(Expr condition, Stmt body) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            while (condition.eval(interp).bool()) {
                body.exec(interp);
            }
        }
    }
}
