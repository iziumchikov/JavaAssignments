/*
 * Description:A account class with methods to deposit to, 
 * withdraw from,change the name on, charge a fee to, and return a 
 * string representation of the account.
 * Lab# 4
*/
public class Account
{
	private double balance;
	private String name;
	private long acctNum;
	private int numberTransactions = 0;
	
/**
 * Constructor -- initializes balance, owner, and account number
 * @param initBal receives a balance of account
 * @param owner	receives name of account owner
 * @param number receives account number
*/
  public Account(double initBal, String owner, long number)
  {
	  balance = initBal;
	  name = owner;
	  acctNum = number;
  }

/**
 * Checks to see if balance is sufficient for 
 * withdrawal. If so, decrements balance by amount; 
 * if not, prints message.
 * @param amount receives amount of withdraw number
 * @return balance
*/
  public double withdraw(double amount)
  {		
	  if(amount <= balance)
	  {
		  balance -= amount;
		  numberTransactions++;
	  } 			
	  else
	  {
		  System.out.println("Not enough money in " + getName() + " account.");
	  }	
	  return balance;
   }

/**
 * Adds deposit amount to balance. If amount is
 * negative number or 0, program will print a 
 * message.
 * @param amount receives amount of deposited number
 * @return balance
*/
  public double deposit(double amount)
  {
	  if (amount >= 0)
	  {
		  balance += amount;
		  numberTransactions++;
	  }
	  else
	  {
		  System.out.println("You have added a negative number or zero");
	  }
	  return balance;
  }

  public double getBalance()
  {
    return balance;
  }

/**
 * Convert into string account number, balance
 * and number of transaction.
 * @return Returns a string containing all info 
 * about account owner in order like in example.
*/
  public String toString()
  {
	  String number = Long.toString(acctNum); 
	  String balanc = Double.toString(balance);
	  String trans = Integer.toString(numberTransactions);
	  return ("Name: " + name + "\nAccount Number: " + number + "\nBalance: " 
			  + balanc + "\nNumber of transactions: " + trans);
  }


/**
 * Charges $10 service fee for transactions. 
 * @return new balance after charging fee.
*/
   public double chargeFee()
   {
	   double newBalance;
	   balance -= 10;
	   newBalance = balance;
	   return newBalance;
   }

/**
 * This method change account owner name if it's necessary
 * @param newName receives a new name
*/
  
  public void changeName(String newName)
  {    
	  name = newName; 
  }
  
  public int getTransactions()
  {
    return numberTransactions;
  }

  public String getName()
  {
	 return name;
  }
}
