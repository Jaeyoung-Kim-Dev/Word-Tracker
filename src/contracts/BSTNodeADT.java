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
	 * Pre-conditions:
	 * Post-conditions:
	 * 
	 * @return Left child or null if no left child.
	 */
	public BSTNodeADT<E> getLeft();
	
	/**
	 * Sets the left child of the node.
	 * 
	 * Pre-conditions:
	 * Post-conditions:
	 * 
	 * @param left the node to be set.
	 */
	public void setLeft(BSTNodeADT<E> left);
	
	
	/**
	 * Gets the right child of the node.
	 * 
	 * Pre-conditions:
	 * Post-conditions:
	 * 
	 * @return Right child or null if no right child.
	 */
	public BSTNodeADT<E> getRight();
	
	/**
	 * Sets the right child of the node.
	 * 
	 * Pre-conditions:
	 * Post-conditions:
	 * 
	 * @param right the node to be set.
	 */
	public void setRight(BSTNodeADT<E> right);
	
	/**
	 * 
	 * Gets the data of the node.
	 * 
	 * Pre-conditions:
	 * Post-conditions:
	 * 
	 * @return data of the node
	 */
	public E getData();
}
