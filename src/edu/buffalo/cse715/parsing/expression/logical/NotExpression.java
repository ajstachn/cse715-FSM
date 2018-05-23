package edu.buffalo.cse715.parsing.expression.logical;

import edu.buffalo.cse715.parsing.expression.Expression;
import edu.buffalo.cse715.parsing.expression.relational.RelationalExpression;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class NotExpression extends LogicalExpression {

	private Expression relationalExpression;

	public NotExpression(Expression relationalExpression) {
		super();
		this.relationalExpression = relationalExpression;
	}

	public NotExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Expression getRelationalExpression() {
		return relationalExpression;
	}

	public void setRelationalExpression(Expression relationalExpression) {
		this.relationalExpression = relationalExpression;
	}

	@Override
	public void setExpressionA(Expression expression) {
		// TODO Auto-generated method stub
		this.relationalExpression = (RelationalExpression) expression;
	}

}
