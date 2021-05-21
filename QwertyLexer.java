// Generated from Qwerty.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QwertyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SIN=1, COS=2, TAN=3, VARNAME=4, NUMBER=5, MULITPLY=6, DIVIDE=7, ADD=8, 
		SUBTRACT=9, POWER=10, FACTORIAL=11, LEFT_PARANTHESES=12, RIGHT_PARANTHESES=13, 
		ESCAPE_CHARS=14, SPACES=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SIN", "COS", "TAN", "VARNAME", "NUMBER", "MULITPLY", "DIVIDE", "ADD", 
			"SUBTRACT", "POWER", "FACTORIAL", "LEFT_PARANTHESES", "RIGHT_PARANTHESES", 
			"ESCAPE_CHARS", "SPACES"
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


	public QwertyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Qwerty.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\6\5/\n\5\r\5\16\5\60\3\5\7\5\64\n\5\f"+
		"\5\16\5\67\13\5\3\6\5\6:\n\6\3\6\6\6=\n\6\r\6\16\6>\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17R\n\17\r\17"+
		"\16\17S\3\17\3\17\3\20\6\20Y\n\20\r\20\16\20Z\3\20\3\20\2\2\21\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3"+
		"\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2\n\f\16\17\3\2\"\"\2c\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5%\3\2\2\2\7"+
		")\3\2\2\2\t.\3\2\2\2\139\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21D\3\2\2\2\23"+
		"F\3\2\2\2\25H\3\2\2\2\27J\3\2\2\2\31L\3\2\2\2\33N\3\2\2\2\35Q\3\2\2\2"+
		"\37X\3\2\2\2!\"\7U\2\2\"#\7k\2\2#$\7p\2\2$\4\3\2\2\2%&\7E\2\2&\'\7q\2"+
		"\2\'(\7u\2\2(\6\3\2\2\2)*\7V\2\2*+\7c\2\2+,\7p\2\2,\b\3\2\2\2-/\t\2\2"+
		"\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\65\3\2\2\2\62\64"+
		"\t\3\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\n"+
		"\3\2\2\2\67\65\3\2\2\28:\7/\2\298\3\2\2\29:\3\2\2\2:<\3\2\2\2;=\t\4\2"+
		"\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\f\3\2\2\2@A\7,\2\2A\16\3\2"+
		"\2\2BC\7\61\2\2C\20\3\2\2\2DE\7-\2\2E\22\3\2\2\2FG\7/\2\2G\24\3\2\2\2"+
		"HI\7`\2\2I\26\3\2\2\2JK\7#\2\2K\30\3\2\2\2LM\7*\2\2M\32\3\2\2\2NO\7+\2"+
		"\2O\34\3\2\2\2PR\t\5\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2"+
		"\2\2UV\b\17\2\2V\36\3\2\2\2WY\t\6\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z["+
		"\3\2\2\2[\\\3\2\2\2\\]\b\20\2\2] \3\2\2\2\t\2\60\659>SZ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}