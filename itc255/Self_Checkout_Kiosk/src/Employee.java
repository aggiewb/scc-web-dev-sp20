
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
		//Give authorization only if an employee's auth is set to true and 
		//if the customer's age is equal to or above the ageLimit set on a product
		if(this.restrictedItemAuth) {
			return name.getAge() >= product.getAgeLimit();
		} else {
			return false;
		}
	}
	
	public void clearCustomerRequest(Customer name) {
		name.resetAssistance();
	}
	
	public void removeSaleProduct(Sale order, Product item) {
		order.removeItem(order.getProducts().lastIndexOf(item));	
	}
	
	public void removeOrder(Sale order) {
		order.removeAllItems();
	}

}
