/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package depositcalc;

/**
 *
 * @author Tony
 */
public class FixedTermDeposit
{
    private double deposit; // stores the deposit amount
    private double interestRate; // stores interest rate
    private int termLength; // term length
    private static final int  DAYS_IN_YEAR = 365;

    // put logic here
    public double calculateSavings()
    {
        return deposit + deposit * interestRate / 100 * termLength / DAYS_IN_YEAR;
    }// end calculateSavings()
    public double getDeposit()
    {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTermLength() {
        return termLength;
    }

    public void setTermLength(int termLength) {
        this.termLength = termLength;
    }

}// End of class FixedTermDeposit
