/**
 * 
 */
package contracts;

import java.io.Serializable;

/**
 * The Abstract Data Type for a Binary Search Tree.
 * @author Jaeyoung Kim
 *
 */
public interface BSTreeADT<E> extends Serializable {
	
	/**
	 * Adds an element to the binary search tree.
	 * 
	 * Pre-conditions:
	 * Post-conditions:
	 * 
	 * @param data Element data to add.
	 * @return True if element was added.
	 */
	public boolean add(E data);
	
	
	//remove() - optional
	
	/**
	 * Checks if a node has a left child.
	 * 
	 * Pre-conditions:
	 * Post-conditions:
	 * 
	 * @param node Node to check.
	 * @return True if node has a left child.
	 */
	public boolean hasLeftChild(BSTNodeADT<E> node);
	
	/**
	 * Checks if a node has a right child.
	 * 
	 * Pre-conditions:
	 * Post-conditions:
	 * 
	 * @param node Node to check.
	 * @return True if node has a right child.
	 */
	public boolean hasRightChild(BSTNodeADT<E> node);
	
	/**
	 * Checks if a node is a leaf.
	 * 
	 * Pre-conditions:
	 * Post-conditions:
	 * 
	 * @param node Node to check.
	 * @return True if node is a leaf.
	 */
	public boolean isLeaf(BSTNodeADT<E> node);
	
	/**
	 * Gets the root node of the tree.
	 * 
	 * Pre-conditions:
	 * Post-conditions:
	 * 
	 * @return Root node of tree.
	 */
	public BSTreeADT<E> getRoot();
	
	getHeight()
	
	// Use counter to track the number of nodes
	size()
	
	/**
	 * Checks if 
	 * 
	 * @return True if the root is empty or size is 0.
	 */
	public boolean isEmpty();
	
	/**
	 * Set the root is null -> Then the rest of nodes will be gone by a garbage collector.
	 * 
	 */
	clear()
	
	/**
	 * 
	 * @return
	 */
	public boolean contains();
	
	/**
	 * 
	 * @return
	 */
	public BSTreeADT<E>search();
	
	
	//loop through all of the nodes
	/**
	 * Returns an in-order iterator.
	 * 
	 * Pre-conditions:
	 * Post-conditions:
	 * 
	 * @return Iterator instance.
	 */
	public Iterator<E> iterator();

	
}
