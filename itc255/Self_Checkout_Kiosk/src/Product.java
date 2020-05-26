
public class Product {
	private int barcode;
	private String type;
	private String name;
	private int amountAvailable;
	private double price;
	
	Product(int barcode, String name, String type, double price){
		this.barcode = barcode;
		this.name = name;
		this.type = type;
	}

	public int getProductBarcode(String productName) {
		return this.barcode;
	}
	
	public String getProduct() {
		return this.name + " " + this.type;
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

}
