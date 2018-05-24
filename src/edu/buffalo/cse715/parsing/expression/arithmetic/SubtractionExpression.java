package edu.buffalo.cse715.parsing.expression.arithmetic;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class SubtractionExpression extends ArithmeticExpression {
  
  public ValueExpression evaluate() {
		Number lhs=((NumberValueExpression)this.getExpressionA()).getLiteral();
		Number rhs=((NumberValueExpression)this.getExpressionB()).getLiteral();
		return new NumberValueExpression((int)lhs-(int)rhs);
	}
}
