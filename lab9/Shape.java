/*
 * Description: Abstract class Shape represent shape of object.
 * Lab# 9.2
*/

public abstract class Shape{
	
	protected String shapeName;
	
	public Shape(String name)
	{
		shapeName = name;
	}
	public String toString()
	{
		return shapeName;
	}
	public abstract double area();
}
