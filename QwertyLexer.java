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
		VARNAME=1, NUMBER=2, MULITPLY=3, DIVIDE=4, ADD=5, SUBTRACT=6, POWER=7, 
		FACTORIAL=8, SIN=9, COS=10, TAN=11, LEFT_PARANTHESES=12, RIGHT_PARANTHESES=13, 
		ESCAPE_CHARS=14, SPACES=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VARNAME", "NUMBER", "MULITPLY", "DIVIDE", "ADD", "SUBTRACT", "POWER", 
			"FACTORIAL", "SIN", "COS", "TAN", "LEFT_PARANTHESES", "RIGHT_PARANTHESES", 
			"ESCAPE_CHARS", "SPACES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'*'", "'/'", "'+'", "'-'", "'^'", "'!'", "'Sin('", 
			"'Cos('", "'Tan('", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARNAME", "NUMBER", "MULITPLY", "DIVIDE", "ADD", "SUBTRACT", "POWER", 
			"FACTORIAL", "SIN", "COS", "TAN", "LEFT_PARANTHESES", "RIGHT_PARANTHESES", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21a\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2#\n\2\r\2\16"+
		"\2$\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\5\3.\n\3\3\3\6\3\61\n\3\r\3\16\3\62"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17"+
		"U\n\17\r\17\16\17V\3\17\3\17\3\20\6\20\\\n\20\r\20\16\20]\3\20\3\20\2"+
		"\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2\n\f\16\17\3\2\""+
		"\"\2f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3\"\3\2\2\2\5"+
		"-\3\2\2\2\7\64\3\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2"+
		"\21>\3\2\2\2\23@\3\2\2\2\25E\3\2\2\2\27J\3\2\2\2\31O\3\2\2\2\33Q\3\2\2"+
		"\2\35T\3\2\2\2\37[\3\2\2\2!#\t\2\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$"+
		"%\3\2\2\2%)\3\2\2\2&(\t\3\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2"+
		"\2*\4\3\2\2\2+)\3\2\2\2,.\7/\2\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/\61\t"+
		"\4\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\6\3\2"+
		"\2\2\64\65\7,\2\2\65\b\3\2\2\2\66\67\7\61\2\2\67\n\3\2\2\289\7-\2\29\f"+
		"\3\2\2\2:;\7/\2\2;\16\3\2\2\2<=\7`\2\2=\20\3\2\2\2>?\7#\2\2?\22\3\2\2"+
		"\2@A\7U\2\2AB\7k\2\2BC\7p\2\2CD\7*\2\2D\24\3\2\2\2EF\7E\2\2FG\7q\2\2G"+
		"H\7u\2\2HI\7*\2\2I\26\3\2\2\2JK\7V\2\2KL\7c\2\2LM\7p\2\2MN\7*\2\2N\30"+
		"\3\2\2\2OP\7*\2\2P\32\3\2\2\2QR\7+\2\2R\34\3\2\2\2SU\t\5\2\2TS\3\2\2\2"+
		"UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\b\17\2\2Y\36\3\2\2\2Z\\\t\6"+
		"\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\b\20\2\2` \3"+
		"\2\2\2\t\2$)-\62V]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}