// Generated from src/main/antlr/MyGrammar.g4 by ANTLR 4.7.2
package my.grammar;
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
		TAG_END_OPEN=1, TAG_OPEN=2, TAG_CLOSE=3, INTERPOLATION_START=4, INTERPOLATION_END=5, 
		LSQUARE=6, RSQUARE=7, LPAREN=8, RPAREN=9, STAR=10, DOT=11, PLUS=12, MINUS=13, 
		DIV=14, EQEQ=15, NOTEQ=16, ANDAND=17, OROR=18, COMMA=19, COLON=20, QUESTION=21, 
		EQUAL=22, STRING=23, NUMBER=24, IDENTIFIER=25, WS=26, TEXT=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TAG_END_OPEN", "TAG_OPEN", "TAG_CLOSE", "INTERPOLATION_START", "INTERPOLATION_END", 
			"LSQUARE", "RSQUARE", "LPAREN", "RPAREN", "STAR", "DOT", "PLUS", "MINUS", 
			"DIV", "EQEQ", "NOTEQ", "ANDAND", "OROR", "COMMA", "COLON", "QUESTION", 
			"EQUAL", "STRING", "NUMBER", "IDENTIFIER", "WS", "TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'</'", "'<'", "'>'", "'{{'", "'}}'", "'['", "']'", "'('", "')'", 
			"'*'", "'.'", "'+'", "'-'", "'/'", "'=='", "'!='", "'&&'", "'||'", "','", 
			"':'", "'?'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAG_END_OPEN", "TAG_OPEN", "TAG_CLOSE", "INTERPOLATION_START", 
			"INTERPOLATION_END", "LSQUARE", "RSQUARE", "LPAREN", "RPAREN", "STAR", 
			"DOT", "PLUS", "MINUS", "DIV", "EQEQ", "NOTEQ", "ANDAND", "OROR", "COMMA", 
			"COLON", "QUESTION", "EQUAL", "STRING", "NUMBER", "IDENTIFIER", "WS", 
			"TEXT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\7\30"+
		"o\n\30\f\30\16\30r\13\30\3\30\3\30\3\31\6\31w\n\31\r\31\16\31x\3\32\3"+
		"\32\7\32}\n\32\f\32\16\32\u0080\13\32\3\33\6\33\u0083\n\33\r\33\16\33"+
		"\u0084\3\33\3\33\3\34\6\34\u008a\n\34\r\34\16\34\u008b\2\2\35\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\b\5\2\f\f\17"+
		"\17$$\3\2\62;\5\2C\\aac|\7\2//\62;C\\aac|\5\2\13\f\17\17\"\"\f\2\13\f"+
		"\17\17\"\"$$)+>@]]__}}\177\177\2\u0091\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5<\3\2\2\2\7>\3\2\2\2\t@\3\2\2\2\13C"+
		"\3\2\2\2\rF\3\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27"+
		"P\3\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37X\3\2\2\2![\3\2\2\2#^"+
		"\3\2\2\2%a\3\2\2\2\'d\3\2\2\2)f\3\2\2\2+h\3\2\2\2-j\3\2\2\2/l\3\2\2\2"+
		"\61v\3\2\2\2\63z\3\2\2\2\65\u0082\3\2\2\2\67\u0089\3\2\2\29:\7>\2\2:;"+
		"\7\61\2\2;\4\3\2\2\2<=\7>\2\2=\6\3\2\2\2>?\7@\2\2?\b\3\2\2\2@A\7}\2\2"+
		"AB\7}\2\2B\n\3\2\2\2CD\7\177\2\2DE\7\177\2\2E\f\3\2\2\2FG\7]\2\2G\16\3"+
		"\2\2\2HI\7_\2\2I\20\3\2\2\2JK\7*\2\2K\22\3\2\2\2LM\7+\2\2M\24\3\2\2\2"+
		"NO\7,\2\2O\26\3\2\2\2PQ\7\60\2\2Q\30\3\2\2\2RS\7-\2\2S\32\3\2\2\2TU\7"+
		"/\2\2U\34\3\2\2\2VW\7\61\2\2W\36\3\2\2\2XY\7?\2\2YZ\7?\2\2Z \3\2\2\2["+
		"\\\7#\2\2\\]\7?\2\2]\"\3\2\2\2^_\7(\2\2_`\7(\2\2`$\3\2\2\2ab\7~\2\2bc"+
		"\7~\2\2c&\3\2\2\2de\7.\2\2e(\3\2\2\2fg\7<\2\2g*\3\2\2\2hi\7A\2\2i,\3\2"+
		"\2\2jk\7?\2\2k.\3\2\2\2lp\7$\2\2mo\n\2\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2"+
		"\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7$\2\2t\60\3\2\2\2uw\t\3\2\2vu\3\2"+
		"\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\62\3\2\2\2z~\t\4\2\2{}\t\5\2\2|{\3"+
		"\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\64\3\2\2\2\u0080~\3\2"+
		"\2\2\u0081\u0083\t\6\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\33"+
		"\2\2\u0087\66\3\2\2\2\u0088\u008a\n\7\2\2\u0089\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c8\3\2\2\2\b\2px"+
		"~\u0084\u008b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}