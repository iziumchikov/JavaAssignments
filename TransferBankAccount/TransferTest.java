/*
 * Description:  Transfer test class creates two bank account objects
 * and enters a loop. Loop asks if the user would like to transfer 
 * from account1 to account2, transfer money from account 2 to account1,
 * or quit.
 * Lab6
*/
import java.util.Scanner;

public class TransferTest 
{
	public static void main(String[] args)
	{
		int choice;		//to hold users choice
		double amount;	// to hold amount for transfer
		Account account1, account2;
		//creates two bank account objects
        account1 = new Account(100, "name1");
        account2 = new Account(100, "name2");
       
        
		Scanner input = new Scanner(System.in);
		//prints info about two accounts
		System.out.println("Account1 Summary");
		System.out.println("----------------");
		System.out.println(account1);
		System.out.println("Account2 Summary");
		System.out.println("----------------");
		System.out.println(account2);
		
		//do-while loop to control transfer menu
		do{
			System.out.println("\nMenu");
			System.out.println("\n----");
			System.out.println("1: Transfer from Account1 to Account2");
			System.out.println("2: Transfer from Account2 to Account1");
			System.out.println("3: Quit");
			System.out.println("Enter your choose: ");
			choice = input.nextInt();
		
			//checks if user choice is legal
			if(choice <= 0 || choice > 3)
			{
				System.out.println("Wrong choose!!! Try again");
			}
				
		
			//if choice 1, then transfer from account1 to account2 
			if (choice == 1)
			{
				System.out.print("Enter amount to transfer: ");
				amount = input.nextDouble();
            
				//allows the user to transfer funds from one bank account to another
				//account1.transfer(account2,amount);
				//using static method transfer
				Account.transfer(account1, account2, amount);
				//prints balance of each account using getBalance() method
				System.out.println("Balance for Account1: " + account1.getBalance());
				System.out.println("Balance for Account2: " + account2.getBalance());
			}
		
			//if choice 2, then transfer from account2 to account1
			if (choice == 2)
			{
				System.out.print("Enter amount to transfer: ");
				amount = input.nextDouble();
            
				//allows the user to transfer funds from one bank 	account to another            
				//account2.transfer(account1,amount);
				//using static method transfer
				Account.transfer(account2, account1, amount);
				//prints balance of each account using getBalance() method            
				System.out.println("Balance for Account1: " + account1.getBalance());
				System.out.println("Balance for Account2: " + account2.getBalance());
			}
		}while(choice != 3);
		input.close();	
	}
}
