
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.Queue;

class JTestIsPalindrome {

	@Test
	void testEmptyPalindrome() {
		Queue<Integer> test = new LinkedList<>();
		
		assertEquals(true, test.isEmpty());
		assertEquals(true, Palindrome.isPalindrome(test));
	}
	
	@Test
	void testTruePalindrome() {
		Queue<Integer> test = new LinkedList<>();
		int[] toSet = {3, 8, 17, 9, 17, 8, 3};
		for(int num : toSet) {
			test.add(num);
		}
		
		assertEquals(3, test.peek());
		assertEquals(true, Palindrome.isPalindrome(test));
	}
	
	@Test
	void testFalsePalindrome() {
		Queue<Integer> test = new LinkedList<>();
		int[] toSet = {5, 10, -1, 4, 3, 2, 4, -1, 10, 5};
		for(int num : toSet) {
			test.add(num);
		}
		
		assertEquals(5, test.peek());
		assertEquals(false, Palindrome.isPalindrome(test));
	}

}
