package edu.buffalo.cse715.parsing.parse;

import java.util.ArrayList;
import java.util.List;

import edu.buffalo.cse715.parsing.expression.AExpression;
import edu.buffalo.cse715.parsing.expression.Expression;
import edu.buffalo.cse715.parsing.expression.GExpression;
import edu.buffalo.cse715.parsing.expression.IBinaryExpression;
import edu.buffalo.cse715.parsing.model.BinaryTree;
import edu.buffalo.cse715.parsing.model.Node;
import edu.buffalo.cse715.parsing.model.Operators;
import edu.buffalo.cse715.parsing.model.Tokenizer;

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
			BinaryTree<String> tree = buildPrecedenceTree(convertToPrefix(Tokenizer.tokenize(input)));
			parsePreOrder(tree.getRoot(), expression);
			expressions.add(expression);
			expression = null;
		}
		return expressions;
	}

	private BinaryTree<String> buildPrecedenceTree(String[] inputs) {
		BinaryTree<String> binaryTree = new BinaryTree<>();
		int i = 0;
		while (i < inputs.length) {
			if (Operators.isOperator(inputs[i])) {
				if (Operators.isUnaryOperator(inputs[i])) {
					binaryTree.insert(inputs[i]);
					i++;
					binaryTree.insert(inputs[i]);
					binaryTree.insert("NULL");
					i++;
				}
			} else {
				binaryTree.insert(inputs[i]);
				i++;
			}
		}

		return binaryTree;
	}

	// private String[] convertToPostfix(String[] input) {
	// return input;
	// }

	private String[] convertToPrefix(String[] input) {
		List<String> prefix = new ArrayList<>();
		for(String i: input) {
			if(Tokenizer.isVariable(i)) {
				prefix.add(i);
			}
		}
		return (String[]) prefix.toArray();
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
