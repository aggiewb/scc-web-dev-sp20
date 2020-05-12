import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class JTestIsNumbers {
	@Test
	void testZero() {
		Numbers nums = new Numbers();
		// () -> A Java lambda expression can be passed around as if it was an object and executed on demand.
		// assertThrows(Class<T> expectedType, Executable executable) <T> means Generic class
		assertThrows(IllegalArgumentException.class, () -> {nums.writeNums(0);});
	}

	@Test
	void testOne() {
		// Create a ByteArrayOutputStream, which is a new byte array output stream,
		// to get the output from the call to print
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		// Change System.out to point out to stream
		// java.lang.System.setOut() method reassigns the "standard" output stream
		System.setOut(new PrintStream(outContent));
		
		Numbers nums = new Numbers();
		nums.writeNums(1);
		
		// java.io.ByteArrayOutputStream.toString() method converts the buffer's contents into a string 
		// decoding bytes using the platform's default character set.
		assertEquals("1", outContent.toString());
	}
	
	@Test
	void testTwo() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
				
		Numbers nums = new Numbers();
		nums.writeNums(2);
		assertEquals("1, 2", outContent.toString());
	}
	
	@Test
	void testFive() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));;
		
		Numbers nums = new Numbers();
		nums.writeNums(5);
		assertEquals("1, 2, 3, 4, 5", outContent.toString());
	}
	
	@Test
	void testTwelve() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		Numbers nums = new Numbers();
		nums.writeNums(12);
		assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12", outContent.toString());
	}
	
}
