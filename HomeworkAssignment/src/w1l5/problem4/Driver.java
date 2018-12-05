package w1l5.problem4;

public class Driver {
	
	public static void main(String[] args) {
		Employee[] employees = {new HourlyEmployee("Jhon", "Perez", "1111", 10, 20),
				new SalariedEmployee("Elena", "Cuenca", "2222", 1000),
				new BasePlusComissionEmployee("Carlos", "Castro", "333", 100, 2000, 100),
				new CommissionEmployee("Ann", "Javie", "444", 300, 700),
				new SalariedEmployee("Javier", "Cuenca", "6666", 7000),
		};
		double salary=0.0;
		for(Employee e: employees) {
			salary = salary+ e.getPayment();		
		}
		System.out.print("Total salaries of all the employees: "+salary);
	}
	/*
	 * OUTPUT
	 * 
	 * Total salaries of all the employees: 12300.0
	 */

}
