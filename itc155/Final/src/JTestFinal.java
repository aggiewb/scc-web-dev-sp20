import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Stack;

class JTestFinal {

	@Test
	void testStackEqual() {
		Stack<Integer> testStackOne = new Stack<>();
		Stack<Integer> testStackTwo = new Stack<>();
		Stack<Integer> testCopy = new Stack<>();
		
		for(int i = 1; i < 4; i++) {
			testStackOne.push(i);
			testStackTwo.push(i);
			testCopy.push(i);
		}
		
		assertTrue(StackQueue.equals(testStackOne, testStackTwo));
		assertEquals(testCopy, testStackOne);
		assertEquals(testCopy, testStackTwo);
	}
	
	@Test
	void testStackEmpty() {
		Stack<Integer> testStackOne = new Stack<>();
		Stack<Integer> testStackTwo = new Stack<>();
		Stack<Integer> testCopy = new Stack<>();

		assertTrue(StackQueue.equals(testStackOne, testStackTwo));
		assertEquals(testCopy, testStackOne);
		assertEquals(testCopy, testStackTwo);
	}
	
	@Test
	void testStackNotEqualDifferentSize() {
		Stack<Integer> testStackOne = new Stack<>();
		Stack<Integer> testStackTwo = new Stack<>();
		Stack<Integer> testCopyOne = new Stack<>();
		Stack<Integer> testCopyTwo = new Stack<>();
		
		for(int i = 0; i < 2; i++) {
			testStackOne.push(i);
			testStackTwo.push(i);
			testCopyOne.push(i);
			testCopyTwo.push(i);
		}
		
		for(int i = 3; i < 5; i++) {
			testStackTwo.push(i);
			testCopyTwo.push(i);
		}
		
		assertFalse(StackQueue.equals(testStackOne, testStackTwo));
		assertEquals(testCopyOne, testStackOne);
		assertEquals(testCopyTwo, testStackTwo);
	}
	
	@Test
	void testStackNotEqualSameSize() {
		Stack<Integer> testStackOne = new Stack<>();
		Stack<Integer> testStackTwo = new Stack<>();
		Stack<Integer> testCopyOne = new Stack<>();
		Stack<Integer> testCopyTwo = new Stack<>();
		
		for(int i = 10; i < 40; i+=10) {
			testStackOne.push(i);
			testCopyOne.push(i);
		}
		
		for(int i = 40; i < 70; i+=10) {
			testStackTwo.push(i);
			testCopyTwo.push(i);
		}
		
		assertFalse(StackQueue.equals(testStackOne, testStackTwo));
		assertEquals(testCopyOne, testStackOne);
		assertEquals(testCopyTwo, testStackTwo);
	}
	
	@Test
	void testConsecutiveListTrue() {
		LinkedIntList testList = new LinkedIntList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(1);
		assertTrue(testList.hasTwoConsecutive());
	}
	
	@Test
	void testConsecutiveListFalse() {
		LinkedIntList testList = new LinkedIntList();
		testList.add(0);
		testList.add(12);
		testList.add(-3);
		assertFalse(testList.hasTwoConsecutive());
	}
	
	@Test
	void testConsecutiveListOneNode() {
		LinkedIntList testList = new LinkedIntList();
		testList.add(23);
		assertFalse(testList.hasTwoConsecutive());
	}
	
	@Test
	void testConsecutiveListEmpty() {
		LinkedIntList testList = new LinkedIntList();
		assertFalse(testList.hasTwoConsecutive());
	}
}
