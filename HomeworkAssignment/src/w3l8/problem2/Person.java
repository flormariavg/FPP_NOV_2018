package w3l8.problem2;

public class Person{

	private String lastName;
	private String firstName;
	private int age;

	// --------------------------------------------------------------
	public Person(String last, String first, int a) { // constructor
		this.lastName = last;
		this.firstName = first;
		this.age = a;
	}

	// --------------------------------------------------------------
	public String getLast() // get last name
	{
		return lastName;
	}

	@Override
	public String toString() {
		return "Person [LastName=" + lastName + " FirstName=" + firstName + " Age=" + age + "]";
	}
	

}
