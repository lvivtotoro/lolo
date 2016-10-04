package org.midnightas.lolo;

import org.midnightas.lolo.parsing.LOLBaseVisitor;
import org.midnightas.lolo.parsing.LOLParser.AddContext;
import org.midnightas.lolo.parsing.LOLParser.DivContext;
import org.midnightas.lolo.parsing.LOLParser.DuplicateContext;
import org.midnightas.lolo.parsing.LOLParser.LowercaseEndContext;
import org.midnightas.lolo.parsing.LOLParser.MulContext;
import org.midnightas.lolo.parsing.LOLParser.NumberEightContext;
import org.midnightas.lolo.parsing.LOLParser.NumberFiveContext;
import org.midnightas.lolo.parsing.LOLParser.NumberFourContext;
import org.midnightas.lolo.parsing.LOLParser.NumberNineContext;
import org.midnightas.lolo.parsing.LOLParser.NumberOneContext;
import org.midnightas.lolo.parsing.LOLParser.NumberSevenContext;
import org.midnightas.lolo.parsing.LOLParser.NumberSixContext;
import org.midnightas.lolo.parsing.LOLParser.NumberTenContext;
import org.midnightas.lolo.parsing.LOLParser.NumberThreeContext;
import org.midnightas.lolo.parsing.LOLParser.NumberTwoContext;
import org.midnightas.lolo.parsing.LOLParser.PopContext;
import org.midnightas.lolo.parsing.LOLParser.PrintContext;
import org.midnightas.lolo.parsing.LOLParser.ProgramContext;
import org.midnightas.lolo.parsing.LOLParser.SubContext;
import org.midnightas.lolo.parsing.LOLParser.SwapContext;
import org.midnightas.lolo.parsing.LOLParser.ToCharContext;
import org.midnightas.lolo.parsing.LOLParser.ToNumberContext;
import org.midnightas.lolo.parsing.LOLParser.ToStringContext;

public class LoloVisitor extends LOLBaseVisitor<Void> {

	public Lolo lolo;

	public LoloVisitor(Lolo lolo) {
		this.lolo = lolo;
	}

	public Void visitProgram(ProgramContext ctx) {
		ctx.lo().forEach(lo -> visit(lo));
		if (ctx.endingL() != null)
			visit(ctx.endingL());
		return null;
	}

	public Void visitLowercaseEnd(LowercaseEndContext ctx) {
		System.out.println(lolo.stack);
		return null;
	}

	public Void visitPrint(PrintContext ctx) {
		System.out.println(lolo.stack.pop(Object.class));
		return null;
	}

	public Void visitNumberOne(NumberOneContext ctx) {
		lolo.stack.push(1d);
		return null;
	}

	public Void visitNumberTwo(NumberTwoContext ctx) {
		lolo.stack.push(2d);
		return null;
	}

	public Void visitNumberThree(NumberThreeContext ctx) {
		lolo.stack.push(3d);
		return null;
	}

	public Void visitNumberFour(NumberFourContext ctx) {
		lolo.stack.push(4d);
		return null;
	}

	public Void visitNumberFive(NumberFiveContext ctx) {
		lolo.stack.push(5d);
		return null;
	}

	public Void visitNumberSix(NumberSixContext ctx) {
		lolo.stack.push(6d);
		return null;
	}

	public Void visitNumberSeven(NumberSevenContext ctx) {
		lolo.stack.push(7d);
		return null;
	}

	public Void visitNumberEight(NumberEightContext ctx) {
		lolo.stack.push(8d);
		return null;
	}

	public Void visitNumberNine(NumberNineContext ctx) {
		lolo.stack.push(9d);
		return null;
	}

	public Void visitAdd(AddContext ctx) {
		lolo.stack.push(lolo.stack.pop(Double.class, 1) + lolo.stack.pop(Double.class));
		return null;
	}

	public Void visitSub(SubContext ctx) {
		lolo.stack.push(lolo.stack.pop(Double.class, 1) - lolo.stack.pop(Double.class));
		return null;
	}

	public Void visitMul(MulContext ctx) {
		lolo.stack.push(lolo.stack.pop(Double.class, 1) * lolo.stack.pop(Double.class));
		return null;
	}

	public Void visitDiv(DivContext ctx) {
		lolo.stack.push(lolo.stack.pop(Double.class, 1) / lolo.stack.pop(Double.class));
		return null;
	}

	public Void visitPop(PopContext ctx) {
		lolo.stack.pop(Object.class);
		return null;
	}

	public Void visitToNumber(ToNumberContext ctx) {
		Object popped = lolo.stack.pop(Object.class);
		if (popped instanceof Double)
			lolo.stack.push(popped);
		else if (popped instanceof Character)
			lolo.stack.push((double) ((int) ((Character) popped)));
		else {
			System.err.println("unsupported operation: " + popped.getClass().getSimpleName());
		}
		return null;
	}

	public Void visitToString(ToStringContext ctx) {
		lolo.stack.push(lolo.stack.pop(Object.class).toString());
		return null;
	}

	public Void visitToChar(ToCharContext ctx) {
		Object popped = lolo.stack.pop(Object.class);
		if (popped instanceof Double)
			lolo.stack.push((char) ((Double) popped).intValue());
		else {
			System.err.println("unsupported operation: " + popped.getClass().getSimpleName());
		}
		return null;
	}
	
	public Void visitDuplicate(DuplicateContext ctx) {
		lolo.stack.push(lolo.stack.peek());
		return null;
	}

	public Void visitSwap(SwapContext ctx) {
		lolo.stack.push(lolo.stack.pop(Object.class, 1));
		return null;
	}
	
	public Void visitNumberTen(NumberTenContext ctx) {
		lolo.stack.push(10d);
		return null;
	}
	
}
