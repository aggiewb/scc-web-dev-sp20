import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JTestLinkedIntList {

	@Test
	void testEmptyTrue() {
		LinkedIntList list = new LinkedIntList();
		assertTrue(list.isSorted());
	}
	
	@Test
	void testFullTrue() {
		LinkedIntList list = new LinkedIntList();
		list.add(-3);
		list.add(1);
		list.add(5);
		list.add(5);
		list.add(8);
		list.add(17);
		list.add(25);
		list.add(42);
		list.add(87);
		assertTrue(list.isSorted());
	}
	
	@Test
	void testFullAllEqualTrue() {
		LinkedIntList list = new LinkedIntList();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		assertTrue(list.isSorted());
	}
	
	@Test
	void testFullFalse() {
		LinkedIntList list = new LinkedIntList();
		list.add(-3);
		list.add(1);
		list.add(5);
		list.add(5);
		list.add(8);
		list.add(17);
		list.add(15);
		list.add(42);
		list.add(87);
		assertFalse(list.isSorted());
	}
}
