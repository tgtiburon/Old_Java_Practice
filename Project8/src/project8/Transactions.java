// Assign 8 CITP 190

/**
 * Project: Project 8
 * Author: Tony Gendreau
 * Date: April 5, 2011
 */


package project8;



public class Transactions
{




// ----------------------------------------------------------------
// deposit -- deposit money into the account
// parameters  --   Depositable account, double amount
//
// return value -- none
//-----------------------------------------------------------------
    public static void deposit(Depositable account, double amount)
    {
        account.deposit(amount);

    }// end deposit



// ----------------------------------------------------------------
// withdraw -- withdraw money from the account
// parameters  --   Withdrawable account, double amount
//
// return value -- none
//-----------------------------------------------------------------
    public static void withdraw(Withdrawable account, double amount)
    {
        account.withdraw(amount);
    }// end withdraw

}// end public class Transactions
