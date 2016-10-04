// Generated from LOL.g4 by ANTLR 4.5.3
package org.midnightas.lolo.parsing;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LOLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, WHITESPACE=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'l'", "'L'", "'Lo'", "'LO'", "'lO'", "'lo'", "'lolo'", "'Lolo'", 
		"'lOlo'", "'loLo'", "'lolO'", "'LOlo'", "'lOLo'", "'loLO'", "'LOLo'", 
		"'lOLO'", "'LOLO'", "'lololo'", "'Lololo'", "'lOlolo'", "'loLolo'", "'lolOlo'", 
		"'loloLo'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"WHITESPACE"
	};
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


	public LOLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\2\2\32\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\3\5\2\f\f\17\17\"\"\u00a7"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t:\3\2\2\2\13="+
		"\3\2\2\2\r@\3\2\2\2\17C\3\2\2\2\21H\3\2\2\2\23M\3\2\2\2\25R\3\2\2\2\27"+
		"W\3\2\2\2\31\\\3\2\2\2\33a\3\2\2\2\35f\3\2\2\2\37k\3\2\2\2!p\3\2\2\2#"+
		"u\3\2\2\2%z\3\2\2\2\'\u0081\3\2\2\2)\u0088\3\2\2\2+\u008f\3\2\2\2-\u0096"+
		"\3\2\2\2/\u009d\3\2\2\2\61\u00a4\3\2\2\2\63\64\7n\2\2\64\4\3\2\2\2\65"+
		"\66\7N\2\2\66\6\3\2\2\2\678\7N\2\289\7q\2\29\b\3\2\2\2:;\7N\2\2;<\7Q\2"+
		"\2<\n\3\2\2\2=>\7n\2\2>?\7Q\2\2?\f\3\2\2\2@A\7n\2\2AB\7q\2\2B\16\3\2\2"+
		"\2CD\7n\2\2DE\7q\2\2EF\7n\2\2FG\7q\2\2G\20\3\2\2\2HI\7N\2\2IJ\7q\2\2J"+
		"K\7n\2\2KL\7q\2\2L\22\3\2\2\2MN\7n\2\2NO\7Q\2\2OP\7n\2\2PQ\7q\2\2Q\24"+
		"\3\2\2\2RS\7n\2\2ST\7q\2\2TU\7N\2\2UV\7q\2\2V\26\3\2\2\2WX\7n\2\2XY\7"+
		"q\2\2YZ\7n\2\2Z[\7Q\2\2[\30\3\2\2\2\\]\7N\2\2]^\7Q\2\2^_\7n\2\2_`\7q\2"+
		"\2`\32\3\2\2\2ab\7n\2\2bc\7Q\2\2cd\7N\2\2de\7q\2\2e\34\3\2\2\2fg\7n\2"+
		"\2gh\7q\2\2hi\7N\2\2ij\7Q\2\2j\36\3\2\2\2kl\7N\2\2lm\7Q\2\2mn\7N\2\2n"+
		"o\7q\2\2o \3\2\2\2pq\7n\2\2qr\7Q\2\2rs\7N\2\2st\7Q\2\2t\"\3\2\2\2uv\7"+
		"N\2\2vw\7Q\2\2wx\7N\2\2xy\7Q\2\2y$\3\2\2\2z{\7n\2\2{|\7q\2\2|}\7n\2\2"+
		"}~\7q\2\2~\177\7n\2\2\177\u0080\7q\2\2\u0080&\3\2\2\2\u0081\u0082\7N\2"+
		"\2\u0082\u0083\7q\2\2\u0083\u0084\7n\2\2\u0084\u0085\7q\2\2\u0085\u0086"+
		"\7n\2\2\u0086\u0087\7q\2\2\u0087(\3\2\2\2\u0088\u0089\7n\2\2\u0089\u008a"+
		"\7Q\2\2\u008a\u008b\7n\2\2\u008b\u008c\7q\2\2\u008c\u008d\7n\2\2\u008d"+
		"\u008e\7q\2\2\u008e*\3\2\2\2\u008f\u0090\7n\2\2\u0090\u0091\7q\2\2\u0091"+
		"\u0092\7N\2\2\u0092\u0093\7q\2\2\u0093\u0094\7n\2\2\u0094\u0095\7q\2\2"+
		"\u0095,\3\2\2\2\u0096\u0097\7n\2\2\u0097\u0098\7q\2\2\u0098\u0099\7n\2"+
		"\2\u0099\u009a\7Q\2\2\u009a\u009b\7n\2\2\u009b\u009c\7q\2\2\u009c.\3\2"+
		"\2\2\u009d\u009e\7n\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1"+
		"\7q\2\2\u00a1\u00a2\7N\2\2\u00a2\u00a3\7q\2\2\u00a3\60\3\2\2\2\u00a4\u00a5"+
		"\t\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\31\2\2\u00a7\62\3\2\2\2\3\2"+
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