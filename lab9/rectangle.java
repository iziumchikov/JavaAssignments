/*
 * Description:Class rectangle extends Shape and represents a rectangle
 * Sphere class contains a class to describe a Sphere which is a 
 * descendant of Shape..
 * Lab# 9.2
*/
public class rectangle extends Shape {
	
	private double length;
	private double width;

	//---------------------------------- 
	//Constructor: Sets up the rectangle. 
	//---------------------------------- 
	public rectangle(double l, double w)
	{
		super("Rectangle");
		length = l;
		width = w;
	}
	//----------------------------------------- 
	//Returns the surface area of the rectangle. 
	//----------------------------------------- 
	public double area()
	{
		return length*width;
	}
	//----------------------------------- 
	//Returns the rectangle as a String. 
	//----------------------------------- 
	public String toString()
	{
		return super.toString() + " of length " + length
								+ " and width " + width;
	}
}
