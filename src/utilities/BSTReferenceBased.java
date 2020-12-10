/**
 * 
 */
package utilities;

import contracts.BSTNodeADT;
import contracts.BSTreeADT;
import contracts.Iterator;

/**
 * @author Jaeyoung Kim
 *
 */
@SuppressWarnings("serial")
public class BSTReferenceBased<E> implements BSTreeADT<E> {

	private BSTNode<E> root;

	private int size;

	public BSTReferenceBased() {
		this.root = null;
		this.size = 0;
	}

	@Override
	public boolean add(E data) {
		if (root == null) {
			root = new BSTNode<E>(data);
		}
		
		if (data < root.getData()) {
			
		}
		
		return false;
	}

	@Override
	public boolean hasLeftChild(BSTNodeADT<E> node) {
		return node.getLeft() != null ? true : false;
	}

	@Override
	public boolean hasRightChild(BSTNodeADT<E> node) {
		return node.getRight() != null ? true : false;
	}

	@Override
	public boolean isLeaf(BSTNodeADT<E> node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BSTreeADT<E> getRoot() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public void getHeight() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BSTreeADT<E> remove(BSTNodeADT<E> node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(BSTNodeADT<E> toFind) throws NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

}
