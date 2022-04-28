// Assign 10 CITP 190

/**
 * Project: Project 11
 * Author: Tony Gendreau
 * Date: April 24, 2011
 *
 * Purpose:  Accepts an int that provides the customer number that does not exist
 */

package project11;


public class NoSuchCustomerException extends Exception
{
    // instance variable
    private int customerNumber;
    //default constructor
    public NoSuchCustomerException()
    {

    }//end NoSuchCustomerException
/** ----------------------------------------------------------------
// NoSuchCustomerException -- Constructor for NoSuchCustomerException
// parameters  --   int customerNumber
//
// return value -- none
//-----------------------------------------------------------------*/
    public NoSuchCustomerException(int customerNumber)
    {
        this.customerNumber = customerNumber;
    }
/** ----------------------------------------------------------------
// getCustomerNumber -- gets the customer number
// parameters  --   none
//
// return value -- int customerNumber
//-----------------------------------------------------------------*/
    public int getCustomerNumber()
    {
        return customerNumber;
    }//end

}//end NoSuchCustomerException
