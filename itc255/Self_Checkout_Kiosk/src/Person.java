
import java.util.Date;

public abstract class Person {
	private String lastName;
	private String firstName;
	private int phoneNumber;
	private String email;
	private String streetAddress;
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
	
	public void setAddress(String streetAddress, String state, int zip) {
		this.streetAddress = streetAddress;
		this.state = state;
		this.zip = zip;
	}
	
	public String getAddress() {
		return this.streetAddress + " " + this.state + " " + this.zip;
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
	
}
