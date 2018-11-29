package w1l3;

public class Customer {
	
	private String firstName, lastName, socSecurityNum;
	private Address billingAddress,shippingAddress;
	public Customer(String firstName, String lastName,String socSecurityNum) {
		
		this.firstName=firstName;
		this.lastName= lastName;
		this.socSecurityNum= socSecurityNum;
		
	}
	
	public static void main(String[] args) {

		Customer c1 = new Customer("Jhon","Perez","123");
		c1.setBillingAddress(new Address("Street 1 billingAddress", "Mexico", "State 1", "1111"));
		c1.setShippingAddress(new Address("Street 1 shippingAddress", "Las Vegas", "State 1", "1111"));
		
		Customer c2 = new Customer("Ann","Cuenca","123");
		c2.setBillingAddress(new Address("Street 2 shippingAddress", "San Francisco", "State 2", "2222"));
		c2.setShippingAddress(new Address("Street 2 shippingAddress", "San Francisco", "State 2", "2222"));
		
		Customer c3 = new Customer("Carlos","Alvarez","123");		
		c3.setBillingAddress(new Address("Street 1 billingAddress", "Chicago", "State 1", "1111"));
		c3.setShippingAddress(new Address("Street 1 billingAddress", "Los Angeles", "State 1", "1111"));
		
		
		Customer [] customers = new Customer[3];
		customers[0]=c1;
		customers[1]=c2;
		customers[2]=c3;
		
		for(Customer c: customers)
			if(c.billingAddress.city.toString().equals("Chicago"))
				System.out.println(c);
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
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
	public String getSocSecurityNum() {
		return socSecurityNum;
	}
	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}
	
	public String toString() {
		return  "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
	}

}
