//Asign 7 CITP 190
/**
 * Project: Project 7
 * Author: Tony Gendreau
 * Date: March 26, 2011
 */

package project7;


public class Customer extends Person
{
    
    // instance variable
    String customerNumber;
    //Constructor of Customer
    public Customer()
    {
        super(); // Call superclass ie Person
        //set customerNumber to  "" for now
        customerNumber = "";



    }// end Customer Constructor


// ----------------------------------------------------------------
// setCustomerNumber -- sets the customerNumber of the Customer Object
// parameters  --   string customerNumber
//
// return value -- none
//-----------------------------------------------------------------
    public void setCustomerNumber(String customerNumber)
    {
        this.customerNumber = customerNumber;

    }// end setCustomerNumber


// ----------------------------------------------------------------
// getCustomerNumber -- gets the customerNumber of the Customer Object
// parameters  --   none
//
// return value -- customerNumber of the customer object
//-----------------------------------------------------------------
    public String getCustomerNumber()
    {
        return customerNumber;

    }// end getCustomerNumber()

// ----------------------------------------------------------------
// getDisplayText -- override the toString method and add customer info
// parameters  --   none
//
// return value -- string message
//-----------------------------------------------------------------

     public String getDisplayText()
    {
         // use person's toString then add Customer number info to it
           String message =
                super.toString() + // call method of Person Superclass
                "Customer number: " + customerNumber + "\n";
         return message;
     }// end getDisplayText()

}//end Class Customer
