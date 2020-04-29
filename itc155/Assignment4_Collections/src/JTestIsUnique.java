import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class JTestIsUnique {

	@Test
	void testTrue() {
		Map<String, String> names = new HashMap<>();
		names.put("Marty", "Stepp");
		names.put("Stuart", "Reges");
		names.put("Jessica", "Miller");
		names.put("Amanda", "Camp");
		names.put("Hal", "Perkins");
		assertEquals(true, Unique.isUnique(names));
	}
	
	@Test
	void testFalse() {
		Map<String, String> names = new HashMap<>();
		names.put("Kendrick", "Perkins");
		names.put("Stuart", "Reges");
		names.put("Jessica", "Miller");
		names.put("Bruce", "Reges");
		names.put("Hal", "Perkins");
		assertEquals(false, Unique.isUnique(names));
	}

}
