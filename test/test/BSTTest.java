/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import contracts.BSTNodeADT;
import contracts.BSTreeADT;
import problemdomain.Word;
import utilities.BSTReferenceBased;

/**
 * @author Jaeyoung Kim
 *
 */
class BSTTest {
	private BSTreeADT<Word> tree;	
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.tree = new BSTReferenceBased<>();
		
		this.tree.add(new Word("e"));
		this.tree.add(new Word("k"));
		this.tree.add(new Word("n"));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		this.tree.clear();
	}

	/**
	 * Test method for {@link utilities.BSTReferenceBased#add(java.lang.Object)}.
	 */
	@Test
	void testAdd() {
		this.tree.add(new Word("a"));
		this.tree.add(new Word("m"));
		this.tree.add(new Word("z"));
		
		assertEquals(this.tree.size(), 6);
	}

	/**
	 * Test method for {@link utilities.BSTReferenceBased#hasLeftChild(contracts.BSTNodeADT)}.
	 */
	@SuppressWarnings("unchecked")
	@Test
	void testHasLeftChild() {
		//assertEquals(this.tree.hasLeftChild((BSTNodeADT<Word>) this.tree), true);
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
		//tree.isLeaf((BSTNodeADT<Word>) this.tree);
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
		assertEquals(tree.isEmpty(), false);
	}

	/**
	 * Test method for {@link utilities.BSTReferenceBased#contains()}.
	 */
	@Test
	void testContains() {
		fail("Not yet implemented");
	}
}
