/**
 * 
 */
package utilities;

import contracts.BSTNodeADT;
import contracts.BSTreeADT;
import contracts.Iterator;
import problemdomain.Word;

/**
 * @author Jaeyoung Kim
 *
 */
@SuppressWarnings("serial")
public class BSTReferenceBased<E> implements BSTreeADT<E> {

	private BSTNodeADT<E> root;
	private int size;

	public BSTReferenceBased() {
		this.root = null;
		this.size = 0;
	}

	@Override
	public boolean add(E data) {
		if (isEmpty()) {
			this.root = new BSTNode<E>(data);
		} else {
			this.root = addRecursive(this.root, data);
		}
		this.size++;
		return true;
	}

	private BSTNodeADT<E> addRecursive(BSTNodeADT<E> node, E data) {
		String wordFromNode = ((Word) node.getData()).getWord();
		String wordToAdd = ((Word) data).getWord();
		
		if (wordToAdd.compareTo(wordFromNode) < 0) { // insert in the left subtree
			if (node.getLeft() == null) {
				node.setLeft(new BSTNode<>(data));
			} else {
				node.setLeft(addRecursive(node.getLeft(), data));
			}
		} else {
			if (node.getRight() == null) {
				node.setRight(new BSTNode<>(data));
			} else {
				node.setRight(addRecursive(node.getRight(), data));
			}
		}
		return node;
	}

	@Override
	public boolean hasLeftChild(BSTNodeADT<E> node) { //public boolean hasLeftChild(BSTNodeADT<E> node) {
		return node.getLeft() != null ? true : false;
	}

	@Override
	public boolean hasRightChild(BSTNodeADT<E> node) {
		return node.getRight() != null ? true : false;
	}

	@Override
	public boolean isLeaf(BSTNodeADT<E> node) {
		return node.getLeft() == null && node.getRight() == null;
	}

	@Override
	public BSTreeADT<E> getRoot() {
		return (BSTreeADT<E>) this.root;
	}


	@Override
	public boolean isEmpty() {
		return this.root == null;
	}

	@Override
	public Iterator<E> iterator() {		
		return new BSTIterator<E>(this.root);
	}

	@Override
	public BSTreeADT<E> remove(BSTNodeADT<E> node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		this.root = null;
	}

	@Override
	public boolean contains(BSTNodeADT<E> toFind) throws NullPointerException {
		return false;
	}

}
