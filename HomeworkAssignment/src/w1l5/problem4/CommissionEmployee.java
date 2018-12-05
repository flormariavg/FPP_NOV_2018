package w1l5.problem4;

public class CommissionEmployee extends Employee{

	private double grossSales;
	private double comissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double comissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
	}


	public double getPayment() {
		return grossSales * getComissionRate();
	}
	
	public String toString() {
		
		return "CommissionEmployee: \n"+"\nFirstName:"+super.getFirstName()+"Last Name: "+super.getLastName()+ 
				"Social Security Number: "+super.getSocialSecurityNumber()+"\nGross Sales: "+grossSales+"Comission Rate: "+comissionRate;
	}


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}


	public double getComissionRate() {
		return comissionRate/100;
	}


	public void setComissionRate(double comissionRate) {
		this.comissionRate = comissionRate;
	}
	
	
}
