/*
 * Description: Vehicle class creates a new vehicle,gets owner 
 * name from Person class,checks if some vehicle are equal or not.
 * FileName: Vehicle.java
*/

public class Vehicle
{
	private String manufacturer; //to hold manufacturer name
	private int cylinders;	//to hold number of cylinders
	Person owner;	//creates new object, if necessary gets or sets owners name

	//Default constructor
	public Vehicle()
	{
		manufacturer = "None";
		cylinders = 0;
		owner = new Person();
	}

	//Constructor: receives and sets manufacturer name,
	//number of cylinders and info about owner.
	public Vehicle(String name,int num,Person object) 
	{
		manufacturer = name;
		cylinders = num;
		owner = new Person(object);
	}

	//Constructor: receives already created object
	//vehicle and sets manufacturer name, number of 
	//cylinders and info about owner.
	public Vehicle(Vehicle vehicle)
	{
		manufacturer = vehicle.manufacturer;
		cylinders = vehicle.cylinders;
		owner = new Person(vehicle.owner);
	}
	
	//Boolean method equals() compares and checks 
	//two Vehicle objects, if they are equals or not. 
	//If equals return true, if not false.	
	public boolean equals(Vehicle vehicle)
	{
		if (vehicle == null)
		{
			return false;//checks if Vehicle object is empty
		}
		//Creates a newTruck ,based on received object
		Vehicle newVehicle = (Vehicle)vehicle;
		
		//compares all info of two vehicles, if equals returns
		//true.If not false
		if (this.getManufacturer().equals(newVehicle.getManufacturer())
			&& (this.getCylinders() == newVehicle.getCylinders()) 
			&& (this.getOwner().equals(newVehicle.getOwner())))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String getManufacturer()
	{
		return manufacturer;
	}

	public void setManufacturer(String name)
	{
		this.manufacturer = name;
	}

	public int getCylinders()
	{
		return cylinders;
	}

	public void setCylinders(int num)
	{
		this.cylinders = num;
	}

	public Person getOwner()
	{
		return new Person(owner);
	}

	public void setOwner(Person owner)
	{
		this.owner = owner;
	}

	public String toString()
	{
		return manufacturer + ", " + cylinders + " cylinders" + ", " + "owned by " + owner;
	}		
}
