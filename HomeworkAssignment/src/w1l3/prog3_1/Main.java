package w1l3.prog3_1;

public class Main {

	public static void main(String[] args) {

		Customer c1 = new Customer("Jhon","Perez","123");
		c1.setBillingAddress(new Address("Street 1 billingAddress", "Mexico", "State 1", "1111"));
		c1.setShippingAddress(new Address("Street 1 shippingAddress", "Las Vegas", "State 1", "1111"));
		
		Customer c2 = new Customer("Ann","Cuenca","123");
		c2.setBillingAddress(new Address("Street 2 shippingAddress", "Chicago", "State 2", "2222"));
		c2.setShippingAddress(new Address("Street 2 shippingAddress", "San Francisco", "State 2", "2222"));
		
		Customer c3 = new Customer("Carlos","Alvarez","123");		
		c3.setBillingAddress(new Address("Street 1 billingAddress", "Chicago", "State 1", "1111"));
		c3.setShippingAddress(new Address("Street 1 billingAddress", "Los Angeles", "State 1", "1111"));
		
		
		Customer [] customers = new Customer[3];
		customers[0]=c1;
		customers[1]=c2;
		customers[2]=c3;
		
		System.out.println("Customers whose billing Address is in Chicago : ");
		for(Customer c: customers)
			if(c.getBillingAddress().getCity().toString().equals("Chicago"))
				System.out.println(c);
		
		/*
		 * Customers whose billing Address is in Chicago : 
		 * [Ann, Cuenca, ssn: 123]
		 * [Carlos, Alvarez, ssn: 123]
		 *  
		 */
	}
	
}
