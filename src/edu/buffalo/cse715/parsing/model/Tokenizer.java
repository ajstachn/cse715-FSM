package edu.buffalo.cse715.parsing.model;

public class Tokenizer {

	public Tokenizer() {
		// TODO Auto-generated constructor stub
	}

	public static String[] tokenize(String input) {
		return input.split(" ");
	}
	
	public static boolean isVariable(String input) {
		return false;
	}
	
}
