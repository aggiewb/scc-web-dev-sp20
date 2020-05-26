
import java.util.Date;

public abstract class Person {
	private String lastName;
	private String firstName;
	private int phoneNumber;
	private String email;
	private String streetAddress;
	private String city;
	private String state;
	private int zip;
	private Date dateAdded;
	
	Person(String lastName, String firstName, String email){
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		Date personDate = new Date();
		this.dateAdded = personDate;
	}
	
	public Date getDateAdded() {
		return this.dateAdded;
	}
	
	public void setAddress(String streetAddress, String city, String state, int zip) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public String getAddress() {
		return this.streetAddress + ", " + this.city + ", " + this.state + " " + this.zip + " ";
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	

	public String toString() {
		return "Name: " + this.getLastName() + ", " + this.getFirstName() + " Email: " + this.getEmail() + " Phone Number: " + this.getPhoneNumber();
	}
	
}
