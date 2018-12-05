package w1l5.problem4;

public class HourlyEmployee extends Employee{
	
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}


	public double getPayment() {
		
		return wage * hours;
	}

	public String toString() {
		return "CommissionEmployee: \n"+"\nFirstName:"+super.getFirstName()+"Last Name: "+super.getLastName()+ 
				"Social Security Number: "+super.getSocialSecurityNumber()+"\nWage: "+wage+"Hours: "+hours;
	}


	public double getWage() {
		return wage;
	}


	public double getHours() {
		return hours;
	}


	public void setWage(double wage) {
		this.wage = wage;
	}


	public void setHours(double hours) {
		this.hours = hours;
	}
	
	
}
