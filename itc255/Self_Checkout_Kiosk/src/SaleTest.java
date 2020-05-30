
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

class SaleTest {

	@Test
	void testSubtotal() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		Product testBeef = new Product(456, "testBeef", "dairy", 9.51);
		Sale testOrder = new Sale(2);
		testOrder.setProduct(testMilk);
		testOrder.setProduct(testBeef);
		BigDecimal testMoney = new BigDecimal(12.01).setScale(2, RoundingMode.HALF_UP);
		testOrder.setSubTotal();
		assertEquals(testMoney, testOrder.getSubTotal());
	}
	
	@Test 
	void testTotalTax() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		Product testBeef = new Product(456, "testBeef", "dairy", 9.51);
		Sale testOrder = new Sale(2);
		testOrder.setProduct(testMilk);
		testOrder.setProduct(testBeef);
		BigDecimal testMoney = new BigDecimal(1.20).setScale(2, RoundingMode.HALF_UP);
		testOrder.setSubTotal();
		testOrder.setTotalTax();
		assertEquals(testMoney, testOrder.getTotalTax());
	}
	
	@Test 
	void testTotalDiscount() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		Product testBeef = new Product(456, "testBeef", "dairy", 9.51);
		Sale testOrder = new Sale(2);
		Customer testCustomer = new Customer("Test", "Bob", "test@example.com");
		testCustomer.setTotalRewardPoints(500);
		testOrder.setProduct(testMilk);
		testOrder.setProduct(testBeef);
		BigDecimal testMoney = new BigDecimal(4.08).setScale(2, RoundingMode.HALF_UP);
		testOrder.setSubTotal();
		testOrder.setDiscount(testCustomer);
		assertEquals(testMoney, testOrder.getDiscount());
	}
	
	@Test 
	void testTotal() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		Product testBeef = new Product(456, "testBeef", "dairy", 9.51);
		Sale testOrder = new Sale(2);
		Customer testCustomer = new Customer("Test", "Bob", "test@example.com");
		testCustomer.setTotalRewardPoints(500);
		testOrder.setProduct(testMilk);
		testOrder.setProduct(testBeef);
		BigDecimal testMoney = new BigDecimal(9.13).setScale(2, RoundingMode.HALF_UP);
		testOrder.setSubTotal();
		testOrder.setTotalTax();
		testOrder.setDiscount(testCustomer);
		testOrder.setTotal();
		assertEquals(testMoney, testOrder.getTotal());
	}

}