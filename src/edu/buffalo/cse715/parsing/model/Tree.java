/**
 * 
 */
package edu.buffalo.cse715.parsing.model;

/**
 * @author Shashank Raghunath
 * @email sraghuna@buffalo.edu
 *
 */
public interface Tree<T> {

	public Node<T> getRoot();
	public void insert(T data);
	public void print();
	public void delete(T data);
}
