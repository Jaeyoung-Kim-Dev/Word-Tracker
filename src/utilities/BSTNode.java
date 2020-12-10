/**
 * 
 */
package utilities;

import contracts.BSTNodeADT;

/**
 * @author kornk
 *
 */
@SuppressWarnings("serial")
public class BSTNode<E> implements BSTNodeADT<E> {

	private E data;
	
	private BSTNode<E> left;
	private BSTNode<E> right;
	
	public BSTNode(E data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
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
		this.right = (BSTNode<E>) right;
		
	}
	
	@Override
	public E getData() {
		return data;
	}

	

	

}
