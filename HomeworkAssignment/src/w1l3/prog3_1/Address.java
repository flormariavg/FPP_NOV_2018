package w1l3.prog3_1;

public class Address {
	private String  street, city, state, zip;
	
	public Address(String street, String city, String state, String zip){
		
		this.street= street;
		this.city= city;
		this.state= state;
		this.zip= zip;
		
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

}
