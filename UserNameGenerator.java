/*
 * Description:This program asks user to enter his first and last name.
 * After input, program randomly generates new user name based on both
 * inputs.
 * Lab# 1
*/
import java.util.Scanner;
import java.util.Random;

public class UserNameGenerator
{
	public static void main(String... args)
	{
		int number;			// to hold random number
		String firstName;	// to hold first name
		String lastName;	// to hold last name
		String userName;	// to hold new user name
			
		Scanner input = new Scanner(System.in);
		System.out.print("Please, enter your first name: ");
			
		firstName = input.nextLine().replaceAll("\\W","");
		System.out.print("Please, enter your last name: ");
		lastName = input.nextLine().replaceAll("\\W","");
			
		Random generator = new Random();
		number = generator.nextInt(89) + 10;
			
		// possible situation, when last name doesn't have 5 letters. 
		if (lastName.length() < 5)
		{
			userName = firstName.toUpperCase().charAt(0) + lastName.substring(0, lastName.length()) + number;
		}
			
		else
		{
			//same statement, but it just prints 5 and more letters
			userName = firstName.toUpperCase().charAt(0) + lastName.substring(0, 5) + number;
			System.out.print("User name: " + userName);
		}
		input.close();
	}
}	