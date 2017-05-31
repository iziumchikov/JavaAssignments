/*
 * Description: Class CourseArray represents a course taken at a school.
 * This class using Arrays. Class can add and drop students.
 * FileName: CourseArray.java
*/
public class CourseArray 
{
	private int numStudents = 0;
	private double total;
	private String courseName;
	
	private Student[] students = new Student[10];
	
	//Constructor: Sets up name for course
	public CourseArray(String name) 
	{
		courseName = name;
	}	
	
	//Method addStudent accepts one Student parameter.
	public void addStudent(Student student) 
	{
		students[numStudents] = student;
		numStudents++;
		total += student.getAverage();
	}

	//Method dropStudent accepts one Student parameter.
	public void dropStudent(Student student)
	{
		for (int i = 0;i<students.length;i++)
		{
			if (students[i] == student)
			{
				 students[i] = students[students.length - 1];
			}
			
			total -= student.getAverage();
			
			System.out.println("Student " + student.getFirstName() + " " 
					+ student.getLastName() + " " + " has been dropped.");
		}
	}

	//Method roll prints all student in the course.
	public void roll()
	{
		for (int i = 0; i<numStudents;i++)
		{
			System.out.println(students[i]);
		}
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
		return total/numStudents;
	}

	public double getTotal()
	{
		return total;
	}

	public void setTotal(double num)
	{
		total=num;
	}

	public int getNumStudents()
	{
		return numStudents;
	}

	public void setNumStudents(int num)
	{
		numStudents = num;
	}
	
}