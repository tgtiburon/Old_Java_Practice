
 /**
 * Project: Project 2-2
 * Author: Tony Gendreau
 * Date: February 4, 2011
 */


package project22;

import java.util.Scanner;

public class Project22
{

    
    public static void main(String[] args)
    {
        // Add eric for capture
        new eric.Console();
      //Welcome to program
        System.out.println("Welcome to the Letter Grade Converter");
        // Print a blank line
        System.out.println();
        // Make a scanner to read the keyboard
        Scanner sc = new Scanner(System.in);

         String choice = "y";
         // While loop to allow for people to repeat the program
         while (choice.equalsIgnoreCase("y"))
         {
             // Ask user to enter a score
             System.out.print("Enter numberical grade:   ");
             int grade = sc.nextInt();
             // Make a string to store the Letter grade equivalent
             String letterGrade;
             //Use the if/else if  section to determine what letter grade the
             // inputted integer grade is as a letter grade.
             if (grade >= 88)
                     letterGrade = "A";
             else if (grade < 88 && grade >= 80)
                     letterGrade = "B";
             else if (grade <80 && grade >= 67)
                     letterGrade = "C";
             else if (grade <67 && grade >= 60 )
                     letterGrade = "D";
             else
                     letterGrade = "E";
             // Print the Letter Grade
             System.out.println("Letter Grade: "+ letterGrade);
             


             

               // see if the user wants to continue
            System.out.print("Continue? (y/n):   ");
            choice = sc.next();
            System.out.println();
         }// end while





    }// end main

}// end Project22
