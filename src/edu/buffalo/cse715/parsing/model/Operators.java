package edu.buffalo.cse715.parsing.model;

import java.util.Arrays;
/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Operators {

	// TODO - Set precedence value
	public static final Map<String, Integer> OPERATOR_PRECEDENCE;
	static {
		Map<String, Integer> map = new HashMap<>();
		map.put("+", 11);
		map.put("-", 11);
		map.put("/", 12);
		map.put("*", 12);
		map.put("^", 13);
		map.put("->", 16);
		map.put("||", 15);
		map.put("&&", 15);
		//map.put("(", 15);
		//map.put("[", 15);
		// map.put("[", 1);
		map.put("==", 8);
		map.put("!=", 8);
		map.put(">=", 9);
		map.put("<=", 9);
		map.put("<", 9);
		map.put(">", 9);
		map.put("!", 14);
		//map.put("&&", 4);
		//map.put("||", 3);
		map.put("=", 17);
		map.put("A", 18);
		map.put("G", 18);
		OPERATOR_PRECEDENCE = Collections.unmodifiableMap(map);
	}

	public static boolean isOperator(String operator) {
		return OPERATOR_PRECEDENCE.containsKey(operator);
	}

	public static boolean isUnaryOperator(String input) {
		return Arrays.asList("A", "G", "!").contains(input);
	}

	public static boolean isBinaryOperator(String input) {
		return Arrays.asList("+", "-", "*", "/", "->", "=", "==", ">=", "<=", ">", "<", "!=", "&&", "||")
				.contains(input);
	}
}
