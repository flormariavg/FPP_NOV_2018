package prog3_2_startup;

class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	//updates the balance field 
	public void makeDeposit(double deposit) {
		// implement
		balance = balance+deposit;
	}
	
	//updates the balance field and returns true, unless
	//withdrawal amount is too large; in that case, 
	//it does not modify the balance field, and returns false
	public boolean makeWithdrawal(double amount) {
		// implement
		
		if(amount>balance)
			return false;
		else
			balance= balance-amount;
		return true;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}
	

}
