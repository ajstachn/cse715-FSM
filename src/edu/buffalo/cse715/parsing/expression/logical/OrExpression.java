package edu.buffalo.cse715.parsing.expression.logical;

import edu.buffalo.cse715.parsing.expression.IBinaryExpression;
import edu.buffalo.cse715.parsing.expression.literal.BooleanValueExpression;
import edu.buffalo.cse715.parsing.expression.literal.Literal;
import edu.buffalo.cse715.parsing.expression.relational.RelationalExpression;
import finite_state_machine.Context;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class OrExpression extends LogicalExpression implements IBinaryExpression {

	private RelationalExpression expressionA;
	private RelationalExpression expressionB;

	public OrExpression(RelationalExpression expressionA, RelationalExpression expressionB) {
		super();
		this.expressionA = expressionA;
		this.expressionB = expressionB;
	}

	public OrExpression() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RelationalExpression getExpressionA() {
		return expressionA;
	}

	public void setExpressionA(RelationalExpression expressionA) {
		this.expressionA = expressionA;
	}

	public RelationalExpression getExpressionB() {
		return expressionB;
	}

	public void setExpressionB(RelationalExpression expressionB) {
		this.expressionB = expressionB;
	}
	
	public Literal evaluate(Context c) {
		Literal a =  expressionA.evaluate(c);
		Literal b =  expressionB.evaluate(c);

		if((a instanceof RelationalExpression ) && (b instanceof RelationalExpression))
		{
		Boolean ans = Boolean.parseBoolean(a.toString()) || Boolean.parseBoolean(b.toString()) ;
		BooleanValueExpression answer = new BooleanValueExpression();
		answer.setLiteral(ans);
		return answer;
		}

		return null;

		}

}
