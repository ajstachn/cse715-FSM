/**
 * 
 */
package edu.buffalo.cse715.parsing.expression;

import edu.buffalo.cse715.parsing.expression.literal.Literal;
import edu.buffalo.cse715.parsing.expression.literal.ValueExpression;
import finite_state_machine.Context;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public abstract class Expression implements IExpression{
 
	public abstract Literal evaluate(Context cxt);
	
}

