/**
 * 
 */
package edu.buffalo.cse715.parsing.parse;

import java.util.List;

import edu.buffalo.cse715.parsing.expression.Expression;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public interface Parser {

	public List<Expression> parse(String input);
}
