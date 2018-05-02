package edu.buffalo.cse715.parsing.expression.relational;

import edu.buffalo.cse715.parsing.expression.Expression;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class EqualityExpression extends RelationalExpression {
	
	public EqualityExpression(Expression a, Expression b) {
		super(a,b);
	}
}
