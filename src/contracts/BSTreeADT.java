/**
 * 
 */
package contracts;

import java.io.Serializable;

import exceptions.EmptyTreeException;

/**
 * The Abstract Data Type for a Binary Search Tree.
 * 
 * @author Jaeyoung Kim
 *
 */
public interface BSTreeADT<E> extends Serializable {

	/**
	 * Adds an element to the binary search tree.
	 * 
	 * Pre-conditions: A valid binary search tree exists and an element is passed.
	 * 
	 * Post-conditions: It returns true if element is added to the binary search tree otherwise it returns false.
	 * 
	 * @param data Element data to add.
	 * @return True if element was added.
	 */
	public boolean add(E data);

	/**
	 * Removes an specific element from the binary search tree.
	 * 
	 * Pre-conditions: A valid binary search tree exists and an node is passed.
	 * 
	 * Post-conditions: It removes an element from the binary search tree and returns the element.
	 * 
	 * @param data Element data to be removed.
	 * @return True if element was removed.
	 * @throws EmptyTreeException Thrown if binary search tree has nothing to remove.
	 */
	public BSTreeADT<E> remove(BSTNodeADT<E> node) throws EmptyTreeException;

	/**
	 * Checks if a node has a left child.
	 * 
	 * Pre-conditions: A valid binary search tree exists and an node is passed.
	 * 
	 * Post-conditions: It returns true if the node has a left child otherwise it returns false.
	 * 
	 * @param node Node to check.
	 * @return True if node has a left child.
	 */
	public boolean hasLeftChild(BSTNodeADT<E> node);

	/**
	 * Checks if a node has a right child.
	 * 
	 * Pre-conditions: A valid binary search tree exists and an node is passed.
	 * 
	 * Post-conditions: It returns true if the node has a right child otherwise it returns false.
	 * 
	 * @param node Node to check.
	 * @return True if node has a right child.
	 */
	public boolean hasRightChild(BSTNodeADT<E> node);

	/**
	 * Checks if a node is a leaf.
	 * 
	 * Pre-conditions: A valid binary search tree exists and an node is passed.
	 * 
	 * Post-conditions: It returns true if the node is a leaf otherwise it returns false.
	 * 
	 * @param node Node to check.
	 * @return True if node is a leaf.
	 */
	public boolean isLeaf(BSTNodeADT<E> node);

	/**
	 * Gets the root node of the tree.
	 * 
	 * Pre-conditions: A valid binary search tree exists.
	 * 
	 * Post-conditions: It returns the root node of tree.
	 * 
	 * @return Root node of tree.
	 * @throws EmptyTreeException Thrown if binary search tree does not have root.
	 */
	public BSTreeADT<E> getRoot() throws EmptyTreeException;

	/**
	 * The size method will return the current element count contained in the list.
	 * 
	 * Pre-conditions: A valid binary search tree exists.
	 * 
	 * Post-conditions: It returns the number of Elements on the binary search tree.
	 * 
	 * @return The current element count.
	 */
	public int size();

	/**
	 * Checks if the binary search tree is empty.
	 * 
	 * Pre-conditions: A valid binary search tree exists.
	 * 
	 * Post-conditions: It returns true if the root is empty or size is 0 otherwise it returns False.
	 * 
	 * @return True if the root is empty or size is 0.
	 */
	public boolean isEmpty();

	/**
	 * Set the root is null -> Then the rest of nodes will be gone by a garbage
	 * collector.
	 * 
	 * Pre-conditions: A valid binary search tree exists.
	 * 
	 * Post-conditions: Binary search tree is empty.
	 * 
	 */
	public void clear();

	/**
	 * Checks if the binary search tree contains the specified node.
	 * 
	 * Pre-conditions: A valid binary search tree exists.
	 * 
	 * Post-conditions: It returns true if a specific node is present in the binary search tree
	 * otherwise it returns False.
	 * 
	 * @param toFind The node to be found.
	 * @return true if the binary search tree contains the specified node.
	 * @throws EmptyTreeException If the specified node is null and the binary
	 *                              search tree does not support having null node.
	 */
	public boolean contains(BSTNodeADT<E> toFind) throws EmptyTreeException;
	
	/**
	 * Returns an iterator over the nodes in the binary search tree, in proper sequence.
	 * 
	 * Pre-conditions: A valid binary search tree exists and an node is passed.
	 * 
	 * Post-conditions: It returns an iterator over the items contained in this binary search tree.
	 * 
	 * @return Iterator instance.
	 */
	public Iterator<E> iterator();

}
