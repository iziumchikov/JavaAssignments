/*
 * Description: Test program that prompts for and reads in three
 * names and creates an account with an initial balance of $ 100 
 * for each. also prints three accounts, then close the first 
 * account and try to consolidate the second and third into a 
 * new account.then prints accounts again, including the 
 * consolidated one if it was created.
 * Lab6
*/
import java.util.Scanner;

public class TestAccounts2
{
    public static void main(String[] args)
    {	
    	
		String name1, name2, name3;	//to hold three names
		//initialize four Account class objects
		Account account1, account2, account3, account4; 


		Scanner scan = new Scanner(System.in);
		
		//Getting names for three accounts
		System.out.print("Enter name for first account: ");
		name1 = scan.nextLine();
		System.out.println("Created account for " + name1 +
				" with balance $ 100\n");
		
		System.out.print("Enter name for second account: ");
		name2 = scan.nextLine();
		System.out.println("Created account for " + name2 +
				 " with balance $ 100\n");
		
		System.out.print("Enter name three for thitd account: ");
		name3 = scan.nextLine();
		System.out.println("Created account for " + name3 +
				 " with balance $ 100\n");
		
		//Creates 3 new accounts with balance $ 100 
		account1 = new Account(100, name1);
		account2 = new Account(100, name2);
		account3 = new Account(100, name3);
		
		System.out.print("Closing first account.");
		//using close() method of Account class to close first account
		account1.close();
		//consolidates the second and third into account4.
        account4 = Account.consolidate(account2, account3);
        //prints info about consolidated account
        System.out.print(account4);
    	//prints number of accounts using getNumAccounts() method
        System.out.println("\nNumber of accounts is now: " + Account.getNumAccounts());
		scan.close();
    }
}
