package w3l11.problem1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName,lastName);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Key key= (Key)obj;
		return this.firstName.equals(key.firstName) && this.lastName.equals(key.lastName);
	}
}
