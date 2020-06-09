
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class JUnitTestsSelfCheckoutKiosk {

	@Test
	void testSubtotal() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		Product testBeef = new Product(456, "testBeef", "meat", 9.51);
		Sale testOrder = new Sale(2);
		Scan scanArea = new Scan();
		scanArea.checkoutProduct(testOrder, testMilk);
		scanArea.checkoutProduct(testOrder, testBeef);
		BigDecimal testMoney = new BigDecimal(12.01).setScale(2, RoundingMode.HALF_UP);
		testOrder.setSubTotal();
		assertEquals(testMoney, testOrder.getSubTotal());
	}
	
	@Test 
	void testTotalTax() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		Product testBeef = new Product(456, "testBeef", "meat", 9.51);
		Sale testOrder = new Sale(2);
		Scan scanArea = new Scan();
		scanArea.checkoutProduct(testOrder, testMilk);
		scanArea.checkoutProduct(testOrder, testBeef);
		BigDecimal testMoney = new BigDecimal(1.20).setScale(2, RoundingMode.HALF_UP);
		testOrder.setSubTotal();
		testOrder.setTotalTax();
		assertEquals(testMoney, testOrder.getTotalTax());
	}
	
	@Test 
	void testTotalDiscount() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		Product testBeef = new Product(456, "testBeef", "meat", 9.51);
		Sale testOrder = new Sale(2);
		Customer testCustomer = new Customer("Test", "Bob", "test@example.com");
		testCustomer.setTotalRewardPoints(500);
		Scan scanArea = new Scan();
		scanArea.checkoutProduct(testOrder, testMilk);
		scanArea.checkoutProduct(testOrder, testBeef);
		BigDecimal testMoney = new BigDecimal(4.08).setScale(2, RoundingMode.HALF_UP);
		testOrder.setSubTotal();
		testOrder.setDiscount(testCustomer);
		assertEquals(testMoney, testOrder.getDiscount());
	}
	
	@Test 
	void testTotal() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		Product testBeef = new Product(456, "testBeef", "meat", 9.51);
		Sale testOrder = new Sale(2);
		Customer testCustomer = new Customer("Test", "Bob", "test@example.com");
		testCustomer.setTotalRewardPoints(500);
		Scan scanArea = new Scan();
		scanArea.checkoutProduct(testOrder, testMilk);
		scanArea.checkoutProduct(testOrder, testBeef);
		BigDecimal testMoney = new BigDecimal(9.13).setScale(2, RoundingMode.HALF_UP);
		testOrder.setSubTotal();
		testOrder.setTotalTax();
		testOrder.setDiscount(testCustomer);
		testOrder.setTotal();
		assertEquals(testMoney, testOrder.getTotal());
	}
	
	@Test 
	void testPayAllTotalDue() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		Product testBeef = new Product(456, "testBeef", "meat", 9.51);
		Sale testOrder = new Sale(2);
		Customer testCustomer = new Customer("Test", "Bob", "test@example.com");
		testCustomer.setTotalRewardPoints(500);
		Scan scanArea = new Scan();
		scanArea.checkoutProduct(testOrder, testMilk);
		scanArea.checkoutProduct(testOrder, testBeef);
		double customerPayment = 9.13;
		BigDecimal remainder = new BigDecimal(0.00).setScale(2, RoundingMode.HALF_UP);
		testOrder.setSubTotal();
		testOrder.setTotalTax();
		testOrder.setDiscount(testCustomer);
		testOrder.setTotal();
		assertEquals(remainder, testCustomer.payTotalDue(testOrder.getTotal(), customerPayment));
	}
	
	@Test 
	void testPaySomeTotalDue() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		Product testBeef = new Product(456, "testBeef", "meat", 9.51);
		Sale testOrder = new Sale(2);
		Customer testCustomer = new Customer("Test", "Bob", "test@example.com");
		testCustomer.setTotalRewardPoints(500);
		Scan scanArea = new Scan();
		scanArea.checkoutProduct(testOrder, testMilk);
		scanArea.checkoutProduct(testOrder, testBeef);
		double customerPayment = 4.13;
		BigDecimal remainder = new BigDecimal(5.00).setScale(2, RoundingMode.HALF_UP);
		testOrder.setSubTotal();
		testOrder.setTotalTax();
		testOrder.setDiscount(testCustomer);
		testOrder.setTotal();
		assertEquals(remainder, testCustomer.payTotalDue(testOrder.getTotal(), customerPayment));
	}
	

	@Test
	void testRemoveItem() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		Product testBeef = new Product(456, "testBeef", "meat", 9.51);
		Employee testEmployee = new Employee("Test", "Bobby", "test-worker@example.com");
		ArrayList<Product> testOrderList = new ArrayList<>();
		testOrderList.add(testBeef);
		Sale testOrder = new Sale(2);
		testOrder.setProduct(testMilk);
		testOrder.setProduct(testBeef);
		testEmployee.removeSaleProduct(testOrder, testMilk);
		assertEquals(testOrderList, testOrder.getProducts());
	}
	
	@Test
	void testRemoveOrder() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		Product testBeef = new Product(456, "testBeef", "meat", 9.51);
		Employee testEmployee = new Employee("Test", "Bobby", "test-worker@example.com");
		ArrayList<Product> testOrderList = new ArrayList<>();
		Sale testOrder = new Sale(2);
		testOrder.setProduct(testMilk);
		testOrder.setProduct(testBeef);
		testEmployee.removeOrder(testOrder);
		assertEquals(testOrderList, testOrder.getProducts());
	}
	
	@Test
	void testApproveRestrictedTrue() {
		RestrictedProduct testBeer = new RestrictedProduct(456, "testBeer", "alcohol", 9.51);
		testBeer.setAgeLimit(21);
		Employee testEmployee = new Employee("Test", "Bobby", "test-worker@example.com");
		Customer testCustomer = new Customer("Test", "Bob", "test@example.com");
		testEmployee.setRestrictedItemAuth(true);
		testCustomer.setAge(35);
		assertEquals(true, testEmployee.approveRestricted(testBeer, testCustomer));
	}
	
	@Test
	void testApproveRestrictedFalseEmployeeNotAuth() {
		RestrictedProduct testBeer = new RestrictedProduct(456, "testBeer", "alcohol", 9.51);
		testBeer.setAgeLimit(21);
		Employee testEmployee = new Employee("Test", "Bobby", "test-worker@example.com");
		Customer testCustomer = new Customer("Test", "Bob", "test@example.com");
		testEmployee.setRestrictedItemAuth(false);
		testCustomer.setAge(35);
		assertEquals(false, testEmployee.approveRestricted(testBeer, testCustomer));
	}
	
	@Test
	void testApproveRestrictedFalseCustomerUnderAgeLimit() {
		RestrictedProduct testBeer = new RestrictedProduct(456, "testBeer", "alcohol", 9.51);
		testBeer.setAgeLimit(21);
		Employee testEmployee = new Employee("Test", "Bobby", "test-worker@example.com");
		Customer testCustomer = new Customer("Test", "Bob", "test@example.com");
		testEmployee.setRestrictedItemAuth(true);
		testCustomer.setAge(16);
		assertEquals(false, testEmployee.approveRestricted(testBeer, testCustomer));
	}
	
	@Test
	void testBagMeasuredWeightEqualsProductSetWeight() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		testMilk.setWeight(8.6);
		Bag baggingArea = new Bag();
		assertEquals("Scan next item.", baggingArea.alertCustomer(testMilk, 8.6));
	}
	
	@Test
	void testBagMeasuredWeightNotEqualsProductSetWeight() {
		Product testMilk = new Product(123, "testMilk", "dairy", 2.50);
		testMilk.setWeight(8.6);
		Bag baggingArea = new Bag();
		assertEquals("Remove product from bagging area and try again.", baggingArea.alertCustomer(testMilk, 8.5));
	}
	
}
