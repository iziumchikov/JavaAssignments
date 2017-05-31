/*
 * Description: Main method that creates a course,adds several students,
 * drops a student,prints a roll, and prints the overall course test
 * average.
 * FileName: School.java
*/
public class School 
{
   public static void main(String[] args)
   {
	   //-----------------------------------------------------------
	   // This block of code creates: new Course with name, School 
	   // address and 5 students. After prints info about all 
	   // students and their average score.
	   //-----------------------------------------------------------
      Course course = new Course("Zoology");
      Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
      Address jHome = new Address("21 Jump Street", "Blacksburg","VA", 24551);                        
      Student john = new Student("John", "Smith", jHome, school, 75, 88, 78);
      	john.setTestScore(1,75); //using setTestScore method. send # of test and score
     	john.setTestScore(2,88);
     	john.setTestScore(3,78);
     	
      Address mHome = new Address("123 Main Street", "Euclid", "OH",44132);
      Student marsha = new Student("Marsha", "Jones", mHome, school, 100, 98, 94);
      	marsha.setTestScore(1,100);
      	marsha.setTestScore(2,98);
      	marsha.setTestScore(3,94);
      
      Address jjHome = new Address("123 Main Street", "Euclid", "OH",44132);
      Student jose = new Student("Jose", "JGarcia", jjHome, school, 79, 85, 96);
      	jose.setTestScore(1,79);
      	jose.setTestScore(2,85);
      	jose.setTestScore(3,96);
      
      Address kHome = new Address("123 Main Street", "Euclid", "OH",44132);
      Student Kayla = new Student("Kayla", "Lewis", kHome, school, 96, 98, 94);
      	Kayla.setTestScore(1,96);
      	Kayla.setTestScore(2,98);
      	Kayla.setTestScore(3,94);
      
      Address tHome = new Address("123 Main Street", "Euclid", "OH",44132);
      Student Tanya = new Student("Tanya", "Dubinski", tHome, school, 89, 86, 85);
      	Tanya.setTestScore(1,89);
      	Tanya.setTestScore(2,86);
      	Tanya.setTestScore(3,85);
      
/*    //this part of code adds students to the Course ArrayList
      course.addStudent(john);
      course.addStudent(marsha);
      course.addStudent(jose);
      course.addStudent(Kayla);
      course.addStudent(Tanya);
      

      System.out.print(course.toString());
      course.roll();
      System.out.println("Average test score for all tests: " + course.average());
      course.dropStudent(Kayla);
      System.out.print(course.toString());
      course.roll();
      System.out.println("Average test score for all tests: " + course.average());*/
      
      	
      //this part of code adds students to the Course Array
      CourseArray courseArray = new CourseArray("Zoology");
      courseArray.addStudent(john);
      courseArray.addStudent(marsha);
      courseArray.addStudent(jose);
      courseArray.addStudent(Kayla);
      courseArray.addStudent(Tanya);

      //this block prints info about course, students,
      //average total score, drops one students and
      //prints info again.
      System.out.print(courseArray.toString());
      courseArray.roll();
      System.out.println("Average test score for all tests: " + courseArray.average());
      courseArray.dropStudent(Kayla);
      System.out.print(courseArray.toString());
      courseArray.roll();
      System.out.println("Average test score for all tests: " + courseArray.average());
   }
 }


