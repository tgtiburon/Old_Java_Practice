
// Assign 12 CITP 190

/**
 * Project: Project 12
 * Author: Tony Gendreau
 * Date: May 1, 2011
 *
 * Purpose: Allows the user to list the customer database, and add to it
 */

package project12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class CustomerMaintApp {

    
    public static void main(String[] args)
    {



         // print welcome
	 System.out.println("Welcome to the Customer Maitenance application");
         System.out.println();

         //setup the scanner
         Scanner sc = new Scanner(System.in);

         //Setup the Validator
         Validator v = new Validator(sc);
         //sets default choice to y
         String choice = "add";
         // While loop to allow for people to repeat the program
         while (choice.equalsIgnoreCase("add") || choice.equalsIgnoreCase("list"))
         {

             //asks for input
             System.out.println();
             System.out.println("COMMAND MENU");
             System.out.println("list   -List all customers");
             System.out.println("add    -Add a customer");
             System.out.println("exit   -Exit this application");
             System.out.println();

             System.out.print("Enter a command: ");


             //sets customerAnswer to user entry
             choice = sc.nextLine();
             System.out.println();

             //User wants to list the customers
             if (choice.equalsIgnoreCase("list"))
             {

                 //read the contents of the file
                 System.out.println("CUSTOMER LIST");

                 try
                 {
                     // create character input stream to file
                
                      BufferedReader in = new BufferedReader(
                                     new FileReader("customers.txt"));
                      //get info from the file
                       String line = in.readLine();

                       while(line != null)
                       {
                            System.out.println(line);
                            line= in.readLine();

                       }//end while(line)
                 }// end try
                 //catch any io problems
                  catch(IOException e)
                  {
                      //Uh oh file problem
                      System.out.println("IOEception was thrown");
                  }//end catch
              
             }// end if "list"

             //User wants to add customers
              if (choice.equalsIgnoreCase("add"))
             {
      
                  //Create new customer object
                  Customer customer = new Customer();
                 // get data from user and validate it
                  String tempEmail = v.getEmail(sc,"Enter customer email address: ");               
                  String tempFirstName = v.getString(sc,"Enter first name: ");
                  String tempLastName = v.getString(sc,"Enter last name: ");
                  
                  //set variables to customer object
                  customer.setEmail(tempEmail);
                  customer.setFirstName(tempFirstName);
                  customer.setLastName(tempLastName);

                  //save customer object

                  // open an output stream for appending to the text file
                  try
                  {
                  PrintWriter out = new PrintWriter(
                                    new BufferedWriter(
                                    new FileWriter("customers.txt",true)));
                  //write to the file
                  out.print(customer.getEmail() + "\t");
                  out.print(customer.getFirstName() + "\t");
                  out.println(customer.getLastName());
                  // close the file
                  out.close();
                  System.out.println();
                  //tell user it worked
                  System.out.println(tempFirstName + " " + tempLastName
                          + " was added to the database.");
                 }//end try
                  //there is an io exception
                 catch(IOException e)
                  {
                      //Uh oh file problem
                      System.out.println("IOException was thrown.");
                  }//end catch
                               
		System.out.println();
                  
             }// end if "add"


         }//end while Stop program
         System.out.println("Bye.");
         

    }//end main() method

    
}//end MAIN
