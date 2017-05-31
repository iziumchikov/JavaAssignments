This assignment will give you practice with classes, methods, and Inheritance.
Part 1: Person and Customer Classes (20 points)
Create a class called Vehicle that has the manufacturer’s name (type String), number of cylinders in the engine (type int), and owner (type Person given next).
The definition of the class Person follows. Completing the definitions of the methods is part of this programming assignment.
public class Person
{
private String name;
public Person()
{...}
public Person(String theName)
{...}
public Person(Person theObject)
{...}
public String getName()
{...}
public void setName(String theName)
{...}
public String toString()
{...}
public boolean equals(Person other)
{...}
}
Part 2: Truck Class (10 points)
Create a class called Truck that is derived from Vehicle and has the following additional properties:
? the load capacity in tons (type double since it may contain a fractional part)
? and towing capacity in pounds (type int).
Be sure your class has a reasonable complement of constructors, accessor and mutator methods, and suitably defined equals and toString methods.
Driver Class (5 points)
Demonstrate the classes in a simple program. Name this file VehicleDemo.java
CS111B Assignment #6
Fall 2015 October 12, 2015
2
Sample Run:
p1:
p1's name is: Bob
p2: Joe
p3: Bob
p3 equal to p1: true
p2 equal to p1: false
v1: None, 0 cylinders, owned by
v1's manufacturer is: Ford
v1's cylinders: 4
v1's owner is: Joe
v2: Chevy, 4 cylinders, owned by Betty
v3: Ford, 4 cylinders, owned by Joe
v3 equal to v1: true
v2 equal to v1: false
t1: None, 0 cylinders, owned by , load capacity 0.0, towing capacity 0
t1's load capacity is: 54.36
t1's towing capacity is: 10
t2: Chevy, 4 cylinders, owned by Betty, load capacity 34.5, towing capacity 65
t3: None, 0 cylinders, owned by , load capacity 54.36, towing capacity 10
t3 equal to t1: true
t2 equal to t1: false