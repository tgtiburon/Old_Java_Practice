/**
 * Project: Project 6
 * Author: Tony Gendreau
 * Date: March 20, 2011
 */

package project6;

import java.util.Scanner;
//import java.text.NumberFormat;



public class AddressBookEntryApp
{

    public static void main(String[] args)
    {

         // Add eric for capture
        new eric.Console();
      //Welcome to program
        System.out.println("Welcome to the Address Book application");



        // Print a blank line
        System.out.println();
        // Make a scanner to read the keyboard
        Scanner sc = new Scanner(System.in);
        String choice = "1";
       // boolean isChoiceValid = false;//to validate the continue? (y/n)

         // While loop to allow for people to repeat the program
         while (choice.equals("1") || choice.equals("2"))
         {

             System.out.println();
             System.out.println("1 - List entries");
             System.out.println("2 - Add entry");
             System.out.println("3 - Exit");
             System.out.println();
          

         

          // Create a do while loop to run the main loop of the program
          // will run as long as the user inputs 1 or 2, and exits on 3

            do
            {
                // Ask user if they want to continue
                System.out.print("Enter menu number:   ");
                // Store answer into choice
                choice = sc.nextLine();
                   // If 1 is selected then List entries
                if (choice.equals("1"))
                    {
                        listEntries();
                     
                    }// end if
                // if 2 is selected call addEntry();
                if (choice.equals("2"))
                    {
                      addEntry();
                 
                    }// end if
                    // user selected exit from menu
                if(choice.equals("3"))
                    {
                        // print a blank line and exit the do while
                        System.out.println();
                        break;
                     }// end if
                    // if person typed nothing and hit enter print error
                if (choice.isEmpty() )
                    {

                        System.out.println("Error! An entry is required. Try again.");
                        //set choice = 1 so it returns to top of do while
                        choice = "1";



                    }//end if
     

            }
             // As long as user chose 1 or 2 go to top of do while
            while(choice.equals("1") || choice.equals("2"));// end choice while loop


         }// end while
         // User chose to leave program say goodbye.
         System.out.println("Goodbye.");


    }// end main

// ----------------------------------------------------------------
// listEntries -- list the entries of the Address Book
// parameters  --   none
//
// return value -- none
//-----------------------------------------------------------------
 
      
  public static  void  listEntries()
    {
     // setup the AddressBookIO object
      AddressBookIO addressBookIO = new AddressBookIO();
      // call the getEntriesString from the addressBookIO object
      String aString = addressBookIO.getEntriesString();
      // print the string returned
      System.out.println(aString);
   
      

    }//end Public void listEntries()

// ----------------------------------------------------------------
// addEntry -- add a new entry to the Address Book
// parameters  --   none
//
// return value -- none
//-----------------------------------------------------------------

  public static void addEntry()
    {
      // setup the AddressBookEntry object
      AddressBookEntry addressBookEntry = new AddressBookEntry();
      // setup the addressBookIO object
      AddressBookIO addressBookIO = new AddressBookIO();
      // call the saveEntry method of the addressBookIO
      addressBookIO.saveEntry(addressBookEntry);

      
    }// end Public Void addEntry



}// end project5
