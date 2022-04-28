// Assign 7 CITP 190

/**
 * Project: Project 7
 * Author: Tony Gendreau
 * Date: March 26, 2011
 */

package project7;
import java.util.Scanner;


public class PersonApp
{

   
     public static void main(String[] args)
    {


         // Add eric for capture
        new eric.Console();
      //Welcome to program
        System.out.println("Welcome to the Person Tester application");



        // Print a blank line
        System.out.println();
        // Make a scanner to read the keyboard
        Scanner sc = new Scanner(System.in);
        // set variables to starting values
        String choice = "y";
        String entryType = "c";
      

         // While loop to allow for people to repeat the program
         while (choice.equalsIgnoreCase("y") )
         {

            do
              {
                // ask user what they want to create
                System.out.print("Create cutomer or employee? (c/e): ");
                
                // Store answer into entryType
                entryType = sc.nextLine();
                   // If c is entered then create a new customer object
                if (entryType.equalsIgnoreCase("c"))
                    {
                        //Call customer code
                        CreateNewCustomer();
                        break;

                    }// end if
               
                    // if e is selected create a new employee object
                if(entryType.equalsIgnoreCase("e"))
                    {
                       CreateNewEmployee();
                       break;
                     }// end if
                // if person entered something other than c or e
                // give error
                 if(!entryType.equalsIgnoreCase("e") &&
                   !entryType.equalsIgnoreCase("c"))
                   {
                       System.out.println("Please enter either 'c' or 'e'!");
                       // set entryType to c to avoid reentering
                       entryType = "c";
                       System.out.println(); // blank line
                   }// end if


                 }//end do while
                  while (entryType.equalsIgnoreCase("c") ||
                            entryType.equalsIgnoreCase("e"));
                 // ask if they want to continue
                System.out.print("Continue? (y/n): ");
                choice = sc.nextLine();
                System.out.println();
         }// end while
     


    }// end main

// ----------------------------------------------------------------
// CreateNewCutomer -- list the entries of the Address Book
// parameters  --   none
//
// return value -- none
//-----------------------------------------------------------------


  public static  void  CreateNewCustomer()
    {


        // create scanner
        Scanner sc = new Scanner(System.in);
        // create new customer object
        Customer customer = new Customer();
        System.out.println(); // print a blank line
       // below get customer info and use the Validator class to check input
        String firstName = Validator.getString(sc,"Enter first name: ");
        customer.setFirstName(firstName);
      
        String lastName = Validator.getString(sc, "Enter last name: ");
        customer.setLastName(lastName);
        String emailAddress = Validator.getEmail(sc, "Enter email address: ");
        customer.setEmailAddress(emailAddress);
     
        String customerNumber = Validator.getString(sc, "Customer number: ");
        customer.setCustomerNumber(customerNumber);

        System.out.println(); // print a blank line
        System.out.println("You entered:");
        // use the getDissplay method of customer to format and print
        // info collected
        System.out.println(customer.getDisplayText());
        
        




    }//end Public void CreateNewCustomer()

// ----------------------------------------------------------------
// CreateNewEmployee -- list the entries of the Address Book
// parameters  --   none
//
// return value -- none
//-----------------------------------------------------------------


  public static  void  CreateNewEmployee()
    {

        // create a new scanner
        Scanner sc = new Scanner(System.in);
        // create a new employee object
        Employee employee = new Employee();
        System.out.println(); // print a blank line
        // below get employee info and use the Validator class to check input
        String firstName = Validator.getString(sc,"Enter first name: ");
        employee.setFirstName(firstName);
       
        String lastName = Validator.getString(sc, "Enter last name: ");
        employee.setLastName(lastName);
        String emailAddress = Validator.getEmail(sc, "Enter email address: ");
        employee.setEmailAddress(emailAddress);
    
        String socialSecurityNumber =
                         Validator.getString(sc, "Social security number: ");
        employee.setSocialSecurityNumber(socialSecurityNumber);
        System.out.println(); // empty line
        System.out.println("You entered:");
        // use the getDissplay method of employee to format and print
        // info collected

        System.out.println(employee.getDisplayText());


    }//end Public void CreateNewEmployee()





}// end Class PersonApp
