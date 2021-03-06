
public class Product {
	private int barcode;
	private String type;
	private String name;
	private int amountAvailable;
	private double price;
	private double weight;
	private boolean restriction = false;
	
	Product(int barcode, String name, String type, double price){
		this.barcode = barcode;
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public int getProductBarcode() {
		return this.barcode;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setAmountAvailable(int amount) {
		this.amountAvailable = amount;
	}
	
	public int getAmountAvailable() {
		return this.amountAvailable;
	}

	public double getPrice() {
		return price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return this.name + " " + this.type + " Weight: " + this.weight + " Price: $" + this.price + " ";
	}

	public boolean isRestriction() {
		return restriction;
	}
	
	public boolean setRestriction(boolean restriction) {
		return this.restriction = restriction;
	}

}
