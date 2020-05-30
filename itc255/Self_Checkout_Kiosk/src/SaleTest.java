
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

class SaleTest {

	@Test
	void testSubtotal() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		Product testBeef = new Product(456, "testBeef", "dairy", 9.51);
		Sale order = new Sale(2);
		order.setProduct(testMilk);
		order.setProduct(testBeef);
		BigDecimal testMoney = new BigDecimal(12.01).setScale(2, RoundingMode.HALF_UP);
		order.setSubTotal();
		assertEquals(testMoney, order.getSubTotal());
	}

}
