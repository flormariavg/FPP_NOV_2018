package prog3_2_startup;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Jhon Alvarez", "Jhon", 3000, 70000, 7000, 300);
		
		//Then it creates a checking account, 
		//savings account and retirement account for employee,
		//each with a starting balance of $300. 
		
		Account checkingAccount = new Account(e1, AccountType.CHECKING,300);
		Account savingsAccount = new Account(e1, AccountType.SAVINGS,300);
		Account retirementAccount = new Account(e1, AccountType.RETIREMENT,300);
		
		checkingAccount.makeDeposit(500);
		checkingAccount.makeWithdrawal(50);
		
		savingsAccount.makeDeposit(200);
		savingsAccount.makeWithdrawal(100);
		
		retirementAccount.makeDeposit(50);
		retirementAccount.makeWithdrawal(150);
		
		System.out.println("Accounts for "+ e1.getName()+" : ");
		
		System.out.println(checkingAccount);
		System.out.println(savingsAccount);
		System.out.println(retirementAccount);
		
		/*
		 * Accounts for Jhon Alvarez : 
		 * type = CHECKING, balance = 750.0
		 * type = SAVINGS, balance = 400.0
		 * type = RETIREMENT, balance = 200.0
		 */
	}
	
}
