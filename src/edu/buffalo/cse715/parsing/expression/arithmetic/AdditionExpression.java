package edu.buffalo.cse715.parsing.expression.arithmetic;

import edu.buffalo.cse715.parsing.expression.literal.Literal;
import edu.buffalo.cse715.parsing.expression.literal.NumberValueExpression;
import edu.buffalo.cse715.parsing.expression.literal.StringValueExpression;
import finite_state_machine.Context;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class AdditionExpression extends ArithmeticExpression {
	public Literal evaluate(Context c) {

		Literal a =  expressionA.evaluate(c);
		Literal b =  expressionB.evaluate(c);

		if((a instanceof NumberValueExpression )&& (b instanceof NumberValueExpression))
		{
		int ans = (Integer.parseInt(a.toString()) + Integer.parseInt(b.toString()));
		NumberValueExpression answer = new NumberValueExpression();
		answer.setLiteral(ans);
		return answer;
		}

		else if((a instanceof StringValueExpression )&& (b instanceof StringValueExpression))
		{
		String ans =  a.toString() + b.toString();
		StringValueExpression answer = new StringValueExpression();
		answer.setLiteral(ans);
		return answer;
		}
		return null;

		}
}
