package edu.buffalo.cse715.parsing.expression.logical;

import edu.buffalo.cse715.parsing.expression.relational.RelationalExpression;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class NotExpression extends LogicalExpression {

	private RelationalExpression relationalExpression;

	public NotExpression(RelationalExpression relationalExpression) {
		super();
		this.relationalExpression = relationalExpression;
	}

	public NotExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RelationalExpression getRelationalExpression() {
		return relationalExpression;
	}

	public void setRelationalExpression(RelationalExpression relationalExpression) {
		this.relationalExpression = relationalExpression;
	}

}
