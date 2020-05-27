
public class SelfCheckoutClient {

	public static void main(String[] args) {
		newCustomer();
		System.out.println();
		
	}
	
	public static void newCustomer() {
		Customer fakeCustomer = new Customer("Smith", "Bob", "simple@example.com");
		fakeCustomer.setAddress("132, My Street", "Kingston", "New York", 12401);
		fakeCustomer.setPhoneNumber("425-555-2323");
		fakeCustomer.setAge(36);
		fakeCustomer.setTotalRewardPoints(100);
		System.out.println(fakeCustomer);
		System.out.println("Age: " + fakeCustomer.getAge() + " Address: " + fakeCustomer.getAddress());
	}

}
