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
		PRINT=1, INT_TYPE=2, FLOAT_TYPE=3, DOUBLE_TYPE=4, CHAR_TYPE=5, STRING_TYPE=6, 
		VOID_TYPE=7, BOOL_TYPE=8, SIN=9, COS=10, TAN=11, IF=12, ELIF=13, ELSE=14, 
		EQ=15, EQ_EQ=16, AND=17, OR=18, LESS_THAN=19, GREATER_THAN=20, LESS_THAN_OR_EQ=21, 
		GREATER_THAN_OR_EQ=22, MULITPLY=23, DIVIDE=24, ADD=25, SUBTRACT=26, POWER=27, 
		FACTORIAL=28, RETURN=29, LEFT_PARANTHESES=30, RIGHT_PARANTHESES=31, LEFT_BRACKET=32, 
		RIGHT_BRACKET=33, COLON=34, COMMA=35, VARNAME=36, NUMBER=37, DECIMAL=38, 
		STRING=39, TRUE=40, FALSE=41, ESCAPE_CHARS=42, SPACES=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "CHAR_TYPE", "STRING_TYPE", 
			"VOID_TYPE", "BOOL_TYPE", "SIN", "COS", "TAN", "IF", "ELIF", "ELSE", 
			"EQ", "EQ_EQ", "AND", "OR", "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQ", 
			"GREATER_THAN_OR_EQ", "MULITPLY", "DIVIDE", "ADD", "SUBTRACT", "POWER", 
			"FACTORIAL", "RETURN", "LEFT_PARANTHESES", "RIGHT_PARANTHESES", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "COLON", "COMMA", "VARNAME", "NUMBER", "DECIMAL", "STRING", 
			"TRUE", "FALSE", "ESCAPE_CHARS", "SPACES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Print'", "'Int'", "'Float'", "'Double'", "'Char'", "'String'", 
			"'Void'", "'Bool'", "'Sin'", "'Cos'", "'Tan'", "'If'", "'Elif'", "'Else'", 
			"'='", "'=='", "'And'", "'Or'", "'<'", "'>'", "'<='", "'>='", "'*'", 
			"'/'", "'+'", "'-'", "'^'", "'!'", "'Return'", "'('", "')'", "'{'", "'}'", 
			"':'", "','", null, null, null, null, "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "INT_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "CHAR_TYPE", 
			"STRING_TYPE", "VOID_TYPE", "BOOL_TYPE", "SIN", "COS", "TAN", "IF", "ELIF", 
			"ELSE", "EQ", "EQ_EQ", "AND", "OR", "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQ", 
			"GREATER_THAN_OR_EQ", "MULITPLY", "DIVIDE", "ADD", "SUBTRACT", "POWER", 
			"FACTORIAL", "RETURN", "LEFT_PARANTHESES", "RIGHT_PARANTHESES", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "COLON", "COMMA", "VARNAME", "NUMBER", "DECIMAL", "STRING", 
			"TRUE", "FALSE", "ESCAPE_CHARS", "SPACES"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0117\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\6%\u00d6\n"+
		"%\r%\16%\u00d7\3%\7%\u00db\n%\f%\16%\u00de\13%\3&\5&\u00e1\n&\3&\6&\u00e4"+
		"\n&\r&\16&\u00e5\3\'\5\'\u00e9\n\'\3\'\6\'\u00ec\n\'\r\'\16\'\u00ed\3"+
		"\'\3\'\6\'\u00f2\n\'\r\'\16\'\u00f3\3(\3(\7(\u00f8\n(\f(\16(\u00fb\13"+
		"(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\6+\u010b\n+\r+\16+\u010c\3"+
		"+\3+\3,\6,\u0112\n,\r,\16,\u0113\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-\3\2\n\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2\60\60\3\2$$\7\2\"\"\62"+
		";C\\aac|\4\2\n\f\16\17\3\2\"\"\2\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5"+
		"_\3\2\2\2\7c\3\2\2\2\ti\3\2\2\2\13p\3\2\2\2\ru\3\2\2\2\17|\3\2\2\2\21"+
		"\u0081\3\2\2\2\23\u0086\3\2\2\2\25\u008a\3\2\2\2\27\u008e\3\2\2\2\31\u0092"+
		"\3\2\2\2\33\u0095\3\2\2\2\35\u009a\3\2\2\2\37\u009f\3\2\2\2!\u00a1\3\2"+
		"\2\2#\u00a4\3\2\2\2%\u00a8\3\2\2\2\'\u00ab\3\2\2\2)\u00ad\3\2\2\2+\u00af"+
		"\3\2\2\2-\u00b2\3\2\2\2/\u00b5\3\2\2\2\61\u00b7\3\2\2\2\63\u00b9\3\2\2"+
		"\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00bf\3\2\2\2;\u00c1\3\2\2\2=\u00c8"+
		"\3\2\2\2?\u00ca\3\2\2\2A\u00cc\3\2\2\2C\u00ce\3\2\2\2E\u00d0\3\2\2\2G"+
		"\u00d2\3\2\2\2I\u00d5\3\2\2\2K\u00e0\3\2\2\2M\u00e8\3\2\2\2O\u00f5\3\2"+
		"\2\2Q\u00fe\3\2\2\2S\u0103\3\2\2\2U\u010a\3\2\2\2W\u0111\3\2\2\2YZ\7R"+
		"\2\2Z[\7t\2\2[\\\7k\2\2\\]\7p\2\2]^\7v\2\2^\4\3\2\2\2_`\7K\2\2`a\7p\2"+
		"\2ab\7v\2\2b\6\3\2\2\2cd\7H\2\2de\7n\2\2ef\7q\2\2fg\7c\2\2gh\7v\2\2h\b"+
		"\3\2\2\2ij\7F\2\2jk\7q\2\2kl\7w\2\2lm\7d\2\2mn\7n\2\2no\7g\2\2o\n\3\2"+
		"\2\2pq\7E\2\2qr\7j\2\2rs\7c\2\2st\7t\2\2t\f\3\2\2\2uv\7U\2\2vw\7v\2\2"+
		"wx\7t\2\2xy\7k\2\2yz\7p\2\2z{\7i\2\2{\16\3\2\2\2|}\7X\2\2}~\7q\2\2~\177"+
		"\7k\2\2\177\u0080\7f\2\2\u0080\20\3\2\2\2\u0081\u0082\7D\2\2\u0082\u0083"+
		"\7q\2\2\u0083\u0084\7q\2\2\u0084\u0085\7n\2\2\u0085\22\3\2\2\2\u0086\u0087"+
		"\7U\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\24\3\2\2\2\u008a\u008b"+
		"\7E\2\2\u008b\u008c\7q\2\2\u008c\u008d\7u\2\2\u008d\26\3\2\2\2\u008e\u008f"+
		"\7V\2\2\u008f\u0090\7c\2\2\u0090\u0091\7p\2\2\u0091\30\3\2\2\2\u0092\u0093"+
		"\7K\2\2\u0093\u0094\7h\2\2\u0094\32\3\2\2\2\u0095\u0096\7G\2\2\u0096\u0097"+
		"\7n\2\2\u0097\u0098\7k\2\2\u0098\u0099\7h\2\2\u0099\34\3\2\2\2\u009a\u009b"+
		"\7G\2\2\u009b\u009c\7n\2\2\u009c\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e"+
		"\36\3\2\2\2\u009f\u00a0\7?\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7?\2\2\u00a2"+
		"\u00a3\7?\2\2\u00a3\"\3\2\2\2\u00a4\u00a5\7C\2\2\u00a5\u00a6\7p\2\2\u00a6"+
		"\u00a7\7f\2\2\u00a7$\3\2\2\2\u00a8\u00a9\7Q\2\2\u00a9\u00aa\7t\2\2\u00aa"+
		"&\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac(\3\2\2\2\u00ad\u00ae\7@\2\2\u00ae*"+
		"\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\u00b1\7?\2\2\u00b1,\3\2\2\2\u00b2\u00b3"+
		"\7@\2\2\u00b3\u00b4\7?\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6\60"+
		"\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8\62\3\2\2\2\u00b9\u00ba\7-\2\2\u00ba"+
		"\64\3\2\2\2\u00bb\u00bc\7/\2\2\u00bc\66\3\2\2\2\u00bd\u00be\7`\2\2\u00be"+
		"8\3\2\2\2\u00bf\u00c0\7#\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7T\2\2\u00c2\u00c3"+
		"\7g\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6\7t\2\2\u00c6"+
		"\u00c7\7p\2\2\u00c7<\3\2\2\2\u00c8\u00c9\7*\2\2\u00c9>\3\2\2\2\u00ca\u00cb"+
		"\7+\2\2\u00cb@\3\2\2\2\u00cc\u00cd\7}\2\2\u00cdB\3\2\2\2\u00ce\u00cf\7"+
		"\177\2\2\u00cfD\3\2\2\2\u00d0\u00d1\7<\2\2\u00d1F\3\2\2\2\u00d2\u00d3"+
		"\7.\2\2\u00d3H\3\2\2\2\u00d4\u00d6\t\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00dc\3\2\2\2\u00d9"+
		"\u00db\t\3\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00ddJ\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1"+
		"\7/\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e4\t\4\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6L\3\2\2\2\u00e7\u00e9\7/\2\2\u00e8\u00e7"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\t\4\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\t\5\2\2\u00f0\u00f2\t\4\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4N\3\2\2\2\u00f5\u00f9\t\6\2\2\u00f6\u00f8\t\7\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\t\6\2\2\u00fdP\3\2\2\2"+
		"\u00fe\u00ff\7V\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7w\2\2\u0101\u0102"+
		"\7g\2\2\u0102R\3\2\2\2\u0103\u0104\7H\2\2\u0104\u0105\7c\2\2\u0105\u0106"+
		"\7n\2\2\u0106\u0107\7u\2\2\u0107\u0108\7g\2\2\u0108T\3\2\2\2\u0109\u010b"+
		"\t\b\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b+\2\2\u010fV\3\2\2\2\u0110"+
		"\u0112\t\t\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\b,\2\2\u0116"+
		"X\3\2\2\2\r\2\u00d7\u00dc\u00e0\u00e5\u00e8\u00ed\u00f3\u00f9\u010c\u0113"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}