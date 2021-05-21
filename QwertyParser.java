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
		SIN=1, COS=2, TAN=3, VARNAME=4, NUMBER=5, MULITPLY=6, DIVIDE=7, ADD=8, 
		SUBTRACT=9, POWER=10, FACTORIAL=11, LEFT_PARANTHESES=12, RIGHT_PARANTHESES=13, 
		ESCAPE_CHARS=14, SPACES=15;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Sin'", "'Cos'", "'Tan'", null, null, "'*'", "'/'", "'+'", "'-'", 
			"'^'", "'!'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SIN", "COS", "TAN", "VARNAME", "NUMBER", "MULITPLY", "DIVIDE", 
			"ADD", "SUBTRACT", "POWER", "FACTORIAL", "LEFT_PARANTHESES", "RIGHT_PARANTHESES", 
			"ESCAPE_CHARS", "SPACES"
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
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIN) | (1L << COS) | (1L << TAN) | (1L << VARNAME) | (1L << NUMBER) | (1L << LEFT_PARANTHESES))) != 0)) {
				{
				{
				setState(6);
				stmt();
				}
				}
				setState(11);
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
		public TerminalNode VARNAME() { return getToken(QwertyParser.VARNAME, 0); }
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
			setState(14);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(VARNAME);
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COS:
				{
				_localctx = new CosExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(17);
				match(COS);
				setState(18);
				match(LEFT_PARANTHESES);
				setState(19);
				expr(0);
				setState(20);
				match(RIGHT_PARANTHESES);
				}
				break;
			case TAN:
				{
				_localctx = new TanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				match(TAN);
				setState(23);
				match(LEFT_PARANTHESES);
				setState(24);
				expr(0);
				setState(25);
				match(RIGHT_PARANTHESES);
				}
				break;
			case SIN:
				{
				_localctx = new SinExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				match(SIN);
				setState(28);
				match(LEFT_PARANTHESES);
				setState(29);
				expr(0);
				setState(30);
				match(RIGHT_PARANTHESES);
				}
				break;
			case LEFT_PARANTHESES:
				{
				_localctx = new ParanthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(LEFT_PARANTHESES);
				setState(33);
				expr(0);
				setState(34);
				match(RIGHT_PARANTHESES);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(NUMBER);
				}
				break;
			case VARNAME:
				{
				_localctx = new VarnameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(VARNAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(51);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(40);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(41);
						((PowerExpressionContext)_localctx).operator = match(POWER);
						setState(42);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new MultiplyDivideExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(43);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(44);
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
						setState(45);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new AddSubtractExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(46);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(47);
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
						setState(48);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new FactorialExpresionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(49);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(50);
						((FactorialExpresionContext)_localctx).operator = match(FACTORIAL);
						}
						break;
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\3\3\3\5\3\21\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\66\n"+
		"\4\f\4\16\49\13\4\3\4\2\3\6\5\2\4\6\2\4\3\2\b\t\3\2\n\13\2B\2\13\3\2\2"+
		"\2\4\20\3\2\2\2\6(\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\r\3\2\2\2\13\t\3"+
		"\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\13\3\2\2\2\16\21\5\6\4\2\17\21\7\6\2"+
		"\2\20\16\3\2\2\2\20\17\3\2\2\2\21\5\3\2\2\2\22\23\b\4\1\2\23\24\7\4\2"+
		"\2\24\25\7\16\2\2\25\26\5\6\4\2\26\27\7\17\2\2\27)\3\2\2\2\30\31\7\5\2"+
		"\2\31\32\7\16\2\2\32\33\5\6\4\2\33\34\7\17\2\2\34)\3\2\2\2\35\36\7\3\2"+
		"\2\36\37\7\16\2\2\37 \5\6\4\2 !\7\17\2\2!)\3\2\2\2\"#\7\16\2\2#$\5\6\4"+
		"\2$%\7\17\2\2%)\3\2\2\2&)\7\7\2\2\')\7\6\2\2(\22\3\2\2\2(\30\3\2\2\2("+
		"\35\3\2\2\2(\"\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\67\3\2\2\2*+\f\b\2\2+,\7"+
		"\f\2\2,\66\5\6\4\t-.\f\7\2\2./\t\2\2\2/\66\5\6\4\b\60\61\f\6\2\2\61\62"+
		"\t\3\2\2\62\66\5\6\4\7\63\64\f\t\2\2\64\66\7\r\2\2\65*\3\2\2\2\65-\3\2"+
		"\2\2\65\60\3\2\2\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\2"+
		"8\7\3\2\2\29\67\3\2\2\2\7\13\20(\65\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}