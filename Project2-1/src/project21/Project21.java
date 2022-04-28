
 /**
 * Project: Project 2-1
 * Author: Tony Gendreau
 * Date: February 3, 2011
 */
                           


package project21;
import java.util.Scanner;

public class Project21
{
   



    public static void main(String[] args)
    {

         // Add Eric
           new eric.Console();
         // Intro to program
          System.out.println("Welcome to the Area and Perimeter Calculator");
          System.out.println(); // print a blank line
          // Create a scanner object
          Scanner sc = new Scanner(System.in);

          // do calculations until the choice is equal to "y" or "Y"
          String choice = "y";
          while (choice.equalsIgnoreCase("y"))
          {
            // Get length
            System.out.print("Enter Length:   ");
            double length = sc.nextDouble();

            // Get width
            System.out.print("Enter Width:   ");
            double width = sc.nextDouble();

            // Do calculations
            double area = width * length;
            double perimeter = 2* width + 2* length;
            // print results of area and perimeter calcs.
            String message = "Area:   "
                            + area + "\n"
                            + "Perimeter:   "
                            + perimeter + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n):   ");
            choice = sc.next();
            System.out.println();



          }// end While




    }//end main



}// end Project2
