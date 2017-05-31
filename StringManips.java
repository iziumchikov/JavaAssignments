/*
 * Description: Originally this program shows: original phrase, it's length,
 * middle index of the phrase, character in the middle. After changes in the 
 * program it's also will show 3 middle characters of the phrase.Program 
 * will ask user to enter hometown city and state. After program will print 
 * a string with name of state in upper case letters, name of the city in 
 * lower case letters, and again the state name in upper case.
 * Lab# 3
*/

import java.util.Scanner;

public class StringManips
{
	public static void main	(String[] args)
	{
		String phrase = new String("This is a String test.");
		int phraseLength;	  // number	of	characters in the	phrase String 
		int	middleIndex;	 // index of the middle	character in the String
		String firstHalf;	  // first half of the phrase String
		String secondHalf;  // second half of the phrase String
		String switchedPhrase; //a new phrase with original halves switched
		String middle3;		// to hold three middle characters
		String city;		//to hold name of the city
		String state;		//to hold name of the state
    
		// compute the length and middle index of the phrase 
		phraseLength	= phrase.length(); 
		middleIndex =	phraseLength /	2;
    
		// get the substring for each	half of the	phrase
		firstHalf = phrase.substring(0,middleIndex);
		secondHalf = phrase.substring(middleIndex, phraseLength);
				
		// Changing swithcedPhrase.This statement changes all blank characters with an asterisk *
		switchedPhrase = phrase.replace(" ", "*");
				
		// using substring method to assign the substring consisting 3 middle characters of the phrase
		middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
    
		Scanner input = new Scanner(System.in);
		// print information about the phrase
		System.out.println();
		System.out.println ("Original phrase: " +	phrase);
		System.out.println ("Length of the phrase: " + phraseLength + " characters");
		System.out.println ("Index of the middle: " + middleIndex);
		System.out.println ("Character at the middle index: "	+ phrase.charAt(middleIndex));
		System.out.println ("Switched phrase: " +	switchedPhrase);	//print swithedPhrase in the same println statement
		System.out.println ("Three middle letters are: " + middle3);	//print 3 middle characters
		System.out.print ("Please, enter the name of your hometown: "); //asks user to enter city name
		city = input.nextLine();
		System.out.print ("Please, enter the name of your state: ");	//asks user to enter state name 
		state = input.nextLine();
		input.close();
				
		//print formated name of the state and name of the city
	    System.out.println(state.toUpperCase() + " " + city.toLowerCase() + " " + state.toUpperCase());
		System.out.println(state.toUpperCase() + city.toLowerCase() + state.toUpperCase());
		System.out.println();
	}
}
