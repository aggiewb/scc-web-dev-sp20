import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModifiedSelectionSortTest {

	@Test
	void testFull() {
		int[] nums = {2, 5, 23, 5, 1, 0, 23, 6, 9};
		int[] checkNums = {0, 1, 2, 5, 5, 6, 9, 23, 23};
		ModifiedSelectionSort sort = new ModifiedSelectionSort();
		sort.selectionSort(nums);
		assertArrayEquals(checkNums, nums);
	}
	
	@Test
	void testEmpty() {
		int[] nums = new int[0];
		ModifiedSelectionSort sort = new ModifiedSelectionSort();
		sort.selectionSort(nums);
		assertEquals(0, nums.length);
	}

}
