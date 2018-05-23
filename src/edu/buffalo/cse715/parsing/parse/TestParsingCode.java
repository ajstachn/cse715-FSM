package edu.buffalo.cse715.parsing.parse;

import java.util.Arrays;
import java.util.List;

import edu.buffalo.cse715.parsing.expression.Expression;

public class TestParsingCode {

	public static void main(String[] args) {
		ParserImpl parser = new ParserImpl();
		String[] arr = { "G [ w = 1  ->  r = 0  ]", "G [ r > 0    ->  w = 0  ]", "G [ w = 0   ||  w = 1 ]" };
		// {"G[<f1, up, , > => <f2, up, , > -> f1 < f2 ]"};
		// {"G[w=1 -> r=0]"};
		// G[ <f1, down,,> => <f2,down,,> -> f1 > f2 ]
		// G[ <f1, d1,,> => <f2, d2,,> && d1 != d2 -> f1 = f2 ]
		// G[w=1 || w=0]
		// G [ r > 0 -> w = 0 ]

		// TODO Auto-generated method stub
		List<String> expList = Arrays.asList("G", "[", "w", "=", "1", "->", "r", "=", "0", "]");
		// String exp = "a+b*[c^d-e]^[f+g*h]-i";
		// System.out.println(parser.convertToPostfix(expList));
		List<Expression> listExp = parser.parse(arr);
		System.out.println(listExp);
	}

}
