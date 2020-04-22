import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class Exercise_10_3_Test {
	@Test
	void testEmpty() {
		ArrayList<String> words = new ArrayList<>();
		Exercise_10_3.removeEvenLength(words);
		assertEquals(0, words.size());
	}

	@Test
	void testAllEvenLength() {
		ArrayList<String> words = new ArrayList<>(Arrays.asList("even", "ev", "evenly"));
		Exercise_10_3.removeEvenLength(words);
		assertEquals(0, words.size());
	}
	
	@Test
	void testAllOddLength() {
		ArrayList<String> words = new ArrayList<>(Arrays.asList("Did", "you", "solve", "what?"));
		Exercise_10_3.removeEvenLength(words);
		assertEquals(4, words.size());
	}
	
	@Test
	void testMixedLength() {
		ArrayList<String> words = new ArrayList<>(Arrays.asList("This", "is", "a", "test"));
		Exercise_10_3.removeEvenLength(words);
		assertEquals(1, words.size());
		assertEquals("a", words.get(0));
	}

}
