
public class SelfCheckoutClient {

	public static void main(String[] args) {
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
		
		Sale fakeOrder = newOrder();
		fakeOrder.setProduct(fakeMilk);
		fakeOrder.setProduct(fakeBread);
		fakeOrder.setProduct(fakeMeat);
		fakeOrder.setProduct(fakeVeggie);
		fakeOrder.setProduct(fakeBeer, fakeCustomer, fakeEmployee);
		System.out.println();
		System.out.println(fakeOrder.getProducts());
	}
	
	public static Customer newCustomer() {
		Customer fakeCustomer = new Customer("Smith", "Bob", "simple@example.com");
		fakeCustomer.setAddress("132, My Street", "Kingston", "New York", 12401);
		fakeCustomer.setPhoneNumber("425-555-2323");
		fakeCustomer.setAge(36);
		fakeCustomer.setTotalRewardPoints(100);
		System.out.println(fakeCustomer);
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
		System.out.println(fakeVeggie);
		System.out.println("Amount available: " + fakeVeggie.getAmountAvailable() + " Restriction: " + fakeVeggie.isRestriction());
		return fakeVeggie;
	}
	
	public static RestrictedProduct newBeer() {
		RestrictedProduct fakeBeer = new RestrictedProduct(987654, "Henry's Hefeweizen", "alcohol", 9.99);
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
