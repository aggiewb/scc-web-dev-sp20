
public class SelfCheckoutClient {

	public static void main(String[] args) {
		Bag baggingArea = new Bag();
		Scan scanningArea = new Scan();
		
		Customer fakeCustomer = newCustomer();
		System.out.println();
		
		Employee fakeEmployee = newEmployee();
		System.out.println();
		
		Product fakeMilk = newMilk();
		Product fakeBread = newBread();
		Product fakeMeat = newMeat();
		Product fakeVeggie = newVeggie();
		RestrictedProduct fakeBeer = newBeer();
		System.out.println();
		
		//Add System.out.println("Checking out <item name>: "); to help highlight each product actions
		Sale fakeOrder = newOrder();
		System.out.println("Checking out milk: ");
		scanningArea.checkoutProduct(fakeOrder, fakeMilk);
		baggingArea.alertCustomer(fakeMilk, 3.4);
		baggingArea.alertCustomer(fakeMilk, 8.6);
		System.out.println("Checking out bread: ");
		scanningArea.checkoutProduct(fakeOrder, fakeBread);
		baggingArea.alertCustomer(fakeBread, 1);
		System.out.println("Checking out bacon: ");
		scanningArea.checkoutProduct(fakeOrder, fakeMeat);
		baggingArea.alertCustomer(fakeMeat, 1.5);
		System.out.println("Checking out tomatoes: ");
		scanningArea.checkoutProduct(fakeOrder, fakeVeggie);
		baggingArea.alertCustomer(fakeVeggie, 4);
		
		fakeCustomer.requestAssistance();
		fakeEmployee.clearCustomerRequest(fakeCustomer);
		
		System.out.println("Checking out beer: ");
		scanningArea.checkoutProduct(fakeOrder, fakeBeer, fakeEmployee, fakeCustomer);
		baggingArea.alertCustomer(fakeBeer, 19.56);
		baggingArea.alertCustomer(fakeBeer, 20);
		System.out.println("Checking out 2nd 6 pack of beer: ");
		scanningArea.checkoutProduct(fakeOrder, fakeBeer, fakeEmployee, fakeCustomer);
		baggingArea.alertCustomer(fakeBeer, 20);
		System.out.println();
		

		for(Product item : fakeOrder.getProducts()) {
			System.out.println(item);
		}
		
		fakeEmployee.removeSaleProduct(fakeOrder, fakeBeer);
		System.out.println();
		
		System.out.println("After last 6 pack removed: ");
		for(Product item : fakeOrder.getProducts()) {
			System.out.println(item);
		}
		
		System.out.println();
		System.out.println("Sale ID: " + fakeOrder.getSaleID());
		fakeOrder.setSubTotal();
		System.out.println("Subtotal: $" + fakeOrder.getSubTotal());
		System.out.println("Tax Percent: " + fakeOrder.getTaxRate() + "%");
		fakeOrder.setTotalTax();
		System.out.println("Total Tax: $" + fakeOrder.getTotalTax());
		fakeOrder.setDiscount(fakeCustomer);
		System.out.println("Total Discount: $" + fakeOrder.getDiscount());
		fakeOrder.setTotal(fakeCustomer);
		System.out.println("Total: $" + fakeOrder.getTotal());
		
		System.out.println("After payment: $" + fakeCustomer.payTotalDue(fakeOrder.getTotal(), 119.93));
		
		System.out.println();
		fakeEmployee.removeOrder(fakeOrder);
		System.out.println("After order items deletion: ");
		System.out.println(fakeOrder.getProducts());
		
	}
	
	public static Customer newCustomer() {
		Customer fakeCustomer = new Customer("Smith", "Bob", "simple@example.com");
		fakeCustomer.setAddress("132, My Street", "Kingston", "New York", 12401);
		fakeCustomer.setPhoneNumber("425-555-2323");
		fakeCustomer.setAge(36);
		fakeCustomer.setTotalRewardPoints(100);
		//each time newCustomer is called a new instance of a date is generated
		System.out.println(fakeCustomer + " Date added: " + fakeCustomer.getDateAdded());
		System.out.println("Age: " + fakeCustomer.getAge() + " Address: " + fakeCustomer.getAddress());
		return fakeCustomer;
	}
	
	public static Employee newEmployee() {
		Employee fakeEmployee = new Employee("Smith", "Barbera", "very_simple@example.com");
		fakeEmployee.setAddress("231, Your Street", "Kingston", "New York", 12401);
		fakeEmployee.setPhoneNumber("425-555-0202");
		fakeEmployee.setEmployeeId(123456789);
		fakeEmployee.setRestrictedItemAuth(true);
		System.out.println(fakeEmployee);
		System.out.println("Employee ID: " + fakeEmployee.getEmployeeId() + " Address: " + fakeEmployee.getAddress() + " Restricted Product Authorization: " + 
		fakeEmployee.getRestrictedItemAuth());
		return fakeEmployee;
	}
	
	public static Product newMilk() {
		Product fakeMilk = new Product(123456, "Moo Cow Milk", "dairy", 5.68);
		fakeMilk.setAmountAvailable(35);
		fakeMilk.setWeight(8.6);
		System.out.println(fakeMilk);
		System.out.println("Amount available: " + fakeMilk.getAmountAvailable());
		return fakeMilk;
	}
	
	public static Product newBread() {
		Product fakeBread = new Product(234567, "Bird Seed Bread", "bread", 2.88);
		fakeBread.setAmountAvailable(23);
		fakeBread.setWeight(1);
		System.out.println(fakeBread);
		System.out.println("Amount available: " + fakeBread.getAmountAvailable() + " Restriction: " + fakeBread.isRestriction());
		return fakeBread;
	}
	
	public static Product newMeat() {
		Product fakeMeat = new Product(345678, "Best Bacon", "meat", 6.58);
		fakeMeat.setAmountAvailable(15);
		fakeMeat.setWeight(1.5);
		System.out.println(fakeMeat);
		System.out.println("Amount available: " + fakeMeat.getAmountAvailable() + " Restriction: " + fakeMeat.isRestriction());
		return fakeMeat;
	}

	public static Product newVeggie() {
		Product fakeVeggie = new Product(456789, "tomato", "vegetable", 1.24);
		fakeVeggie.setAmountAvailable(46);
		fakeVeggie.setWeight(4);
		System.out.println(fakeVeggie);
		System.out.println("Amount available: " + fakeVeggie.getAmountAvailable() + " Restriction: " + fakeVeggie.isRestriction());
		return fakeVeggie;
	}
	
	public static RestrictedProduct newBeer() {
		RestrictedProduct fakeBeer = new RestrictedProduct(987654, "Henry's Hefeweizen", "alcohol", 100.06);
		fakeBeer.setAgeLimit(21);
		fakeBeer.setAmountAvailable(12);
		fakeBeer.setWeight(20);
		fakeBeer.setRestriction(true);
		System.out.println(fakeBeer);
		System.out.println("Amount available: " + fakeBeer.getAmountAvailable() + " Restriction: " + fakeBeer.isRestriction());
		return fakeBeer;	
	}
	
	public static Sale newOrder() {
		Sale fakeSale = new Sale(1);
		System.out.println(fakeSale);
		return fakeSale;
	}

}
