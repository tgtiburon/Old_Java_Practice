/**
 * Project: Project 1
 * Author: Tony Gendreau
 * Date: January 28, 2011
 */
package project1;
import java.util.Scanner;

public class Project1
{
 public static void main(String[] args)
    {
        int total = 0;
        int number1;
        int number2;
        new eric.Console();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        number1 = sc.nextInt();
        
        System.out.print("Enter second integer: ");
        number2= sc.nextInt();

        total = number1 + number2;

        System.out.println("The total is " + total);



    }// end of Main

}// end of class Project1
