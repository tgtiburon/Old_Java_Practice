 /**
 * Project: Project 4-1
 * Author: Tony Gendreau
 * Date: March 1, 2011
 */

package project41;

import java.util.Scanner;


public class project41

{

    public static void main(String[] args) {

         // Add eric for capture
        new eric.Console();
      //Welcome to program
        System.out.println("Welcome to the Factorial Calculator");
        // Print a blank line
        System.out.println();
        // Make a scanner to read the keyboard
        Scanner sc = new Scanner(System.in);

         String choice = "y";
         // While loop to allow for people to repeat the program
         while (choice.equalsIgnoreCase("y"))
         {
             // Ask user to enter the integer
             System.out.print("Enter an integer that's greater than 0 and less"
                     + " than 10:   ");
             int userInteger= sc.nextInt();
    

             long factorial = 1;  // stores the factorial
              
             // Create a loop to calculate the factorial of the
             // user entered integer
             for (int i = 1; i <=userInteger; i++)
             {
                 // I should be cast to long automatically.
                  factorial = factorial *  i; // go step by step to factorial


             }// end of for


             // print result
             System.out.println("Factorial = " + factorial);

          // Print a blank  line
            System.out.println();


             // see if the user wants to continue
            System.out.print("Continue? (y/n):   ");
            choice = sc.next();
            System.out.println();
         }// end while


    }// end main


}// end project41
