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
 * Answer: The complexity class is O(N). The single loop N with a body containing 2(K) simple 
 * statements with 2(K) simple statements outside the loop. The simple statements include new 
 * array initializing with the elements of the new array are initialized to a default initial 
 * value and the other statements are variable assignments.  A loop with a body that contains K 
 * simple statements and that repeats N times will have a runtime of roughly (K * N), and have 
 * a fixed amount of time to execute.
 */

/* pg. 888 exercise 5
 * To which complexity class does the following algorithm belong?
 * public static void mystery2(int[] list){
 *     for(int i = 0; i < list.length / 2; i++){
 *         int j = list.length - 1 - i;
 *         int temp = list[i];
 *         list[i] = list[j];
 *         list[j] = temp;
 *     }
 * }
 * 
 * Answer: The complexity class is O(N). The single loop N which is iterated 1/2 N is considered
 * just N and the 4(k) statements include variable and index assignments, which are simple statements. 
 * A loop with a body that contains K simple statements and that repeats N times will have a runtime 
 * of roughly (K * N), and have a fixed amount of time to execute.
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
