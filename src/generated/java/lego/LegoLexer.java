// Generated from Lego.g4 by ANTLR 4.9
package lego;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LegoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, MUL=8, DIV=9, 
		ADD=10, SUB=11, MOD=12, GT=13, GTE=14, EQ=15, LT=16, LTE=17, NOT=18, AND=19, 
		OR=20, IMPL=21, EQUIV=22, FORALL=23, EXISTS=24, ID=25, INT=26, NEWLINE=27, 
		WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "MUL", "DIV", 
			"ADD", "SUB", "MOD", "GT", "GTE", "EQ", "LT", "LTE", "NOT", "AND", "OR", 
			"IMPL", "EQUIV", "FORALL", "EXISTS", "ID", "INT", "NEWLINE", "WS", "A", 
			"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", 
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'.'", "'('", "')'", "'['", "'..'", "']'", "'*'", "'/'", 
			"'+'", "'-'", "'%'", "'>'", "'>='", "'='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "MUL", "DIV", "ADD", 
			"SUB", "MOD", "GT", "GTE", "EQ", "LT", "LTE", "NOT", "AND", "OR", "IMPL", 
			"EQUIV", "FORALL", "EXISTS", "ID", "INT", "NEWLINE", "WS"
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


	public LegoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lego.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0124\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u009a\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00a2"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u00a9\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00b7\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00c9"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\7\32\u00db\n\32\f\32\16\32\u00de\13\32\3\33\6\33\u00e1"+
		"\n\33\r\33\16\33\u00e2\3\34\5\34\u00e6\n\34\3\34\3\34\3\35\6\35\u00eb"+
		"\n\35\r\35\16\35\u00ec\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2"+
		"Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2\3\2 \4\2C\\c|\5\2\62;C\\c|\3\2\62;\5"+
		"\2\13\f\17\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2"+
		"IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4"+
		"\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZz"+
		"z\4\2[[{{\4\2\\\\||\2\u0115\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13"+
		"w\3\2\2\2\ry\3\2\2\2\17|\3\2\2\2\21~\3\2\2\2\23\u0080\3\2\2\2\25\u0082"+
		"\3\2\2\2\27\u0084\3\2\2\2\31\u0086\3\2\2\2\33\u0088\3\2\2\2\35\u008a\3"+
		"\2\2\2\37\u008d\3\2\2\2!\u008f\3\2\2\2#\u0091\3\2\2\2%\u0099\3\2\2\2\'"+
		"\u00a1\3\2\2\2)\u00a8\3\2\2\2+\u00b6\3\2\2\2-\u00c8\3\2\2\2/\u00ca\3\2"+
		"\2\2\61\u00d1\3\2\2\2\63\u00d8\3\2\2\2\65\u00e0\3\2\2\2\67\u00e5\3\2\2"+
		"\29\u00ea\3\2\2\2;\u00f0\3\2\2\2=\u00f2\3\2\2\2?\u00f4\3\2\2\2A\u00f6"+
		"\3\2\2\2C\u00f8\3\2\2\2E\u00fa\3\2\2\2G\u00fc\3\2\2\2I\u00fe\3\2\2\2K"+
		"\u0100\3\2\2\2M\u0102\3\2\2\2O\u0104\3\2\2\2Q\u0106\3\2\2\2S\u0108\3\2"+
		"\2\2U\u010a\3\2\2\2W\u010c\3\2\2\2Y\u010e\3\2\2\2[\u0110\3\2\2\2]\u0112"+
		"\3\2\2\2_\u0114\3\2\2\2a\u0116\3\2\2\2c\u0118\3\2\2\2e\u011a\3\2\2\2g"+
		"\u011c\3\2\2\2i\u011e\3\2\2\2k\u0120\3\2\2\2m\u0122\3\2\2\2op\7<\2\2p"+
		"\4\3\2\2\2qr\7\60\2\2r\6\3\2\2\2st\7*\2\2t\b\3\2\2\2uv\7+\2\2v\n\3\2\2"+
		"\2wx\7]\2\2x\f\3\2\2\2yz\7\60\2\2z{\7\60\2\2{\16\3\2\2\2|}\7_\2\2}\20"+
		"\3\2\2\2~\177\7,\2\2\177\22\3\2\2\2\u0080\u0081\7\61\2\2\u0081\24\3\2"+
		"\2\2\u0082\u0083\7-\2\2\u0083\26\3\2\2\2\u0084\u0085\7/\2\2\u0085\30\3"+
		"\2\2\2\u0086\u0087\7\'\2\2\u0087\32\3\2\2\2\u0088\u0089\7@\2\2\u0089\34"+
		"\3\2\2\2\u008a\u008b\7@\2\2\u008b\u008c\7?\2\2\u008c\36\3\2\2\2\u008d"+
		"\u008e\7?\2\2\u008e \3\2\2\2\u008f\u0090\7>\2\2\u0090\"\3\2\2\2\u0091"+
		"\u0092\7>\2\2\u0092\u0093\7?\2\2\u0093$\3\2\2\2\u0094\u009a\7#\2\2\u0095"+
		"\u0096\5U+\2\u0096\u0097\5W,\2\u0097\u0098\5a\61\2\u0098\u009a\3\2\2\2"+
		"\u0099\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u009a&\3\2\2\2\u009b\u009c\7"+
		"(\2\2\u009c\u00a2\7(\2\2\u009d\u009e\5;\36\2\u009e\u009f\5U+\2\u009f\u00a0"+
		"\5A!\2\u00a0\u00a2\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2"+
		"(\3\2\2\2\u00a3\u00a4\7~\2\2\u00a4\u00a9\7~\2\2\u00a5\u00a6\5W,\2\u00a6"+
		"\u00a7\5]/\2\u00a7\u00a9\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a5\3\2\2"+
		"\2\u00a9*\3\2\2\2\u00aa\u00ab\7/\2\2\u00ab\u00b7\7@\2\2\u00ac\u00ad\7"+
		"?\2\2\u00ad\u00b7\7@\2\2\u00ae\u00af\5K&\2\u00af\u00b0\5S*\2\u00b0\u00b1"+
		"\5Y-\2\u00b1\u00b2\5Q)\2\u00b2\u00b3\5K&\2\u00b3\u00b4\5C\"\2\u00b4\u00b5"+
		"\5_\60\2\u00b5\u00b7\3\2\2\2\u00b6\u00aa\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b6"+
		"\u00ae\3\2\2\2\u00b7,\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9\u00ba\7/\2\2\u00ba"+
		"\u00c9\7@\2\2\u00bb\u00bc\7>\2\2\u00bc\u00bd\7?\2\2\u00bd\u00c9\7@\2\2"+
		"\u00be\u00bf\5C\"\2\u00bf\u00c0\5[.\2\u00c0\u00c1\5c\62\2\u00c1\u00c2"+
		"\5K&\2\u00c2\u00c3\5e\63\2\u00c3\u00c9\3\2\2\2\u00c4\u00c5\5K&\2\u00c5"+
		"\u00c6\5E#\2\u00c6\u00c7\5E#\2\u00c7\u00c9\3\2\2\2\u00c8\u00b8\3\2\2\2"+
		"\u00c8\u00bb\3\2\2\2\u00c8\u00be\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9.\3"+
		"\2\2\2\u00ca\u00cb\5E#\2\u00cb\u00cc\5W,\2\u00cc\u00cd\5]/\2\u00cd\u00ce"+
		"\5;\36\2\u00ce\u00cf\5Q)\2\u00cf\u00d0\5Q)\2\u00d0\60\3\2\2\2\u00d1\u00d2"+
		"\5C\"\2\u00d2\u00d3\5i\65\2\u00d3\u00d4\5K&\2\u00d4\u00d5\5_\60\2\u00d5"+
		"\u00d6\5a\61\2\u00d6\u00d7\5_\60\2\u00d7\62\3\2\2\2\u00d8\u00dc\t\2\2"+
		"\2\u00d9\u00db\t\3\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\64\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e1\t\4\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\66\3\2\2\2\u00e4\u00e6\7\17\2\2\u00e5\u00e4"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\f\2\2\u00e8"+
		"8\3\2\2\2\u00e9\u00eb\t\5\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2"+
		"\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\b\35\2\2\u00ef:\3\2\2\2\u00f0\u00f1\t\6\2\2\u00f1<\3\2\2\2\u00f2\u00f3"+
		"\t\7\2\2\u00f3>\3\2\2\2\u00f4\u00f5\t\b\2\2\u00f5@\3\2\2\2\u00f6\u00f7"+
		"\t\t\2\2\u00f7B\3\2\2\2\u00f8\u00f9\t\n\2\2\u00f9D\3\2\2\2\u00fa\u00fb"+
		"\t\13\2\2\u00fbF\3\2\2\2\u00fc\u00fd\t\f\2\2\u00fdH\3\2\2\2\u00fe\u00ff"+
		"\t\r\2\2\u00ffJ\3\2\2\2\u0100\u0101\t\16\2\2\u0101L\3\2\2\2\u0102\u0103"+
		"\t\17\2\2\u0103N\3\2\2\2\u0104\u0105\t\20\2\2\u0105P\3\2\2\2\u0106\u0107"+
		"\t\21\2\2\u0107R\3\2\2\2\u0108\u0109\t\22\2\2\u0109T\3\2\2\2\u010a\u010b"+
		"\t\23\2\2\u010bV\3\2\2\2\u010c\u010d\t\24\2\2\u010dX\3\2\2\2\u010e\u010f"+
		"\t\25\2\2\u010fZ\3\2\2\2\u0110\u0111\t\26\2\2\u0111\\\3\2\2\2\u0112\u0113"+
		"\t\27\2\2\u0113^\3\2\2\2\u0114\u0115\t\30\2\2\u0115`\3\2\2\2\u0116\u0117"+
		"\t\31\2\2\u0117b\3\2\2\2\u0118\u0119\t\32\2\2\u0119d\3\2\2\2\u011a\u011b"+
		"\t\33\2\2\u011bf\3\2\2\2\u011c\u011d\t\34\2\2\u011dh\3\2\2\2\u011e\u011f"+
		"\t\35\2\2\u011fj\3\2\2\2\u0120\u0121\t\36\2\2\u0121l\3\2\2\2\u0122\u0123"+
		"\t\37\2\2\u0123n\3\2\2\2\f\2\u0099\u00a1\u00a8\u00b6\u00c8\u00dc\u00e2"+
		"\u00e5\u00ec\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}