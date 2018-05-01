package edu.buffalo.cse715.parsing.model;
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
		map.put("+", 1);
		map.put("-", 1);
		map.put("/", 1);
		map.put("*", 1);
		map.put("->", 1);
		map.put("(", 1);
		map.put("[", 1);
		map.put("==", 1);
		map.put("=>", 1);
		map.put("<=", 1);
		map.put("<", 1);
		map.put(">", 1);
		map.put("!", 1);
		map.put("&&", 1);
		map.put("||", 1);
		OPERATOR_PRECEDENCE = Collections.unmodifiableMap(map);
	}

}
