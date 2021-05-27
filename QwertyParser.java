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
		LEFT_BRACKET=34, RIGHT_BRACKET=35, COLON=36, COMMA=37, VARNAME=38, NUMBER=39, 
		DECIMAL=40, STRING=41, TRUE=42, FALSE=43, ESCAPE_CHARS=44, SPACES=45;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_conditional = 2, RULE_if_statement = 3, 
		RULE_elif_statement = 4, RULE_else_statement = 5, RULE_conditional_block = 6, 
		RULE_while_statement = 7, RULE_for_statement = 8, RULE_variable_declaration = 9, 
		RULE_function_declaration = 10, RULE_function_parameters = 11, RULE_function_arguments = 12, 
		RULE_function_block = 13, RULE_function_call = 14, RULE_function_name = 15, 
		RULE_system_function = 16, RULE_custom_function = 17, RULE_return_stmt = 18, 
		RULE_type = 19, RULE_system_type = 20, RULE_custom_type = 21, RULE_value_expression = 22, 
		RULE_expr = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "conditional", "if_statement", "elif_statement", "else_statement", 
			"conditional_block", "while_statement", "for_statement", "variable_declaration", 
			"function_declaration", "function_parameters", "function_arguments", 
			"function_block", "function_call", "function_name", "system_function", 
			"custom_function", "return_stmt", "type", "system_type", "custom_type", 
			"value_expression", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Print'", "'Int'", "'Float'", "'Double'", "'Char'", "'String'", 
			"'Void'", "'Bool'", "'Sin'", "'Cos'", "'Tan'", "'If'", "'Elif'", "'Else'", 
			"'For'", "'While'", "'='", "'=='", "'And'", "'Or'", "'<'", "'>'", "'<='", 
			"'>='", "'*'", "'/'", "'+'", "'-'", "'^'", "'!'", "'Return'", "'('", 
			"')'", "'{'", "'}'", "':'", "','", null, null, null, null, "'True'", 
			"'False'"
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
			"LEFT_BRACKET", "RIGHT_BRACKET", "COLON", "COMMA", "VARNAME", "NUMBER", 
			"DECIMAL", "STRING", "TRUE", "FALSE", "ESCAPE_CHARS", "SPACES"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << VOID_TYPE) | (1L << BOOL_TYPE) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << LEFT_PARANTHESES) | (1L << VARNAME) | (1L << NUMBER) | (1L << DECIMAL) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				{
				setState(48);
				stmt();
				}
				}
				setState(53);
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
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				variable_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				function_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				function_call();
				setState(58);
				match(COLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
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
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conditional);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				if_statement();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELIF) {
					{
					{
					setState(64);
					elif_statement();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(70);
					else_statement();
					}
				}

				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				for_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
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
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(IF);
			setState(78);
			match(COLON);
			setState(79);
			value_expression();
			setState(80);
			match(COLON);
			setState(81);
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
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ELIF);
			setState(84);
			match(COLON);
			setState(85);
			value_expression();
			setState(86);
			match(COLON);
			setState(87);
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
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ELSE);
			setState(90);
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
	}

	public final Conditional_blockContext conditional_block() throws RecognitionException {
		Conditional_blockContext _localctx = new Conditional_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(LEFT_BRACKET);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << VOID_TYPE) | (1L << BOOL_TYPE) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << LEFT_PARANTHESES) | (1L << VARNAME) | (1L << NUMBER) | (1L << DECIMAL) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(95);
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
				case LEFT_PARANTHESES:
				case VARNAME:
				case NUMBER:
				case DECIMAL:
				case STRING:
				case TRUE:
				case FALSE:
					{
					setState(93);
					stmt();
					}
					break;
				case RETURN:
					{
					setState(94);
					return_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(WHILE);
			setState(103);
			match(COLON);
			setState(104);
			value_expression();
			setState(105);
			match(COLON);
			setState(106);
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
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(FOR);
			setState(109);
			match(COLON);
			setState(110);
			value_expression();
			setState(111);
			match(COLON);
			setState(112);
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
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			type();
			setState(115);
			match(VARNAME);
			setState(116);
			match(EQ);
			setState(117);
			value_expression();
			setState(118);
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
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(VARNAME);
			setState(121);
			match(LEFT_PARANTHESES);
			setState(122);
			function_parameters();
			setState(123);
			match(RIGHT_PARANTHESES);
			setState(124);
			match(COLON);
			setState(125);
			type();
			setState(126);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(QwertyParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(QwertyParser.VARNAME, i);
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
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << VOID_TYPE) | (1L << BOOL_TYPE) | (1L << VARNAME))) != 0)) {
				{
				setState(128);
				type();
				setState(129);
				match(VARNAME);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(130);
					match(COMMA);
					setState(131);
					type();
					setState(132);
					match(VARNAME);
					}
					}
					setState(138);
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

	public static class Function_argumentsContext extends ParserRuleContext {
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
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
	}

	public final Function_argumentsContext function_arguments() throws RecognitionException {
		Function_argumentsContext _localctx = new Function_argumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << LEFT_PARANTHESES) | (1L << VARNAME) | (1L << NUMBER) | (1L << DECIMAL) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(141);
				value_expression();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(142);
					match(COMMA);
					setState(143);
					value_expression();
					}
					}
					setState(148);
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
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(LEFT_BRACKET);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << CHAR_TYPE) | (1L << STRING_TYPE) | (1L << VOID_TYPE) | (1L << BOOL_TYPE) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << LEFT_PARANTHESES) | (1L << VARNAME) | (1L << NUMBER) | (1L << DECIMAL) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(154);
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
				case LEFT_PARANTHESES:
				case VARNAME:
				case NUMBER:
				case DECIMAL:
				case STRING:
				case TRUE:
				case FALSE:
					{
					setState(152);
					stmt();
					}
					break;
				case RETURN:
					{
					setState(153);
					return_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			function_name();
			setState(162);
			match(LEFT_PARANTHESES);
			setState(163);
			function_arguments();
			setState(164);
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
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_name);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				system_function();
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
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
	}

	public final System_functionContext system_function() throws RecognitionException {
		System_functionContext _localctx = new System_functionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_system_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
	}

	public final Custom_functionContext custom_function() throws RecognitionException {
		Custom_functionContext _localctx = new Custom_functionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_custom_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(RETURN);
			setState(175);
			value_expression();
			setState(176);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(180);
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
				setState(178);
				system_type();
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
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
	}

	public final System_typeContext system_type() throws RecognitionException {
		System_typeContext _localctx = new System_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_system_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
	}

	public final Custom_typeContext custom_type() throws RecognitionException {
		Custom_typeContext _localctx = new Custom_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_custom_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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
	}

	public final Value_expressionContext value_expression() throws RecognitionException {
		Value_expressionContext _localctx = new Value_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new CosExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(189);
				match(COS);
				setState(190);
				match(LEFT_PARANTHESES);
				setState(191);
				expr(0);
				setState(192);
				match(RIGHT_PARANTHESES);
				}
				break;
			case 2:
				{
				_localctx = new TanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(TAN);
				setState(195);
				match(LEFT_PARANTHESES);
				setState(196);
				expr(0);
				setState(197);
				match(RIGHT_PARANTHESES);
				}
				break;
			case 3:
				{
				_localctx = new SinExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(SIN);
				setState(200);
				match(LEFT_PARANTHESES);
				setState(201);
				expr(0);
				setState(202);
				match(RIGHT_PARANTHESES);
				}
				break;
			case 4:
				{
				_localctx = new ParanthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(LEFT_PARANTHESES);
				setState(205);
				expr(0);
				setState(206);
				match(RIGHT_PARANTHESES);
				}
				break;
			case 5:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(NUMBER);
				}
				break;
			case 6:
				{
				_localctx = new DecimalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(DECIMAL);
				}
				break;
			case 7:
				{
				_localctx = new TrueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(TRUE);
				}
				break;
			case 8:
				{
				_localctx = new FalseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(FALSE);
				}
				break;
			case 9:
				{
				_localctx = new VarnameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(VARNAME);
				}
				break;
			case 10:
				{
				_localctx = new FunctioncallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				function_call();
				}
				break;
			case 11:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(249);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(218);
						((PowerExpressionContext)_localctx).operator = match(POWER);
						setState(219);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new MultiplyDivideExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(221);
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
						setState(222);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new AddSubtractExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(224);
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
						setState(225);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new EqualEqualExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(227);
						((EqualEqualExpressionContext)_localctx).operator = match(EQ_EQ);
						setState(228);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(230);
						((AndExpressionContext)_localctx).operator = match(AND);
						setState(231);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(233);
						((OrExpressionContext)_localctx).operator = match(OR);
						setState(234);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new LessthanExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(236);
						((LessthanExpressionContext)_localctx).operator = match(LESS_THAN);
						setState(237);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new GreaterthanExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(239);
						((GreaterthanExpressionContext)_localctx).operator = match(GREATER_THAN);
						setState(240);
						expr(11);
						}
						break;
					case 9:
						{
						_localctx = new LessthanorequalExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(242);
						((LessthanorequalExpressionContext)_localctx).operator = match(LESS_THAN_OR_EQ);
						setState(243);
						expr(10);
						}
						break;
					case 10:
						{
						_localctx = new GreaterthanorequalExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(245);
						((GreaterthanorequalExpressionContext)_localctx).operator = match(GREATER_THAN_OR_EQ);
						setState(246);
						expr(9);
						}
						break;
					case 11:
						{
						_localctx = new FactorialExpresionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(248);
						((FactorialExpresionContext)_localctx).operator = match(FACTORIAL);
						}
						break;
					}
					} 
				}
				setState(253);
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
		case 23:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0101\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3"+
		"\3\4\3\4\7\4D\n\4\f\4\16\4G\13\4\3\4\5\4J\n\4\3\4\3\4\5\4N\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\7\bb"+
		"\n\b\f\b\16\be\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\r\u0089\n\r\f\r\16\r\u008c\13\r\5\r\u008e\n\r"+
		"\3\16\3\16\3\16\7\16\u0093\n\16\f\16\16\16\u0096\13\16\5\16\u0098\n\16"+
		"\3\17\3\17\3\17\7\17\u009d\n\17\f\17\16\17\u00a0\13\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00ab\n\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\5\25\u00b7\n\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u00da\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00fc\n\31\f\31\16\31\u00ff\13\31"+
		"\3\31\2\3\60\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\5"+
		"\3\2\4\n\3\2\33\34\3\2\35\36\2\u0110\2\65\3\2\2\2\4?\3\2\2\2\6M\3\2\2"+
		"\2\bO\3\2\2\2\nU\3\2\2\2\f[\3\2\2\2\16^\3\2\2\2\20h\3\2\2\2\22n\3\2\2"+
		"\2\24t\3\2\2\2\26z\3\2\2\2\30\u008d\3\2\2\2\32\u0097\3\2\2\2\34\u0099"+
		"\3\2\2\2\36\u00a3\3\2\2\2 \u00aa\3\2\2\2\"\u00ac\3\2\2\2$\u00ae\3\2\2"+
		"\2&\u00b0\3\2\2\2(\u00b6\3\2\2\2*\u00b8\3\2\2\2,\u00ba\3\2\2\2.\u00bc"+
		"\3\2\2\2\60\u00d9\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\67\65\3\2\2\28@\5\60\31\29@\5\24"+
		"\13\2:@\5\26\f\2;<\5\36\20\2<=\7&\2\2=@\3\2\2\2>@\5\6\4\2?8\3\2\2\2?9"+
		"\3\2\2\2?:\3\2\2\2?;\3\2\2\2?>\3\2\2\2@\5\3\2\2\2AE\5\b\5\2BD\5\n\6\2"+
		"CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2HJ\5\f\7\2"+
		"IH\3\2\2\2IJ\3\2\2\2JN\3\2\2\2KN\5\22\n\2LN\5\20\t\2MA\3\2\2\2MK\3\2\2"+
		"\2ML\3\2\2\2N\7\3\2\2\2OP\7\16\2\2PQ\7&\2\2QR\5.\30\2RS\7&\2\2ST\5\16"+
		"\b\2T\t\3\2\2\2UV\7\17\2\2VW\7&\2\2WX\5.\30\2XY\7&\2\2YZ\5\16\b\2Z\13"+
		"\3\2\2\2[\\\7\20\2\2\\]\5\16\b\2]\r\3\2\2\2^c\7$\2\2_b\5\4\3\2`b\5&\24"+
		"\2a_\3\2\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2"+
		"\2fg\7%\2\2g\17\3\2\2\2hi\7\22\2\2ij\7&\2\2jk\5.\30\2kl\7&\2\2lm\5\16"+
		"\b\2m\21\3\2\2\2no\7\21\2\2op\7&\2\2pq\5.\30\2qr\7&\2\2rs\5\16\b\2s\23"+
		"\3\2\2\2tu\5(\25\2uv\7(\2\2vw\7\23\2\2wx\5.\30\2xy\7&\2\2y\25\3\2\2\2"+
		"z{\7(\2\2{|\7\"\2\2|}\5\30\r\2}~\7#\2\2~\177\7&\2\2\177\u0080\5(\25\2"+
		"\u0080\u0081\5\34\17\2\u0081\27\3\2\2\2\u0082\u0083\5(\25\2\u0083\u008a"+
		"\7(\2\2\u0084\u0085\7\'\2\2\u0085\u0086\5(\25\2\u0086\u0087\7(\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0084\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u0082\3\2\2\2\u008d\u008e\3\2\2\2\u008e\31\3\2\2\2\u008f\u0094\5.\30"+
		"\2\u0090\u0091\7\'\2\2\u0091\u0093\5.\30\2\u0092\u0090\3\2\2\2\u0093\u0096"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0098\3\2\2\2\u0098\33\3\2\2"+
		"\2\u0099\u009e\7$\2\2\u009a\u009d\5\4\3\2\u009b\u009d\5&\24\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7%"+
		"\2\2\u00a2\35\3\2\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6"+
		"\5\32\16\2\u00a6\u00a7\7#\2\2\u00a7\37\3\2\2\2\u00a8\u00ab\5\"\22\2\u00a9"+
		"\u00ab\5$\23\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab!\3\2\2\2"+
		"\u00ac\u00ad\7\3\2\2\u00ad#\3\2\2\2\u00ae\u00af\7(\2\2\u00af%\3\2\2\2"+
		"\u00b0\u00b1\7!\2\2\u00b1\u00b2\5.\30\2\u00b2\u00b3\7&\2\2\u00b3\'\3\2"+
		"\2\2\u00b4\u00b7\5*\26\2\u00b5\u00b7\5,\27\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7)\3\2\2\2\u00b8\u00b9\t\2\2\2\u00b9+\3\2\2\2\u00ba"+
		"\u00bb\7(\2\2\u00bb-\3\2\2\2\u00bc\u00bd\5\60\31\2\u00bd/\3\2\2\2\u00be"+
		"\u00bf\b\31\1\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\7\"\2\2\u00c1\u00c2\5"+
		"\60\31\2\u00c2\u00c3\7#\2\2\u00c3\u00da\3\2\2\2\u00c4\u00c5\7\r\2\2\u00c5"+
		"\u00c6\7\"\2\2\u00c6\u00c7\5\60\31\2\u00c7\u00c8\7#\2\2\u00c8\u00da\3"+
		"\2\2\2\u00c9\u00ca\7\13\2\2\u00ca\u00cb\7\"\2\2\u00cb\u00cc\5\60\31\2"+
		"\u00cc\u00cd\7#\2\2\u00cd\u00da\3\2\2\2\u00ce\u00cf\7\"\2\2\u00cf\u00d0"+
		"\5\60\31\2\u00d0\u00d1\7#\2\2\u00d1\u00da\3\2\2\2\u00d2\u00da\7)\2\2\u00d3"+
		"\u00da\7*\2\2\u00d4\u00da\7,\2\2\u00d5\u00da\7-\2\2\u00d6\u00da\7(\2\2"+
		"\u00d7\u00da\5\36\20\2\u00d8\u00da\7+\2\2\u00d9\u00be\3\2\2\2\u00d9\u00c4"+
		"\3\2\2\2\u00d9\u00c9\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00d2\3\2\2\2\u00d9"+
		"\u00d3\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00fd\3\2\2\2\u00db"+
		"\u00dc\f\24\2\2\u00dc\u00dd\7\37\2\2\u00dd\u00fc\5\60\31\25\u00de\u00df"+
		"\f\23\2\2\u00df\u00e0\t\3\2\2\u00e0\u00fc\5\60\31\24\u00e1\u00e2\f\22"+
		"\2\2\u00e2\u00e3\t\4\2\2\u00e3\u00fc\5\60\31\23\u00e4\u00e5\f\20\2\2\u00e5"+
		"\u00e6\7\24\2\2\u00e6\u00fc\5\60\31\21\u00e7\u00e8\f\17\2\2\u00e8\u00e9"+
		"\7\25\2\2\u00e9\u00fc\5\60\31\20\u00ea\u00eb\f\16\2\2\u00eb\u00ec\7\26"+
		"\2\2\u00ec\u00fc\5\60\31\17\u00ed\u00ee\f\r\2\2\u00ee\u00ef\7\27\2\2\u00ef"+
		"\u00fc\5\60\31\16\u00f0\u00f1\f\f\2\2\u00f1\u00f2\7\30\2\2\u00f2\u00fc"+
		"\5\60\31\r\u00f3\u00f4\f\13\2\2\u00f4\u00f5\7\31\2\2\u00f5\u00fc\5\60"+
		"\31\f\u00f6\u00f7\f\n\2\2\u00f7\u00f8\7\32\2\2\u00f8\u00fc\5\60\31\13"+
		"\u00f9\u00fa\f\25\2\2\u00fa\u00fc\7 \2\2\u00fb\u00db\3\2\2\2\u00fb\u00de"+
		"\3\2\2\2\u00fb\u00e1\3\2\2\2\u00fb\u00e4\3\2\2\2\u00fb\u00e7\3\2\2\2\u00fb"+
		"\u00ea\3\2\2\2\u00fb\u00ed\3\2\2\2\u00fb\u00f0\3\2\2\2\u00fb\u00f3\3\2"+
		"\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\61\3\2\2\2\u00ff\u00fd\3\2\2"+
		"\2\24\65?EIMac\u008a\u008d\u0094\u0097\u009c\u009e\u00aa\u00b6\u00d9\u00fb"+
		"\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}