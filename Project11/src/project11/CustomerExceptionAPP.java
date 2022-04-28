
// Assign 10 CITP 190

/**
 * Project: Project 11
 * Author: Tony Gendreau
 * Date: April 24, 2011
 *
 * Purpose:  Allows the user to input a customer number to retrieve customer
 * info, or will give a NoSuchCustomerException
 */

package project11;

import java.util.Scanner;


public class CustomerExceptionAPP
{


    public static void main(String[] args) throws NoSuchCustomerException
    {

        

         // print welcome
	 System.out.println("Welcome to the Customer application.");
         System.out.println();
                
         //setup the scanner
         Scanner sc = new Scanner(System.in);
         //sets default choice to y
         String choice = "y";
         // While loop to allow for people to repeat the program
         while (choice.equalsIgnoreCase("y"))
         {
             //temp variables
             String tmpName = "";
             String tmpAddress = "";
             String tmpCity = "";
             String tmpState = "";
             String tmpZipCode = "";
             //asks for input
             System.out.print("Enter a customer number: ");
            
             
             //sets customerInt to user entry
             int customerInt = sc.nextInt();
             System.out.println();
             //creates the objects we need
             Customer cust = new Customer();
             CustomerIO custIO = new CustomerIO();

             try
             {
                 //if all works out in getCustomer we store
                 // variables then print them out
                     cust = custIO.getCustomer(customerInt);
                     tmpName = cust.name;
                     tmpAddress = cust.address;
                     tmpCity = cust.city;
                     tmpState = cust.state;
                     tmpZipCode = cust.zipCode;




                     System.out.println(tmpName);
                     System.out.println(tmpAddress);
                     System.out.println(tmpCity + ", " + tmpState + " " + tmpZipCode);
                     System.out.println();
                     //reset the boolean for checking customer numbers
                     CustomerIO.customerFound = false;
             }
             catch (NoSuchCustomerException e)
             {
                 //something went wrong with getCustomerInfo
                
               
                 System.out.println("The customer " + e.getCustomerNumber() +
                         " does not exist.");
                 System.out.println();
                 //reset the boolean for checking customer numbers
                 CustomerIO.customerFound = false;
             }



             // Another customer?
             System.out.print("Display another customer? (y/n):");
             choice = sc.next();
             System.out.println();
           



             
             
             
         }//end while Stop program




    }//end main() method








}// end CustomerExceptionAPP() Class
