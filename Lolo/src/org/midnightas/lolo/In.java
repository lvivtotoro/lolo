package org.midnightas.lolo;

import java.io.InputStream;
import java.util.Scanner;

public class In {
	
	public InputStream is;
	public Scanner scanner;
	
	public In(InputStream is) {
		this.is = is;
		this.scanner = new Scanner(this.is);
	}
	
	public String get() {
		return this.scanner.nextLine();
	}
	
}
