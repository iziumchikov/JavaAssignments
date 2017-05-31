Objectives:
This assignment will give you practice with while loops, random numbers, and String class.
Number Guessing Game [20 points]
Write a program that allows the user to play a simple guessing game in which your program thinks up an integer and allows the user to make guesses until the user gets it right. For each incorrect guess you will tell the user whether the right answer is higher or lower.
You are to define a class constant for the maximum number used in the guessing game. The sample run shows the user making guesses from 1 to 100, but the choice of 100 is arbitrary. By introducing a constant for 100, you should be able to change just the value of the constant to make the program play the game with a range of 1 to 50 or a range of 1 to 250 or some other range starting with 1.
When you ask the user whether or not to play again, you should use the “next()” method of the Scanner class to read a one-word answer from the user. You should continue playing if this answer begins with the letter “y” or the letter “Y”.
Notice that the user is allowed to type words like “yes”. You are to look just at the first letter of the user’s response and see whether it begins with a “y” or “n” (either capitalized or not) to determine whether to play again.
Assume that the user always types an integer when guessing, that the integer is always in an appropriate range and that the user gives you a one-word answer beginning with “y”, “Y”, “n” or “N” when asked whether to play again.
You will notice at the end of the sample run that you need to report various statistics about the series of games played by the user. You need to report the total number of games played, the total number of guesses made (all games included), the average number of guesses per game and the maximum number of guesses used in any single game.
Here are a few helpful hints to keep in mind.
? This program needs to generate random numbers.
? To deal with the yes/no response from the user, you might want to use some of the String class methods. You will want to use the next() method of the Scanner class to read a word from the console.
? It’s a good idea to change the value of your class constant and run the program to make sure that everything works right with the new value of the constant. For example, turn it into a guessing game for numbers between 1 and 5.
CS111B Assignment #1
Fall 2015 August 31, 2015
______________________________________________________________________________________________________
2
Requirements:
? You are required to have a while loop in main that plays multiple games and prompts the user for whether or not to play another game.
? Your program is required to exactly reproduce the format and behavior of the sample run, so you may want to look that over first.
I expect you to use good programming style and to include useful comments throughout your program. I expect you to make appropriate choices about when to store values as int versus double, which if/else constructs to use, what parameters to pass, and so on.
Your program should be stored in a file called NumberGuessingGame.java.
Sample Run:
This program allows you to play a guessing game.
I will think of a number between 1 and 100 and will allow you to guess until you get it.
For each guess, I will tell you whether the right answer is higher or lower than your guess.
I'm thinking of a number...
Your guess? 20
higher
Your guess? 40
higher
Your guess? 60
higher
Your guess? 80
higher
Your guess? 100
lower
Your guess? 90
lower
Your guess? 88
lower
Your guess? 86
You got it right in 8 guesses
Do you want to play again? Yes
I'm thinking of a number...
Your guess? 20
higher
Your guess? 40
higher
Your guess? 60
higher
Your guess? 80
higher
Your guess? 82
higher
Your guess? 84
higher
CS111B Assignment #1
Fall 2015 August 31, 2015
______________________________________________________________________________________________________
3
Your guess? 86
higher
Your guess? 88
higher
Your guess? 90
higher
Your guess? 92
higher
Your guess? 94
lower
Your guess? 93
You got it right in 12 guesses
Do you want to play again? YES
I'm thinking of a number...
Your guess? 20
higher
Your guess? 40
higher
Your guess? 60
lower
Your guess? 58
lower
Your guess? 56
You got it right in 5 guesses
Do you want to play again? No
Overall results:
total games = 3
total guesses = 25
guesses/game = 8.33
max guesses = 12
Optional Extra Credit (5 points)
Add the following static methods in addition to method main to your program:
? The giveIntro method should have a return type of void. It gives instructions to the user.
? The playGame method should have a return type of void. It implements a complete guessing game on the range of 1 to 100. (Just one game, not multiple games)
? The reportResults method should have a return type of void. It reports the overall results to the user.
You may define more methods than this if you find it helpful, although you will find that the limitation that methods can return only one value will tend to limit how much you can decompose this problem.
CS111B Assignment #1
Fall 2015 August 31, 2015
______________________________________________________________________________________________________
4
Submitting Your Assignment
Each assignment requires two submissions: an electronic component submitted through Insight, and a hardcopy component submitted in class.
? The hardcopy submissions must include the following:
1. A copy of your program. This copy needs to include all the code that you have written for the assignment.
2. One or more sample runs of your program. In addition to the program copy, submit examples showing the output of your program.
? Additionally, your program must be uploaded to Insight. To upload:
1. Create a new directory (Assignment1) on your computer, and put all files:
(NumberGuessingGame.java, NumberGuessingGame.class) inside that directory.
Then, compress, or zip up, the directory.
2. Upload the file Assignment1.zip to Insight by the due date/time.
? The program uploaded to Insight must be the exact same one submitted in class.
? A significant portion of each grade will be based on how well your program adheres to the style and documentation standards.
? Regarding the hard copies:
1. Your name must appear in a comment block above the test class (the one containing the main method)
2. Use a 10-point or 12-point font size only
3. Do not let any statements or comments “wrap” to the next line. Start new lines instead
4. The pages of each individual .java file must be stapled together separately, with all pages in the correct order.
5. In addition, all the individual files and the output must be securely fastened together with a paper clip
Program copies and sample runs are both easy to generate in Eclipse. All you need to do is select the Print command under the File menu.
If you are submitting a late assignment on a day when the class does not meet, just upload it to Insight and turn in the hard copy the next time the class meets.