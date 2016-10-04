// Generated from LOL.g4 by ANTLR 4.5.3
package org.midnightas.lolo.parsing;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LOLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, WHITESPACE=24;
	public static final int
		RULE_program = 0, RULE_endingL = 1, RULE_lo = 2;
	public static final String[] ruleNames = {
		"program", "endingL", "lo"
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

	@Override
	public String getGrammarFileName() { return "LOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LOLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<LoContext> lo() {
			return getRuleContexts(LoContext.class);
		}
		public LoContext lo(int i) {
			return getRuleContext(LoContext.class,i);
		}
		public EndingLContext endingL() {
			return getRuleContext(EndingLContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) {
				{
				{
				setState(6);
				lo();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(13);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(12);
				endingL();
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

	public static class EndingLContext extends ParserRuleContext {
		public EndingLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endingL; }
	 
		public EndingLContext() { }
		public void copyFrom(EndingLContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UppercaseEndContext extends EndingLContext {
		public UppercaseEndContext(EndingLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterUppercaseEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitUppercaseEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitUppercaseEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LowercaseEndContext extends EndingLContext {
		public LowercaseEndContext(EndingLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterLowercaseEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitLowercaseEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitLowercaseEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndingLContext endingL() throws RecognitionException {
		EndingLContext _localctx = new EndingLContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_endingL);
		try {
			setState(17);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new LowercaseEndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new UppercaseEndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(T__1);
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

	public static class LoContext extends ParserRuleContext {
		public LoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lo; }
	 
		public LoContext() { }
		public void copyFrom(LoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends LoContext {
		public AddContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends LoContext {
		public SubContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberEightContext extends LoContext {
		public NumberEightContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterNumberEight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitNumberEight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitNumberEight(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberFiveContext extends LoContext {
		public NumberFiveContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterNumberFive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitNumberFive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitNumberFive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberTenContext extends LoContext {
		public NumberTenContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterNumberTen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitNumberTen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitNumberTen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends LoContext {
		public MulContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwapContext extends LoContext {
		public SwapContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterSwap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitSwap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitSwap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberNineContext extends LoContext {
		public NumberNineContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterNumberNine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitNumberNine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitNumberNine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberOneContext extends LoContext {
		public NumberOneContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterNumberOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitNumberOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitNumberOne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DuplicateContext extends LoContext {
		public DuplicateContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterDuplicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitDuplicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitDuplicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberSixContext extends LoContext {
		public NumberSixContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterNumberSix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitNumberSix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitNumberSix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberThreeContext extends LoContext {
		public NumberThreeContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterNumberThree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitNumberThree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitNumberThree(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberSevenContext extends LoContext {
		public NumberSevenContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterNumberSeven(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitNumberSeven(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitNumberSeven(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends LoContext {
		public DivContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PopContext extends LoContext {
		public PopContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitPop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitPop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends LoContext {
		public PrintContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberTwoContext extends LoContext {
		public NumberTwoContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterNumberTwo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitNumberTwo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitNumberTwo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberFourContext extends LoContext {
		public NumberFourContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterNumberFour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitNumberFour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitNumberFour(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToStringContext extends LoContext {
		public ToStringContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterToString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitToString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitToString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToNumberContext extends LoContext {
		public ToNumberContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterToNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitToNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitToNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToCharContext extends LoContext {
		public ToCharContext(LoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).enterToChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LOLListener ) ((LOLListener)listener).exitToChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LOLVisitor ) return ((LOLVisitor<? extends T>)visitor).visitToChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoContext lo() throws RecognitionException {
		LoContext _localctx = new LoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lo);
		try {
			setState(40);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(22);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(23);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new NumberOneContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(24);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new NumberTwoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(25);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new NumberThreeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(26);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new NumberFourContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(27);
				match(T__10);
				}
				break;
			case T__11:
				_localctx = new NumberFiveContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(28);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new NumberSixContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(29);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new NumberSevenContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(30);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new NumberEightContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(31);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new NumberNineContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(32);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new PopContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(33);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new ToNumberContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(34);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new ToStringContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(35);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new ToCharContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(36);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new DuplicateContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(37);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new SwapContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(38);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new NumberTenContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(39);
				match(T__22);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32-\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\5\2\20\n\2\3\3\3\3\5\3\24"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4+\n\4\3\4\2\2\5\2\4\6\2\2@\2\13\3\2\2\2\4\23\3\2"+
		"\2\2\6*\3\2\2\2\b\n\5\6\4\2\t\b\3\2\2\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f"+
		"\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\17\20\3"+
		"\2\2\2\20\3\3\2\2\2\21\24\7\3\2\2\22\24\7\4\2\2\23\21\3\2\2\2\23\22\3"+
		"\2\2\2\24\5\3\2\2\2\25+\7\5\2\2\26+\7\6\2\2\27+\7\7\2\2\30+\7\b\2\2\31"+
		"+\7\t\2\2\32+\7\n\2\2\33+\7\13\2\2\34+\7\f\2\2\35+\7\r\2\2\36+\7\16\2"+
		"\2\37+\7\17\2\2 +\7\20\2\2!+\7\21\2\2\"+\7\22\2\2#+\7\23\2\2$+\7\24\2"+
		"\2%+\7\25\2\2&+\7\26\2\2\'+\7\27\2\2(+\7\30\2\2)+\7\31\2\2*\25\3\2\2\2"+
		"*\26\3\2\2\2*\27\3\2\2\2*\30\3\2\2\2*\31\3\2\2\2*\32\3\2\2\2*\33\3\2\2"+
		"\2*\34\3\2\2\2*\35\3\2\2\2*\36\3\2\2\2*\37\3\2\2\2* \3\2\2\2*!\3\2\2\2"+
		"*\"\3\2\2\2*#\3\2\2\2*$\3\2\2\2*%\3\2\2\2*&\3\2\2\2*\'\3\2\2\2*(\3\2\2"+
		"\2*)\3\2\2\2+\7\3\2\2\2\6\13\17\23*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}