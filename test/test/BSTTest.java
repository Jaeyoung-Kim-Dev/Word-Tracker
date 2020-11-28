/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import contracts.BSTreeADT;
import utilities.BSTReferenceBased;

/**
 * @author kornk
 *
 */
class BSTTest {
	private BSTreeADT<Integer> tree;	
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.tree = new BSTReferenceBased();
		
		this.tree.add(5);
		this.tree.add(4);
		this.tree.add(10);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link utilities.BSTReferenceBased#add(java.lang.Object)}.
	 */
	@Test
	void testAdd() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTReferenceBased#hasLeftChild(contracts.BSTNodeADT)}.
	 */
	@Test
	void testHasLeftChild() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTReferenceBased#hasRightChild(contracts.BSTNodeADT)}.
	 */
	@Test
	void testHasRightChild() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTReferenceBased#isLeaf(contracts.BSTNodeADT)}.
	 */
	@Test
	void testIsLeaf() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTReferenceBased#getRoot()}.
	 */
	@Test
	void testGetRoot() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTReferenceBased#isEmpty()}.
	 */
	@Test
	void testIsEmpty() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTReferenceBased#contains()}.
	 */
	@Test
	void testContains() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTReferenceBased#search()}.
	 */
	@Test
	void testSearch() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link utilities.BSTReferenceBased#iterator()}.
	 */
	@Test
	void testIterator() {
		fail("Not yet implemented");
	}

}
