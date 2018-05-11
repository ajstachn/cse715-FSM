package edu.buffalo.cse715.parsing.parse;

import java.io.DataInputStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
			Node<String> tree = buildPrecedenceTree(convertToPrefix(tokenizer.tokenize()));
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

	// private String[] convertToPostfix(String[] input) {
	// return input;
	// }

	private List<String> convertToPrefix(List<String> input) {
		return Arrays.asList("w", "1", "=", "r", "0", "=", "->", "G");
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
