
/*
 * Description:Demonstrates using of methods, which was discribed in 
 * Account class file.
 * Lab# 4
*/
public class ManageAccount
{
   public static void main(String[] args)
   {											
	   Account acct1 = new Account(1200, "Sally", 1111);		//create account1 for Sally
	   Account acct2 = new Account(500, "Joe", 12345);		//create account2 for Joe 

	  //deposit to Joe's account
      acct2.deposit(100);
      //print Joe's new balance (use getBalance())
      System.out.println("Joe's new balance is: $" + acct2.getBalance());
      //withdraw Sally's account
      acct1.withdraw(300);
      //print Sally's new balance (use getBalance())
      System.out.println("Sally's new balance is: $" + acct1.getBalance());
      //charge fee from Sally'saccounts
      System.out.println("Sally's balance after charging a fee is " + acct1.chargeFee());
      //charge fee from Joe's account
      System.out.println("Joe's balance after charging a fee is " + acct2.chargeFee());
      //change the name on Joe's account to Joseph
      acct2.changeName("Joseph");
      //prints name, number of account, balance and number of transactions using toString() method
      System.out.println(acct1.toString());
      //prints name, number of account, balance and number of transactions using toString() method
      System.out.println(acct2.toString());
      System.out.println();
      
      //prints number of transactions,using getTransactions() method
      //and prints name of account owner, using method getName()
      System.out.println("The number of transactions for " + acct1.getName() +  " account is " 
    		  + acct1.getTransactions());
      System.out.println("The number of transactions for "  + acct2.getName() +  " account is "
    		  + acct2.getTransactions());
   }
}
