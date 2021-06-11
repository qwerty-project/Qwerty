// Generated from Qwerty.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QwertyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, INT_TYPE=2, FLOAT_TYPE=3, DOUBLE_TYPE=4, CHAR_TYPE=5, STRING_TYPE=6, 
		VOID_TYPE=7, BOOL_TYPE=8, SIN=9, COS=10, TAN=11, IF=12, ELIF=13, ELSE=14, 
		FOR=15, WHILE=16, EQ=17, EQ_EQ=18, AND=19, OR=20, LESS_THAN=21, GREATER_THAN=22, 
		LESS_THAN_OR_EQ=23, GREATER_THAN_OR_EQ=24, MULITPLY=25, DIVIDE=26, ADD=27, 
		SUBTRACT=28, POWER=29, FACTORIAL=30, RETURN=31, LEFT_PARANTHESES=32, RIGHT_PARANTHESES=33, 
		LEFT_BRACKET=34, RIGHT_BRACKET=35, COLON=36, COMMA=37, TRUE=38, FALSE=39, 
		VARNAME=40, NUMBER=41, DECIMAL=42, STRING=43, ESCAPE_CHARS=44, SPACES=45;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_conditional = 2, RULE_if_statement = 3, 
		RULE_elif_statement = 4, RULE_else_statement = 5, RULE_conditional_block = 6, 
		RULE_while_statement = 7, RULE_for_statement = 8, RULE_variable_declaration = 9, 
		RULE_function_declaration = 10, RULE_function_parameters = 11, RULE_function_parameter = 12, 
		RULE_function_arguments = 13, RULE_function_argument = 14, RULE_function_block = 15, 
		RULE_function_call = 16, RULE_function_name = 17, RULE_system_function = 18, 
		RULE_custom_function = 19, RULE_return_stmt = 20, RULE_type = 21, RULE_system_type = 22, 
		RULE_custom_type = 23, RULE_value_expression = 24, RULE_expr = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "conditional", "if_statement", "elif_statement", "else_statement", 
			"conditional_block", "while_statement", "for_statement", "variable_declaration", 
			"function_declaration", "function_parameters", "function_parameter", 
			"function_arguments", "function_argument", "function_block", "function_call", 
			"function_name", "system_function", "custom_function", "return_stmt", 
			"type", "system_type", "custom_type", "value_expression", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Print'", "'Int'", "'Float'", "'Double'", "'Char'", "'String'", 
			"'Void'", "'Bool'", "'Sin'", "'Cos'", "'Tan'", "'If'", "'Elif'", "'Else'", 
			"'For'", "'While'", "'='", "'=='", "'And'", "'Or'", "'<'", "'>'", "'<='", 
			"'>='", "'*'", "'/'", "'+'", "'-'", "'^'", "'!'", "'Return'", "'('", 
			"')'", "'{'", "'}'", "':'", "','", "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "CHAR_TYPE", 
			"STRING_TYPE", "VOID_TYPE", "BOOL_TYPE", "SIN", "COS", "TAN", "IF", "ELIF", 
			"ELSE", "FOR", "WHILE", "EQ", "EQ_EQ", "AND", "OR", "LESS_THAN", "GREATER_THAN", 
			"LESS_THAN_OR_EQ", "GREATER_THAN_OR_EQ", "MULITPLY", "DIVIDE", "ADD", 
			"SUBTRACT", "POWER", "FACTORIAL", "RETURN", "LEFT_PARANTHESES", "RIGHT_PARANTHESES", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "COLON", "COMMA", "TRUE", "FALSE", "VARNAME", 
			"NUMBER", "DECIMAL", "STRING", "ESCAPE_CHARS", "SPACES"
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
	public String getGrammarFileName() { return "Qwerty.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QwertyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << VOID_TYPE) | (1L << BOOL_TYPE) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FACTORIAL) | (1L << LEFT_PARANTHESES) | (1L << TRUE) | (1L << FALSE) | (1L << VARNAME) | (1L << NUMBER) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
				{
				{
				setState(52);
				stmt();
				}
				}
				setState(57);
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

	public static class StmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode COLON() { return getToken(QwertyParser.COLON, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				variable_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				function_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				function_call();
				setState(62);
				match(COLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				conditional();
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

	public static class ConditionalContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public List<Elif_statementContext> elif_statement() {
			return getRuleContexts(Elif_statementContext.class);
		}
		public Elif_statementContext elif_statement(int i) {
			return getRuleContext(Elif_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conditional);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				if_statement();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELIF) {
					{
					{
					setState(68);
					elif_statement();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(74);
					else_statement();
					}
				}

				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				for_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				while_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(QwertyParser.IF, 0); }
		public List<TerminalNode> COLON() { return getTokens(QwertyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(QwertyParser.COLON, i);
		}
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Conditional_blockContext conditional_block() {
			return getRuleContext(Conditional_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IF);
			setState(82);
			match(COLON);
			setState(83);
			value_expression();
			setState(84);
			match(COLON);
			setState(85);
			conditional_block();
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

	public static class Elif_statementContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(QwertyParser.ELIF, 0); }
		public List<TerminalNode> COLON() { return getTokens(QwertyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(QwertyParser.COLON, i);
		}
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Conditional_blockContext conditional_block() {
			return getRuleContext(Conditional_blockContext.class,0);
		}
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterElif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitElif_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitElif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ELIF);
			setState(88);
			match(COLON);
			setState(89);
			value_expression();
			setState(90);
			match(COLON);
			setState(91);
			conditional_block();
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

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(QwertyParser.ELSE, 0); }
		public Conditional_blockContext conditional_block() {
			return getRuleContext(Conditional_blockContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ELSE);
			setState(94);
			conditional_block();
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

	public static class Conditional_blockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(QwertyParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(QwertyParser.RIGHT_BRACKET, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<Return_stmtContext> return_stmt() {
			return getRuleContexts(Return_stmtContext.class);
		}
		public Return_stmtContext return_stmt(int i) {
			return getRuleContext(Return_stmtContext.class,i);
		}
		public Conditional_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterConditional_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitConditional_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitConditional_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_blockContext conditional_block() throws RecognitionException {
		Conditional_blockContext _localctx = new Conditional_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(LEFT_BRACKET);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << VOID_TYPE) | (1L << BOOL_TYPE) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FACTORIAL) | (1L << RETURN) | (1L << LEFT_PARANTHESES) | (1L << TRUE) | (1L << FALSE) | (1L << VARNAME) | (1L << NUMBER) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
				{
				setState(99);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRINT:
				case INT_TYPE:
				case FLOAT_TYPE:
				case DOUBLE_TYPE:
				case CHAR_TYPE:
				case STRING_TYPE:
				case VOID_TYPE:
				case BOOL_TYPE:
				case SIN:
				case COS:
				case TAN:
				case IF:
				case FOR:
				case WHILE:
				case FACTORIAL:
				case LEFT_PARANTHESES:
				case TRUE:
				case FALSE:
				case VARNAME:
				case NUMBER:
				case DECIMAL:
				case STRING:
					{
					setState(97);
					stmt();
					}
					break;
				case RETURN:
					{
					setState(98);
					return_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(RIGHT_BRACKET);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(QwertyParser.WHILE, 0); }
		public List<TerminalNode> COLON() { return getTokens(QwertyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(QwertyParser.COLON, i);
		}
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Conditional_blockContext conditional_block() {
			return getRuleContext(Conditional_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(WHILE);
			setState(107);
			match(COLON);
			setState(108);
			value_expression();
			setState(109);
			match(COLON);
			setState(110);
			conditional_block();
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(QwertyParser.FOR, 0); }
		public List<TerminalNode> COLON() { return getTokens(QwertyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(QwertyParser.COLON, i);
		}
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Conditional_blockContext conditional_block() {
			return getRuleContext(Conditional_blockContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(FOR);
			setState(113);
			match(COLON);
			setState(114);
			value_expression();
			setState(115);
			match(COLON);
			setState(116);
			conditional_block();
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(QwertyParser.VARNAME, 0); }
		public TerminalNode EQ() { return getToken(QwertyParser.EQ, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(QwertyParser.COLON, 0); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			type();
			setState(119);
			match(VARNAME);
			setState(120);
			match(EQ);
			setState(121);
			value_expression();
			setState(122);
			match(COLON);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(QwertyParser.VARNAME, 0); }
		public TerminalNode LEFT_PARANTHESES() { return getToken(QwertyParser.LEFT_PARANTHESES, 0); }
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESES() { return getToken(QwertyParser.RIGHT_PARANTHESES, 0); }
		public TerminalNode COLON() { return getToken(QwertyParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(VARNAME);
			setState(125);
			match(LEFT_PARANTHESES);
			setState(126);
			function_parameters();
			setState(127);
			match(RIGHT_PARANTHESES);
			setState(128);
			match(COLON);
			setState(129);
			type();
			setState(130);
			function_block();
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

	public static class Function_parametersContext extends ParserRuleContext {
		public List<Function_parameterContext> function_parameter() {
			return getRuleContexts(Function_parameterContext.class);
		}
		public Function_parameterContext function_parameter(int i) {
			return getRuleContext(Function_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QwertyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QwertyParser.COMMA, i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitFunction_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitFunction_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << VOID_TYPE) | (1L << BOOL_TYPE) | (1L << VARNAME))) != 0)) {
				{
				setState(132);
				function_parameter();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(133);
					match(COMMA);
					setState(134);
					function_parameter();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Function_parameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(QwertyParser.VARNAME, 0); }
		public Function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterFunction_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitFunction_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitFunction_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parameterContext function_parameter() throws RecognitionException {
		Function_parameterContext _localctx = new Function_parameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			type();
			setState(143);
			match(VARNAME);
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

	public static class Function_argumentsContext extends ParserRuleContext {
		public List<Function_argumentContext> function_argument() {
			return getRuleContexts(Function_argumentContext.class);
		}
		public Function_argumentContext function_argument(int i) {
			return getRuleContext(Function_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QwertyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QwertyParser.COMMA, i);
		}
		public Function_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterFunction_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitFunction_arguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitFunction_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentsContext function_arguments() throws RecognitionException {
		Function_argumentsContext _localctx = new Function_argumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << FACTORIAL) | (1L << LEFT_PARANTHESES) | (1L << TRUE) | (1L << FALSE) | (1L << VARNAME) | (1L << NUMBER) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
				{
				setState(145);
				function_argument();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(146);
					match(COMMA);
					setState(147);
					function_argument();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Function_argumentContext extends ParserRuleContext {
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitFunction_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitFunction_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			value_expression();
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

	public static class Function_blockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(QwertyParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(QwertyParser.RIGHT_BRACKET, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<Return_stmtContext> return_stmt() {
			return getRuleContexts(Return_stmtContext.class);
		}
		public Return_stmtContext return_stmt(int i) {
			return getRuleContext(Return_stmtContext.class,i);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitFunction_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitFunction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(LEFT_BRACKET);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << VOID_TYPE) | (1L << BOOL_TYPE) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FACTORIAL) | (1L << RETURN) | (1L << LEFT_PARANTHESES) | (1L << TRUE) | (1L << FALSE) | (1L << VARNAME) | (1L << NUMBER) | (1L << DECIMAL) | (1L << STRING))) != 0)) {
				{
				setState(160);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRINT:
				case INT_TYPE:
				case FLOAT_TYPE:
				case DOUBLE_TYPE:
				case CHAR_TYPE:
				case STRING_TYPE:
				case VOID_TYPE:
				case BOOL_TYPE:
				case SIN:
				case COS:
				case TAN:
				case IF:
				case FOR:
				case WHILE:
				case FACTORIAL:
				case LEFT_PARANTHESES:
				case TRUE:
				case FALSE:
				case VARNAME:
				case NUMBER:
				case DECIMAL:
				case STRING:
					{
					setState(158);
					stmt();
					}
					break;
				case RETURN:
					{
					setState(159);
					return_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(RIGHT_BRACKET);
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LEFT_PARANTHESES() { return getToken(QwertyParser.LEFT_PARANTHESES, 0); }
		public Function_argumentsContext function_arguments() {
			return getRuleContext(Function_argumentsContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESES() { return getToken(QwertyParser.RIGHT_PARANTHESES, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			function_name();
			setState(168);
			match(LEFT_PARANTHESES);
			setState(169);
			function_arguments();
			setState(170);
			match(RIGHT_PARANTHESES);
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

	public static class Function_nameContext extends ParserRuleContext {
		public System_functionContext system_function() {
			return getRuleContext(System_functionContext.class,0);
		}
		public Custom_functionContext custom_function() {
			return getRuleContext(Custom_functionContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_name);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				system_function();
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				custom_function();
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

	public static class System_functionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(QwertyParser.PRINT, 0); }
		public System_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterSystem_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitSystem_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitSystem_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final System_functionContext system_function() throws RecognitionException {
		System_functionContext _localctx = new System_functionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_system_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(PRINT);
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

	public static class Custom_functionContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(QwertyParser.VARNAME, 0); }
		public Custom_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterCustom_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitCustom_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitCustom_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Custom_functionContext custom_function() throws RecognitionException {
		Custom_functionContext _localctx = new Custom_functionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_custom_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(VARNAME);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(QwertyParser.RETURN, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(QwertyParser.COLON, 0); }
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(RETURN);
			setState(181);
			value_expression();
			setState(182);
			match(COLON);
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
		public System_typeContext system_type() {
			return getRuleContext(System_typeContext.class,0);
		}
		public Custom_typeContext custom_type() {
			return getRuleContext(Custom_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case CHAR_TYPE:
			case STRING_TYPE:
			case VOID_TYPE:
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				system_type();
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				custom_type();
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

	public static class System_typeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(QwertyParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(QwertyParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(QwertyParser.DOUBLE_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(QwertyParser.CHAR_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(QwertyParser.STRING_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(QwertyParser.VOID_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(QwertyParser.BOOL_TYPE, 0); }
		public System_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterSystem_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitSystem_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitSystem_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final System_typeContext system_type() throws RecognitionException {
		System_typeContext _localctx = new System_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_system_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << VOID_TYPE) | (1L << BOOL_TYPE))) != 0)) ) {
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

	public static class Custom_typeContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(QwertyParser.VARNAME, 0); }
		public Custom_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterCustom_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitCustom_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitCustom_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Custom_typeContext custom_type() throws RecognitionException {
		Custom_typeContext _localctx = new Custom_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_custom_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(VARNAME);
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

	public static class Value_expressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterValue_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitValue_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitValue_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_expressionContext value_expression() throws RecognitionException {
		Value_expressionContext _localctx = new Value_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			expr(0);
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
	public static class GreaterthanExpressionContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(QwertyParser.GREATER_THAN, 0); }
		public GreaterthanExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterGreaterthanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitGreaterthanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitGreaterthanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosExpressionContext extends ExprContext {
		public TerminalNode COS() { return getToken(QwertyParser.COS, 0); }
		public TerminalNode LEFT_PARANTHESES() { return getToken(QwertyParser.LEFT_PARANTHESES, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESES() { return getToken(QwertyParser.RIGHT_PARANTHESES, 0); }
		public CosExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterCosExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitCosExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitCosExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterthanorequalExpressionContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER_THAN_OR_EQ() { return getToken(QwertyParser.GREATER_THAN_OR_EQ, 0); }
		public GreaterthanorequalExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterGreaterthanorequalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitGreaterthanorequalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitGreaterthanorequalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(QwertyParser.NUMBER, 0); }
		public NumberExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyDivideExpressionContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULITPLY() { return getToken(QwertyParser.MULITPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(QwertyParser.DIVIDE, 0); }
		public MultiplyDivideExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterMultiplyDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitMultiplyDivideExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitMultiplyDivideExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExprContext {
		public Token operator;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FACTORIAL() { return getToken(QwertyParser.FACTORIAL, 0); }
		public NotExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExpressionContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(QwertyParser.FALSE, 0); }
		public FalseExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterFalseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitFalseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitFalseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarnameExpressionContext extends ExprContext {
		public TerminalNode VARNAME() { return getToken(QwertyParser.VARNAME, 0); }
		public VarnameExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterVarnameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitVarnameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitVarnameExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanthesesExpressionContext extends ExprContext {
		public TerminalNode LEFT_PARANTHESES() { return getToken(QwertyParser.LEFT_PARANTHESES, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESES() { return getToken(QwertyParser.RIGHT_PARANTHESES, 0); }
		public ParanthesesExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterParanthesesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitParanthesesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitParanthesesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(QwertyParser.OR, 0); }
		public OrExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExpressionContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POWER() { return getToken(QwertyParser.POWER, 0); }
		public PowerExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessthanExpressionContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(QwertyParser.LESS_THAN, 0); }
		public LessthanExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterLessthanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitLessthanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitLessthanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalExpressionContext extends ExprContext {
		public TerminalNode DECIMAL() { return getToken(QwertyParser.DECIMAL, 0); }
		public DecimalExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterDecimalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitDecimalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitDecimalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(QwertyParser.AND, 0); }
		public AndExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExprContext {
		public TerminalNode STRING() { return getToken(QwertyParser.STRING, 0); }
		public StringExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExpressionContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(QwertyParser.TRUE, 0); }
		public TrueExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterTrueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitTrueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitTrueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TanExpressionContext extends ExprContext {
		public TerminalNode TAN() { return getToken(QwertyParser.TAN, 0); }
		public TerminalNode LEFT_PARANTHESES() { return getToken(QwertyParser.LEFT_PARANTHESES, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESES() { return getToken(QwertyParser.RIGHT_PARANTHESES, 0); }
		public TanExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterTanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitTanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitTanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinExpressionContext extends ExprContext {
		public TerminalNode SIN() { return getToken(QwertyParser.SIN, 0); }
		public TerminalNode LEFT_PARANTHESES() { return getToken(QwertyParser.LEFT_PARANTHESES, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PARANTHESES() { return getToken(QwertyParser.RIGHT_PARANTHESES, 0); }
		public SinExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterSinExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitSinExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitSinExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubtractExpressionContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(QwertyParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(QwertyParser.SUBTRACT, 0); }
		public AddSubtractExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterAddSubtractExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitAddSubtractExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitAddSubtractExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorialExpresionContext extends ExprContext {
		public Token operator;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FACTORIAL() { return getToken(QwertyParser.FACTORIAL, 0); }
		public FactorialExpresionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterFactorialExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitFactorialExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitFactorialExpresion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualEqualExpressionContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ_EQ() { return getToken(QwertyParser.EQ_EQ, 0); }
		public EqualEqualExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterEqualEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitEqualEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitEqualEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessthanorequalExpressionContext extends ExprContext {
		public Token operator;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS_THAN_OR_EQ() { return getToken(QwertyParser.LESS_THAN_OR_EQ, 0); }
		public LessthanorequalExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterLessthanorequalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitLessthanorequalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitLessthanorequalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctioncallExpressionContext extends ExprContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctioncallExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).enterFunctioncallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QwertyListener ) ((QwertyListener)listener).exitFunctioncallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QwertyVisitor ) return ((QwertyVisitor<? extends T>)visitor).visitFunctioncallExpression(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new CosExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(195);
				match(COS);
				setState(196);
				match(LEFT_PARANTHESES);
				setState(197);
				expr(0);
				setState(198);
				match(RIGHT_PARANTHESES);
				}
				break;
			case 2:
				{
				_localctx = new TanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(TAN);
				setState(201);
				match(LEFT_PARANTHESES);
				setState(202);
				expr(0);
				setState(203);
				match(RIGHT_PARANTHESES);
				}
				break;
			case 3:
				{
				_localctx = new SinExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(SIN);
				setState(206);
				match(LEFT_PARANTHESES);
				setState(207);
				expr(0);
				setState(208);
				match(RIGHT_PARANTHESES);
				}
				break;
			case 4:
				{
				_localctx = new FunctioncallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				function_call();
				}
				break;
			case 5:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				((NotExpressionContext)_localctx).operator = match(FACTORIAL);
				setState(212);
				expr(18);
				}
				break;
			case 6:
				{
				_localctx = new ParanthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(LEFT_PARANTHESES);
				setState(214);
				expr(0);
				setState(215);
				match(RIGHT_PARANTHESES);
				}
				break;
			case 7:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(NUMBER);
				}
				break;
			case 8:
				{
				_localctx = new DecimalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(DECIMAL);
				}
				break;
			case 9:
				{
				_localctx = new TrueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(TRUE);
				}
				break;
			case 10:
				{
				_localctx = new FalseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(FALSE);
				}
				break;
			case 11:
				{
				_localctx = new VarnameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(VARNAME);
				}
				break;
			case 12:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(226);
						((PowerExpressionContext)_localctx).operator = match(POWER);
						setState(227);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new MultiplyDivideExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(229);
						((MultiplyDivideExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULITPLY || _la==DIVIDE) ) {
							((MultiplyDivideExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new AddSubtractExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(232);
						((AddSubtractExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBTRACT) ) {
							((AddSubtractExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new EqualEqualExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(235);
						((EqualEqualExpressionContext)_localctx).operator = match(EQ_EQ);
						setState(236);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(238);
						((AndExpressionContext)_localctx).operator = match(AND);
						setState(239);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(241);
						((OrExpressionContext)_localctx).operator = match(OR);
						setState(242);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new LessthanExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(244);
						((LessthanExpressionContext)_localctx).operator = match(LESS_THAN);
						setState(245);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new GreaterthanExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(247);
						((GreaterthanExpressionContext)_localctx).operator = match(GREATER_THAN);
						setState(248);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new LessthanorequalExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(250);
						((LessthanorequalExpressionContext)_localctx).operator = match(LESS_THAN_OR_EQ);
						setState(251);
						expr(9);
						}
						break;
					case 10:
						{
						_localctx = new GreaterthanorequalExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(253);
						((GreaterthanorequalExpressionContext)_localctx).operator = match(GREATER_THAN_OR_EQ);
						setState(254);
						expr(8);
						}
						break;
					case 11:
						{
						_localctx = new FactorialExpresionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(256);
						((FactorialExpresionContext)_localctx).operator = match(FACTORIAL);
						}
						break;
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		case 25:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0109\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3D\n\3\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\5\4N\n\4\3\4\3\4\5"+
		"\4R\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u008a\n\r\f\r\16\r\u008d\13\r\5\r\u008f\n"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u0097\n\17\f\17\16\17\u009a\13\17"+
		"\5\17\u009c\n\17\3\20\3\20\3\21\3\21\3\21\7\21\u00a3\n\21\f\21\16\21\u00a6"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00b1\n\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00bd\n\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00e2\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u0104\n\33\f\33\16\33\u0107\13\33\3\33\2\3\64\34\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\5\3\2\4\n\3\2\33\34\3\2\35\36\2"+
		"\u0117\29\3\2\2\2\4C\3\2\2\2\6Q\3\2\2\2\bS\3\2\2\2\nY\3\2\2\2\f_\3\2\2"+
		"\2\16b\3\2\2\2\20l\3\2\2\2\22r\3\2\2\2\24x\3\2\2\2\26~\3\2\2\2\30\u008e"+
		"\3\2\2\2\32\u0090\3\2\2\2\34\u009b\3\2\2\2\36\u009d\3\2\2\2 \u009f\3\2"+
		"\2\2\"\u00a9\3\2\2\2$\u00b0\3\2\2\2&\u00b2\3\2\2\2(\u00b4\3\2\2\2*\u00b6"+
		"\3\2\2\2,\u00bc\3\2\2\2.\u00be\3\2\2\2\60\u00c0\3\2\2\2\62\u00c2\3\2\2"+
		"\2\64\u00e1\3\2\2\2\668\5\4\3\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:"+
		"\3\2\2\2:\3\3\2\2\2;9\3\2\2\2<D\5\64\33\2=D\5\24\13\2>D\5\26\f\2?@\5\""+
		"\22\2@A\7&\2\2AD\3\2\2\2BD\5\6\4\2C<\3\2\2\2C=\3\2\2\2C>\3\2\2\2C?\3\2"+
		"\2\2CB\3\2\2\2D\5\3\2\2\2EI\5\b\5\2FH\5\n\6\2GF\3\2\2\2HK\3\2\2\2IG\3"+
		"\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LN\5\f\7\2ML\3\2\2\2MN\3\2\2\2NR\3"+
		"\2\2\2OR\5\22\n\2PR\5\20\t\2QE\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\7\3\2\2\2"+
		"ST\7\16\2\2TU\7&\2\2UV\5\62\32\2VW\7&\2\2WX\5\16\b\2X\t\3\2\2\2YZ\7\17"+
		"\2\2Z[\7&\2\2[\\\5\62\32\2\\]\7&\2\2]^\5\16\b\2^\13\3\2\2\2_`\7\20\2\2"+
		"`a\5\16\b\2a\r\3\2\2\2bg\7$\2\2cf\5\4\3\2df\5*\26\2ec\3\2\2\2ed\3\2\2"+
		"\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7%\2\2k\17\3\2"+
		"\2\2lm\7\22\2\2mn\7&\2\2no\5\62\32\2op\7&\2\2pq\5\16\b\2q\21\3\2\2\2r"+
		"s\7\21\2\2st\7&\2\2tu\5\62\32\2uv\7&\2\2vw\5\16\b\2w\23\3\2\2\2xy\5,\27"+
		"\2yz\7*\2\2z{\7\23\2\2{|\5\62\32\2|}\7&\2\2}\25\3\2\2\2~\177\7*\2\2\177"+
		"\u0080\7\"\2\2\u0080\u0081\5\30\r\2\u0081\u0082\7#\2\2\u0082\u0083\7&"+
		"\2\2\u0083\u0084\5,\27\2\u0084\u0085\5 \21\2\u0085\27\3\2\2\2\u0086\u008b"+
		"\5\32\16\2\u0087\u0088\7\'\2\2\u0088\u008a\5\32\16\2\u0089\u0087\3\2\2"+
		"\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\31\3\2\2\2\u0090\u0091\5,\27\2\u0091\u0092\7*\2\2\u0092\33\3\2\2\2\u0093"+
		"\u0098\5\36\20\2\u0094\u0095\7\'\2\2\u0095\u0097\5\36\20\2\u0096\u0094"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\35\3\2\2\2\u009d\u009e\5\62\32\2\u009e\37\3\2\2\2\u009f\u00a4"+
		"\7$\2\2\u00a0\u00a3\5\4\3\2\u00a1\u00a3\5*\26\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7%\2\2\u00a8"+
		"!\3\2\2\2\u00a9\u00aa\5$\23\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\5\34\17"+
		"\2\u00ac\u00ad\7#\2\2\u00ad#\3\2\2\2\u00ae\u00b1\5&\24\2\u00af\u00b1\5"+
		"(\25\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1%\3\2\2\2\u00b2\u00b3"+
		"\7\3\2\2\u00b3\'\3\2\2\2\u00b4\u00b5\7*\2\2\u00b5)\3\2\2\2\u00b6\u00b7"+
		"\7!\2\2\u00b7\u00b8\5\62\32\2\u00b8\u00b9\7&\2\2\u00b9+\3\2\2\2\u00ba"+
		"\u00bd\5.\30\2\u00bb\u00bd\5\60\31\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3"+
		"\2\2\2\u00bd-\3\2\2\2\u00be\u00bf\t\2\2\2\u00bf/\3\2\2\2\u00c0\u00c1\7"+
		"*\2\2\u00c1\61\3\2\2\2\u00c2\u00c3\5\64\33\2\u00c3\63\3\2\2\2\u00c4\u00c5"+
		"\b\33\1\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\7\"\2\2\u00c7\u00c8\5\64\33"+
		"\2\u00c8\u00c9\7#\2\2\u00c9\u00e2\3\2\2\2\u00ca\u00cb\7\r\2\2\u00cb\u00cc"+
		"\7\"\2\2\u00cc\u00cd\5\64\33\2\u00cd\u00ce\7#\2\2\u00ce\u00e2\3\2\2\2"+
		"\u00cf\u00d0\7\13\2\2\u00d0\u00d1\7\"\2\2\u00d1\u00d2\5\64\33\2\u00d2"+
		"\u00d3\7#\2\2\u00d3\u00e2\3\2\2\2\u00d4\u00e2\5\"\22\2\u00d5\u00d6\7 "+
		"\2\2\u00d6\u00e2\5\64\33\24\u00d7\u00d8\7\"\2\2\u00d8\u00d9\5\64\33\2"+
		"\u00d9\u00da\7#\2\2\u00da\u00e2\3\2\2\2\u00db\u00e2\7+\2\2\u00dc\u00e2"+
		"\7,\2\2\u00dd\u00e2\7(\2\2\u00de\u00e2\7)\2\2\u00df\u00e2\7*\2\2\u00e0"+
		"\u00e2\7-\2\2\u00e1\u00c4\3\2\2\2\u00e1\u00ca\3\2\2\2\u00e1\u00cf\3\2"+
		"\2\2\u00e1\u00d4\3\2\2\2\u00e1\u00d5\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1"+
		"\u00db\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u0105\3\2\2\2\u00e3"+
		"\u00e4\f\23\2\2\u00e4\u00e5\7\37\2\2\u00e5\u0104\5\64\33\24\u00e6\u00e7"+
		"\f\22\2\2\u00e7\u00e8\t\3\2\2\u00e8\u0104\5\64\33\23\u00e9\u00ea\f\21"+
		"\2\2\u00ea\u00eb\t\4\2\2\u00eb\u0104\5\64\33\22\u00ec\u00ed\f\17\2\2\u00ed"+
		"\u00ee\7\24\2\2\u00ee\u0104\5\64\33\20\u00ef\u00f0\f\16\2\2\u00f0\u00f1"+
		"\7\25\2\2\u00f1\u0104\5\64\33\17\u00f2\u00f3\f\r\2\2\u00f3\u00f4\7\26"+
		"\2\2\u00f4\u0104\5\64\33\16\u00f5\u00f6\f\f\2\2\u00f6\u00f7\7\27\2\2\u00f7"+
		"\u0104\5\64\33\r\u00f8\u00f9\f\13\2\2\u00f9\u00fa\7\30\2\2\u00fa\u0104"+
		"\5\64\33\f\u00fb\u00fc\f\n\2\2\u00fc\u00fd\7\31\2\2\u00fd\u0104\5\64\33"+
		"\13\u00fe\u00ff\f\t\2\2\u00ff\u0100\7\32\2\2\u0100\u0104\5\64\33\n\u0101"+
		"\u0102\f\25\2\2\u0102\u0104\7 \2\2\u0103\u00e3\3\2\2\2\u0103\u00e6\3\2"+
		"\2\2\u0103\u00e9\3\2\2\2\u0103\u00ec\3\2\2\2\u0103\u00ef\3\2\2\2\u0103"+
		"\u00f2\3\2\2\2\u0103\u00f5\3\2\2\2\u0103\u00f8\3\2\2\2\u0103\u00fb\3\2"+
		"\2\2\u0103\u00fe\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\65\3\2\2\2\u0107\u0105\3\2\2"+
		"\2\249CIMQeg\u008b\u008e\u0098\u009b\u00a2\u00a4\u00b0\u00bc\u00e1\u0103"+
		"\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}