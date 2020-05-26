
public class SelfCheckoutClient {

	public static void main(String[] args) {
		newCustomer();
	}
	
	public static void newCustomer() {
		Customer bobSmith = new Customer("Smith", "Bob", "simple@example.com");
		bobSmith.setAddress("132, My Street", "Kingston", "New York", 12401);
		System.out.println(bobSmith.toString());
		System.out.println(bobSmith.getAddress());
	}

}
