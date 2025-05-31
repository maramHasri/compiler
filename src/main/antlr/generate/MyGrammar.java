// Generated from MyGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_OPEN=1, TAG_CLOSE=2, TAG_OPEN_SLASH=3, TAG_SLASH_CLOSE=4, EQUALS=5, 
		STAR=6, LBRACK=7, RBRACK=8, INTERPOLATION=9, STRING=10, IDENT=11, TEXT=12, 
		WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TAG_OPEN", "TAG_CLOSE", "TAG_OPEN_SLASH", "TAG_SLASH_CLOSE", "EQUALS", 
			"STAR", "LBRACK", "RBRACK", "INTERPOLATION", "STRING", "IDENT", "TEXT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'</'", "'/>'", "'='", "'*'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAG_OPEN", "TAG_CLOSE", "TAG_OPEN_SLASH", "TAG_SLASH_CLOSE", "EQUALS", 
			"STAR", "LBRACK", "RBRACK", "INTERPOLATION", "STRING", "IDENT", "TEXT", 
			"WS"
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


	public MyGrammar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n\64\n\n\f\n\16\n\67"+
		"\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13@\n\13\f\13\16\13C\13\13\3\13"+
		"\3\13\3\f\3\f\7\fI\n\f\f\f\16\fL\13\f\3\r\6\rO\n\r\r\r\16\rP\3\16\6\16"+
		"T\n\16\r\16\16\16U\3\16\3\16\3\65\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\3\2\7\4\2$$^^\5\2C\\aac|\7\2//\62;C\\a"+
		"ac|\b\2\13\f\17\17$$>@}}\177\177\5\2\13\f\17\17\"\"\2^\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t$\3\2\2\2\13\'\3\2\2\2"+
		"\r)\3\2\2\2\17+\3\2\2\2\21-\3\2\2\2\23/\3\2\2\2\25;\3\2\2\2\27F\3\2\2"+
		"\2\31N\3\2\2\2\33S\3\2\2\2\35\36\7>\2\2\36\4\3\2\2\2\37 \7@\2\2 \6\3\2"+
		"\2\2!\"\7>\2\2\"#\7\61\2\2#\b\3\2\2\2$%\7\61\2\2%&\7@\2\2&\n\3\2\2\2\'"+
		"(\7?\2\2(\f\3\2\2\2)*\7,\2\2*\16\3\2\2\2+,\7]\2\2,\20\3\2\2\2-.\7_\2\2"+
		".\22\3\2\2\2/\60\7}\2\2\60\61\7}\2\2\61\65\3\2\2\2\62\64\13\2\2\2\63\62"+
		"\3\2\2\2\64\67\3\2\2\2\65\66\3\2\2\2\65\63\3\2\2\2\668\3\2\2\2\67\65\3"+
		"\2\2\289\7\177\2\29:\7\177\2\2:\24\3\2\2\2;A\7$\2\2<@\n\2\2\2=>\7^\2\2"+
		">@\13\2\2\2?<\3\2\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2"+
		"\2CA\3\2\2\2DE\7$\2\2E\26\3\2\2\2FJ\t\3\2\2GI\t\4\2\2HG\3\2\2\2IL\3\2"+
		"\2\2JH\3\2\2\2JK\3\2\2\2K\30\3\2\2\2LJ\3\2\2\2MO\n\5\2\2NM\3\2\2\2OP\3"+
		"\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\32\3\2\2\2RT\t\6\2\2SR\3\2\2\2TU\3\2\2\2U"+
		"S\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\b\16\2\2X\34\3\2\2\2\t\2\65?AJPU\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}