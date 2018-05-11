package edu.buffalo.cse715.parsing.parse;

import java.io.DataInputStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import edu.buffalo.cse715.parsing.expression.Expression;
import edu.buffalo.cse715.parsing.expression.ExpressionFactory;
import edu.buffalo.cse715.parsing.expression.IBinaryExpression;
import edu.buffalo.cse715.parsing.model.Buffer;
import edu.buffalo.cse715.parsing.model.Node;
import edu.buffalo.cse715.parsing.model.Operators;
import edu.buffalo.cse715.parsing.model.Tokenizer;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
@SuppressWarnings("deprecation")
public class ParserImpl implements Parser {

	private Expression expression;

	@Override
	public List<Expression> parse(String[] inputs) {
		List<Expression> expressions = new ArrayList<>();
		for (String input : inputs) {
			StringBuffer buffer = new StringBuffer(input);
			buffer.append(";");
			Tokenizer tokenizer = new Tokenizer(
					new Buffer(new DataInputStream(new StringBufferInputStream(buffer.toString()))));
			Node<String> tree = buildPrecedenceTree(convertToPostfix(tokenizer.tokenize()));
			expressions.add(parsePreOrder(tree, expression));
			expression = null;
		}
		return expressions;
	}

	public Node<String> buildPrecedenceTree(List<String> inputs) {
		Stack<Node<String>> stack = new Stack<>();
		int i = 0;
		while (i < inputs.size()) {
			if (Operators.isOperator(inputs.get(i))) {
				if (Operators.isUnaryOperator(inputs.get(i))) {
					Node<String> node = new Node<>();
					node.setData(inputs.get(i));
					node.setLeft(stack.pop());
					node.setRight(new Node<String>("NULL"));
					stack.push(node);
				} else {
					Node<String> node = new Node<>();
					node.setData(inputs.get(i));
					node.setRight(stack.pop());
					node.setLeft(stack.pop());
					stack.push(node);
				}
			} else {
				stack.push(new Node<>(inputs.get(i)));
			}
			i++;
		}

		return stack.pop();
	}

	/**
	 * 
	 * @author Sandeep Kumar
	 * @email skumar28@buffalo.edu
	 */
	private List<String> convertToPostfix(List<String> input) {
		// initializing empty String for result
		List<String> result = new ArrayList<>();
		Set<String> bracesSet = new HashSet<>();
		bracesSet.add("[");
		bracesSet.add("]");
		bracesSet.add("(");
		bracesSet.add(")");
		// initializing empty stack
		Stack<String> stack = new Stack<>();

		for (int i = 0; i < input.size(); ++i) {
			String token = input.get(i);
			if (token.isEmpty())
				continue;

			// If the scanned character is an operand, add it to output.
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

	public Expression parsePreOrder(Node<String> root, Expression expression) {
		if (root == null) {
			return null;
		}
		String data = root.getData();
		expression = ExpressionFactory.getExpression(data);
		if (expression instanceof IBinaryExpression) {
			expression.setExpressionA(parsePreOrder(root.getLeft(), ((IBinaryExpression) expression).getExpressionA()));
			((IBinaryExpression) expression)
					.setExpressionB(parsePreOrder(root.getRight(), ((IBinaryExpression) expression).getExpressionB()));
		} else {
			expression.setExpressionA(parsePreOrder(root.getLeft(), expression.getExpressionA()));
		}
		return expression;
	}
}
