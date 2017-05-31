/*
 * Description: Person class represents owner of truck or vehicle
 * and compare persons equal or not.
 * FileName: Person.java
*/

public class Person 
{
	private String name; //to hold owners name
	
	//Default constructor
	public Person()
	{
		name = "";
	}

	//Constructor: receives owner name
	public Person(String name)
	{
		this.name = name;
	}
	
	//Constructor: receives already created person object
	// and sets owner name.
	public Person(Person object)
	{
	     this.name = object.getName();
	}

	//Boolean method equals() compares and checks 
	//two Person objects if they are equals or not. 
	//If equals return true, if not false.
	public boolean equals(Person object) 
	{
		if (object == null)
		{
			return false;
		}
	        
		//Creates a newPerson,based on received object
		Person newPerson = (Person) object;
		
		//compares names of two object, if equals returns
		//true.If not false
		if (this.getName().equals(newPerson.getName()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String toString()
	{
		return name;
	}
}
