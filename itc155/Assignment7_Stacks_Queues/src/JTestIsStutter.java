
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Stack;

class JTestIsStutter {

	@Test
	void testEmptyStutter() {
		Stack<Integer> toStutter = new Stack<>();
		
		Stutter.stutter(toStutter);
		
		assertEquals(true, toStutter.isEmpty());
		assertEquals(0, toStutter.size());
	}
	
	@Test
	void testHasStackElements() {
		Stack<Integer> toStutter = new Stack<>();
		for(int i = 1; i < 4; i++) {
			toStutter.push(i);
		}
		
		Stack<Integer> test = new Stack<>();
		for(int i = 1; i < 4; i++) {
			for(int j = 0; j < 2; j++) {
				test.push(i);
			}
		}
		
		Stutter.stutter(toStutter);
		
		assertEquals(test, toStutter);
		assertEquals(3, toStutter.peek());
	}

}
