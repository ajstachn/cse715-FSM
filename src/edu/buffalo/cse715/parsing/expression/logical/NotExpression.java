package edu.buffalo.cse715.parsing.expression.logical;

import edu.buffalo.cse715.parsing.expression.literal.BooleanValueExpression;
import edu.buffalo.cse715.parsing.expression.literal.Literal;
import edu.buffalo.cse715.parsing.expression.relational.RelationalExpression;
import finite_state_machine.Context;

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
	
	public Literal evaluate(Context c) {
		Literal a =  relationalExpression.evaluate(c);

		if((a instanceof RelationalExpression ))
		{
		Boolean ans = !Boolean.parseBoolean(a.toString()) ;
		BooleanValueExpression answer = new BooleanValueExpression();
		answer.setLiteral(ans);
		return answer;
		}

		return null;
	}


}
