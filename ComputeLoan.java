/*
 * Description: This program asks user to input 3 statements such as annual interest rate,
 * the number of years and loan amount. After this input, program calculates monthly payment amount
 * using formula,which was preceded in task paper and count total amount of payments.
 * Lab# 2
*/

import java.util.Scanner;

public class ComputeLoan 
{
    public static void main(String[] args) 
    {
		int numYears;
    	double interestRate, loanAmount, 			
    		   monthlyInterestRate, monthlyPayment, 		
    		   totalPayment;					
    	
    	Scanner input = new Scanner(System.in);
    	// Enter yearly interest rate
    	System.out.print("Enter yearly interest rate, e.g., 5,75%: ");	
    	interestRate = input.nextDouble();
    		
    	//Obtain monthly interest rate
    	monthlyInterestRate = interestRate / 1200;	
    		
    	//Enter number of years
        System.out.print( "Enter number of years as an integer, e.g., 5: ");	
        numYears = input.nextInt();
    		
    	//Enter loan amount
    	System.out.print("Enter loan amount, for example 120000.95: ");		
    	loanAmount = input.nextDouble();
        
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
    	System.out.println("The monthly payment is $ " +  monthlyPayment);
    	System.out.println("The total payment is $ " +  totalPayment);
     	System.out.println("Programmed by Ilya Dubinin");
     	input.close();
   }
 }
