/*
 * Description: This program asks user to input 3 statements such as annual interest rate,
 * the number of years and loan amount. After this input, program calculates monthly payment amount
 * using formula,which was preceded in task paper and count total amount of payments.
 * Lab# 2
*/
import javax.swing.JOptionPane;
import java.lang.Math;

public class ComputeLoanUsingInputDialog 
{
		public static void   main(String[] args) 
		{ 
			String interest, loan, years;		// String variables to hold user input
			int numYears;
    		double interestRate,loanAmount, 			   
    			monthlyInterestRate,monthlyPayment, 			
		        totalPayment;			
		   				
    		
    		// Enter yearly interest rate
			interest = JOptionPane.showInputDialog("Enter yearly interest rate, e.g., 5.75%: "); 
			interestRate = Double.parseDouble(interest); 
			
    		//Obtain monthly interest rate
			monthlyInterestRate = interestRate / 1200;

    		//Enter number of years
			years = JOptionPane.showInputDialog("Enter number of years as an integer, for example 5:");
			numYears = Integer.parseInt(years);

    		//Enter loan amount
			loan = JOptionPane.showInputDialog("Enter loan amount, for example 120000.95:");  
			loanAmount = Double.parseDouble(loan);

    		//Using Math.pow method to raise first argument "1 + monthlyInterestRate" raised to the power of the second argument
			//"numYears * 12". Variable "x" will hold on the result of Math.pow method.
			double x = Math.pow(1 + monthlyInterestRate, numYears * 12);
			
    		//Calculate monthly and total payments, using formula, which was simplified by Math.pow method
			monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / x); 
			totalPayment = monthlyPayment * numYears * 12; 

    		//Using this formula to show only two numbers after comma
			monthlyPayment = (int)(monthlyPayment * 100) / 100.0;  
			totalPayment = (int)(totalPayment * 100) / 100.0;

			//Display results
			JOptionPane.showMessageDialog(null, "The monthly payment is $" + monthlyPayment); 
			JOptionPane.showMessageDialog(null, "The total payment is $" + totalPayment);
			
			JOptionPane.showMessageDialog(null, "Programmed by Ilya Dubinin");
			System.exit(0);
		}
	} 


