This assignment will give you practice with defining classes. You will need the support file TelevisionDemo from the course web site. Place this file in the same folder as your program.
Part 1: Television Class
Everyone is familiar with a television. It is the object we are going to create in this assignment. All manufacturers have the same basic elements in the televisions they produce as well as many options. We are going to work with a few basic elements that are common to all televisions. Think about a television in general. It has a brand name (i.e. it is made by a specific manufacturer). The television screen has a specific size. It has some basic controls. There is a control to turn the power on and off. There is a control to change the channel. There is also a control for the volume. At any point in time, the television’s state can be described by how these controls are set.
You will write the television class. Each object that is created from the television class must be able to hold information about that instance of a television in fields. So a television object will have the following attributes:
? manufacturer. The manufacturer attribute will hold the brand name. This cannot change once the television is created, so will be a named constant.
? screenSize. The screenSize attribute will hold the size of the television screen. This cannot change once the television has been created so will be a named constant.
? powerOn. The powerOn attribute will hold the value true if the power is on, and false if the power is off.
? channel. The channel attribute will hold the value of the station that the television is showing.
? volume. The volume attribute will hold a number value representing the loudness (0 being no sound).
These attributes become attributes (fields) in our class.
The television object will also be able to control the state of its attributes. These controls become methods in our class.
? setChannel. The setChannel method will store the desired station in the channel field.
? power. The power method will toggle the power between on and off, changing the value stored in the powerOn field from true to false or from false to true.
? increaseVolume. The increaseVolume method will increase the value stored in the volume field by 1.
? decreaseVolume. The decreaseVolume method will decrease the value stored in the volume field by 1.
? getChannel. The getChannel method will return the value stored in the channel field.
CS111B Assignment #2
Fall 2015 September 8, 2015
2
? getVolume. The getVolume method will return the value stored in the volume field.
? getManufacturer. The getManufacturer method will return the constant value stored in the MANUFACTURER field.
? getScreenSize. The getScreenSize method will return the constant value stored in the SCREEN_SIZE field.
You will also need a constructor method that will be used to create an instance of a television.
These ideas can be brought together to form a UML (Unified Modeling Language) diagram for this class as shown below.
Television ?Class Name
- MANUFACTURER: String
- SCREEN_SIZE: int ?Attributes or fields
- powerOn: boolean
- channel: int
- volume: int
+Television(brand: String, size: int):
+setChannel (station: int): void
+power( ): void ?Methods
+increaseVolume( ): void
+decreaseVolume( ): void
+getChannel( ): int
+getVolume( ): int
+ getManufacturer( ): String
+getScreenSize( ): int
Data type returned
Name the source code file Televesion.java
Running the Application
1. You can only execute (run) a program that has a main method, so there is a driver program that is already written to test out your Television class.
2. Copy the file TelevisionDemo.java from the class website. Make sure it is in the same directory as Television.java.
3. Compile and run TelevisionDemo and follow the prompts.
4. If your output matches the output below, Television.java is complete and correct.
CS111B Assignment #2
Fall 2015 September 8, 2015
3
Sample Run:
A 55 inch Toshiba has been turned on.
What channel do you want? 56
Channel: 56 Volume: 21
Too loud! Lowering the volume.
Channel: 56 Volume: 15
Part 2: Creating another instance of a Television
1. Edit the TelevisionDemo.java file.
2. Declare another Television object called portable.
3. Instantiate portable to be a Sharp 19 inch television.
4. Use a call to the power method to turn the power on.
5. Use calls to the accessor methods to print what television was turned on.
6. Use calls to the mutator methods to change the channel to the user’s preference and decrease the volume by two.
7. Use calls to the accessor methods to print the changed state of the portable.
8. Compile and debug this class.
9. Run TelevisionDemo again.
Sample Run:
A 19 inch Sharp has been turned on.
What channel do you want? 7
Channel: 7 Volume: 18