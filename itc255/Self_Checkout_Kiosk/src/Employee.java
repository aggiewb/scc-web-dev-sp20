
public class Employee extends Person{
	private long employeeId;
	private boolean restrictedItemAuth;
	
	Employee(String lastName, String firstName, String email){
		super(lastName, firstName, email);
	}
	
	public void setEmployeeId(long id) {
		this.employeeId = id;
	}
	
	public long getEmployeeId() {
		return this.employeeId;
	}
	
	public void setRestrictedItemAuth(boolean auth) {
		this.restrictedItemAuth = auth;
	}
	
	public boolean getRestrictedItemAuth() {
		return this.restrictedItemAuth;
	}
	
	public boolean approveRestricted(RestrictedProduct product, Customer name) {
		return name.getAge() >= product.getAgeLimit();
	}
	
	public void clearCustomerRequest(Customer name) {
		name.resetAssistance();
	}

}
