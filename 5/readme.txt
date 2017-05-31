This assignment will give you practice with classes, methods, and arrays.
Part 1: Player Class (5 points)
Write a class named Player that stores a player’s name and the player’s high score.
A player is described by:
? player’s name
? player’s high score
In your class, include:
? instance data variables
? two constructors
? getters and setters
? include appropriate value checks when applicable
? a toString method
Part 2: PlayersList Class (15 points)
Write a class that manages a list of up to 10 players and their high scores. Create a single array of type Player that stores the players’ names and scores.
In your class, include:
? a single array of type Player to hold player name and score.
? a constructor
Your class should support the following features:
? Add a new player and score (up to 10 players).
method header: public void addPlayer()
? Print all the players’ names and their scores to the screen.
method header: public void printPlayers()
? Allow the user to enter a player’s name and output that player’s score or a message if that player’s name has not been entered.
method header: public void lookupPlayer()
? Allow the user to enter a player’s name and remove the player from the list.
method header: public void removePlayer()
Notes
? You can include additional instance data variables if it is helpful. If you include additional variables, include additional getters and setters as appropriate.
? I have provided a driver program ScoreManagementSystem.java you can use to test your code and sample output.
CS111B Assignment #5
Fall 2015 October 5, 2015
2
Score Management System
Choose:
A)dd new player
P)rint all players
L)ookup a player's score
R)emove a player
Q)uit
A
Enter name:
Alexander
Enter score:
300
Score Management System
Choose:
A)dd new player
P)rint all players
L)ookup a player's score
R)emove a player
Q)uit
A
Enter name:
Michael
Enter score:
200
Score Management System
Choose:
A)dd new player
P)rint all players
L)ookup a player's score
R)emove a player
Q)uit
P
Score Name
300 Alexander
200 Michael
Score Management System
Choose:
A)dd new player
P)rint all players
L)ookup a player's score
CS111B Assignment #5
Fall 2015 October 5, 2015
3
R)emove a player
Q)uit
L
Enter name to look up.
George
Name not found.
Score Management System
Choose:
A)dd new player
P)rint all players
L)ookup a player's score
R)emove a player
Q)uit
P
Score Name
300 Alexander
200 Michael
Score Management System
Choose:
A)dd new player
P)rint all players
L)ookup a player's score
R)emove a player
Q)uit
L
Enter name to look up.
Michael
Michael's score = 200
Score Management System
Choose:
A)dd new player
P)rint all players
L)ookup a player's score
R)emove a player
Q)uit
R
Enter name to remove.
Michael
Michael removed.
CS111B Assignment #5
Fall 2015 October 5, 2015
4
Score Management System
Choose:
A)dd new player
P)rint all players
L)ookup a player's score
R)emove a player
Q)uit
P
Score Name
300 Alexander
Score Management System
Choose:
A)dd new player
P)rint all players
L)ookup a player's score
R)emove a player
Q)uit
Q
Extra Credit (5 points)
Write a program that manages a list of up to 10 players and their high scores. Use two arrays to manage the list.
One array should store the players’ names, and the other array should store the players’ high scores. Use the index of the arrays to correlate the names with the scores.
Your program should support the following features:
a. Add a new player and score (up to 10 players).
b. Print all the players’ names and their scores to the screen.
c. Allow the user to enter a player’s name and output that player’s score or a message if that player’s name has not been entered.
Name the file PlayersTwoArrays.java