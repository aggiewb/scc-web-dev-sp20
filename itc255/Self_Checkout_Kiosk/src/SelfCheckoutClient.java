
public class SelfCheckoutClient {

	public static void main(String[] args) {
		newCustomer();
		System.out.println();
		newEmployee();
		
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
	
	public static void newEmployee() {
		Employee fakeEmployee = new Employee("Smith", "Barbera", "very_simple@example.com");
		fakeEmployee.setAddress("231, Your Street", "Kingston", "New York", 12401);
		fakeEmployee.setPhoneNumber("425-555-0202");
		fakeEmployee.setEmployeeId(123456789);
		fakeEmployee.setRestrictedItemAuth(true);
		System.out.println(fakeEmployee);
		System.out.println("Employee ID: " + fakeEmployee.getEmployeeId() + " Address: " + fakeEmployee.getAddress() + " Restricted Product Authorization: " + 
		fakeEmployee.getRestrictedItemAuth());
	}

}
