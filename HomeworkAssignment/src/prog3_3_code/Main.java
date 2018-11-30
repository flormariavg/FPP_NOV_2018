package prog3_3_code;
import java.util.Scanner;

import prog3_3_code.employeeinfo.Employee;

public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
				
		Scanner sc = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			String info = getFormattedAccountInfo();
			System.out.println(info);
		}
		else {
			//do nothing..the application ends here
		}	
		
		/*
		 * See a report of all account balances? (y/n) y
		 * ACCOUNT INFO FOR Jim Daley:
		
		 * Account type: CHECKING
		 * Current bal: 10500.0
		 * Account type: SAVINGS
		 * Current bal: 1000.0
		 * Account type: RETIREMENT
		 * Current bal: 9300.0
		
		 ACCOUNT INFO FOR Bob Reuben:
		
		 * Account type: CHECKING
		 * Current bal: 34000.0
		 * Account type: SAVINGS
		 * Current bal: 27000.0
		
		
		ACCOUNT INFO FOR Susan Randolph:
		
		 * Account type: CHECKING
		 * Current bal: 10038.0
		 * Account type: SAVINGS
		 * Current bal: 12600.0
		 * Account type: RETIREMENT
		 * Current bal: 9000.0

		 */
	}
	String getFormattedAccountInfo(){
		//loop through employees array and get formatted
		//account info for each employee, and assemble into a string
		StringBuilder sb =  new StringBuilder();
		for(Employee e: emps) {
			sb.append(e.getFormattedAcctInfo());
		}
		return sb.toString();
	}
}
