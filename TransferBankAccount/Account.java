/*
 * Description: A bank account class with methods to deposit, withdraw, 
 * get and check balance, get and check account number, and return 
 * String representation. 
 * Lab6
*/

public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    private static int numAccounts; 	//to hold number of account
    private static double consolidate;	//to hold consolidated value
    private double amount;				//to hold user transfer amount

    //Constructor -- initializes balance and owner; 
    //generates random account number
    public Account(double initBal, String owner)
    {
    	balance = initBal;
    	name = owner;
    	acctNum = (int) (Math.random() * Integer.MAX_VALUE);
    	numAccounts++;	//increment number of account each time when it created
    }

    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    public void withdraw(double amount)
    {
    	if (balance >= amount)
    	{
    		balance -= amount;
    	}
    	else
    	{
    		System.out.println("Insufficient funds");
    	}  
    }

  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  // Also deducts fee from account.
    public void withdraw(double amount, double fee)
    {
    	if (balance >= amount)
    	{
    		balance -= amount;
    		balance -= fee;
    	}
    	else
    	{
    		System.out.println("Insufficient funds");
    	}
    }
    
    // Adds deposit amount to balance.
    public void deposit(double amount)
  	{
	  balance += amount;
  	}
  
  	public double getBalance()
  	{
	  return balance;
  	}

  	public double getAcctNumber()
  	{
	  return acctNum;
  	}

  	public void setAcctNumber(double num)
  	{
	  	acctNum = (long) num;
  	}

    public String toString()
    {
    	return "Result account is Name: " + name + 
	    "\nAcct #: " + acctNum + 
	    "\nBalance: " + balance;
    }  

    public static int getNumAccounts()
    {
    	return numAccounts;
    }

    public static void setNumAccounts(int num)
    {
    	numAccounts = num;
    }

    public double getAmount()
    {
    	return amount;
    }
 
    public void setAmount(double num)
    {
    	amount=num;
    }

    public double getConsolidate()
    {
    	return consolidate;
    }

    public void setConsolidate(double num)
    {
    	consolidate = num;
    }
    
    // This method closes current account and setting 
    // the balance to 0. Also decreases number of 
    // accounts.
    void close()
    {
    	balance = 0;
    	numAccounts--;
    	System.out.println();
    }

    // Creates a new account whose balance is the sum 
    // of the balances in aact1 and acct2 and closes 
    // acct1 and acct2. Return new account.
    public static Account consolidate(Account acct1, Account acct2)
    {
      String name1 = acct1.name;
      String name2 = acct2.name;
      
      System.out.print("Trying to consolidate second and third accounts.");
      
      //checks if names of both accounts are equal and 
      //account numbers are not equal to each other
      if (name1.equals(name2)&& acct1.acctNum != acct2.acctNum)
      {		
    	  //Creates a new Account with 0 balance and name of first
    	  //account object
    	  Account AccountConsolidated = new Account(0, acct1.name);	
    	  //getting the sum of two account balances
    	  consolidate = acct1.getBalance() + acct2.getBalance();
    	  //getting balance for Account object
    	  AccountConsolidated.balance = consolidate;
    	  
    	  //closing both accounts
    	  acct1.close();
    	  acct2.close();
    	  //returns new account
    	  return AccountConsolidated;
      }
      else
      {	  
	   	System.out.print("\nSorry, accounts with different names"
        +  " cannot be consolidated.\n");
	   	System.out.print("Result account is ");
        return null;
      }
    } 

    // Method allows the user to transfer funds from one 
    // bank account to another. Receives account object 
    // and numeric amount. Makes checking if amount less 
    // then account . If so displays error message. If 
    // not makes transfer based on user decision.  
    public void transfer(Account acct, double amount)
    {
    	Account account = acct;
    	//checks if account object balance is equals or bigger 
    	//than amount of user input
    	if(amount < account.getBalance())
    	{
    		withdraw(amount);
    		acct.deposit(amount);
    	}
    	else
    	{
    		System.out.print("Insufficient funds for transfer\n");
    	}
    }

    // Method lets user transfer money between two 
    // accounts without going through either account. 
    // Takes two account objects and an amount and 
    // transfer the amount from the first account 
    // to the second.
    public static void transfer(Account acct1, Account acct2, double amount)
    {
    	Account account1 = acct1;
    	Account account2 = acct2;
    	//checks if two accounts balances available for making a transfer
        if (account1.getBalance() >= amount || account2.getBalance() >= amount)
        {
            account1.withdraw(amount);
            account2.deposit(amount);
        }
    	else
    	{
    		System.out.print("Insufficient funds for transfer\n");
    	}
    }
 }