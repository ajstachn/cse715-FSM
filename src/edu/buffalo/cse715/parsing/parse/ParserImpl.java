package edu.buffalo.cse715.parsing.parse;

import java.util.List;

import edu.buffalo.cse715.parsing.expression.Expression;
import edu.buffalo.cse715.parsing.model.BinaryTree;
import edu.buffalo.cse715.parsing.model.Node;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public class ParserImpl implements Parser {

	@Override
	public List<Expression> parse(String input) {
		BinaryTree<String> tree = buildPrecendenceTree(input);
		Node<String> node = tree.getRoot();
		return null;
	}

	private BinaryTree<String> buildPrecendenceTree(String input) {
// TODO - Build and return a precedence tree from input string.
		return null;
	}
}
