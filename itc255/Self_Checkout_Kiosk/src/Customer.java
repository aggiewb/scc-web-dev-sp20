
public class Customer extends Person {
	private int totalRewardPoints;
	public boolean assistance = false;
	
	Customer(String lastName, String firstName, String email){
		super(lastName, firstName, email);
	}
	
	public void setTotalRewardPoints(int points) {
		this.totalRewardPoints = points;
	}
	
	public int getTotalRewardPoints() {
		return this.totalRewardPoints;
	}
	
	public void requestAssistance() {	
		this.assistance = true;
	}
	
	public int searchProductDirectory(String productName) {
		return Product.getProductBarcode(productName);
	}
	
}
