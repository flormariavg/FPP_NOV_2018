package w1l5.problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Professor p1 = new Professor("Professor 1", LocalDate.of(2000, 10, 30), 5000, 4);
		Professor p2 = new Professor("Professor 2", LocalDate.of(2005, 10, 30), 3000, 2);
		Professor p3 = new Professor("Professor 3", LocalDate.of(2010, 10, 30), 6000, 10);
		
		Secretary s1 = new Secretary("Secretary 1", LocalDate.of(2002, 2, 15), 2005, 5);
		Secretary s2 = new Secretary("Secretary 2", LocalDate.of(2010, 2, 15), 2000, 8);
		
		DeptEmployee[] department = new DeptEmployee[] {p1,p2,p3,s1,s2};
		
		double salaryProfessor=0.0;
		double salarySecretary=0.0;
		double salary=0.0;
		
		
		String s="y";
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to see the sum of all Professor salary, sum of all secretary salary and all salaries in the department (y/n) :");
		s=sc.nextLine().toString().toLowerCase();
		
		if(s.equals("y")) {
			
			for(DeptEmployee de: department) {
				salary= salary+de.computeSalary();
				if(de instanceof Professor) 
					salaryProfessor= salaryProfessor+de.computeSalary();
				if(de instanceof Secretary) 
					salarySecretary= salarySecretary+de.computeSalary();
				
			}
			System.out.println("Salary Professor: "+ salaryProfessor);
			System.out.println("Salary Secretary: "+ salarySecretary);
			System.out.println("Salary: "+ salary);
		}
		sc.close();
	}
	/*
	 * OUPUT:
	 * 
	 * Do you want to see the sum of all Professor salary, sum of all secretary salary and all salaries in the department (y/n) :y
		Salary Professor: 14000.0
		Salary Secretary: 4005.0
		Salary: 18005.0

	 */

}
