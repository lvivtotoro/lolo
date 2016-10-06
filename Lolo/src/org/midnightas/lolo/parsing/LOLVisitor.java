// Generated from LOL.g4 by ANTLR 4.5.3
package org.midnightas.lolo.parsing;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LOLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LOLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LOLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LOLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lowercaseEnd}
	 * labeled alternative in {@link LOLParser#endingL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowercaseEnd(LOLParser.LowercaseEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uppercaseEnd}
	 * labeled alternative in {@link LOLParser#endingL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUppercaseEnd(LOLParser.UppercaseEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LOLParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(LOLParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(LOLParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(LOLParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(LOLParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberOne}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberOne(LOLParser.NumberOneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberTwo}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberTwo(LOLParser.NumberTwoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberThree}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberThree(LOLParser.NumberThreeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFour}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFour(LOLParser.NumberFourContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFive}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFive(LOLParser.NumberFiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberSix}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberSix(LOLParser.NumberSixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberSeven}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberSeven(LOLParser.NumberSevenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberEight}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberEight(LOLParser.NumberEightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberNine}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberNine(LOLParser.NumberNineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pop}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPop(LOLParser.PopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toNumber}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToNumber(LOLParser.ToNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toString}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToString(LOLParser.ToStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toChar}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToChar(LOLParser.ToCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code duplicate}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicate(LOLParser.DuplicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code swap}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwap(LOLParser.SwapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberTen}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberTen(LOLParser.NumberTenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code popToVar}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPopToVar(LOLParser.PopToVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pushFromVar}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushFromVar(LOLParser.PushFromVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newCodeBlock}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewCodeBlock(LOLParser.NewCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code closeCodeBlock}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseCodeBlock(LOLParser.CloseCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code runCodeBlock}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunCodeBlock(LOLParser.RunCodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeatCodeBlock}
	 * labeled alternative in {@link LOLParser#lo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatCodeBlock(LOLParser.RepeatCodeBlockContext ctx);
}