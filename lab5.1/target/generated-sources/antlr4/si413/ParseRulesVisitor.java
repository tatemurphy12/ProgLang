// Generated from si413/ParseRules.g4 by ANTLR 4.13.1
package si413;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParseRules}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParseRulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code RegProg}
	 * labeled alternative in {@link ParseRules#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegProg(ParseRules.RegProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegStmtList}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegStmtList(ParseRules.RegStmtListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link ParseRules#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(ParseRules.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStr}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStr(ParseRules.AssignStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignBool}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignBool(ParseRules.AssignBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignFun(ParseRules.AssignFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignNum}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignNum(ParseRules.AssignNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStr}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStr(ParseRules.PrintStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintBool}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintBool(ParseRules.PrintBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintNum}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintNum(ParseRules.PrintNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(ParseRules.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(ParseRules.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefStrFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefStrFun(ParseRules.DefStrFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefBoolFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefBoolFun(ParseRules.DefBoolFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefVoidFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefVoidFun(ParseRules.DefVoidFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefFunFun}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFunFun(ParseRules.DefFunFunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidFunCall}
	 * labeled alternative in {@link ParseRules#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunCall(ParseRules.VoidFunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegParam}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegParam(ParseRules.RegParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyParam}
	 * labeled alternative in {@link ParseRules#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyParam(ParseRules.EmptyParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolParam}
	 * labeled alternative in {@link ParseRules#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolParam(ParseRules.BoolParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrParam}
	 * labeled alternative in {@link ParseRules#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrParam(ParseRules.StrParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunParam}
	 * labeled alternative in {@link ParseRules#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunParam(ParseRules.FunParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegArg}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegArg(ParseRules.RegArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyArg}
	 * labeled alternative in {@link ParseRules#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArg(ParseRules.EmptyArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrArg}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrArg(ParseRules.StrArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolArg}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolArg(ParseRules.BoolArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunArg}
	 * labeled alternative in {@link ParseRules#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunArg(ParseRules.FunArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrIdentity}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrIdentity(ParseRules.StrIdentityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumToStr}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumToStr(ParseRules.NumToStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(ParseRules.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Reverse}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReverse(ParseRules.ReverseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Concat}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(ParseRules.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrLit}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLit(ParseRules.StrLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrVar}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrVar(ParseRules.StrVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrFunCall}
	 * labeled alternative in {@link ParseRules#strEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrFunCall(ParseRules.StrFunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ParseRules.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ParseRules.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ParseRules.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Contains}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContains(ParseRules.ContainsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(ParseRules.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumLessThan}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumLessThan(ParseRules.NumLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVar}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVar(ParseRules.BoolVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLit(ParseRules.BoolLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolIdentity}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolIdentity(ParseRules.BoolIdentityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolFunCall}
	 * labeled alternative in {@link ParseRules#boolEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFunCall(ParseRules.BoolFunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumInput}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumInput(ParseRules.NumInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ParseRules.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(ParseRules.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(ParseRules.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumVar}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumVar(ParseRules.NumVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumLit}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumLit(ParseRules.NumLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumIdentity}
	 * labeled alternative in {@link ParseRules#numEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumIdentity(ParseRules.NumIdentityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncName}
	 * labeled alternative in {@link ParseRules#funcEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncName(ParseRules.FuncNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunFunCall}
	 * labeled alternative in {@link ParseRules#funcEx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunFunCall(ParseRules.FunFunCallContext ctx);
}