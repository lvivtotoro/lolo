// Generated from LOL.g4 by ANTLR 4.5.3
package org.midnightas.lolo.parsing;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LOLParser}.
 */
public interface LOLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LOLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LOLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LOLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LOLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lowercaseEnd}
	 * labeled alternative in {@link LOLParser#endingL}.
	 * @param ctx the parse tree
	 */
	void enterLowercaseEnd(LOLParser.LowercaseEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lowercaseEnd}
	 * labeled alternative in {@link LOLParser#endingL}.
	 * @param ctx the parse tree
	 */
	void exitLowercaseEnd(LOLParser.LowercaseEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uppercaseEnd}
	 * labeled alternative in {@link LOLParser#endingL}.
	 * @param ctx the parse tree
	 */
	void enterUppercaseEnd(LOLParser.UppercaseEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uppercaseEnd}
	 * labeled alternative in {@link LOLParser#endingL}.
	 * @param ctx the parse tree
	 */
	void exitUppercaseEnd(LOLParser.UppercaseEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LOLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LOLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterAdd(LOLParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitAdd(LOLParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterSub(LOLParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitSub(LOLParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterMul(LOLParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitMul(LOLParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterDiv(LOLParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitDiv(LOLParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberOne}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterNumberOne(LOLParser.NumberOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberOne}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitNumberOne(LOLParser.NumberOneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberTwo}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterNumberTwo(LOLParser.NumberTwoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberTwo}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitNumberTwo(LOLParser.NumberTwoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberThree}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterNumberThree(LOLParser.NumberThreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberThree}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitNumberThree(LOLParser.NumberThreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFour}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterNumberFour(LOLParser.NumberFourContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFour}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitNumberFour(LOLParser.NumberFourContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFive}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterNumberFive(LOLParser.NumberFiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFive}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitNumberFive(LOLParser.NumberFiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberSix}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterNumberSix(LOLParser.NumberSixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberSix}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitNumberSix(LOLParser.NumberSixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberSeven}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterNumberSeven(LOLParser.NumberSevenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberSeven}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitNumberSeven(LOLParser.NumberSevenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberEight}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterNumberEight(LOLParser.NumberEightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberEight}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitNumberEight(LOLParser.NumberEightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberNine}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterNumberNine(LOLParser.NumberNineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberNine}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitNumberNine(LOLParser.NumberNineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pop}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterPop(LOLParser.PopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pop}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitPop(LOLParser.PopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toNumber}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterToNumber(LOLParser.ToNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toNumber}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitToNumber(LOLParser.ToNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toString}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterToString(LOLParser.ToStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toString}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitToString(LOLParser.ToStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toChar}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterToChar(LOLParser.ToCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toChar}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitToChar(LOLParser.ToCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code duplicate}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterDuplicate(LOLParser.DuplicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code duplicate}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitDuplicate(LOLParser.DuplicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code swap}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterSwap(LOLParser.SwapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code swap}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitSwap(LOLParser.SwapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberTen}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void enterNumberTen(LOLParser.NumberTenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberTen}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 */
	void exitNumberTen(LOLParser.NumberTenContext ctx);
}