/*
 */

package project6;

import java.util.Scanner;


/**
 *
 * @author Administrator
 */
public class AddressBookEntry
{
    //declare variables needed for the class
    Validator validator = new Validator();
    Scanner sc = new Scanner(System.in);
    String name;
    String emailAddress;
    String phoneNumber;
// ----------------------------------------------------------------
// AddressBookEntry -- sets up the AddressBookEntry
// parameters  --   none
//
// return value -- none
//-----------------------------------------------------------------
    public AddressBookEntry()
    {
        this.name = "";
        this.phoneNumber = "";
        this.emailAddress= "";

    }// end AddressBookEntry
// ----------------------------------------------------------------
// getName -- gets the name from the user and validates it
// parameters  --   none
//
// return value -- name
//-----------------------------------------------------------------
    String getName()
    {
       
        // use the validator.getline to get a valid contact name
         name = validator.getLine(sc, "Enter contacts name: ");
        // return the validated name
        return name;
    }// end getname

 // ----------------------------------------------------------------
// setName -- sets the name of the AddressBookEntry
// parameters  --   String name
//
// return value -- none
//-----------------------------------------------------------------
    public void setName(String name)
    {
        this.name = name;

    }// end setname

// ----------------------------------------------------------------
// getEmailAddress -- gets the email address and validates it
// parameters  --   none
//
// return value -- String emailAddress
//-----------------------------------------------------------------
    String getEmailAddress()
    {
      
       //use validator.getEmail to get a valid email adddress
        emailAddress = validator.getEmail(sc,"Enter the email address: ");
        //return the validated email Address
        return emailAddress;
    }// end getEmailAddress


// ----------------------------------------------------------------
// setEmailAddress -- set the email address of the AddressBookEntry
// parameters  --   String emailAddress
//
// return value -- none
//-----------------------------------------------------------------
     public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;

    }// end setEmailAddress

// ----------------------------------------------------------------
// getPhoneNumber -- get and validate the phone Number from the user
// parameters  --   none
//
// return value -- String phoneNumber
//-----------------------------------------------------------------
    String getPhoneNumber() 
    {
      
        //use validator.getString to get a valid phone number
        phoneNumber = validator.getString(sc, "Enter the phone number: ");
        //return the validated phone Number
        return phoneNumber;
    }//end getPhoneNumber

// ----------------------------------------------------------------
// setPhoneNumber -- sets the phoneNumber of the AddressBookEntry
// parameters  --   String phoneNumber
//
// return value -- none
//-----------------------------------------------------------------

     public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;

    }// end setname
}
