//Asign 7 CITP 190
/**
 * Project: Project 7
 * Author: Tony Gendreau
 * Date: March 26, 2011
 */

package project7;


public class Employee extends Person
{
    String socialSecurityNumber;

    public Employee()
    {
        super(); // Call superclass ie Person
        socialSecurityNumber = "";



    }// end Employee Constructor

// ----------------------------------------------------------------
// setSocialSecurityNumber -- sets the socialSecurityNumber of the
// Employee Object
// parameters  --   string socialSecurityNumber
//
// return value -- none
//-----------------------------------------------------------------
    public void setSocialSecurityNumber(String socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;

    }// end setSocialSecurityNumber


// ----------------------------------------------------------------
// getSocialSecurityNumber -- gets the socialSecurityNumber of the
// Employee Object
// parameters  --   none
//
// return value -- socialSecurityNumber of the employee object
//-----------------------------------------------------------------
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;

    }// end getSocialSecurityNumber()



// ----------------------------------------------------------------
// getDisplayText -- override the toString method
// parameters  --   none
//
// return value -- string message
//-----------------------------------------------------------------
  public String getDisplayText()
    {
      // use person's toString method then add the Social Security info to it
           String message =
                super.toString() + // call method of Person Superclass
                "Social security number: " + socialSecurityNumber + "\n";
         return message;
     }// end getDisplayText()
}//end Employee
