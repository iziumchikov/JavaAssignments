/*
 * Description: Student class creates Student object, which contains
 * info about student, three test scores, and methods to work with 
 * this info.
 * FileName: Student.java
*/
import java.text.NumberFormat;

public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int testScore1,testScore2,testScore3;
   private double average;


   //  Constructor: Sets up this student with the specified values.
   public Student(String first, String last, Address home,
                  Address school,int test1, int test2, int test3)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      testScore1 = test1;
      testScore2 = test2;
      testScore3 = test3;
   }

   public Student()
   {
	   testScore1 = 0;
	   testScore2 = 0;
	   testScore3 = 0;
   }

   public String getFirstName() 
   {
       return firstName;
   }

   public void setFirstName(String name)
   {
	   firstName = name;
   }

   public String getLastName() 
   {
       return lastName;
   }
   
   public void setLastName(String name)
   {
	   lastName = name;
   }

   public Address getHome()
   {
	   return homeAddress;
   }

   public void setHomeAddress(Address address)
   {
	   homeAddress = address;
   }

   public Address getSchoolAddress()
   {
	   return schoolAddress;
   }

   public void setSchoolAddress(Address address)
   {
	   schoolAddress = address;
   }

  //  Returns a string description of this Student object.
   public String toString()
   {
	  NumberFormat fmt = NumberFormat.getInstance();
      String result;
      result = "------------------------------------\n";
      result += firstName + " " + lastName + "\n";
      result += "-----------------------------------\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "\nSchool Address:\n" + schoolAddress + "\n";
      result += "\nTest scores:" + testScore1;
      result += "\nTest scores:" + testScore2;
      result += "\nTest scores:" + testScore3;
      result += "\nAverage: " + fmt.format(average) + "\n";
      return result;
   }
   
   // Method setTestScore that accepts two parameters: 
   // the test number(int test) (1 through 3) and the 
   // score(score). Also using average method to initialize
   // average variable
   public void setTestScore(int test, int score)
   {
	   if (test == 1)
	   {
		   testScore1 = score;
	   }
	   else if (test == 2)
	   {
		   testScore2 = score;
	   }
	   else if (test == 3)
	   {
		   testScore3 = score;
	   }
		
	   average = average(testScore1, testScore2, testScore3);
   }

   // Method getTestScore accepts the test number and 
   // returns the appropriate score.
   public double getTestScore (int test)
   {
      if (test == 1)
      {
    	  return testScore1;
      } 
      else if (test == 2)
      {
    	  return testScore2;
      }
      else
      {
    	  return testScore3;
      }
   } 

   // Method average computes and returns the average test 
   // score for student.
   public double average(int test1, int test2, int test3)
   {
	   return (testScore1 + testScore2 + testScore3)/3.0; 
   }  

   public double getAverage()
   {
	   return average;
   }

   public void setAverage(double num)
   {
	   average = num;
   }   
}