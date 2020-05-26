
public class Employee extends Person{
	private int employeeId;
	private boolean restrictedItemAuth;
	
	Employee(String lastName, String firstName, String email){
		super(lastName, firstName, email);
	}
	
	public void setEmployeeId(int id) {
		this.employeeId = id;
	}
	
	public int getEmployeeId() {
		return this.employeeId;
	}
	
	public void setRestrictedItemAuth(boolean auth) {
		this.restrictedItemAuth = auth;
	}
	
	public boolean getRestrictedItemAuth() {
		return this.restrictedItemAuth;
	}
	

}
