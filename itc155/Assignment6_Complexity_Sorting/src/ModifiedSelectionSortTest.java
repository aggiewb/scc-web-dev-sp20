import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModifiedSelectionSortTest {

	@Test
	void test() {
		int[] nums = {2, 5, 5, 1, 0};
		int[] checkNums = {0, 1, 2, 5, 5};
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
