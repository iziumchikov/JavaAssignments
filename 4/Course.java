/*
 * Description: Class Course represents a course taken at a school.
 * This class using ArrayList. Class can add and drop students.
 * FileName: Course.java
*/
import java.util.ArrayList;

public class Course 
{
	private double total = 0;
	private String courseName;
	
	private ArrayList<Student> students = new ArrayList<Student>();
	
	//Constructor: Sets up name for course
	public Course(String name) 
	{
		courseName = name;
	}	

	//Method addStudent accepts one Student parameter.
	public void addStudent(Student student) 
	{
		students.add(student);
		total += student.getAverage();
	}

	//Method dropStudent accepts one Student parameter.
	public void dropStudent(Student student)
	{
		students.remove(student);
		System.out.println("Student " + student.getFirstName() + " has been dropped");
		total -= student.getAverage();
	}

	//Method roll prints all student in the course.
	public void roll()
	{
		for (Student student : students)
			System.out.println(student);
	}

	//toString method
	public String toString()
	{
		return "--------------------------------\n" + courseName + " Class Roll\n";
	}

	public String getName()
	{
		return courseName;
	}

	public void setName(String name)
	{
		courseName = name;
	}

	public double average()
	{
		return total/students.size();
	}

	public double getTotal()
	{
		return total;
	}

	public void setTotal(double num)
	{
		total = num;
	}
}

