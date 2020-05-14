/* pg. 888 exercise 3
 * Suppose the following array has been declared:
 * index            0  1  2  3   4   5   6   7   8   9   10  11  12  13  14
 * int[] numbers = {0, 0, 5, 10, 15, 40, 55, 60, 65, 70, 80, 85, 90, 95, 300}; 
 * What indexes will be examined as the middle element by a binary search for each
 * of the following target values?
 * a. 65 Answer: 7, 11, 9, 8 return index 8 value 65
 * b. 9 Answer: 7, 3, 1, 2, 3 return -4
 * c. 90 Answer: 7, 11, 13, 12 return index 12 value 90
 * d. 147 Answer: 7, 11, 13, 14 return -15
 * */


/* pg. 888 exercise 4
 * To which complexity class does the following algorithm belong? Consider N to be the
 * length or size of the array or collection passed to the method. Explain your reasoning.
 * 
 * public static int[] mystery1(int[] list){
 *     int[] result = new int[2 * list.length];
 *     for(int i = 0; i < list.length; i++){
 *         result[2 * i] = list[i] / 2 + list[i] % 2;
 *         result[2 * i + 1] = list[i] / 2;
 *     }
 *     return result;
 * }
 * 
 * Answer: O(N) The single loop N with a body containing 2(K) simple statements with 2(K) simple 
 * statements outside the loop. A loop with a body that contains K simple statements and that 
 * repeats N times will have a runtime of roughly (K * N).
 */


/* The following class is a modified version of the selection sort algorithm that selects the 
 * largest element each time and moves it to the end of the array, rather than selecting the 
 * smallest element and moving it to the beginning.
 * Will this sort be faster than the standard selection sort, and what will the complexity class
 * (big-Oh) be? The complexity class of the modified version would O(N^2), which isn't any faster
 * than the standard. */

public class ModifiedSelectionSort {
	public void selectionSort(int[] arr) {
		for(int i = arr.length - 1; i > 0; i--) {
			int largest = i;
			for(int j = i - 1; j >= 0; j--) {
				if(arr[largest] < arr[j]) {
					largest = j;
				}
			}
			
			if(largest != i) {
				swap(arr, i, largest);	
			}	
		}
	}
	
	private static void swap(int[] arr, int i, int largest) {
		int temp = arr[i];
		arr[i] = arr[largest];
		arr[largest] = temp;
	}
}
