/*
 * Description:Class cylinder extends Shape and represents a cylinder
 * Sphere class contains a class to describe a Sphere which is a 
 * descendant of Shape.
 * Lab# 9.2
*/

public class cylinder extends Shape{
	
	private double radius; //to hold radius
	private double height; //to hold height
	
	//---------------------------------- 
	//Constructor: Sets up the cylinder. 
	//----------------------------------
	public cylinder(double r, double h)
	{
		super("Cylinder");
		radius = r;
		height = h;
	}
	
	//----------------------------------------- 
	//Returns the surface area of the cylinder. 
	//----------------------------------------- 
	public double area()
	{
		return Math.PI*height*Math.pow(radius, 2);
	}
	//----------------------------------- 
	//Returns the cylinder as a String. 
	//----------------------------------- 
	public String toString()
	{
		return super.toString() + " of radius " + radius
								+ " and height " + height;
	}
}
