
public class RestrictedProduct extends Product{
	private boolean restriction;
	private int ageLimit;
	
	RestrictedProduct(int barcode, String name, String type, double price) {
		super(barcode, name, type, price);
	}
	
	public boolean getRestriction() {
		return restriction;
	}
	
	public void setRestriction(boolean restriction) {
		this.restriction = restriction;
	}
	
	public int getAgeLimit() {
		return ageLimit;
	}
	
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	
	public double getPrice() {
		return this.getPrice();
	}
	
	public boolean requestEmployeeApproval(Employee worker, Customer name) {
		return worker.approveRestricted(this, name);
	}
	
}
