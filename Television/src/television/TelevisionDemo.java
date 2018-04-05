package television;

import java.util.Scanner;  // Needed for the Scanner class

/** This class demonstrates the Television class.*/

public class TelevisionDemo
{
   public static void main(String[] args)
   {
      // Create a Scanner object to read from the keyboard
      Scanner keyboard = new Scanner (System.in);

      // Declare variables
      int station;         // The user's channel choice

      // Declare and instantiate a television object
      Television bigScreen = new Television("Toshiba", 55);

      // Turn the power on
      bigScreen.power();

    // Display the state of the television
      System.out.println("A " +
                         bigScreen.getScreenSize() +
                         " inch " + bigScreen.getManufacturer() +
                         " has been turned on.");

      // Prompt the user for input and store into station
      System.out.print("What channel do you want? ");
      station = keyboard.nextInt();

      // Change the channel on the television
      bigScreen.setChannel(station);

      // Increase the volume of the television
      bigScreen.increaseVolume();

      // Display the current channel and volume of the television
      System.out.println("Channel: " +
                         bigScreen.getChannel() +
                         " Volume: " + bigScreen.getVolume());
      System.out.println("Too loud! Lowering the volume.");

      // Decrease the volume of the television
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();

      // Display the current channel and volume of the television
      System.out.println("Channel: " +
                         bigScreen.getChannel() +
                         " Volume: " +
                         bigScreen.getVolume());

      System.out.println();   // For a blank line

      

      // Instanciate a new Sharp 19inch television.
      Television portable = new Television("Sharp", 19);
      
      // Turn on the power.
      portable.power();
      
      // Print the status of the telivision.
      System.out.println("A " +
                         portable.getScreenSize() +
                         " inch " + portable.getManufacturer() +
                         " has been turned on.");
      
      // Change the channel to the users preference.
      System.out.print("What channel do you want? ");
      station = keyboard.nextInt();
      portable.setChannel(station);
      
      // Decrease the volume by 2.
      portable.decreaseVolume();
      portable.decreaseVolume();
      
      // Print the changed states of the portable television.
      System.out.print("Channel:  " + portable.getChannel());
      System.out.print(" Volume:  " + portable.getVolume());
      
      // Blank line.
      System.out.println();
   }
}
