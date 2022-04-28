//Asign 7 CITP 190
/**
 * Project: Project 7
 * Author: Tony Gendreau
 * Date: March 26, 2011
 */
package project7;


public abstract class Person
{
    // the instance variables
    private String firstName;
    private String lastName;
    private String emailAddress;

    //the class constructor
    public Person()
    {
        //set instance variables to "" for now
        firstName = "";
        lastName = "" ;
        emailAddress = "" ;

    }// end Person() constructor


// ----------------------------------------------------------------
// setFirstName -- sets the firstName of the Person Object
// parameters  --   string firstName
//
// return value -- none
//-----------------------------------------------------------------
    public void setFirstName(String firstName)
    {

        this.firstName = firstName;

    }// end setFirstName


// ----------------------------------------------------------------
// getFirstName -- gets the firstName of the Person Object
// parameters  --   none
//
// return value -- firstName of the person object
//-----------------------------------------------------------------
    public String getFirstName()
    {
        return firstName;

    }// end getFirstName()


// ----------------------------------------------------------------
// setLastName -- sets the lastName of the Person Object
// parameters  --   string lastName
//
// return value -- none
//-----------------------------------------------------------------
    public void setLastName(String lastName)
    {
        this.lastName = lastName;

    }// end setLastName


// ----------------------------------------------------------------
// getLastName -- gets the lastName of the Person Object
// parameters  --   none
//
// return value -- string lastName
//-----------------------------------------------------------------
    public String getLastName()
    {
        return lastName;

    }// end getLastName()


// ----------------------------------------------------------------
// setEmailAddress -- sets the emailAddress of the Person Object
// parameters  --   string emailAddress
//
// return value -- none
//-----------------------------------------------------------------
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;

    }// end setEmailAddress


// ----------------------------------------------------------------
// getEmailAddress -- gets the emailAddress of the Person Object
// parameters  --   none
//
// return value -- string emailAddress
//-----------------------------------------------------------------
    public String getEmailAddress()
    {
        return emailAddress;

    }// end getFirstName()

  
// ----------------------------------------------------------------
// toString --  creates a formated string to display
// parameters  --   none
//
// return value -- string message
//-----------------------------------------------------------------
   
    public String toString()//override the toString method
    {
        // create the formatted string
        String message =
                "Name: " + firstName + " " + lastName + "\n" +
                "Email: " + emailAddress + "\n";
        return message;

    }//end toString

    abstract String getDisplayText(); // abstract method










}//end Class Person
