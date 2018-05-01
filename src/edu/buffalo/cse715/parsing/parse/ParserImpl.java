package edu.buffalo.cse715.parsing.parse;

import java.util.ArrayList;
import java.util.List;

import edu.buffalo.cse715.parsing.expression.AExpression;
import edu.buffalo.cse715.parsing.expression.Expression;
import edu.buffalo.cse715.parsing.expression.GExpression;
import edu.buffalo.cse715.parsing.expression.IBinaryExpression;
import edu.buffalo.cse715.parsing.model.BinaryTree;
import edu.buffalo.cse715.parsing.model.Node;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class ParserImpl implements Parser {

	private Expression expression;

	@Override
	public List<Expression> parse(String[] inputs) {
		List<Expression> expressions = new ArrayList<>();
		for (String input : inputs) {
			BinaryTree<String> tree = buildPrecedenceTree(input);
			parsePreOrder(tree.getRoot(), expression);
			expressions.add(expression);
			expression = null;
		}
		return expressions;
	}

	private BinaryTree<String> buildPrecedenceTree(String input) {
		// TODO - Build and return a precedence tree from input string.
		return null;
	}

	private void parsePreOrder(Node<String> root, Expression expression) {
		if (root == null) {
			return;
		}
		String data = root.getData();
		if (expression instanceof IBinaryExpression) {
			switch (data) {

			}
			parsePreOrder(root.getLeft(), ((IBinaryExpression) this.expression).getExpressionA());
			parsePreOrder(root.getRight(), ((IBinaryExpression) this.expression).getExpressionB());
		} else {
			switch (data) {
			case "A":
				expression = new AExpression();
				break;
			case "G":
				expression = new GExpression();
				break;
			default:
				break;
			}
			parsePreOrder(root.getLeft(), this.expression.getExpressionA());
		}
	}
}
