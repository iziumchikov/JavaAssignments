/*
 * Description:Savings account extends Bank Account class.
 * Creates several accounts for same person using different
 * parameters.Initializes account number to be the current value
 * in the superclass accountNumber concatenate with a hyphen and 
 * then the savingsNumber.
 * Lab# 8
*/
public class SavingsAccount extends BankAccount
{
	
	//to hold annual interest rate
	private double rate = 0.025;
	//to hold number of savings accounts per one owner
	private int savingsNumber = 0;
	//to hold account number variable,hide 
	//the accountNumber from the superclass
	private String accountNumber;
	
	// Default constructor
	public SavingsAccount()
	{
		super();
	}
	
	//Constructor takes a name and an initial 
	//balance as parameters and calls the constructor.
	//Concatenates accountNumber with hyphen and then
	//the savingsNumber.
	public SavingsAccount(String name, double amount) 
	{	//call superclass constructor
		super(name, amount);
		accountNumber = super.getAccountNumber()  + 
				"-" + savingsNumber;
	}

	//Constructor for a savings account with original
	//savings account as a parameter and same 
	//initial amount.Concatenates accountNumber with 
	//hyphen and then the savingsNumber to be one 
	//more than the savingsNumber of the original
	//savings account.


	public SavingsAccount(SavingsAccount account, double amount) 
	{
		super(account, amount);
		accountNumber = super.getAccountNumber()  + 
				"-" + (savingsNumber + 1);
	}

	// Calculates one month's worth of interest
	//on the balance and deposit it into the account
	public void postInterest() 
	{
		super.setBalance((this.getBalance() * (rate / 12)) 
				+ this.getBalance());
	}
	
	public String getAccountNumber()
	{
	      return accountNumber;
	}
	
	public double getRate()
	{
		return rate;
	}
	
	public void setRate(double rate)
	{
		this.rate = rate;
	}
	
	public int getSavingsNumber()
	{
		return savingsNumber;
	}
	
	public void setSavingsNumber(int num)
	{
		this.savingsNumber = num;
	}
	
	   
}