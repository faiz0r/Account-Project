package banking;

public class person {
	
	private String firstname;
	private String lastName;
	
	public person(String firstname, String lastName) {
		setFirstname(firstname);
		setLastName(lastName);
		
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}