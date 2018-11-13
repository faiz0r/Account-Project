package banking;

public class Person {

	private int accountNumber;
	private String firstname;
	private String lastName;

	public Person(int accountNumber, String firstname, String lastName) {
		setFirstname(firstname);
		setLastName(lastName);
		setAccountNumber(accountNumber);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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
