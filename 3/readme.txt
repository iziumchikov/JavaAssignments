This assignment will give you practice with defining classes, interactive programs, if/else statements, methods that return values, and producing an external output file.
Part 1: Payroll Report (10 points)
Design a Payroll class that stores
? an employee’s ID number
? an employee’s name
? gross pay
? state tax
? federal tax
? FICA withholdings.
Include the following in your class:
? instance data variables
? two constructors
a. a constructor that accepts the employee’s name and ID number as arguments
b. a no-argument constructor
? appropriate accessor and mutator methods
? a toString method
? a method that calculates an employee’s net pay as follows:
net pay = gross pay - state tax - federal tax - FICA withholdings
Your program should be stored in a file called Payroll.java.
Part 2: Driver Program (10 points)
Write a program that demonstrates the class by creating a Payroll object, then asking the user to enter the data for an employee. The program should display the amount of gross pay earned.
Input Validation:
? Do not accept negative numbers for any of the items entered.
? Do not accept values for state, federal, or FICA withholdings that are greater than the gross pay.
? If the state tax + federal tax + FICA withholdings for any employee are greater than gross pay, print an error message, and ask the user to reenter the data for that employee.
Your program should be stored in a file called PayrollReport.java.
CS111B Assignment #4
Fall 2015 September 14, 2015
________________________________________________________________________________________________________
2
Here are sample runs of the program:
Sample Run 1:
Enter the employee ID number: w12302
Enter the employee Name: Tony Lewis
Enter employee w12302's gross pay: 4500
Enter employee w12302's state tax: 30.56
Enter employee w12302's federal tax: 100.25
Enter employee w12302's FICA: 30
gross pay: $4,500.00
state tax: $30.56
federal tax: $100.25
FICA: $30.00
net pay: $4,339.19
Sample Run 2:
Enter the employee ID number: w21313
Enter the employee Name: George Matthew
Enter employee w21313's gross pay: 5000
Enter employee w21313's state tax: 5500
Error - state tax cannot be greater than gross pay.
Re-enter state tax: 60.50
Enter employee w21313's federal tax: 5500
Error - federal tax cannot be greater than gross pay.
Re-enter federal tax: 30
Enter employee w21313's FICA: 5500
Error - FICA cannot be greater than gross pay.
Re-enter FICA: 25
gross pay: $5,000.00
state tax: $60.50
federal tax: $30.00
FICA: $25.00
net pay: $4,884.50
Extra Credit Payroll Report File (5 points)
Modify the program you wrote for Part 2 so it writes the report to a file instead of the screen. Name the file PayrollReport.txt. Then, open the file in Notepad or another text editor to confirm the output.
Your program should be stored in a file called PayrollReportFile.java.