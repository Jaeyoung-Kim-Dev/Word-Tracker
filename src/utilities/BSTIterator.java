/**
 * 
 */
package utilities;

import java.util.NoSuchElementException;

import contracts.Iterator;

/**
 * @author Jaeyoung Kim
 *
 */
public class BSTIterator<E> implements Iterator<E> {
	private int position;
	private BSTReferenceBased<E> referenceBased;
	
	/**
	 * @param mySLL mySLL
	 */
	public BSTIterator(BSTReferenceBased<E> referenceBased) {
		this.referenceBased = referenceBased;
		this.position = -1;
		
	}

	@Override
	public boolean hasNext() {
		boolean inBounds = this.position < this.referenceBased.size() - 1;
	       
		return inBounds;
	}

	@Override
	public E next() throws NoSuchElementException {
		if (!this.hasNext())
			throw new NoSuchElementException();
		
		this.position++;
		
		//E item = this.referenceBased.get(this.position);
		
		return null;//item;
	}

}
