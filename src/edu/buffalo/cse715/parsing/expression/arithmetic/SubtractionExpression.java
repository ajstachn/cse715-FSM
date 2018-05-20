package edu.buffalo.cse715.parsing.expression.arithmetic;

import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;
import finite_state_machine.Context;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class SubtractionExpression extends ArithmeticExpression {

	public ValueExpression evaluate() {
		int lhs=this.getExpressionA();
		Number lhs=((NumberValueExpression)this.getExpressionA()).getLiteral();
		Number rhs=((NumberValueExpression)this.getExpressionB()).getLiteral();
		return new NumberValueExpression(lhs-rhs);
	}
}
