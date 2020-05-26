
public class Customer extends Person {
	private int totalRewardPoints;
	public boolean assistance = false;
	public int age;
	
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
	
	public void resetAssistance() {
		this.assistance = false;
	}
	
	public double payTotalDue(Sale order, double payment) {
		double total = order.getTotal();
		return total - payment;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
