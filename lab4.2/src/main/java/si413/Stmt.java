package si413;

import java.util.List;

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
			System.out.println("Executing stmtList");
            for (Stmt child : children) {
				//System.out.println(child.toString());
                child.exec(interp);
            }
            System.out.println();
			//interp.getEnv().printBinds();
            System.out.println();
        }
    }

	record Param(String name, String type) implements Stmt
	{
		public void exec(Interpreter interp)
		{
			interp.getEnv().addParam(name);
          	interp.getEnv().printParams();
		}
	}
	
	record Arg(Expr arg, String type) implements Stmt
	{
		public void exec(Interpreter interp)
		{
			//will have to change later but its fine for now because we're in the global frame
			Frame currentEnv = interp.getEnv();
			//we read args sequentially, so pop the corresponding parameter
			String cParam = currentEnv.getParam();
			//we then need to reassign the value passed in the arg
			//to the parameter its associated with, in the function Frame
			Value argVal = arg.eval(interp);
            System.out.println(cParam + ": " + argVal.toString());
			currentEnv.assign(cParam, argVal);
			//now when the code is run in the function call, the code referencing the 
			//parameters should work the same as if it had referenced the args
		}
	}

    record ExprStmt(Expr child) implements Stmt {
        @Override
        public void exec(Interpreter interp) {
            child.eval(interp);
        }
    }

	record FuncDef(String fname, Stmt.Block params, Stmt.Block code, Expr retVal) implements Stmt
	{
		public void exec(Interpreter interp)
		{
			params.exec(interp);
			Value closure = new Value.Closure(interp.getEnv(), code, retVal);
			interp.getEnv().assign(fname, closure);
			System.out.print("Defined " + fname);
		}
	}

    record VoidFuncDef(String fname, Stmt.Block params, Stmt.Block code) implements Stmt {
        @Override
        public void exec(Interpreter interp)
        {
			params.exec(interp);
            Value closure = new Value.Closure(interp.getEnv(), code, null);
            interp.getEnv().assign(fname, closure);
        }
    }

    record VoidFunCall(Expr name, Stmt.Block args) implements Stmt
    {
      @Override
      public void exec(Interpreter interp)
      {
			//Frame fFrame = new Frame();
			//interp.addFrame(fFrame);
	    	args.exec(interp);
			Value fname = name.eval(interp);
			System.out.println("Calling "+ fname);			
			Value code = interp.getEnv().lookup(fname.str());
			Stmt.Block b = code.functionCode();
			b.exec(interp);
			//interp.removeFrame();
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
