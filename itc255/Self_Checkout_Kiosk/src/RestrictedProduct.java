
public class RestrictedProduct extends Product{
	private int ageLimit;
	
	RestrictedProduct(int barcode, String name, String type, double price) {
		super(barcode, name, type, price);
	}
	
	public int getAgeLimit() {
		return ageLimit;
	}
	
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	
	public boolean requestEmployeeApproval(Employee worker, Customer name) {
		return worker.approveRestricted(this, name);
	}
	
}
