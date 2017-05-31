/*
 * Description: Vehicle Demo tests Vehicle, Person and Truck classes,
 * creates object of each type, sets and gets different info, compare
 * object and prints result information.   
 * FileName: VehicleDemo.java
*/
	public class VehicleDemo
	{
	   public static void main(String[] args)
	   {
		  //creates first person
	      Person p1 = new Person();
	      System.out.println("p1: " + p1);
	      
	      //sets name of first person
	      p1.setName("Bob");
	      System.out.println("p1's name is: " + p1.getName() );

	      //creates second person
	      Person p2 = new Person("Joe");
	      System.out.println("p2: " + p2);
	      
	      //creates third person
	      Person p3 = new Person(p1);
	      System.out.println("p3: " + p3);
	      //compares persons
	      System.out.println("p3 equal to p1: " + p3.equals(p1));
	      System.out.println("p2 equal to p1: " + p2.equals(p1));

	      //creates first vehicle
	      Vehicle v1 = new Vehicle();
	      System.out.println("v1: " + v1);

	      //Sets info of first vehicle
	      v1.setManufacturer("Ford");
	      v1.setCylinders(4);
	      v1.setOwner(new Person("Joe"));
	      System.out.println("v1's manufacturer is: " + v1.getManufacturer() );
	      System.out.println("v1's cylinders: " + v1.getCylinders() );
	      System.out.println("v1's owner is: " + v1.getOwner() );
	      
	      //creates second vehicle
	      Vehicle v2 = new Vehicle("Chevy", 4, new Person("Betty"));
	      System.out.println("v2: " + v2);

	      //creates third vehicle
	      Vehicle v3 = new Vehicle(v1);
	      System.out.println("v3: " + v3);
	      //compares vehicles
	      System.out.println("v3 equal to v1: " + v3.equals(v1));
	      System.out.println("v2 equal to v1: " + v2.equals(v1));

	      //creates first truck
	      Truck t1 = new Truck();
	      System.out.println("t1: " + t1);

	      //sets truck info
	      t1.setLoad(54.36);
	      t1.setTowing(10);
	      System.out.println("t1's load capacity is: " + t1.getLoad() );
	      System.out.println("t1's towing capacity is: " + t1.getTowing() );

	      //creates second truck
	      Truck t2 = new Truck("Chevy", 4, new Person("Betty"), 34.5, 65);
	      System.out.println("t2: " + t2);

	      //creates third truck
	      Truck t3 = new Truck(t1);
	      System.out.println("t3: " + t3);
	      //compares trucks
	      System.out.println("t3 equal to t1: " + t3.equals(t1));
	      System.out.println("t2 equal to t1: " + t2.equals(t1));
	   }
	}
