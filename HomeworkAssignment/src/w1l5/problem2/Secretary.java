package w1l5.problem2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
	
	private double overtimeHours;

	public Secretary(String name, LocalDate hireDate, double salary, double overtimeHours) {
		// TODO Auto-generated constructor stub
		super(name, hireDate, salary);
	}
	
	public double computeSalary() {
		
		return super.computeSalary()+(12*overtimeHours);
	}
	
	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

}
