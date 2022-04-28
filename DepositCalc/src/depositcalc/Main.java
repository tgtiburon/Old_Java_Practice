/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package depositcalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Tony
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FixedTermDeposit ftd = new FixedTermDeposit();
        // a hot mess

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // ask user for amount deposited
        System.out.println("Enter the amount deposited: ");
        // uses try and catch for this problem
        try {
            ftd.setDeposit(Double.valueOf(br.readLine()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Enter the interest rate, %: ");
        // uses try and catch for this problem
        try {
            ftd.setInterestRate(Double.valueOf(br.readLine()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Enter the term length, days: ");
        // uses try and catch for this problem
        try {
            ftd.setTermLength(Integer.valueOf(br.readLine()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        // Lets print the final amount

        System.out.println("Your total saving: " + ftd.calculateSavings());


    }// end oof main method
}// end of Main class

