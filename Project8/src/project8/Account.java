// Assign 8 CITP 190

/**
 * Project: Project 8
 * Author: Tony Gendreau
 * Date: April 5, 2011
 */

package project8;



public abstract class Account implements Depositable, Withdrawable, Balanceable
{
    // instance variable
    double balance;


// ----------------------------------------------------------------
// deposit -- deposit money into the account
// parameters  --   double amount
//
// return value -- none
//-----------------------------------------------------------------
    public void deposit(double amount)
    {
        balance += amount;

    }// end deposit


 // ----------------------------------------------------------------
// withdraw -- withdraw money from the account
// parameters  --    double amount
//
// return value -- none
//-----------------------------------------------------------------
    public void withdraw(double amount)
    {
        balance -= amount;
    }// end withdraw


// ----------------------------------------------------------------
// getBalance -- return the balance of the account
// parameters  --   Depositable account, double amount
//
// return value -- none
//-----------------------------------------------------------------
    public double getBalance()
    {
        return balance;
    }// end getBalance


// ----------------------------------------------------------------
// setBalance -- set how much money is in the account
// parameters  --   Depositable account, double amount
//
// return value -- none
//-----------------------------------------------------------------
    public void setBalance(double amount)
    {
        balance = amount;
        
    }// end setBalance



}// end public class Account
