
/*
 * Description: This program randomly generates a number. The range
 * 	of the number easy to determine. After generating
 * 	program asks user to guess the number. As soon as 
 * 	user will find the right number, program asks user
 * 	continue or not. I the end  it report all results.
 * FileName: NUmberGuessingGame.java
*/
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
{
	private static final int MAX_GUESS = 100;
	private static int numGames = 0;
	private static int totalAttempts = 0;
	private static int biggest = 0;

	public static void main(String[] args) 
	{
		String again;
		Scanner input = new Scanner(System.in);
		Random gen = new Random();
		giveIntro();
		do
		{										
			playGame(input,gen);				
			input.nextLine();
			System.out.println("Would you like to play again(y/n)?");
			again = input.nextLine();
			numGames++;
		} while (again.toLowerCase().charAt(0) == 'y');
		reportResults();
		input.close();
	}
	
	public static void giveIntro()
	{
		System.out.println("This program allows you to play a guessing game.");
		System.out.println("I will think of a number between 1 and" + " " + MAX_GUESS + 
							" " + "I will\nallow you to guess until you get it." + 
							"For each guess,\nI will tell you whether the right " +
							"answer is higher\nor lower than your guess.");
		System.out.println();
	}

	public static void playGame(Scanner input, Random generator)
	{
		int userGuess;
		int attempt = 0;		
		int random = generator.nextInt(MAX_GUESS) + 1;
		
		System.out.println("I'm thinking of a number...");

		do 
		{									 
			System.out.print("Your guess? ");
			userGuess = input.nextInt();
			attempt++;
			
			if (userGuess < 1 || userGuess > MAX_GUESS)
			{
				System.out.println("Your guess must be in the range 1 to "+ MAX_GUESS);
				System.out.println("Please enter another number.");
				attempt--;
			}
			
			else if (userGuess != random)
			{
				if (userGuess < random)
				{
					System.out.println("higher"); 
				}

				if (userGuess > random)
				{
					System.out.println("lower");
				}
			}	
			
		} while (userGuess != random && attempt < MAX_GUESS);
		
		if (userGuess == random)
		{
			System.out.println("You got it right in " + attempt + " guesses");
			totalAttempts += attempt;
		}
		else
		{
			System.out.println("You have had " + MAX_GUESS + " tries.");
			System.out.println("You already have used all you tries!");
			attempt -= MAX_GUESS;
		}
		
		findMaxAttempt(attempt);
	}

	public static void findMaxAttempt(int attempt)
	{
        if (attempt > biggest) 
        {
        	biggest = attempt;
        }
	}
	
	public static void reportResults()
	{
		//this statements prints all statistic 
		System.out.println();
		System.out.println("Overall results: ");
	    System.out.println("\ttotal games   = " + numGames);
	    System.out.println("\ttotal guesses = " + totalAttempts);
	    System.out.println("\tguesses/game  = " + 1.0*totalAttempts/numGames);
	    System.out.println("\tmax guess  = " + biggest);
	}
}