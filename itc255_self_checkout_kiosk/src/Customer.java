import java.math.BigDecimal;
import java.math.RoundingMode;

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
	
	public BigDecimal payTotalDue(BigDecimal total, double customerPayment) {
		BigDecimal payment = new BigDecimal(customerPayment);
		return total.subtract(payment).setScale(2, RoundingMode.HALF_EVEN);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Name: " + super.getLastName() + ", " + super.getFirstName() + " Email: " + super.getEmail() + " Phone Number: " + super.getPhoneNumber() +
				" Reward points: " + this.getTotalRewardPoints();
	}
	
}
