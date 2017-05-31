/*
 * Description:Payroll class stores info about employee.Checks user input.
 * Program makes calculations with info , and then print it.
 * FileName: Payroll.java
*/
import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Payroll 
{
	private String name;
	private int idNumber;
	private double grossPay,
				   stateTax, 
				   fedTax, 
				   fica, 
				   netPay;
	
	Scanner input = new Scanner(System.in);

	public Payroll(String empName, int num)
	{
		name = empName;
		idNumber = num;
	}
	
	/**
	 * No-argument constructor. Receives result from 
	 * methods.
	 */
	public void PayrollNoArg()
	{	
		grossPay = getGrossPay();
		stateTax = getStateTax();
		fedTax = getFedTax();
		fica = getFica();
		check();
	}
	
    /**
     * Returns a string with the information about the item.
     */
    public String toString()
    {	
    	return  "\tgross pay: " + grossPay +
    			"\n\tname: " + name +
    			"\n\tstate tax: " + stateTax +
    			"\n\tfederal tax: " + fedTax +
    			"\n\tFICA: " + fica;
    }
	
	/**
	 * Returns Gross pay and checks user input
	 * @return gross pay
	 */
    public double getGrossPay()
    {		
    		System.out.print("");
    		System.out.print("Enter employee w" + idNumber + " Gross pay: ");
    		grossPay = input.nextDouble();
    		
    		while(grossPay <= 0)
    		{
        		System.out.println("Error - gross pay cannot be "
        				+ "less or equals zero.");
    			System.out.print("Re-enter Gross Pay: ");
    			grossPay = input.nextDouble();
    		}
    		return grossPay;
    }
    /**
     * Returns State tax and checks user input
     * @return State tax
     */
    public double getStateTax()
    {
    	System.out.print("Enter employee w" + idNumber + " State Tax: ");
    	stateTax = input.nextDouble();
    	
    	while (stateTax <= 0 || stateTax >= grossPay)
    	{
    		System.out.println("Error - state tax cannot be "
    				+ "greater than gross pay.");
    		System.out.print("Re-enter State Tax: ");
    		stateTax = input.nextDouble();
    	}
    		
	    return stateTax;
    }
    
    /**
     * Returns Federal tax and checks user input
     * @return Federal tax
     */
    public double getFedTax()
    {
    	System.out.print("Enter employee w" + idNumber + " Federal Tax: ");
    	fedTax = input.nextDouble();
    	while (fedTax <= 0 || fedTax >= grossPay)
    	{
    		System.out.println("Error - federal taxcannot be greater "
    				+ "than gross pay.");
    		System.out.print("Re-enter Federal Tax: ");
    		fedTax = input.nextDouble();
    	}
	    return fedTax;
    }
    
    /**
     * Returns FICA and checks user input
     * @return FICA
     */
    public double getFica()
    {
    	System.out.print("Enter employee w" + idNumber + " FICA: ");
    	fica = input.nextDouble();
    	while (fica <= 0 || fica >= grossPay)
    	{
    		System.out.println("Error - FICA cannot be greater than gross pay.");
    		System.out.print("Re-enter FICA: ");
    		stateTax = input.nextDouble();
    	}
	    return fica;
    }
    
    /**
     * Checks if State tax plus federal tax plus
     * FICA is greater or equals to Gross pay
     * print error.
     */
    public void check()
    {
    	if (stateTax + fedTax + fica >= grossPay)
    		System.out.print("Error - State Tax + Federal Tax + FICA\n "
    				+ " cannot be greather then Gross Pay");
    }
    /**
     * Returns Net pay
     * @return Net pay
     */
    public double getNetPay()
    {
    	netPay = grossPay - stateTax - fedTax - fica;
	    return netPay;
    }
    /**
     * This statement prints net pay,using 
     * printf.
     */
    public void printNetPay()
    {
    	System.out.printf("\n\tnet pay $: %,8.2f\n", netPay);
    }
    /**
     * Returns name.
     * @return name
     */
    public String getName()
    {
	   return name;
    }

}
