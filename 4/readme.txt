Part 1: Student Class (10 points)
Modify the Student class as follows.
? Each student object should also contain the scores for three tests.
? Provide a constructor that sets all instance values based on parameter values.
? Overload the constructor such that each test score is assumed to be initially zero.
? Provide a method called setTestScore that accepts two parameters: the test number (1 through 3) and the score.
? Also provide a method called getTestScore that accepts the test number and returns the appropriate score.
? Provide a method called average that computes and returns the average test score for this student.
? Modify the toString method such that the test scores and average are included in the description of the student.
Part 2: Course Class (10 points)
Write a class called Course that represents a course taken at a school. Represent each student using the modified Student class from Part 1.
? Use an ArrayList in the Course to store the students taking that course.
? The constructor of the Course class should accept only the name of the course.
? Provide a method called addStudent that accepts one Student parameter.
? Provide a method called dropStudent that accepts one Student parameter.
? Provide a method called average that computes and returns the average of all students’ test score averages.
? Provide a method called roll that prints all students in the course.
Part 3: Driver Class (5 points)
Create a driver class School.java with a main method that creates a course, adds several students, drops a student, prints a roll, and prints the overall course test average.
Extra Credit (10 points)
Write a class called CourseArray. This class has the same methods as Course. Instead of using an ArrayList<Student> to store the roll, use Student[] array.
CS111B Assignment #4
Fall 2015 September 21, 2015
_________________________________________________________________________________________________________
2
Sample Run
Zoology Class Roll
----------------------------------------
John Smith
----------------------------------------
Home Address:
Placeholder
Atlanta, GA 30301
School Address:
Placeholder
Reno, NV 89501
Test 1 score: 75
Test 2 score: 88
Test 3 score: 78
Average test score: 80.33
----------------------------------------
Marsha Jones
----------------------------------------
Home Address:
Placeholder
Atlanta, GA 30301
School Address:
Placeholder
Reno, NV 89501
Test 1 score: 100
Test 2 score: 98
Test 3 score: 94
Average test score: 97.33
----------------------------------------
Jose Garcia
----------------------------------------
Home Address:
Placeholder
Atlanta, GA 30301
School Address:
Placeholder
Reno, NV 89501
Test 1 score: 79
Test 2 score: 85
Test 3 score: 96
Average test score: 86.67
----------------------------------------
Kayla Lewis
----------------------------------------
Home Address:
CS111B Assignment #4
Fall 2015 September 21, 2015
_________________________________________________________________________________________________________
3
Placeholder
Atlanta, GA 30301
School Address:
Placeholder
Reno, NV 89501
Test 1 score: 96
Test 2 score: 98
Test 3 score: 94
Average test score: 96.0
----------------------------------------
Tanya Dubinski
----------------------------------------
Home Address:
Placeholder
Atlanta, GA 30301
School Address:
Placeholder
Reno, NV 89501
Test 1 score: 89
Test 2 score: 86
Test 3 score: 85
Average test score: 86.67
Average test score for all tests: 89.4