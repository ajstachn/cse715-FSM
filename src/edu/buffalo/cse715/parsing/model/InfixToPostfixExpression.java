package edu.buffalo.cse715.parsing.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class InfixToPostfixExpression {

	// converts given infix expression to postfix expression.
	public List<String> infixToPostfix(List<String> exp) {
		// initializing empty String for result
		List<String> result = new ArrayList<>();
		Set<String> bracesSet = new HashSet<>();
		bracesSet.add("[");
		bracesSet.add("]");
		bracesSet.add("(");
		bracesSet.add(")");
		// initializing empty stack
		Stack<String> stack = new Stack<>();

		for (int i = 0; i < exp.size(); ++i) {
			String token = exp.get(i);
			if (token.isEmpty())
				continue;

			// If the scanned character is an operand, add it to output.
			boolean isOperator = false;
			if (!Operators.OPERATOR_PRECEDENCE.containsKey(token) && !bracesSet.contains(token)) {
				result.add(token);
			}

			// If the scanned character is an '[', push it to the stack.
			else if (token.equals("["))
				stack.push(token);

			// If the scanned character is an ']', pop and output from the stack
			// until an '(' is encountered.
			else if (token.equals("]")) {
				while (!stack.isEmpty() && !stack.peek().equals("[")) {
					result.add(stack.pop());
				}

				if (!stack.isEmpty() && !stack.peek().equals("["))
					return null;// "Invalid Expression"; // invalid expression
				else
					stack.pop();
			} else if (token.equals("("))
				stack.push(token);

			// If the scanned character is an ')', pop and output from the stack
			// until an '(' is encountered.
			else if (token.equals(")")) {
				while (!stack.isEmpty() && !stack.peek().equals("(")) {
					result.add(stack.pop());
				}

				if (!stack.isEmpty() && !stack.peek().equals("("))
					return null;// "Invalid Expression"; // invalid expression
				else
					stack.pop();
			} else // an operator is encountered
			{
				while (!stack.isEmpty()) {
					int precOp = Operators.OPERATOR_PRECEDENCE.get(token);
					int stackPeekPrec = Operators.OPERATOR_PRECEDENCE.get(stack.peek()) == null ? -1
							: Operators.OPERATOR_PRECEDENCE.get(stack.peek());
					if (precOp < stackPeekPrec) {
						result.add(stack.pop());

					} else {
						break;
					}
				}
				stack.push(token);

			}

		}

		// pop all the operators from the stack
		while (!stack.isEmpty()) {
			result.add(stack.pop());
		}

		return result;
	}

	// Driver method
	public static void main(String[] args) {
		// String exp = "a+b*(c^d-e)^(f+g*h)-i";
		InfixToPostfixExpression inToPost = new InfixToPostfixExpression();
		String exp = "G [w = 1 > r = 0]";
		List<String> expList = Arrays.asList("G","[","w","=","1","->","r","=","0","]");		
		// String exp = "a+b*[c^d-e]^[f+g*h]-i";
		System.out.println(inToPost.infixToPostfix(expList));
	}

}
