// Generated from si413/ParseRules.g4 by ANTLR 4.13.1
package si413;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParseRules extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, PRINT=2, TYPESTR=3, TYPEBOOL=4, TYPEVOID=5, TYPEFUNC=6, DEF=7, 
		RETURN=8, WHILE=9, IF=10, CONCAT=11, REV=12, IN=13, CON=14, LT=15, AND=16, 
		OR=17, NOT=18, OPENEX=19, CLOSEX=20, BOOL=21, STR=22, ID=23, TYPENUM=24, 
		NUM=25, NUMLT=26, NUMIN=27, ADD=28, SUB=29, MUL=30, TOSTR=31;
	public static final int
		RULE_prog = 0, RULE_stmtList = 1, RULE_stmt = 2, RULE_paramList = 3, RULE_param = 4, 
		RULE_argList = 5, RULE_arg = 6, RULE_strEx = 7, RULE_boolEx = 8, RULE_numEx = 9, 
		RULE_funcEx = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmtList", "stmt", "paramList", "param", "argList", "arg", "strEx", 
			"boolEx", "numEx", "funcEx"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "PRINT", "TYPESTR", "TYPEBOOL", "TYPEVOID", "TYPEFUNC", 
			"DEF", "RETURN", "WHILE", "IF", "CONCAT", "REV", "IN", "CON", "LT", "AND", 
			"OR", "NOT", "OPENEX", "CLOSEX", "BOOL", "STR", "ID", "TYPENUM", "NUM", 
			"NUMLT", "NUMIN", "ADD", "SUB", "MUL", "TOSTR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParseRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParseRules(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegProgContext extends ProgContext {
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ParseRules.EOF, 0); }
		public RegProgContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterRegProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitRegProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitRegProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			_localctx = new RegProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			stmtList();
			setState(23);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtListContext extends ParserRuleContext {
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
	 
		public StmtListContext() { }
		public void copyFrom(StmtListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegStmtListContext extends StmtListContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public RegStmtListContext(StmtListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterRegStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitRegStmtList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitRegStmtList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStmtContext extends StmtListContext {
		public EmptyStmtContext(StmtListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitEmptyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmtList);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
			case PRINT:
			case DEF:
			case WHILE:
			case IF:
			case ID:
				_localctx = new RegStmtListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				stmt();
				setState(26);
				stmtList();
				}
				break;
			case EOF:
			case RETURN:
			case CLOSEX:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseContext extends StmtContext {
		public TerminalNode IF() { return getToken(ParseRules.IF, 0); }
		public List<TerminalNode> OPENEX() { return getTokens(ParseRules.OPENEX); }
		public TerminalNode OPENEX(int i) {
			return getToken(ParseRules.OPENEX, i);
		}
		public BoolExContext boolEx() {
			return getRuleContext(BoolExContext.class,0);
		}
		public List<StmtListContext> stmtList() {
			return getRuleContexts(StmtListContext.class);
		}
		public StmtListContext stmtList(int i) {
			return getRuleContext(StmtListContext.class,i);
		}
		public List<TerminalNode> CLOSEX() { return getTokens(ParseRules.CLOSEX); }
		public TerminalNode CLOSEX(int i) {
			return getToken(ParseRules.CLOSEX, i);
		}
		public IfElseContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignNumContext extends StmtContext {
		public TerminalNode ASSIGN() { return getToken(ParseRules.ASSIGN, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public TerminalNode TYPENUM() { return getToken(ParseRules.TYPENUM, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public NumExContext numEx() {
			return getRuleContext(NumExContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public AssignNumContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterAssignNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitAssignNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitAssignNum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefStrFunContext extends StmtContext {
		public TerminalNode DEF() { return getToken(ParseRules.DEF, 0); }
		public TerminalNode TYPESTR() { return getToken(ParseRules.TYPESTR, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public List<TerminalNode> OPENEX() { return getTokens(ParseRules.OPENEX); }
		public TerminalNode OPENEX(int i) {
			return getToken(ParseRules.OPENEX, i);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<TerminalNode> CLOSEX() { return getTokens(ParseRules.CLOSEX); }
		public TerminalNode CLOSEX(int i) {
			return getToken(ParseRules.CLOSEX, i);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ParseRules.RETURN, 0); }
		public StrExContext strEx() {
			return getRuleContext(StrExContext.class,0);
		}
		public DefStrFunContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterDefStrFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitDefStrFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitDefStrFun(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintNumContext extends StmtContext {
		public TerminalNode PRINT() { return getToken(ParseRules.PRINT, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public TerminalNode TYPENUM() { return getToken(ParseRules.TYPENUM, 0); }
		public NumExContext numEx() {
			return getRuleContext(NumExContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public PrintNumContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterPrintNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitPrintNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitPrintNum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignFunContext extends StmtContext {
		public TerminalNode ASSIGN() { return getToken(ParseRules.ASSIGN, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public TerminalNode TYPEFUNC() { return getToken(ParseRules.TYPEFUNC, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public FuncExContext funcEx() {
			return getRuleContext(FuncExContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public AssignFunContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterAssignFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitAssignFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitAssignFun(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignBoolContext extends StmtContext {
		public TerminalNode ASSIGN() { return getToken(ParseRules.ASSIGN, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public TerminalNode TYPEBOOL() { return getToken(ParseRules.TYPEBOOL, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public BoolExContext boolEx() {
			return getRuleContext(BoolExContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public AssignBoolContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterAssignBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitAssignBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitAssignBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStrContext extends StmtContext {
		public TerminalNode PRINT() { return getToken(ParseRules.PRINT, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public TerminalNode TYPESTR() { return getToken(ParseRules.TYPESTR, 0); }
		public StrExContext strEx() {
			return getRuleContext(StrExContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public PrintStrContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterPrintStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitPrintStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitPrintStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefFunFunContext extends StmtContext {
		public TerminalNode DEF() { return getToken(ParseRules.DEF, 0); }
		public TerminalNode TYPEFUNC() { return getToken(ParseRules.TYPEFUNC, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public List<TerminalNode> OPENEX() { return getTokens(ParseRules.OPENEX); }
		public TerminalNode OPENEX(int i) {
			return getToken(ParseRules.OPENEX, i);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<TerminalNode> CLOSEX() { return getTokens(ParseRules.CLOSEX); }
		public TerminalNode CLOSEX(int i) {
			return getToken(ParseRules.CLOSEX, i);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ParseRules.RETURN, 0); }
		public FuncExContext funcEx() {
			return getRuleContext(FuncExContext.class,0);
		}
		public DefFunFunContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterDefFunFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitDefFunFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitDefFunFun(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidFunCallContext extends StmtContext {
		public FuncExContext funcEx() {
			return getRuleContext(FuncExContext.class,0);
		}
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public VoidFunCallContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterVoidFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitVoidFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitVoidFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefVoidFunContext extends StmtContext {
		public TerminalNode DEF() { return getToken(ParseRules.DEF, 0); }
		public TerminalNode TYPEVOID() { return getToken(ParseRules.TYPEVOID, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public List<TerminalNode> OPENEX() { return getTokens(ParseRules.OPENEX); }
		public TerminalNode OPENEX(int i) {
			return getToken(ParseRules.OPENEX, i);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<TerminalNode> CLOSEX() { return getTokens(ParseRules.CLOSEX); }
		public TerminalNode CLOSEX(int i) {
			return getToken(ParseRules.CLOSEX, i);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public DefVoidFunContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterDefVoidFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitDefVoidFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitDefVoidFun(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintBoolContext extends StmtContext {
		public TerminalNode PRINT() { return getToken(ParseRules.PRINT, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public TerminalNode TYPEBOOL() { return getToken(ParseRules.TYPEBOOL, 0); }
		public BoolExContext boolEx() {
			return getRuleContext(BoolExContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public PrintBoolContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterPrintBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitPrintBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitPrintBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends StmtContext {
		public TerminalNode WHILE() { return getToken(ParseRules.WHILE, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public BoolExContext boolEx() {
			return getRuleContext(BoolExContext.class,0);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public WhileLoopContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStrContext extends StmtContext {
		public TerminalNode ASSIGN() { return getToken(ParseRules.ASSIGN, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public TerminalNode TYPESTR() { return getToken(ParseRules.TYPESTR, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public StrExContext strEx() {
			return getRuleContext(StrExContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public AssignStrContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterAssignStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitAssignStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitAssignStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefBoolFunContext extends StmtContext {
		public TerminalNode DEF() { return getToken(ParseRules.DEF, 0); }
		public TerminalNode TYPEBOOL() { return getToken(ParseRules.TYPEBOOL, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public List<TerminalNode> OPENEX() { return getTokens(ParseRules.OPENEX); }
		public TerminalNode OPENEX(int i) {
			return getToken(ParseRules.OPENEX, i);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<TerminalNode> CLOSEX() { return getTokens(ParseRules.CLOSEX); }
		public TerminalNode CLOSEX(int i) {
			return getToken(ParseRules.CLOSEX, i);
		}
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ParseRules.RETURN, 0); }
		public BoolExContext boolEx() {
			return getRuleContext(BoolExContext.class,0);
		}
		public DefBoolFunContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterDefBoolFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitDefBoolFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitDefBoolFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AssignStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(ASSIGN);
				setState(32);
				match(OPENEX);
				setState(33);
				match(TYPESTR);
				setState(34);
				match(ID);
				setState(35);
				strEx();
				setState(36);
				match(CLOSEX);
				}
				break;
			case 2:
				_localctx = new AssignBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(ASSIGN);
				setState(39);
				match(OPENEX);
				setState(40);
				match(TYPEBOOL);
				setState(41);
				match(ID);
				setState(42);
				boolEx();
				setState(43);
				match(CLOSEX);
				}
				break;
			case 3:
				_localctx = new AssignFunContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(ASSIGN);
				setState(46);
				match(OPENEX);
				setState(47);
				match(TYPEFUNC);
				setState(48);
				match(ID);
				setState(49);
				funcEx(0);
				setState(50);
				match(CLOSEX);
				}
				break;
			case 4:
				_localctx = new AssignNumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				match(ASSIGN);
				setState(53);
				match(OPENEX);
				setState(54);
				match(TYPENUM);
				setState(55);
				match(ID);
				setState(56);
				numEx();
				setState(57);
				match(CLOSEX);
				}
				break;
			case 5:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				match(PRINT);
				setState(60);
				match(OPENEX);
				setState(61);
				match(TYPESTR);
				setState(62);
				strEx();
				setState(63);
				match(CLOSEX);
				}
				break;
			case 6:
				_localctx = new PrintBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(PRINT);
				setState(66);
				match(OPENEX);
				setState(67);
				match(TYPEBOOL);
				setState(68);
				boolEx();
				setState(69);
				match(CLOSEX);
				}
				break;
			case 7:
				_localctx = new PrintNumContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				match(PRINT);
				setState(72);
				match(OPENEX);
				setState(73);
				match(TYPENUM);
				setState(74);
				numEx();
				setState(75);
				match(CLOSEX);
				}
				break;
			case 8:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				match(IF);
				setState(78);
				match(OPENEX);
				setState(79);
				boolEx();
				setState(80);
				match(OPENEX);
				setState(81);
				stmtList();
				setState(82);
				match(CLOSEX);
				setState(83);
				match(OPENEX);
				setState(84);
				stmtList();
				setState(85);
				match(CLOSEX);
				setState(86);
				match(CLOSEX);
				}
				break;
			case 9:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				match(WHILE);
				setState(89);
				match(OPENEX);
				setState(90);
				boolEx();
				setState(91);
				stmtList();
				setState(92);
				match(CLOSEX);
				}
				break;
			case 10:
				_localctx = new DefStrFunContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(94);
				match(DEF);
				setState(95);
				match(TYPESTR);
				setState(96);
				match(ID);
				setState(97);
				match(OPENEX);
				setState(98);
				paramList();
				setState(99);
				match(CLOSEX);
				setState(100);
				match(OPENEX);
				setState(101);
				stmtList();
				setState(102);
				match(RETURN);
				setState(103);
				strEx();
				setState(104);
				match(CLOSEX);
				}
				break;
			case 11:
				_localctx = new DefBoolFunContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(106);
				match(DEF);
				setState(107);
				match(TYPEBOOL);
				setState(108);
				match(ID);
				setState(109);
				match(OPENEX);
				setState(110);
				paramList();
				setState(111);
				match(CLOSEX);
				setState(112);
				match(OPENEX);
				setState(113);
				stmtList();
				setState(114);
				match(RETURN);
				setState(115);
				boolEx();
				setState(116);
				match(CLOSEX);
				}
				break;
			case 12:
				_localctx = new DefVoidFunContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(118);
				match(DEF);
				setState(119);
				match(TYPEVOID);
				setState(120);
				match(ID);
				setState(121);
				match(OPENEX);
				setState(122);
				paramList();
				setState(123);
				match(CLOSEX);
				setState(124);
				match(OPENEX);
				setState(125);
				stmtList();
				setState(126);
				match(CLOSEX);
				}
				break;
			case 13:
				_localctx = new DefFunFunContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(128);
				match(DEF);
				setState(129);
				match(TYPEFUNC);
				setState(130);
				match(ID);
				setState(131);
				match(OPENEX);
				setState(132);
				paramList();
				setState(133);
				match(CLOSEX);
				setState(134);
				match(OPENEX);
				setState(135);
				stmtList();
				setState(136);
				match(RETURN);
				setState(137);
				funcEx(0);
				setState(138);
				match(CLOSEX);
				}
				break;
			case 14:
				_localctx = new VoidFunCallContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(140);
				funcEx(0);
				setState(141);
				match(OPENEX);
				setState(142);
				argList();
				setState(143);
				match(CLOSEX);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	 
		public ParamListContext() { }
		public void copyFrom(ParamListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyParamContext extends ParamListContext {
		public EmptyParamContext(ParamListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterEmptyParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitEmptyParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitEmptyParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegParamContext extends ParamListContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public RegParamContext(ParamListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterRegParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitRegParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitRegParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramList);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPESTR:
			case TYPEBOOL:
			case TYPEFUNC:
				_localctx = new RegParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				param();
				setState(148);
				paramList();
				}
				break;
			case CLOSEX:
				_localctx = new EmptyParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolParamContext extends ParamContext {
		public TerminalNode TYPEBOOL() { return getToken(ParseRules.TYPEBOOL, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public BoolParamContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunParamContext extends ParamContext {
		public TerminalNode TYPEFUNC() { return getToken(ParseRules.TYPEFUNC, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public FunParamContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterFunParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitFunParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitFunParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrParamContext extends ParamContext {
		public TerminalNode TYPESTR() { return getToken(ParseRules.TYPESTR, 0); }
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public StrParamContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEBOOL:
				_localctx = new BoolParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(TYPEBOOL);
				setState(154);
				match(ID);
				}
				break;
			case TYPESTR:
				_localctx = new StrParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(TYPESTR);
				setState(156);
				match(ID);
				}
				break;
			case TYPEFUNC:
				_localctx = new FunParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(TYPEFUNC);
				setState(158);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	 
		public ArgListContext() { }
		public void copyFrom(ArgListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyArgContext extends ArgListContext {
		public EmptyArgContext(ArgListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterEmptyArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitEmptyArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitEmptyArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegArgContext extends ArgListContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public RegArgContext(ArgListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterRegArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitRegArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitRegArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argList);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPESTR:
			case TYPEBOOL:
			case TYPEFUNC:
				_localctx = new RegArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				arg();
				setState(162);
				argList();
				}
				break;
			case CLOSEX:
				_localctx = new EmptyArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunArgContext extends ArgContext {
		public TerminalNode TYPEFUNC() { return getToken(ParseRules.TYPEFUNC, 0); }
		public FuncExContext funcEx() {
			return getRuleContext(FuncExContext.class,0);
		}
		public FunArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterFunArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitFunArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitFunArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrArgContext extends ArgContext {
		public TerminalNode TYPESTR() { return getToken(ParseRules.TYPESTR, 0); }
		public StrExContext strEx() {
			return getRuleContext(StrExContext.class,0);
		}
		public StrArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolArgContext extends ArgContext {
		public TerminalNode TYPEBOOL() { return getToken(ParseRules.TYPEBOOL, 0); }
		public BoolExContext boolEx() {
			return getRuleContext(BoolExContext.class,0);
		}
		public BoolArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arg);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPESTR:
				_localctx = new StrArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(TYPESTR);
				setState(168);
				strEx();
				}
				break;
			case TYPEBOOL:
				_localctx = new BoolArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(TYPEBOOL);
				setState(170);
				boolEx();
				}
				break;
			case TYPEFUNC:
				_localctx = new FunArgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(TYPEFUNC);
				setState(172);
				funcEx(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrExContext extends ParserRuleContext {
		public StrExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strEx; }
	 
		public StrExContext() { }
		public void copyFrom(StrExContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatContext extends StrExContext {
		public TerminalNode CONCAT() { return getToken(ParseRules.CONCAT, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public List<StrExContext> strEx() {
			return getRuleContexts(StrExContext.class);
		}
		public StrExContext strEx(int i) {
			return getRuleContext(StrExContext.class,i);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public ConcatContext(StrExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends StrExContext {
		public TerminalNode IN() { return getToken(ParseRules.IN, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public InputContext(StrExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReverseContext extends StrExContext {
		public TerminalNode REV() { return getToken(ParseRules.REV, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public StrExContext strEx() {
			return getRuleContext(StrExContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public ReverseContext(StrExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterReverse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitReverse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitReverse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrIdentityContext extends StrExContext {
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public StrExContext strEx() {
			return getRuleContext(StrExContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public StrIdentityContext(StrExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrIdentity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrIdentity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrIdentity(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumToStrContext extends StrExContext {
		public TerminalNode TOSTR() { return getToken(ParseRules.TOSTR, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public NumExContext numEx() {
			return getRuleContext(NumExContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public NumToStrContext(StrExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterNumToStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitNumToStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitNumToStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrVarContext extends StrExContext {
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public StrVarContext(StrExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrFunCallContext extends StrExContext {
		public FuncExContext funcEx() {
			return getRuleContext(FuncExContext.class,0);
		}
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public StrFunCallContext(StrExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrLitContext extends StrExContext {
		public TerminalNode STR() { return getToken(ParseRules.STR, 0); }
		public StrLitContext(StrExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterStrLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitStrLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitStrLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrExContext strEx() throws RecognitionException {
		StrExContext _localctx = new StrExContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_strEx);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StrIdentityContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(OPENEX);
				setState(176);
				strEx();
				setState(177);
				match(CLOSEX);
				}
				break;
			case 2:
				_localctx = new NumToStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(TOSTR);
				setState(180);
				match(OPENEX);
				setState(181);
				numEx();
				setState(182);
				match(CLOSEX);
				}
				break;
			case 3:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(IN);
				setState(185);
				match(OPENEX);
				setState(186);
				match(CLOSEX);
				}
				break;
			case 4:
				_localctx = new ReverseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(REV);
				setState(188);
				match(OPENEX);
				setState(189);
				strEx();
				setState(190);
				match(CLOSEX);
				}
				break;
			case 5:
				_localctx = new ConcatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(CONCAT);
				setState(193);
				match(OPENEX);
				setState(194);
				strEx();
				setState(195);
				strEx();
				setState(196);
				match(CLOSEX);
				}
				break;
			case 6:
				_localctx = new StrLitContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				match(STR);
				}
				break;
			case 7:
				_localctx = new StrVarContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				match(ID);
				}
				break;
			case 8:
				_localctx = new StrFunCallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(200);
				funcEx(0);
				setState(201);
				match(OPENEX);
				setState(202);
				argList();
				setState(203);
				match(CLOSEX);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolExContext extends ParserRuleContext {
		public BoolExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolEx; }
	 
		public BoolExContext() { }
		public void copyFrom(BoolExContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolFunCallContext extends BoolExContext {
		public FuncExContext funcEx() {
			return getRuleContext(FuncExContext.class,0);
		}
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public BoolFunCallContext(BoolExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends BoolExContext {
		public TerminalNode NOT() { return getToken(ParseRules.NOT, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public BoolExContext boolEx() {
			return getRuleContext(BoolExContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public NotContext(BoolExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanContext extends BoolExContext {
		public TerminalNode LT() { return getToken(ParseRules.LT, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public List<StrExContext> strEx() {
			return getRuleContexts(StrExContext.class);
		}
		public StrExContext strEx(int i) {
			return getRuleContext(StrExContext.class,i);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public LessThanContext(BoolExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends BoolExContext {
		public TerminalNode OR() { return getToken(ParseRules.OR, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public List<BoolExContext> boolEx() {
			return getRuleContexts(BoolExContext.class);
		}
		public BoolExContext boolEx(int i) {
			return getRuleContext(BoolExContext.class,i);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public OrContext(BoolExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends BoolExContext {
		public TerminalNode AND() { return getToken(ParseRules.AND, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public List<BoolExContext> boolEx() {
			return getRuleContexts(BoolExContext.class);
		}
		public BoolExContext boolEx(int i) {
			return getRuleContext(BoolExContext.class,i);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public AndContext(BoolExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolIdentityContext extends BoolExContext {
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public BoolExContext boolEx() {
			return getRuleContext(BoolExContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public BoolIdentityContext(BoolExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolIdentity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolIdentity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolIdentity(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContainsContext extends BoolExContext {
		public TerminalNode CON() { return getToken(ParseRules.CON, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public List<StrExContext> strEx() {
			return getRuleContexts(StrExContext.class);
		}
		public StrExContext strEx(int i) {
			return getRuleContext(StrExContext.class,i);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public ContainsContext(BoolExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterContains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitContains(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitContains(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumLessThanContext extends BoolExContext {
		public TerminalNode NUMLT() { return getToken(ParseRules.NUMLT, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public List<NumExContext> numEx() {
			return getRuleContexts(NumExContext.class);
		}
		public NumExContext numEx(int i) {
			return getRuleContext(NumExContext.class,i);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public NumLessThanContext(BoolExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterNumLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitNumLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitNumLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolVarContext extends BoolExContext {
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public BoolVarContext(BoolExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLitContext extends BoolExContext {
		public TerminalNode BOOL() { return getToken(ParseRules.BOOL, 0); }
		public BoolLitContext(BoolExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterBoolLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitBoolLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitBoolLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExContext boolEx() throws RecognitionException {
		BoolExContext _localctx = new BoolExContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolEx);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(AND);
				setState(208);
				match(OPENEX);
				setState(209);
				boolEx();
				setState(210);
				boolEx();
				setState(211);
				match(CLOSEX);
				}
				break;
			case 2:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(OR);
				setState(214);
				match(OPENEX);
				setState(215);
				boolEx();
				setState(216);
				boolEx();
				setState(217);
				match(CLOSEX);
				}
				break;
			case 3:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(NOT);
				setState(220);
				match(OPENEX);
				setState(221);
				boolEx();
				setState(222);
				match(CLOSEX);
				}
				break;
			case 4:
				_localctx = new ContainsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(CON);
				setState(225);
				match(OPENEX);
				setState(226);
				strEx();
				setState(227);
				strEx();
				setState(228);
				match(CLOSEX);
				}
				break;
			case 5:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(LT);
				setState(231);
				match(OPENEX);
				setState(232);
				strEx();
				setState(233);
				strEx();
				setState(234);
				match(CLOSEX);
				}
				break;
			case 6:
				_localctx = new NumLessThanContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				match(NUMLT);
				setState(237);
				match(OPENEX);
				setState(238);
				numEx();
				setState(239);
				numEx();
				setState(240);
				match(CLOSEX);
				}
				break;
			case 7:
				_localctx = new BoolVarContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				match(ID);
				}
				break;
			case 8:
				_localctx = new BoolLitContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				match(BOOL);
				}
				break;
			case 9:
				_localctx = new BoolIdentityContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				match(OPENEX);
				setState(245);
				boolEx();
				setState(246);
				match(CLOSEX);
				}
				break;
			case 10:
				_localctx = new BoolFunCallContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(248);
				funcEx(0);
				setState(249);
				match(OPENEX);
				setState(250);
				argList();
				setState(251);
				match(CLOSEX);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumExContext extends ParserRuleContext {
		public NumExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numEx; }
	 
		public NumExContext() { }
		public void copyFrom(NumExContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends NumExContext {
		public TerminalNode ADD() { return getToken(ParseRules.ADD, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public List<NumExContext> numEx() {
			return getRuleContexts(NumExContext.class);
		}
		public NumExContext numEx(int i) {
			return getRuleContext(NumExContext.class,i);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public AddContext(NumExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumIdentityContext extends NumExContext {
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public NumExContext numEx() {
			return getRuleContext(NumExContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public NumIdentityContext(NumExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterNumIdentity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitNumIdentity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitNumIdentity(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyContext extends NumExContext {
		public TerminalNode MUL() { return getToken(ParseRules.MUL, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public List<NumExContext> numEx() {
			return getRuleContexts(NumExContext.class);
		}
		public NumExContext numEx(int i) {
			return getRuleContext(NumExContext.class,i);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public MultiplyContext(NumExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumInputContext extends NumExContext {
		public TerminalNode NUMIN() { return getToken(ParseRules.NUMIN, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public NumInputContext(NumExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterNumInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitNumInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitNumInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractContext extends NumExContext {
		public TerminalNode SUB() { return getToken(ParseRules.SUB, 0); }
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public List<NumExContext> numEx() {
			return getRuleContexts(NumExContext.class);
		}
		public NumExContext numEx(int i) {
			return getRuleContext(NumExContext.class,i);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public SubtractContext(NumExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitSubtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitSubtract(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumVarContext extends NumExContext {
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public NumVarContext(NumExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterNumVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitNumVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitNumVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumLitContext extends NumExContext {
		public TerminalNode NUM() { return getToken(ParseRules.NUM, 0); }
		public NumLitContext(NumExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterNumLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitNumLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitNumLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumExContext numEx() throws RecognitionException {
		NumExContext _localctx = new NumExContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numEx);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMIN:
				_localctx = new NumInputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(NUMIN);
				setState(256);
				match(OPENEX);
				setState(257);
				match(CLOSEX);
				}
				break;
			case ADD:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(ADD);
				setState(259);
				match(OPENEX);
				setState(260);
				numEx();
				setState(261);
				numEx();
				setState(262);
				match(CLOSEX);
				}
				break;
			case SUB:
				_localctx = new SubtractContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(SUB);
				setState(265);
				match(OPENEX);
				setState(266);
				numEx();
				setState(267);
				numEx();
				setState(268);
				match(CLOSEX);
				}
				break;
			case MUL:
				_localctx = new MultiplyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(MUL);
				setState(271);
				match(OPENEX);
				setState(272);
				numEx();
				setState(273);
				numEx();
				setState(274);
				match(CLOSEX);
				}
				break;
			case ID:
				_localctx = new NumVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				match(ID);
				}
				break;
			case NUM:
				_localctx = new NumLitContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
				match(NUM);
				}
				break;
			case OPENEX:
				_localctx = new NumIdentityContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(278);
				match(OPENEX);
				setState(279);
				numEx();
				setState(280);
				match(CLOSEX);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncExContext extends ParserRuleContext {
		public FuncExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcEx; }
	 
		public FuncExContext() { }
		public void copyFrom(FuncExContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncNameContext extends FuncExContext {
		public TerminalNode ID() { return getToken(ParseRules.ID, 0); }
		public FuncNameContext(FuncExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitFuncName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunFunCallContext extends FuncExContext {
		public FuncExContext funcEx() {
			return getRuleContext(FuncExContext.class,0);
		}
		public TerminalNode OPENEX() { return getToken(ParseRules.OPENEX, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode CLOSEX() { return getToken(ParseRules.CLOSEX, 0); }
		public FunFunCallContext(FuncExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).enterFunFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseRulesListener ) ((ParseRulesListener)listener).exitFunFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseRulesVisitor ) return ((ParseRulesVisitor<? extends T>)visitor).visitFunFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncExContext funcEx() throws RecognitionException {
		return funcEx(0);
	}

	private FuncExContext funcEx(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FuncExContext _localctx = new FuncExContext(_ctx, _parentState);
		FuncExContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_funcEx, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FuncNameContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(285);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunFunCallContext(new FuncExContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_funcEx);
					setState(287);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(288);
					match(OPENEX);
					setState(289);
					argList();
					setState(290);
					match(CLOSEX);
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return funcEx_sempred((FuncExContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean funcEx_sempred(FuncExContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u012a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0092\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0098\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a0\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a6\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00ae\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00ce\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00fe\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u011b\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0125\b\n\n\n\f\n\u0128\t\n\u0001\n\u0000\u0001\u0014\u000b"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000\u0149"+
		"\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000"+
		"\u0004\u0091\u0001\u0000\u0000\u0000\u0006\u0097\u0001\u0000\u0000\u0000"+
		"\b\u009f\u0001\u0000\u0000\u0000\n\u00a5\u0001\u0000\u0000\u0000\f\u00ad"+
		"\u0001\u0000\u0000\u0000\u000e\u00cd\u0001\u0000\u0000\u0000\u0010\u00fd"+
		"\u0001\u0000\u0000\u0000\u0012\u011a\u0001\u0000\u0000\u0000\u0014\u011c"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018"+
		"\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0003\u0004\u0002\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u001e"+
		"\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u0019"+
		"\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u0003"+
		"\u0001\u0000\u0000\u0000\u001f \u0005\u0001\u0000\u0000 !\u0005\u0013"+
		"\u0000\u0000!\"\u0005\u0003\u0000\u0000\"#\u0005\u0017\u0000\u0000#$\u0003"+
		"\u000e\u0007\u0000$%\u0005\u0014\u0000\u0000%\u0092\u0001\u0000\u0000"+
		"\u0000&\'\u0005\u0001\u0000\u0000\'(\u0005\u0013\u0000\u0000()\u0005\u0004"+
		"\u0000\u0000)*\u0005\u0017\u0000\u0000*+\u0003\u0010\b\u0000+,\u0005\u0014"+
		"\u0000\u0000,\u0092\u0001\u0000\u0000\u0000-.\u0005\u0001\u0000\u0000"+
		"./\u0005\u0013\u0000\u0000/0\u0005\u0006\u0000\u000001\u0005\u0017\u0000"+
		"\u000012\u0003\u0014\n\u000023\u0005\u0014\u0000\u00003\u0092\u0001\u0000"+
		"\u0000\u000045\u0005\u0001\u0000\u000056\u0005\u0013\u0000\u000067\u0005"+
		"\u0018\u0000\u000078\u0005\u0017\u0000\u000089\u0003\u0012\t\u00009:\u0005"+
		"\u0014\u0000\u0000:\u0092\u0001\u0000\u0000\u0000;<\u0005\u0002\u0000"+
		"\u0000<=\u0005\u0013\u0000\u0000=>\u0005\u0003\u0000\u0000>?\u0003\u000e"+
		"\u0007\u0000?@\u0005\u0014\u0000\u0000@\u0092\u0001\u0000\u0000\u0000"+
		"AB\u0005\u0002\u0000\u0000BC\u0005\u0013\u0000\u0000CD\u0005\u0004\u0000"+
		"\u0000DE\u0003\u0010\b\u0000EF\u0005\u0014\u0000\u0000F\u0092\u0001\u0000"+
		"\u0000\u0000GH\u0005\u0002\u0000\u0000HI\u0005\u0013\u0000\u0000IJ\u0005"+
		"\u0018\u0000\u0000JK\u0003\u0012\t\u0000KL\u0005\u0014\u0000\u0000L\u0092"+
		"\u0001\u0000\u0000\u0000MN\u0005\n\u0000\u0000NO\u0005\u0013\u0000\u0000"+
		"OP\u0003\u0010\b\u0000PQ\u0005\u0013\u0000\u0000QR\u0003\u0002\u0001\u0000"+
		"RS\u0005\u0014\u0000\u0000ST\u0005\u0013\u0000\u0000TU\u0003\u0002\u0001"+
		"\u0000UV\u0005\u0014\u0000\u0000VW\u0005\u0014\u0000\u0000W\u0092\u0001"+
		"\u0000\u0000\u0000XY\u0005\t\u0000\u0000YZ\u0005\u0013\u0000\u0000Z[\u0003"+
		"\u0010\b\u0000[\\\u0003\u0002\u0001\u0000\\]\u0005\u0014\u0000\u0000]"+
		"\u0092\u0001\u0000\u0000\u0000^_\u0005\u0007\u0000\u0000_`\u0005\u0003"+
		"\u0000\u0000`a\u0005\u0017\u0000\u0000ab\u0005\u0013\u0000\u0000bc\u0003"+
		"\u0006\u0003\u0000cd\u0005\u0014\u0000\u0000de\u0005\u0013\u0000\u0000"+
		"ef\u0003\u0002\u0001\u0000fg\u0005\b\u0000\u0000gh\u0003\u000e\u0007\u0000"+
		"hi\u0005\u0014\u0000\u0000i\u0092\u0001\u0000\u0000\u0000jk\u0005\u0007"+
		"\u0000\u0000kl\u0005\u0004\u0000\u0000lm\u0005\u0017\u0000\u0000mn\u0005"+
		"\u0013\u0000\u0000no\u0003\u0006\u0003\u0000op\u0005\u0014\u0000\u0000"+
		"pq\u0005\u0013\u0000\u0000qr\u0003\u0002\u0001\u0000rs\u0005\b\u0000\u0000"+
		"st\u0003\u0010\b\u0000tu\u0005\u0014\u0000\u0000u\u0092\u0001\u0000\u0000"+
		"\u0000vw\u0005\u0007\u0000\u0000wx\u0005\u0005\u0000\u0000xy\u0005\u0017"+
		"\u0000\u0000yz\u0005\u0013\u0000\u0000z{\u0003\u0006\u0003\u0000{|\u0005"+
		"\u0014\u0000\u0000|}\u0005\u0013\u0000\u0000}~\u0003\u0002\u0001\u0000"+
		"~\u007f\u0005\u0014\u0000\u0000\u007f\u0092\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005\u0007\u0000\u0000\u0081\u0082\u0005\u0006\u0000\u0000\u0082"+
		"\u0083\u0005\u0017\u0000\u0000\u0083\u0084\u0005\u0013\u0000\u0000\u0084"+
		"\u0085\u0003\u0006\u0003\u0000\u0085\u0086\u0005\u0014\u0000\u0000\u0086"+
		"\u0087\u0005\u0013\u0000\u0000\u0087\u0088\u0003\u0002\u0001\u0000\u0088"+
		"\u0089\u0005\b\u0000\u0000\u0089\u008a\u0003\u0014\n\u0000\u008a\u008b"+
		"\u0005\u0014\u0000\u0000\u008b\u0092\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0003\u0014\n\u0000\u008d\u008e\u0005\u0013\u0000\u0000\u008e\u008f\u0003"+
		"\n\u0005\u0000\u008f\u0090\u0005\u0014\u0000\u0000\u0090\u0092\u0001\u0000"+
		"\u0000\u0000\u0091\u001f\u0001\u0000\u0000\u0000\u0091&\u0001\u0000\u0000"+
		"\u0000\u0091-\u0001\u0000\u0000\u0000\u00914\u0001\u0000\u0000\u0000\u0091"+
		";\u0001\u0000\u0000\u0000\u0091A\u0001\u0000\u0000\u0000\u0091G\u0001"+
		"\u0000\u0000\u0000\u0091M\u0001\u0000\u0000\u0000\u0091X\u0001\u0000\u0000"+
		"\u0000\u0091^\u0001\u0000\u0000\u0000\u0091j\u0001\u0000\u0000\u0000\u0091"+
		"v\u0001\u0000\u0000\u0000\u0091\u0080\u0001\u0000\u0000\u0000\u0091\u008c"+
		"\u0001\u0000\u0000\u0000\u0092\u0005\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0003\b\u0004\u0000\u0094\u0095\u0003\u0006\u0003\u0000\u0095\u0098\u0001"+
		"\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0093\u0001"+
		"\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0007\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\u0004\u0000\u0000\u009a\u00a0\u0005"+
		"\u0017\u0000\u0000\u009b\u009c\u0005\u0003\u0000\u0000\u009c\u00a0\u0005"+
		"\u0017\u0000\u0000\u009d\u009e\u0005\u0006\u0000\u0000\u009e\u00a0\u0005"+
		"\u0017\u0000\u0000\u009f\u0099\u0001\u0000\u0000\u0000\u009f\u009b\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\t\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0003\f\u0006\u0000\u00a2\u00a3\u0003\n\u0005"+
		"\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u000b\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0003\u0000"+
		"\u0000\u00a8\u00ae\u0003\u000e\u0007\u0000\u00a9\u00aa\u0005\u0004\u0000"+
		"\u0000\u00aa\u00ae\u0003\u0010\b\u0000\u00ab\u00ac\u0005\u0006\u0000\u0000"+
		"\u00ac\u00ae\u0003\u0014\n\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000\u00ad"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae"+
		"\r\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0013\u0000\u0000\u00b0\u00b1"+
		"\u0003\u000e\u0007\u0000\u00b1\u00b2\u0005\u0014\u0000\u0000\u00b2\u00ce"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u001f\u0000\u0000\u00b4\u00b5"+
		"\u0005\u0013\u0000\u0000\u00b5\u00b6\u0003\u0012\t\u0000\u00b6\u00b7\u0005"+
		"\u0014\u0000\u0000\u00b7\u00ce\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005"+
		"\r\u0000\u0000\u00b9\u00ba\u0005\u0013\u0000\u0000\u00ba\u00ce\u0005\u0014"+
		"\u0000\u0000\u00bb\u00bc\u0005\f\u0000\u0000\u00bc\u00bd\u0005\u0013\u0000"+
		"\u0000\u00bd\u00be\u0003\u000e\u0007\u0000\u00be\u00bf\u0005\u0014\u0000"+
		"\u0000\u00bf\u00ce\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u000b\u0000"+
		"\u0000\u00c1\u00c2\u0005\u0013\u0000\u0000\u00c2\u00c3\u0003\u000e\u0007"+
		"\u0000\u00c3\u00c4\u0003\u000e\u0007\u0000\u00c4\u00c5\u0005\u0014\u0000"+
		"\u0000\u00c5\u00ce\u0001\u0000\u0000\u0000\u00c6\u00ce\u0005\u0016\u0000"+
		"\u0000\u00c7\u00ce\u0005\u0017\u0000\u0000\u00c8\u00c9\u0003\u0014\n\u0000"+
		"\u00c9\u00ca\u0005\u0013\u0000\u0000\u00ca\u00cb\u0003\n\u0005\u0000\u00cb"+
		"\u00cc\u0005\u0014\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd"+
		"\u00af\u0001\u0000\u0000\u0000\u00cd\u00b3\u0001\u0000\u0000\u0000\u00cd"+
		"\u00b8\u0001\u0000\u0000\u0000\u00cd\u00bb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00cd\u00c6\u0001\u0000\u0000\u0000\u00cd"+
		"\u00c7\u0001\u0000\u0000\u0000\u00cd\u00c8\u0001\u0000\u0000\u0000\u00ce"+
		"\u000f\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0010\u0000\u0000\u00d0"+
		"\u00d1\u0005\u0013\u0000\u0000\u00d1\u00d2\u0003\u0010\b\u0000\u00d2\u00d3"+
		"\u0003\u0010\b\u0000\u00d3\u00d4\u0005\u0014\u0000\u0000\u00d4\u00fe\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005\u0011\u0000\u0000\u00d6\u00d7\u0005"+
		"\u0013\u0000\u0000\u00d7\u00d8\u0003\u0010\b\u0000\u00d8\u00d9\u0003\u0010"+
		"\b\u0000\u00d9\u00da\u0005\u0014\u0000\u0000\u00da\u00fe\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0005\u0012\u0000\u0000\u00dc\u00dd\u0005\u0013\u0000"+
		"\u0000\u00dd\u00de\u0003\u0010\b\u0000\u00de\u00df\u0005\u0014\u0000\u0000"+
		"\u00df\u00fe\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u000e\u0000\u0000"+
		"\u00e1\u00e2\u0005\u0013\u0000\u0000\u00e2\u00e3\u0003\u000e\u0007\u0000"+
		"\u00e3\u00e4\u0003\u000e\u0007\u0000\u00e4\u00e5\u0005\u0014\u0000\u0000"+
		"\u00e5\u00fe\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u000f\u0000\u0000"+
		"\u00e7\u00e8\u0005\u0013\u0000\u0000\u00e8\u00e9\u0003\u000e\u0007\u0000"+
		"\u00e9\u00ea\u0003\u000e\u0007\u0000\u00ea\u00eb\u0005\u0014\u0000\u0000"+
		"\u00eb\u00fe\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u001a\u0000\u0000"+
		"\u00ed\u00ee\u0005\u0013\u0000\u0000\u00ee\u00ef\u0003\u0012\t\u0000\u00ef"+
		"\u00f0\u0003\u0012\t\u0000\u00f0\u00f1\u0005\u0014\u0000\u0000\u00f1\u00fe"+
		"\u0001\u0000\u0000\u0000\u00f2\u00fe\u0005\u0017\u0000\u0000\u00f3\u00fe"+
		"\u0005\u0015\u0000\u0000\u00f4\u00f5\u0005\u0013\u0000\u0000\u00f5\u00f6"+
		"\u0003\u0010\b\u0000\u00f6\u00f7\u0005\u0014\u0000\u0000\u00f7\u00fe\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0003\u0014\n\u0000\u00f9\u00fa\u0005\u0013"+
		"\u0000\u0000\u00fa\u00fb\u0003\n\u0005\u0000\u00fb\u00fc\u0005\u0014\u0000"+
		"\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00cf\u0001\u0000\u0000"+
		"\u0000\u00fd\u00d5\u0001\u0000\u0000\u0000\u00fd\u00db\u0001\u0000\u0000"+
		"\u0000\u00fd\u00e0\u0001\u0000\u0000\u0000\u00fd\u00e6\u0001\u0000\u0000"+
		"\u0000\u00fd\u00ec\u0001\u0000\u0000\u0000\u00fd\u00f2\u0001\u0000\u0000"+
		"\u0000\u00fd\u00f3\u0001\u0000\u0000\u0000\u00fd\u00f4\u0001\u0000\u0000"+
		"\u0000\u00fd\u00f8\u0001\u0000\u0000\u0000\u00fe\u0011\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005\u001b\u0000\u0000\u0100\u0101\u0005\u0013\u0000"+
		"\u0000\u0101\u011b\u0005\u0014\u0000\u0000\u0102\u0103\u0005\u001c\u0000"+
		"\u0000\u0103\u0104\u0005\u0013\u0000\u0000\u0104\u0105\u0003\u0012\t\u0000"+
		"\u0105\u0106\u0003\u0012\t\u0000\u0106\u0107\u0005\u0014\u0000\u0000\u0107"+
		"\u011b\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u001d\u0000\u0000\u0109"+
		"\u010a\u0005\u0013\u0000\u0000\u010a\u010b\u0003\u0012\t\u0000\u010b\u010c"+
		"\u0003\u0012\t\u0000\u010c\u010d\u0005\u0014\u0000\u0000\u010d\u011b\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0005\u001e\u0000\u0000\u010f\u0110\u0005"+
		"\u0013\u0000\u0000\u0110\u0111\u0003\u0012\t\u0000\u0111\u0112\u0003\u0012"+
		"\t\u0000\u0112\u0113\u0005\u0014\u0000\u0000\u0113\u011b\u0001\u0000\u0000"+
		"\u0000\u0114\u011b\u0005\u0017\u0000\u0000\u0115\u011b\u0005\u0019\u0000"+
		"\u0000\u0116\u0117\u0005\u0013\u0000\u0000\u0117\u0118\u0003\u0012\t\u0000"+
		"\u0118\u0119\u0005\u0014\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000"+
		"\u011a\u00ff\u0001\u0000\u0000\u0000\u011a\u0102\u0001\u0000\u0000\u0000"+
		"\u011a\u0108\u0001\u0000\u0000\u0000\u011a\u010e\u0001\u0000\u0000\u0000"+
		"\u011a\u0114\u0001\u0000\u0000\u0000\u011a\u0115\u0001\u0000\u0000\u0000"+
		"\u011a\u0116\u0001\u0000\u0000\u0000\u011b\u0013\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0006\n\uffff\uffff\u0000\u011d\u011e\u0005\u0017\u0000\u0000"+
		"\u011e\u0126\u0001\u0000\u0000\u0000\u011f\u0120\n\u0001\u0000\u0000\u0120"+
		"\u0121\u0005\u0013\u0000\u0000\u0121\u0122\u0003\n\u0005\u0000\u0122\u0123"+
		"\u0005\u0014\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u011f"+
		"\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0015"+
		"\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\n\u001d\u0091"+
		"\u0097\u009f\u00a5\u00ad\u00cd\u00fd\u011a\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}