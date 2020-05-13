/* pg. 888 exercise 3
 * Suppose the following array has been declared:
 * index            0  1  2  3   4   5   6   7   8   9   10  11  12  13  14
 * int[] numbers = {0, 0, 5, 10, 15, 40, 55, 60, 65, 70, 80, 85, 90, 95, 300}; 
 * What indexes will be examined as the middle element by a binary search for each
 * of the following target values?
 * a. 65 Answer: 
 * b. 9 Answer: 
 * c. 90 Answer: 
 * d. 147 Answer: 
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
 * Answer: 
 */


/* The following class is a modified version of the selection sort algorithm that selects the 
 * largest element each time and moves it to the end of the array, rather than selecting the 
 * smallest element and moving it to the beginning.
 * Will this sort be faster than the standard selection sort, and what will the complexity class
 * (big-Oh) be? */

public class ModifiedSelectionSort {
}
