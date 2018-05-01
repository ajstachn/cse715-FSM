package edu.buffalo.cse715.parsing.expression.logical;

import edu.buffalo.cse715.parsing.expression.Expression;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public abstract class LogicalExpression extends Expression {

	@Override
	public Expression getExpressionA() {
		return this;
	}
}
