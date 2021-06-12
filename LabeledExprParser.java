// Generated from LabeledExpr.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONST=1, ARRAY=2, STRING=3, INT=4, FLOAT=5, BOOLEAN=6, TRUE=7, FALSE=8, 
		NULL=9, PRINTLN=10, IF=11, ELSE=12, WHILE=13, FOR=14, ASSIGN=15, NOT=16, 
		OPAR=17, CPAR=18, OBRACE=19, CBRACE=20, OBRACKET=21, CBRACKET=22, MULT=23, 
		DIV=24, PLUS=25, MINUS=26, EQ=27, NEQ=28, LTEQ=29, GTEQ=30, LT=31, GT=32, 
		AND=33, OR=34, SCOL=35, COMMA=36, MOD=37, ID=38, IntegerLiteral=39, FloatLiteral=40, 
		StringLiteral=41, Comment=42, Space=43;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_stat = 2, RULE_var = 3, RULE_const_type = 4, 
		RULE_type = 5, RULE_lista = 6, RULE_id_lista = 7, RULE_expr_list = 8, 
		RULE_assignment = 9, RULE_if_stat = 10, RULE_condition_block = 11, RULE_stat_block = 12, 
		RULE_while_stat = 13, RULE_for_stat = 14, RULE_boolean_literal = 15, RULE_println = 16, 
		RULE_expr = 17, RULE_atom = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "stat", "var", "const_type", "type", "lista", "id_lista", 
			"expr_list", "assignment", "if_stat", "condition_block", "stat_block", 
			"while_stat", "for_stat", "boolean_literal", "println", "expr", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "'array'", "'string'", "'int'", "'float'", "'boolean'", 
			"'true'", "'false'", "'null'", "'println'", "'if'", "'else'", "'while'", 
			"'for'", "'='", "'!'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'*'", 
			"'/'", "'+'", "'-'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'&&'", 
			"'||'", "';'", "','", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONST", "ARRAY", "STRING", "INT", "FLOAT", "BOOLEAN", "TRUE", 
			"FALSE", "NULL", "PRINTLN", "IF", "ELSE", "WHILE", "FOR", "ASSIGN", "NOT", 
			"OPAR", "CPAR", "OBRACE", "CBRACE", "OBRACKET", "CBRACKET", "MULT", "DIV", 
			"PLUS", "MINUS", "EQ", "NEQ", "LTEQ", "GTEQ", "LT", "GT", "AND", "OR", 
			"SCOL", "COMMA", "MOD", "ID", "IntegerLiteral", "FloatLiteral", "StringLiteral", 
			"Comment", "Space"
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
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LabeledExprParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			block();
			setState(39);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << ARRAY) | (1L << STRING) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(41);
				stat();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class StatContext extends ParserRuleContext {
		public Const_typeContext const_type() {
			return getRuleContext(Const_typeContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				const_type();
				}
				break;
			case STRING:
			case INT:
			case FLOAT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				var();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				lista();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				assignment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				if_stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				while_stat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				for_stat();
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				println();
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

	public static class VarContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(LabeledExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LabeledExprParser.ID, i);
		}
		public TerminalNode SCOL() { return getToken(LabeledExprParser.SCOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LabeledExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LabeledExprParser.COMMA, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			type();
			setState(58);
			match(ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(59);
				match(COMMA);
				setState(60);
				match(ID);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(SCOL);
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

	public static class Const_typeContext extends ParserRuleContext {
		public Const_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_type; }
	 
		public Const_typeContext() { }
		public void copyFrom(Const_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstTypeContext extends Const_typeContext {
		public TerminalNode CONST() { return getToken(LabeledExprParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LabeledExprParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(LabeledExprParser.SCOL, 0); }
		public ConstTypeContext(Const_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitConstType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_typeContext const_type() throws RecognitionException {
		Const_typeContext _localctx = new Const_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_type);
		try {
			_localctx = new ConstTypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(CONST);
			setState(69);
			type();
			setState(70);
			match(ID);
			setState(71);
			match(ASSIGN);
			setState(72);
			expr(0);
			setState(73);
			match(SCOL);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeFloatContext extends TypeContext {
		public TerminalNode FLOAT() { return getToken(LabeledExprParser.FLOAT, 0); }
		public TypeFloatContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTypeFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeBoolContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(LabeledExprParser.BOOLEAN, 0); }
		public TypeBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeStrContext extends TypeContext {
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public TypeStrContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTypeStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeIntContext extends TypeContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new TypeStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(STRING);
				}
				break;
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new TypeFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(FLOAT);
				}
				break;
			case BOOLEAN:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(BOOLEAN);
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

	public static class ListaContext extends ParserRuleContext {
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
	 
		public ListaContext() { }
		public void copyFrom(ListaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListaTypeContext extends ListaContext {
		public TerminalNode ARRAY() { return getToken(LabeledExprParser.ARRAY, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode OBRACKET() { return getToken(LabeledExprParser.OBRACKET, 0); }
		public TerminalNode IntegerLiteral() { return getToken(LabeledExprParser.IntegerLiteral, 0); }
		public TerminalNode CBRACKET() { return getToken(LabeledExprParser.CBRACKET, 0); }
		public TerminalNode SCOL() { return getToken(LabeledExprParser.SCOL, 0); }
		public ListaTypeContext(ListaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitListaType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lista);
		try {
			_localctx = new ListaTypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ARRAY);
			setState(82);
			type();
			setState(83);
			match(ID);
			setState(84);
			match(OBRACKET);
			setState(85);
			match(IntegerLiteral);
			setState(86);
			match(CBRACKET);
			setState(87);
			match(SCOL);
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

	public static class Id_listaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode OBRACKET() { return getToken(LabeledExprParser.OBRACKET, 0); }
		public TerminalNode IntegerLiteral() { return getToken(LabeledExprParser.IntegerLiteral, 0); }
		public TerminalNode CBRACKET() { return getToken(LabeledExprParser.CBRACKET, 0); }
		public Id_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_lista; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitId_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listaContext id_lista() throws RecognitionException {
		Id_listaContext _localctx = new Id_listaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_id_lista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(90);
			match(OBRACKET);
			setState(91);
			match(IntegerLiteral);
			setState(92);
			match(CBRACKET);
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

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LabeledExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LabeledExprParser.COMMA, i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			expr(0);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				expr(0);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LabeledExprParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(LabeledExprParser.SCOL, 0); }
		public Id_listaContext id_lista() {
			return getRuleContext(Id_listaContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(ID);
				setState(103);
				match(ASSIGN);
				setState(104);
				expr(0);
				setState(105);
				match(SCOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				id_lista();
				setState(108);
				match(ASSIGN);
				setState(109);
				expr(0);
				setState(110);
				match(SCOL);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(LabeledExprParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(LabeledExprParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(LabeledExprParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(LabeledExprParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IF);
			setState(115);
			condition_block();
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					match(ELSE);
					setState(117);
					match(IF);
					setState(118);
					condition_block();
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(124);
				match(ELSE);
				setState(125);
				stat_block();
				}
				break;
			}
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

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			expr(0);
			setState(129);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(LabeledExprParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(LabeledExprParser.CBRACE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stat_block);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(OBRACE);
				setState(132);
				block();
				setState(133);
				match(CBRACE);
				}
				break;
			case CONST:
			case ARRAY:
			case STRING:
			case INT:
			case FLOAT:
			case BOOLEAN:
			case PRINTLN:
			case IF:
			case WHILE:
			case FOR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				stat();
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LabeledExprParser.WHILE, 0); }
		public TerminalNode OPAR() { return getToken(LabeledExprParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(LabeledExprParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(WHILE);
			setState(139);
			match(OPAR);
			setState(140);
			expr(0);
			setState(141);
			match(CPAR);
			setState(142);
			stat_block();
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

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LabeledExprParser.FOR, 0); }
		public TerminalNode OPAR() { return getToken(LabeledExprParser.OPAR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(LabeledExprParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(FOR);
			setState(145);
			match(OPAR);
			setState(146);
			assignment();
			setState(147);
			expr(0);
			setState(148);
			match(CPAR);
			setState(149);
			stat_block();
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(LabeledExprParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LabeledExprParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(LabeledExprParser.PRINTLN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(LabeledExprParser.SCOL, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(PRINTLN);
			setState(154);
			expr(0);
			setState(155);
			match(SCOL);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(LabeledExprParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(LabeledExprParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(LabeledExprParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(LabeledExprParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LabeledExprParser.MOD, 0); }
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(LabeledExprParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(LabeledExprParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LabeledExprParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(LabeledExprParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(LabeledExprParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(LabeledExprParser.LT, 0); }
		public TerminalNode GT() { return getToken(LabeledExprParser.GT, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LabeledExprParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(LabeledExprParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(158);
				match(MINUS);
				setState(159);
				expr(9);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(NOT);
				setState(161);
				expr(8);
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
			case OPAR:
			case ID:
			case IntegerLiteral:
			case FloatLiteral:
			case StringLiteral:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(166);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(169);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(172);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LTEQ) | (1L << GTEQ) | (1L << LT) | (1L << GT))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(175);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(178);
						match(AND);
						setState(179);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(181);
						match(OR);
						setState(182);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends AtomContext {
		public TerminalNode OPAR() { return getToken(LabeledExprParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(LabeledExprParser.CPAR, 0); }
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDlistaAtomContext extends AtomContext {
		public Id_listaContext id_lista() {
			return getRuleContext(Id_listaContext.class,0);
		}
		public IDlistaAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitIDlistaAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode StringLiteral() { return getToken(LabeledExprParser.StringLiteral, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode IntegerLiteral() { return getToken(LabeledExprParser.IntegerLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(LabeledExprParser.FloatLiteral, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullAtomContext extends AtomContext {
		public TerminalNode NULL() { return getToken(LabeledExprParser.NULL, 0); }
		public NullAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNullAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atom);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(OPAR);
				setState(189);
				expr(0);
				setState(190);
				match(CPAR);
				}
				break;
			case 2:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				_la = _input.LA(1);
				if ( !(_la==IntegerLiteral || _la==FloatLiteral) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				boolean_literal();
				}
				break;
			case 4:
				_localctx = new IDlistaAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				id_lista();
				}
				break;
			case 5:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(ID);
				}
				break;
			case 6:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				match(StringLiteral);
				}
				break;
			case 7:
				_localctx = new NullAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				match(NULL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7R\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nd\n\n\f"+
		"\n\16\ng\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13s"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\7\fz\n\f\f\f\16\f}\13\f\3\f\3\f\5\f\u0081\n"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u008b\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a6\n\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u00ba\n\23\f\23\16\23\u00bd\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00c9\n\24\3\24\2\3$\25\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&\2\b\3\2\t\n\4\2\31\32\'\'\3\2\33\34\3\2"+
		"\37\"\3\2\35\36\3\2)*\2\u00d6\2(\3\2\2\2\4.\3\2\2\2\69\3\2\2\2\b;\3\2"+
		"\2\2\nF\3\2\2\2\fQ\3\2\2\2\16S\3\2\2\2\20[\3\2\2\2\22`\3\2\2\2\24r\3\2"+
		"\2\2\26t\3\2\2\2\30\u0082\3\2\2\2\32\u008a\3\2\2\2\34\u008c\3\2\2\2\36"+
		"\u0092\3\2\2\2 \u0099\3\2\2\2\"\u009b\3\2\2\2$\u00a5\3\2\2\2&\u00c8\3"+
		"\2\2\2()\5\4\3\2)*\7\2\2\3*\3\3\2\2\2+-\5\6\4\2,+\3\2\2\2-\60\3\2\2\2"+
		".,\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60.\3\2\2\2\61:\5\n\6\2\62:\5\b\5\2\63"+
		":\5\16\b\2\64:\5\24\13\2\65:\5\26\f\2\66:\5\34\17\2\67:\5\36\20\28:\5"+
		"\"\22\29\61\3\2\2\29\62\3\2\2\29\63\3\2\2\29\64\3\2\2\29\65\3\2\2\29\66"+
		"\3\2\2\29\67\3\2\2\298\3\2\2\2:\7\3\2\2\2;<\5\f\7\2<A\7(\2\2=>\7&\2\2"+
		">@\7(\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2"+
		"DE\7%\2\2E\t\3\2\2\2FG\7\3\2\2GH\5\f\7\2HI\7(\2\2IJ\7\21\2\2JK\5$\23\2"+
		"KL\7%\2\2L\13\3\2\2\2MR\7\5\2\2NR\7\6\2\2OR\7\7\2\2PR\7\b\2\2QM\3\2\2"+
		"\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\r\3\2\2\2ST\7\4\2\2TU\5\f\7\2UV\7(\2"+
		"\2VW\7\27\2\2WX\7)\2\2XY\7\30\2\2YZ\7%\2\2Z\17\3\2\2\2[\\\7(\2\2\\]\7"+
		"\27\2\2]^\7)\2\2^_\7\30\2\2_\21\3\2\2\2`e\5$\23\2ab\7&\2\2bd\5$\23\2c"+
		"a\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\23\3\2\2\2ge\3\2\2\2hi\7(\2\2"+
		"ij\7\21\2\2jk\5$\23\2kl\7%\2\2ls\3\2\2\2mn\5\20\t\2no\7\21\2\2op\5$\23"+
		"\2pq\7%\2\2qs\3\2\2\2rh\3\2\2\2rm\3\2\2\2s\25\3\2\2\2tu\7\r\2\2u{\5\30"+
		"\r\2vw\7\16\2\2wx\7\r\2\2xz\5\30\r\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3"+
		"\2\2\2|\u0080\3\2\2\2}{\3\2\2\2~\177\7\16\2\2\177\u0081\5\32\16\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\27\3\2\2\2\u0082\u0083\5$\23\2\u0083"+
		"\u0084\5\32\16\2\u0084\31\3\2\2\2\u0085\u0086\7\25\2\2\u0086\u0087\5\4"+
		"\3\2\u0087\u0088\7\26\2\2\u0088\u008b\3\2\2\2\u0089\u008b\5\6\4\2\u008a"+
		"\u0085\3\2\2\2\u008a\u0089\3\2\2\2\u008b\33\3\2\2\2\u008c\u008d\7\17\2"+
		"\2\u008d\u008e\7\23\2\2\u008e\u008f\5$\23\2\u008f\u0090\7\24\2\2\u0090"+
		"\u0091\5\32\16\2\u0091\35\3\2\2\2\u0092\u0093\7\20\2\2\u0093\u0094\7\23"+
		"\2\2\u0094\u0095\5\24\13\2\u0095\u0096\5$\23\2\u0096\u0097\7\24\2\2\u0097"+
		"\u0098\5\32\16\2\u0098\37\3\2\2\2\u0099\u009a\t\2\2\2\u009a!\3\2\2\2\u009b"+
		"\u009c\7\f\2\2\u009c\u009d\5$\23\2\u009d\u009e\7%\2\2\u009e#\3\2\2\2\u009f"+
		"\u00a0\b\23\1\2\u00a0\u00a1\7\34\2\2\u00a1\u00a6\5$\23\13\u00a2\u00a3"+
		"\7\22\2\2\u00a3\u00a6\5$\23\n\u00a4\u00a6\5&\24\2\u00a5\u009f\3\2\2\2"+
		"\u00a5\u00a2\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00bb\3\2\2\2\u00a7\u00a8"+
		"\f\t\2\2\u00a8\u00a9\t\3\2\2\u00a9\u00ba\5$\23\n\u00aa\u00ab\f\b\2\2\u00ab"+
		"\u00ac\t\4\2\2\u00ac\u00ba\5$\23\t\u00ad\u00ae\f\7\2\2\u00ae\u00af\t\5"+
		"\2\2\u00af\u00ba\5$\23\b\u00b0\u00b1\f\6\2\2\u00b1\u00b2\t\6\2\2\u00b2"+
		"\u00ba\5$\23\7\u00b3\u00b4\f\5\2\2\u00b4\u00b5\7#\2\2\u00b5\u00ba\5$\23"+
		"\6\u00b6\u00b7\f\4\2\2\u00b7\u00b8\7$\2\2\u00b8\u00ba\5$\23\5\u00b9\u00a7"+
		"\3\2\2\2\u00b9\u00aa\3\2\2\2\u00b9\u00ad\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9"+
		"\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc%\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf"+
		"\7\23\2\2\u00bf\u00c0\5$\23\2\u00c0\u00c1\7\24\2\2\u00c1\u00c9\3\2\2\2"+
		"\u00c2\u00c9\t\7\2\2\u00c3\u00c9\5 \21\2\u00c4\u00c9\5\20\t\2\u00c5\u00c9"+
		"\7(\2\2\u00c6\u00c9\7+\2\2\u00c7\u00c9\7\13\2\2\u00c8\u00be\3\2\2\2\u00c8"+
		"\u00c2\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\'\3\2\2\2\17.9AQer"+
		"{\u0080\u008a\u00a5\u00b9\u00bb\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}