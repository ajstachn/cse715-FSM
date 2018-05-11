package edu.buffalo.cse715.parsing.expression;

import edu.buffalo.cse715.parsing.expression.arithmetic.AdditionExpression;
import edu.buffalo.cse715.parsing.expression.arithmetic.DivisionExpression;
import edu.buffalo.cse715.parsing.expression.arithmetic.MultiplicationExpression;
import edu.buffalo.cse715.parsing.expression.arithmetic.SubtractionExpression;
import edu.buffalo.cse715.parsing.expression.literal.BooleanValueExpression;
import edu.buffalo.cse715.parsing.expression.literal.NumberValueExpression;
import edu.buffalo.cse715.parsing.expression.literal.StringValueExpression;
import edu.buffalo.cse715.parsing.expression.logical.AndExpression;
import edu.buffalo.cse715.parsing.expression.logical.OrExpression;
import edu.buffalo.cse715.parsing.expression.relational.EqualityExpression;
import edu.buffalo.cse715.parsing.expression.relational.GreaterThanExpression;
import edu.buffalo.cse715.parsing.expression.relational.LessThanExpression;
import edu.buffalo.cse715.parsing.model.Tokenizer;

public class ExpressionFactory {

	public ExpressionFactory() {
		// TODO Auto-generated constructor stub
	}

	public static Expression getExpression(String input) {
		switch (input) {
		case "A":
			return new AExpression();
		case "G":
			return new GExpression();
		case "+":
			return new AdditionExpression();
		case "-":
			return new SubtractionExpression();
		case "/":
			return new DivisionExpression();
		case "*":
			return new MultiplicationExpression();
		case "->":
			return new ImplicationExpression();
		case "==":
			return new EqualityExpression();
		case "&&":
			return new AndExpression();
		case "||":
			return new OrExpression();
		case "=":
			return new AssignmentExpression();
		case ">":
			return new GreaterThanExpression();
		case "<":
			return new LessThanExpression();
		case "true":
			return new BooleanValueExpression(Boolean.TRUE);
		case "false":
			return new BooleanValueExpression(Boolean.FALSE);
		default:
			if (input.matches("([+-]?\\d*\\.\\d+)(?![-+0-9\\.])")) {
				return new NumberValueExpression(Float.valueOf(input));
			} else if (input.matches("\\d+")) {
				return new NumberValueExpression(Integer.valueOf(input));
			} else if (Tokenizer.idList.contains(input)) {
				return new VariableExpression(input);
			} else {
				return new StringValueExpression(input);
			}
		}
	}

}
