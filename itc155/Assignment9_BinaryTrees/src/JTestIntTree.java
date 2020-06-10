import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JTestIntTree {

	@Test
	void testNullRoot() {
		IntTree testTree = new IntTree();
		assertEquals(1, testTree.countEmpty());
	}

	@Test
	void testOnlyRoot() {
		IntTree testTree = new IntTree();
		testTree.add(23);
		assertEquals(2, testTree.countEmpty());
	}

	
	@Test
	void testMultipleNodes() {
		IntTree testTree = new IntTree();
		testTree.add(3);
		testTree.add(1);
		testTree.add(2);
		testTree.add(4);
		testTree.add(5);
		testTree.add(6);
		assertEquals(7, testTree.countEmpty());
	}
}
