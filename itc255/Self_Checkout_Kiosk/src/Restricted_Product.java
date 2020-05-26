
public class Restricted_Product extends Product{
	private boolean restriction;
	private int ageLimit;
	private int quantityLimit;
	
	Restricted_Product(int barcode, String name, String type, double price) {
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

	public int getQuantityLimit() {
		return quantityLimit;
	}

	public void setQuantityLimit(int quantityLimit) {
		this.quantityLimit = quantityLimit;
	}
	
	public double getPrice() {
		return this.getPrice();
	}
	
}
