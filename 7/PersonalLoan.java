/*
 * Description: Class PersonalLoan extends Loan class.Represents personal loan
 * and sets interest rate.
 * FileName: PersonalLoan.java
*/
public class PersonalLoan extends Loan
{
	public PersonalLoan(String lastName, String loanNumber, double amount, double interestRate, int term)
	{
		super(lastName, loanNumber, amount, term); //use super constructor
		super.interestRate = (.02 + interestRate) * 100;	//sets interest rate
	} 

}