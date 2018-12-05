package w1l5.problem4;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String SocialSecurityNumber;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SocialSecurityNumber = socialSecurityNumber;
	}

	public abstract double getPayment();

	public String getSocialSecurityNumber() {
		return SocialSecurityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		SocialSecurityNumber = socialSecurityNumber;
	}

}
