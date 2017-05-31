/*
 * Description: Television demo is using a Television class.
 * It prints main information about TV. turn it on or turn it off,
 * asks user to choose the channel.
 * FileName: TelevisionDemo.java
*/
import java.util.Scanner;


public class TelevisionDemo
{
   public static void main(String[] args)
   {
	  int station;
      Scanner keyboard = new Scanner (System.in);
      Television bigScreen = new Television("Toshiba", 55);
      Television portable = new Television("Sharp", 19);

      // Turn the power on
      bigScreen.power(1);
      
      // Display the state of the television
      System.out.println("A " + bigScreen.getScreenSize() +" inch " + 
      bigScreen.getManufacturer() +" has been turned on.");

      // Prompt the user for input and store into station
      System.out.print("What channel do you want? ");
      station = keyboard.nextInt();

      // Change the channel on the television
      bigScreen.setChannel(station);

      // Increase the volume of the television
      bigScreen.increaseVolume();

      // Display the the current channel and
      // volume of the television
      System.out.println("Channel: " + bigScreen.getChannel() + 
    		  " Volume: " + bigScreen.getVolume());
      System.out.println("Too loud! Lowering the volume.");

      // Decrease the volume of the television
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();

      // Display the the current channel and
      // volume of the television
      System.out.println("Channel: " + bigScreen.getChannel() + 
    		  " Volume: " + bigScreen.getVolume());
      System.out.println();
      
      portable.power(1);
      System.out.println("A " + portable.getScreenSize() +" inch " + 
      portable.getManufacturer() +" has been turned on.");
      System.out.print("What channel do you want? ");
      station = keyboard.nextInt();
      portable.setChannel(station);
      portable.decreaseVolume();
      portable.decreaseVolume();
      System.out.println("Channel: " + portable.getChannel() + 
    		  " Volume: " + portable.getVolume());
      portable.power(0);
      
      
     }
}