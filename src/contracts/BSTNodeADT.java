/**
 * 
 */
package contracts;

import java.io.Serializable;

/**
 * The abstract data type for a node in a BST.
 * @author Jaeyoung Kim
 *
 */
public interface BSTNodeADT<E> {
	/**
	 * Gets the left child of the node.
	 * 
	 * Pre-conditions: A valid binary search tree node exists.
	 * Post-conditions: It returns the left node of tree.
	 * 
	 * @return Left child or null if no left child.
	 */
	public BSTNodeADT<E> getLeft();
	
	/**
	 * Sets the left child of the node.
	 * 
	 * Pre-conditions: A valid binary search tree node exists.
	 * Post-conditions: It sets the left child of the node.
	 * 
	 * @param left the node to be set.
	 */
	public void setLeft(BSTNodeADT<E> left);
	
	
	/**
	 * Gets the right child of the node.
	 * 
	 * Pre-conditions: A valid binary search tree node exists.
	 * Post-conditions: It returns the right node of tree.
	 * 
	 * @return Right child or null if no right child.
	 */
	public BSTNodeADT<E> getRight();
	
	/**
	 * Sets the right child of the node.
	 * 
	 * Pre-conditions: A valid binary search tree node exists.
	 * Post-conditions:It sets the right child of the node.
	 * 
	 * @param right the node to be set.
	 */
	public void setRight(BSTNodeADT<E> right);
	
	/**
	 * 
	 * Gets the data of the node.
	 * 
	 * Pre-conditions: A valid binary search tree node exists.
	 * Post-conditions: It returns the data of node.
	 * 
	 * @return data of the node
	 */
	public E getData();
}
