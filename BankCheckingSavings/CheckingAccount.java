/*
 * Description: CheckingAccount extends BankAccount class.
 * CheckingAccount concatenate accountNumber with "-10" and
 * overrides the withdraw method in the superclass.
 * Lab# 8
*/

public class CheckingAccount extends BankAccount {
	
	//Constant declared for checking account fee.
	private static final double FEE = 0.15;
	
	//Default constructor
	public CheckingAccount() 
	{
		super();
	}
	
	//Constructor: takes a name and initial 
	//amount.
	public CheckingAccount(String name, double balance) 
	{
		//calling constructor of the super class
		super(name, balance); 
		//concatenate accountNumber with "-10"
		super.setAccountNumber(getAccountNumber() + "-10");
	}
	

	//Method withdraw overrides the withdraw
	//method in the superclass. If enough money
	//in the account,adds fee to the amount and 
	//returns true if the transaction was 
	//completed, returns false if there was not 
	//enough money.

	public boolean withdraw(double amount) 
	{
		//checking amount and balance
		if(amount <= super.getBalance())
		{
			super.withdraw(amount + FEE);
			return true;
		}
	    else
	    {
	    	return false;
	    }
	}	
}
