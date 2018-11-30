package prog3_3_code.employeeinfo;

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
		hireDate = LocalDate.of(yearOfHire,monthOfHire,dayOfHire);
	}

	
	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct= new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {
		// implement
		StringBuilder sb = new StringBuilder();
		sb.append("\n\nACCOUNT INFO FOR "+this.name+":\n\n");
		if(checkingAcct!=null)
			sb.append(checkingAcct+"\n");
		if(savingsAcct!=null)
			sb.append(savingsAcct+"\n");
		if(retirementAcct!=null)
			sb.append(retirementAcct);
		return  sb.toString();
	}
	public void deposit(AccountType acctType, double amt){
		// implement
		
		switch(acctType) {
		
		case CHECKING: checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS: savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT: retirementAcct.makeDeposit(amt);
			break;
		
		}
		
	}
	public boolean withdraw(AccountType acctType, double amt){
		// implement
		
		switch(acctType) {
			case CHECKING: return checkingAcct.makeWithdrawal(amt);
			case SAVINGS: return checkingAcct.makeWithdrawal(amt);
			case RETIREMENT: return checkingAcct.makeWithdrawal(amt);
			default : return false;
		}
	
	}


	public String getName() {
		return name;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}

}
