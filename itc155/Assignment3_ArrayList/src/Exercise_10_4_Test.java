import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

class Exercise_10_4_Test {
	
	@Test
	void testEmpty() {
		ArrayList<String> words = new ArrayList<>();
		Exercise_10_4.doubleList(words);
		assertEquals(0, words.size());
	}
	
	@Test
	void testShort() {
		ArrayList<String> words = new ArrayList<>();
		words.add("sup?");
		Exercise_10_4.doubleList(words);
		assertEquals(2, words.size());
	}
	
	@Test
	void testLong() {
		ArrayList<String> words = new ArrayList<>(Arrays.asList("I", "am", "great,", "thanks", "!"));
		Exercise_10_4.doubleList(words);
		assertEquals(10, words.size());
	}

}
