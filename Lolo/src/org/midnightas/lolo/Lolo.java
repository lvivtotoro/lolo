package org.midnightas.lolo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.FileUtils;
import org.midnightas.lolo.parsing.LOLLexer;
import org.midnightas.lolo.parsing.LOLParser;
import org.midnightas.lolo.parsing.LOLParser.ProgramContext;

public class Lolo {
	
	public static final In stdin = new In(System.in);
	
	public static final void main(String[] args) throws IOException {
		new Lolo().interpret(FileUtils.readFileToString(new File(args[0])));
	}
	
	public Map<String, Object> vars = new HashMap<String, Object>();
	public LoloVisitor visitor;
	public Stack stack;
	
	public Lolo() {
		stack = new Stack();
		visitor = new LoloVisitor(this);
	}
	
	public void interpret(String s) {
		LOLLexer lexer = new LOLLexer(new ANTLRInputStream(s));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LOLParser parser = new LOLParser(tokens);
		parser.setBuildParseTree(true);
		ProgramContext tree = parser.program();
		tree.accept(visitor);
	}
	
}
