/**
 * 
 */
package utilities;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import contracts.BSTNodeADT;
import contracts.Iterator;

/**
 * @author Jaeyoung Kim
 *
 */
public class BSTIterator<E> implements Iterator<E> {
	private int position;
	private ArrayList<E> sortedNodes;
	
	/**
	 * @param mySLL mySLL
	 */
	public BSTIterator(BSTNodeADT<E> root) {
		this.sortedNodes = new ArrayList<E>();
		this.position = -1;
		this.inorder(root);
	}

	private void inorder(BSTNodeADT<E> root) {

        if (root == null) {
            return;
        }

        this.inorder(root.getLeft());
        this.sortedNodes.add(root.getData());
        this.inorder(root.getRight());
    }
	
	@Override
	public boolean hasNext() {
		return this.position + 1 < this.sortedNodes.size();
	}

	@Override
	public E next() throws NoSuchElementException {
		return this.sortedNodes.get(++this.position);
	}

}
