import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JTestLinkedIntList {

	@Test
	void testEmptyTrue() {
		LinkedIntList list = new LinkedIntList();
		assertTrue(list.isSorted());
	}
	
	void testFullTrue() {
		fail("Not yet implemented");
	}
	
	void testFullAllEqualTrue() {
		fail("Not yet implemented");
	}
	
	void testFullFalse() {
		fail("Not yet implemented");
	}
}
