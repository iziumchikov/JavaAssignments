/*
 * Class: CS 111B Object-Oriented Programming Methodologies in Java
 * Description: PayrollReports uses payroll class to get the
 * info about employee.
 * FileName: PayrollReport.java
*/
import java.util.Scanner;
import java.io.*;

public class PayrollReport 
{
    public static void main (String[] args) throws IOException
    {
    	int number;
    	String empName;

    	Scanner input = new Scanner(System.in);
	
    	System.out.printf("Enter the employee ID number:");
    	number= input.nextInt();
	
    	System.out.print("Enter employee w" + number + " name: ");
    	empName = input.nextLine();
    	input.nextLine();
	
    	Payroll employee = new Payroll (empName, number);
    	employee.PayrollNoArg();

    	System.out.print(employee);
    	employee.printNetPay();
		
    	PrintWriter file = new PrintWriter("employee.txt");
    	file.println(employee);
    	file.close();
    }
}