 /**
 * Project: Project 4-2
 * Author: Tony Gendreau
 * Date: March 1, 2011
 */

package project42;

import java.util.Scanner;


public class Project42
{

    public static void main(String[] args) {

         // Add eric for capture
        new eric.Console();
      //Welcome to program
        System.out.println("Greatest Common Divisor Finder");
        // Print a blank line
        System.out.println();
        // Make a scanner to read the keyboard
        Scanner sc = new Scanner(System.in);
        String choice = "y";

         // While loop to allow for people to repeat the program
         while (choice.equalsIgnoreCase("y"))
         {
             // Ask user to enter first and second number
             System.out.print("Enter first number: ");
             int firstNumber= sc.nextInt();
             System.out.print("Enter second number: ");
             int secondNumber= sc.nextInt();
             int greatestCommonDivisor = 0;

             // Call a static method to calculate the Divisor
             // send firstNumber and secondNumber
              greatestCommonDivisor  = getGreatestDivisor(firstNumber,
                      secondNumber);
            
             // print result
           System.out.println("Greatest common divisor: "
                   + greatestCommonDivisor);

          // Print a blank  line
            System.out.println();


               // see if the user wants to continue
            System.out.print("Continue? (y/n):   ");
            choice = sc.next();
            System.out.println();
         }// end while

    }// end main


// ----------------------------------------------------------------
// getGreatestDivisor -- calculate the Greatest Common Divisor
//                       between two integers
//
// parameters  --   two integers
//
// return value -- greatest common divisor between the integers
//-----------------------------------------------------------------

 public static int getGreatestDivisor (int x, int y)
    {
     // declare divisor and set it to 0
     int divisor = 0;
       
     // create an outer while loop as long as x does not equal 0
     while (x != 0)
        {
           // inner while  loop for part of formula
            while (y>=x)
                {
                    y = y -x;
                } //end while inner

            int tmpNum;//temp. integer to allow for swapping of x and y;
            tmpNum = x; // store x in tmpNum
            x = y;// set  x equal to y
            y = tmpNum;//set y to what x used to be
        
        }// end while outter
    divisor = y; // set divisor equal to the y we calculated
    return divisor; // return divisor
}// end getGreatestDivisor



}// end project41
