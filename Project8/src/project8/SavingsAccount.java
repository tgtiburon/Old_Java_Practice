// Assign 8 CITP 190

/**
 * Project: Project 8
 * Author: Tony Gendreau
 * Date: April 5, 2011
 */

package project8;








public class SavingsAccount extends Account
{
    //instance variable
    double monthlyInterestRate;
    double monthlyInterestPayment;



// ----------------------------------------------------------------
// SavingsAccount -- Constructor of the SavingsAccount
// parameters  --   double monthlyInterestRate
//
// return value -- none
//-----------------------------------------------------------------
    public SavingsAccount(double monthlyInterestRate)
    {
        // divide by 12 to get monthly
        this.monthlyInterestRate = (monthlyInterestRate);

    }// end SavingsAccount contructor



// ----------------------------------------------------------------
// calculateMonthlyInterestPayment -- calculate the monthly interest payment
//                                    also update the balance adding the payment
// parameters  --   none
//
// return value -- none
//-----------------------------------------------------------------
    public void  calculateMonthlyInterestPayment()
    {
        // logic to calculate interest payment
      
        monthlyInterestPayment = balance * monthlyInterestRate;

        // also calculate new balance

        balance += monthlyInterestPayment;

    }// end monthlyInterestPayment

// ----------------------------------------------------------------
// getMonthlyInterestPayment -- get the monthly interest payment
// parameters  --   none
//
// return value -- double balance
//-----------------------------------------------------------------
    public  double getMonthlyInterestPayment()
    {

        return monthlyInterestPayment;

    }// end getAccountBalance




}// end public class SavingsAccount
