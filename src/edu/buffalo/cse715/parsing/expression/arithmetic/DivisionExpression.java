package edu.buffalo.cse715.parsing.expression.arithmetic;

import edu.buffalo.cse715.parsing.expression.literal.Literal;
import edu.buffalo.cse715.parsing.expression.literal.NumberValueExpression;
import finite_state_machine.Context;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class DivisionExpression extends ArithmeticExpression {
	
	public Literal evaluate(Context c) {
		Literal a =  expressionA.evaluate(c);
		Literal b =  expressionB.evaluate(c);

		if((a instanceof NumberValueExpression )&& (b instanceof NumberValueExpression))
		{
		int ans = (Integer.parseInt(a.toString()) / Integer.parseInt(b.toString()));
		NumberValueExpression answer = new NumberValueExpression();
		answer.setLiteral(ans);
		return answer;
		}

		return null;

		}
}
