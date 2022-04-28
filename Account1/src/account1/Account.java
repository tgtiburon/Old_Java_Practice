/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
// Account class with a constructor to validate and
// initialize instance variable balace of type double
package account1;

/**
 *
 * @author Tony
 */
public class Account
{
private double balance; //instance variable that stores balance
// constructor
public Account (double intitialBalance)
    {// To call use Account 100   to setup an account with 100.00 dollars
    // validate initialBalance is greater than 0.0
    // if it  is not, balance iis initialized to default of 0.0
    if(intitialBalance>0.0)
        balance = intitialBalance;
}// end Account constructor
    // credit (add) an amount to the account
public void credit(double amount)
    {
    balance = balance + amount; // add amount to balance
}// end method credit
//retuurn the account balance
public double getBalance()
    {
    return balance; // gives value of balance to calling method
}// end method getBalance
}// end account
