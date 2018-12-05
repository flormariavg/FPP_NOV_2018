package w1l5.problem4;

public class BasePlusComissionEmployee extends CommissionEmployee{

	double baseSalary=0.0;

	public BasePlusComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double comissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary = baseSalary + (super.getGrossSales()*super.getComissionRate());
	}
	
	public String toString() {
		return "CommissionEmployee: \n"+"\nFirstName:"+super.getFirstName()+"Last Name: "+super.getLastName()+ 
				"Social Security Number: "+super.getSocialSecurityNumber()+"\nBaseSalary: "+baseSalary;
	}
}
