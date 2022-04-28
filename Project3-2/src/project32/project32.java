
 /**
 * Project: Project 3-1
 * Author: Tony Gendreau
 * Date: February 24, 2011
 */

package project32;

import java.util.Scanner;





public class project32

{
      
    public static void main(String[] args) {
    
         // Add eric for capture
        new eric.Console();
      //Welcome to program
        System.out.println("Welcome to the Change Calculator");
        // Print a blank line
        System.out.println();
        // Make a scanner to read the keyboard
        Scanner sc = new Scanner(System.in);

         String choice = "y";
         // While loop to allow for people to repeat the program
         while (choice.equalsIgnoreCase("y"))
         {
             // Ask user to enter a score
             System.out.print("Enter number of cents (0-99):   ");
             int cents = sc.nextInt();
            //Do the math to calculate the number of each coin

             int numQuarters = 0; // stores number of dimes
             int numDimes = 0 ; // stores number of dimes
             int numNickles = 0; // stores number of nickles
             int numPennies = 0; // stores number of pennies
             int centsLeft = 0; // stores amount of cents left after calculations


             // Calculate the number of quarters
             numQuarters = cents / 25;
             // calculate number of cents left;
             centsLeft = cents - (numQuarters * 25);
             // calculate number of dimes
             numDimes = centsLeft / 10;
             // calculate number of cents left;
             centsLeft = centsLeft - (numDimes * 10);
             // calculate number of nickles
             numNickles = centsLeft / 5;
             //calculate cents left
             centsLeft = centsLeft - (numNickles * 5);
             // calculate number of pennies
             numPennies = centsLeft;

             

             








            // Print out number of quarters
            System.out.println("Quarters:    "+ numQuarters);
            System.out.println("Dimes:       "+ numDimes);
            System.out.println("Nickles:     "+ numNickles);
            System.out.println("Pennies:     "+ numPennies);
          // Print a blank  line
            System.out.println();

            
            


             

               // see if the user wants to continue
            System.out.print("Continue? (y/n):   ");
            choice = sc.next();
            System.out.println();
         }// end while

        
        
        
    }// end main

    
    
    
}// end project32
