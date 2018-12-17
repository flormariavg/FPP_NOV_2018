package w3l12.problem2;

/**
 * 
 * @author flormaria
 *
 */
public class CustomerAccount {
	String cus_name;
	int acc_No;
	double balance;
	
	public void deposit(double amount) {
		balance= amount+balance;
		
	}
	public void withdraw(double amount) throws Exception {
		if(amount>balance) {
			throw new Exception("Withdraw amount exceed the balance");
		}else {
			balance= balance-amount;
			if(balance<100)
				throw new Exception("Balance reach below 100$");
		}
		
		
	}
	
	public static void main(String[] args) {
		try {
		CustomerAccount ca = new CustomerAccount();
		ca.deposit(200);
		//ca.withdraw(110);
		ca.withdraw(500);
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	/*
	 * OUTPUT
	 * 
	 * Balance reach below 100$
	 * 
	 * Withdraw amount exceed the balance

	 */
}
