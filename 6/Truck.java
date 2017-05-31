/*
 * Description:Child class Truck extends Vehicle class. Creates a
 * new Truck,gets necessary info about owner, manufacturer ,etc.
 * Checks if trucks are equal or not.
 * FileName: Truck.java
*/

public class Truck extends Vehicle
{
   private double load;
   private int towing;
   Truck truck;


   //Default constructor
   public Truck ()
   {
      super();
      load = 0.0;
      towing = 0;
   }

   //Constructor: Receives manufacturer name, number
   // of cylinders, Person object, loading capacity
   // and towing capacity. Uses superclass to create
   // a new vehicle, sets lading and towing capacity.              
   public Truck(String manufacturer, int cylinders, Person owner, 
		   		double load, int tow)
   {
      super(manufacturer, cylinders, owner);  //calling superclass
      this.load = load;	//set loading capacity
      this.towing = tow;//set towing capacity
   }

   //Constructor: Receives already created class truck,
   // sends this object to superclass Vehicle,sets 
   //loading and towing capacity.
   public Truck(Truck truck)
   {
	  super(truck);		//calling superclass
      this.load = truck.getLoad();	//set loading capacity
      this.towing = truck.getTowing();	//set towing capacity
   }

	//Boolean method equals() compares and checks 
	//two Truck objects, if they are equals or not. 
	//If equals return true, if not false.
   public boolean equals(Truck truck)
   {      
	   if (truck == null) //checks if Truck object is empty
		   return false;
	   
	   //Creates a newTruck ,based on received object
	   Truck newTruck = (Truck)truck;
	   
		//compares all info of two trucks, if equals returns
		//true.If not false
	   if (this.getManufacturer().equals(newTruck.getManufacturer()) 
			   && (this.getCylinders() == newTruck.getCylinders()) 
			   && (this.getOwner().equals(newTruck.getOwner())) 
			   && (this.getLoad() == newTruck.getLoad()) 
			   && (this.getTowing() == newTruck.getTowing()))
	   {
		   return true;
	   }
				   
	   else 
	   {
		   return false;
	   }
   }

   public double getLoad()
   {
      return load;
   }
   
   public void setLoad(double load)
   {
      this.load = load;
   }
   
   public int getTowing()
   {
      return towing;
   }

   public void setTowing(int tow)
   {
      towing = tow;
   }

   public String toString()
   {
      return ", load capacity " + load + ", towing capacity " + towing;
   }
}
