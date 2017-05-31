/*
 * Class: CS 111B Object-Oriented Programming Methodologies in Java
 * Description: BusinessLoan class extends Loan. Represent business 
 * loan and sets interest rate.
 * FileName: Loan.java
*/
public class BusinessLoan extends Loan{
	//constructor
	public BusinessLoan(String lastName, String loanNumber, double amount, double interestRate, int term)
	{
		super(lastName, loanNumber, amount, term);//use super constructor
		super.interestRate =(.01 + interestRate) * 100;	//sets interest rate
	} 
}
