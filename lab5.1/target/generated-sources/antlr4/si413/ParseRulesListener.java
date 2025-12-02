// Generated from si413/ParseRules.g4 by ANTLR 4.13.1
package si413;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParseRules}.
 */
public interface ParseRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code RegProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void enterRegProg(ParseRules.RegProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 */
	void exitRegProg(ParseRules.RegProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegStmtList}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterRegStmtList(ParseRules.RegStmtListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegStmtList}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitRegStmtList(ParseRules.RegStmtListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(ParseRules.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(ParseRules.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStr}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStr(ParseRules.AssignStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStr}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStr(ParseRules.AssignStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignBool}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignBool(ParseRules.AssignBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignBool}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignBool(ParseRules.AssignBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignFun(ParseRules.AssignFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignFun(ParseRules.AssignFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignNum}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignNum(ParseRules.AssignNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignNum}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignNum(ParseRules.AssignNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStr}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStr(ParseRules.PrintStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStr}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStr(ParseRules.PrintStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintBool}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintBool(ParseRules.PrintBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintBool}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintBool(ParseRules.PrintBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintNum}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintNum(ParseRules.PrintNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintNum}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintNum(ParseRules.PrintNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(ParseRules.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(ParseRules.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(ParseRules.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(ParseRules.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefStrFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDefStrFun(ParseRules.DefStrFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefStrFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDefStrFun(ParseRules.DefStrFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefBoolFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDefBoolFun(ParseRules.DefBoolFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefBoolFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDefBoolFun(ParseRules.DefBoolFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefVoidFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDefVoidFun(ParseRules.DefVoidFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefVoidFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDefVoidFun(ParseRules.DefVoidFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefFunFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDefFunFun(ParseRules.DefFunFunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefFunFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDefFunFun(ParseRules.DefFunFunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidFunCall}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunCall(ParseRules.VoidFunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidFunCall}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunCall(ParseRules.VoidFunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegParam}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 */
	void enterRegParam(ParseRules.RegParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegParam}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 */
	void exitRegParam(ParseRules.RegParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyParam}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 */
	void enterEmptyParam(ParseRules.EmptyParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyParam}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 */
	void exitEmptyParam(ParseRules.EmptyParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolParam}
	 * labeled alternative in {@link ParseRules#param}.
	 * @param ctx the parse tree
	 */
	void enterBoolParam(ParseRules.BoolParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolParam}
	 * labeled alternative in {@link ParseRules#param}.
	 * @param ctx the parse tree
	 */
	void exitBoolParam(ParseRules.BoolParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrParam}
	 * labeled alternative in {@link ParseRules#param}.
	 * @param ctx the parse tree
	 */
	void enterStrParam(ParseRules.StrParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrParam}
	 * labeled alternative in {@link ParseRules#param}.
	 * @param ctx the parse tree
	 */
	void exitStrParam(ParseRules.StrParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunParam}
	 * labeled alternative in {@link ParseRules#param}.
	 * @param ctx the parse tree
	 */
	void enterFunParam(ParseRules.FunParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunParam}
	 * labeled alternative in {@link ParseRules#param}.
	 * @param ctx the parse tree
	 */
	void exitFunParam(ParseRules.FunParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegArg}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 */
	void enterRegArg(ParseRules.RegArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegArg}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 */
	void exitRegArg(ParseRules.RegArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyArg}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArg(ParseRules.EmptyArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyArg}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArg(ParseRules.EmptyArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrArg}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 */
	void enterStrArg(ParseRules.StrArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrArg}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 */
	void exitStrArg(ParseRules.StrArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolArg}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 */
	void enterBoolArg(ParseRules.BoolArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolArg}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 */
	void exitBoolArg(ParseRules.BoolArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunArg}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 */
	void enterFunArg(ParseRules.FunArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunArg}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 */
	void exitFunArg(ParseRules.FunArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrIdentity}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void enterStrIdentity(ParseRules.StrIdentityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrIdentity}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void exitStrIdentity(ParseRules.StrIdentityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumToStr}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void enterNumToStr(ParseRules.NumToStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumToStr}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void exitNumToStr(ParseRules.NumToStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Input}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void enterInput(ParseRules.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void exitInput(ParseRules.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Reverse}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void enterReverse(ParseRules.ReverseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Reverse}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void exitReverse(ParseRules.ReverseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Concat}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void enterConcat(ParseRules.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Concat}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void exitConcat(ParseRules.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void enterStrLit(ParseRules.StrLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void exitStrLit(ParseRules.StrLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrVar}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void enterStrVar(ParseRules.StrVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrVar}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void exitStrVar(ParseRules.StrVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrFunCall}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void enterStrFunCall(ParseRules.StrFunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrFunCall}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 */
	void exitStrFunCall(ParseRules.StrFunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ParseRules.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ParseRules.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void enterOr(ParseRules.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void exitOr(ParseRules.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void enterNot(ParseRules.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void exitNot(ParseRules.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Contains}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void enterContains(ParseRules.ContainsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Contains}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void exitContains(ParseRules.ContainsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(ParseRules.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(ParseRules.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumLessThan}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void enterNumLessThan(ParseRules.NumLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumLessThan}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void exitNumLessThan(ParseRules.NumLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void enterBoolVar(ParseRules.BoolVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void exitBoolVar(ParseRules.BoolVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void enterBoolLit(ParseRules.BoolLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void exitBoolLit(ParseRules.BoolLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolIdentity}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void enterBoolIdentity(ParseRules.BoolIdentityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolIdentity}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void exitBoolIdentity(ParseRules.BoolIdentityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolFunCall}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void enterBoolFunCall(ParseRules.BoolFunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolFunCall}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 */
	void exitBoolFunCall(ParseRules.BoolFunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumInput}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void enterNumInput(ParseRules.NumInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumInput}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void exitNumInput(ParseRules.NumInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ParseRules.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ParseRules.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(ParseRules.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(ParseRules.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(ParseRules.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(ParseRules.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumVar}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void enterNumVar(ParseRules.NumVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumVar}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void exitNumVar(ParseRules.NumVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumLit}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void enterNumLit(ParseRules.NumLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumLit}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void exitNumLit(ParseRules.NumLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumIdentity}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void enterNumIdentity(ParseRules.NumIdentityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumIdentity}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 */
	void exitNumIdentity(ParseRules.NumIdentityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncName}
	 * labeled alternative in {@link ParseRules#funcEx}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(ParseRules.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncName}
	 * labeled alternative in {@link ParseRules#funcEx}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(ParseRules.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunFunCall}
	 * labeled alternative in {@link ParseRules#funcEx}.
	 * @param ctx the parse tree
	 */
	void enterFunFunCall(ParseRules.FunFunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunFunCall}
	 * labeled alternative in {@link ParseRules#funcEx}.
	 * @param ctx the parse tree
	 */
	void exitFunFunCall(ParseRules.FunFunCallContext ctx);
}