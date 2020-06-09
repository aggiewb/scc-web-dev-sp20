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
	void testMultipleLeftEmpty() {
		fail("Not yet implemented");
	}

	@Test
	void testMultipleRightEmpty() {
		fail("Not yet implemented");
	}
	
	@Test
	void testEqualLeftRightEmpty() {
		fail("Not yet implemented");
	}
}
