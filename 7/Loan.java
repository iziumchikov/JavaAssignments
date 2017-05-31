/*
 * Description: Abstract class Loan implements interface LoanConstants.
 * Represent basic Loan methods
 * FileName: Loan.java
*/

public abstract class Loan implements LoanConstants
{
	protected String loanNumber;
	protected String lastName;
	protected double amount;
	protected double interestRate;
	protected int term;
	
	//Default constructor
	public Loan()
	{
		loanNumber = "";
		lastName = "";
		amount = 0;
		interestRate = 0;
		term = 0;
	}

	//Constructor: sets main info about loan
	public Loan(String lastName, String loanNumber,	
				double amount, int term)
	{
		this.lastName = lastName;
		this.loanNumber = loanNumber;
		this.amount = amount;
		this.term = term;

	}

	//Represents toString method
	public String toString()
	{
		return "Loan #" + loanNumber + " Name:" 
				+ lastName + " $" + amount + "\n" +
				"for " + term + "year(s) at " 
				+ (int)interestRate + "% interest"  ;
	}
	

	public void setloanNumber(String str){
		loanNumber = str;
	}
	
	public String getloanNumber(){
		return loanNumber;
	}
	public void setLastName(String name){
		lastName = name;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLoanAmount(double amount){
		this.amount = amount;
	}
	
	public double getLoanAmount(){
		return amount;
	}
	
	public void setInterestRate(double rate){
		this.interestRate= rate;
	}
	
	public double getInterestRate(){
		return interestRate;
	}
	
	public void setTerm(int num){
		term = num;
	}
	
	public int getTerm(){
		return term;
	}
}

