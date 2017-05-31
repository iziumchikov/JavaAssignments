/*
 * Description: Player class creates new player. Player has name 
 * and score.
 * FileName: Player.java
*/

public class Player {
	private String name;
	private int score;
	
	// Default constructor
	public Player()
	{
		score = 0;
		name = "";
	}
	
	public Player(String name, int score)
	{
		this.name = name;
		this.score = score;
	}
	

	public Player(String name)
	{
		this.name = name;
	}
	
	public Player(int score)
	{
		this.score = score;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getScore()
	{
		return score;
	}

	public void setScore(int score)
	{
		this.score = score;
	}

	public String toString()
	{
		return "\t" + score + "\t" + name;
	}
	
/*
	// This toString method necessary when using two arrays
	public String toString()
	{
		return "\t" + getScore() + "\t" + getName();
	}*/
}
