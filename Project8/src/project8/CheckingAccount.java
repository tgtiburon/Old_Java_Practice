// Assign 8 CITP 190

/**
 * Project: Project 8
 * Author: Tony Gendreau
 * Date: April 5, 2011
 */
package project8;




public class CheckingAccount extends Account
{
    // instance variable
    public double monthlyFee;



// ----------------------------------------------------------------
// CheckingAccount -- Constructor for CheckingAccount
// parameters  --   double monthlyFee
//
// return value -- none
//-----------------------------------------------------------------

    public CheckingAccount(double monthlyFee)
    {
        this.monthlyFee = monthlyFee;

    }// end CheckingAccount


// ----------------------------------------------------------------
// subtractMonthlyFee -- subtract the monthly fee from the account
// parameters  --   none
//
// return value -- none
//-----------------------------------------------------------------
    public void subtractMonthlyFee()
    {
        balance -= monthlyFee;

    }// end subtractMontlyFee()


// ----------------------------------------------------------------
// getMonthlyFee -- return the monthlyFee to user
// parameters  --   none
//
// return value -- monthlyFee
//-----------------------------------------------------------------
    public double getMonthlyFee()
    {
        return monthlyFee;
    }


}// end public class Checking Account
