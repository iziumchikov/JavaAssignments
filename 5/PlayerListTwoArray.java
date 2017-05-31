/*
 * Description: PlayerList class manages list of up to 10 players
 * names and list of their high scores.Creates a two arrays of 
 * type Player that stores the player's name and scores.
 * FileName: PlayerListTwoArray.java
*/
import java.util.Scanner;

public class PlayerListTwoArray{

	private int count;	//to hold number of players in array
	private int score;	//to hold user input of player scores
	private String name;	//to hold user input of player name
	
	//two arrays of type Player to hold player name and score
	private Player[] listofName;	
	private Player[] listofScores;
	Scanner input = new Scanner(System.in);
	
	// Constructor
	public PlayerListTwoArray()
	{
		//instantiation of array, which holds 10 items with players names
		listofName = new Player[10];
		//instantiation of array, which holds 10 items with players scores
		listofScores = new Player[10];
		//set number of items in array to 0
		count = 0;	
	}
	
	// Method Adds a new player and score
	public void addPlayer()
	{
		System.out.println("Enter name: ");
			name = input.nextLine();
		System.out.println("Enter score: ");
			score = input.nextInt();
		//checks if score negative and equals to 0
		while(score <= 0)
		{
			System.out.println("Score must be greater then 0");
			System.out.println("Re-enter score: ");
			score = input.nextInt();
		}
		input.nextLine();
		
		//creating a new player
		Player newPlayerName = new Player(name);
		Player newPlayerScore = new Player(score);
		
		//checks array size, if necessary increase
		if (count == listofName.length && count == listofScores.length)
		{
			increaseSize();
		}
			
		listofName[count] = newPlayerName;//adds new player to the array
		listofScores[count] = newPlayerScore;
		
		count++;	//increases number of players
	}
	
	//Method printPlayers prints all players in the list.
	public void printPlayers()
	{
		System.out.print("\t" + "Score " + "Name\n");
		for(int i = 0; i < count; i++)
		{
			System.out.println(listofScores[i] + "  " + listofName[i].getName());
		}
	}
	
	//Method lookupPlayer allows user to enter a player's
	//and output that player's score or a message if that
	//player's name has not been found.
	public void lookupPlayer()
	{
		boolean found = false;	//flag indicating search results
		System.out.println("Enter name to look up: ");
		name = input.nextLine();
		
		//for loop to find a name in array list
		for(int i = 0;i < count;i++)
		{
			//checks if array list not empty and array contains
			//looking name. If found prints score. 
			if(listofName[i] != null && listofName[i].getName().equalsIgnoreCase(name))
			{	
				found = true; //changes flag to true if name found
				System.out.print(name + "'s score = " + listofScores[i].getScore());
			}
		}
		//prints result if name not found
		if(found != true)
		{
			System.out.println("Name not found");
		}
	}

	//Method removePlayer allows user to enter a player's
	//name and remove the player from the list.
	public void removePlayer()
	{
		boolean found = false;	//flag indicating search results
		System.out.println("Enter name to remove: ");
		name = input.nextLine();
		
		//for loop to find a name in array list
		for (int i = 0; i < count;i++)
		{
			//checks if array list not empty and array contains
			//looking name
			if (listofName[i] != null && listofName[i].getName().equalsIgnoreCase(name))
			{
				found = true; //changes flag to true if name found
				listofName[i] = null;	//deletes content of array object
				listofScores[i] = null;
				System.out.println(name + " removed.");
				count--;//decreases number of player
			}
		}
		
		//prints result if name not found
		if (found != true) 
		{
			System.out.println("Name not found");
		}
	}

	// Increases the capacity of the cart by creating a
	// larger array and copying the existing collection into it.
	public void increaseSize()
	{
		Player[] temp = new Player[listofName.length + 5];
		for(int i=0; i < listofName.length;i++)
		{
			temp[i] = listofName[i];
			listofName = temp;
		}
		
		Player[] temp2 = new Player[listofScores.length + 5];
		for(int i = 0;i < listofScores.length; i++)
		{
			temp2[i] = listofScores[i];
			listofScores = temp2;
		}
	}
	
	
}
