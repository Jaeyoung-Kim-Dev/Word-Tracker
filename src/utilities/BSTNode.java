/**
 * 
 */
package utilities;

import contracts.BSTNodeADT;

/**
 * @author kornk
 *
 */
public class BSTNode<E> implements BSTNodeADT<E> {

	private E data;
	
	private BSTNode<E> left;
	private BSTNode<E> right;
	
	@Override
	public BSTNodeADT<E> getLeft() {		
		return left;
	}

	@Override
	public void setLeft(BSTNodeADT<E> left) {
		this.left = (BSTNode<E>) left;
	}
	
	@Override
	public BSTNodeADT<E> getRight() {
		// TODO Auto-generated method stub
		return right;
	}

	@Override
	public void setRight(BSTNodeADT<E> right) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public E getData() {
		return data;
	}

	

	

}
