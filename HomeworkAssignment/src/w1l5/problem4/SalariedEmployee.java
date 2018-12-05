package w1l5.problem4;

public class SalariedEmployee extends Employee{

	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	public double getPayment() {
		return weeklySalary;
	}
	public String toString () {
		return "CommissionEmployee: \n"+"\nFirstName:"+super.getFirstName()+"Last Name: "+super.getLastName()+ 
				"Social Security Number: "+super.getSocialSecurityNumber()+"\nEeeklySalary: "+weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
}
