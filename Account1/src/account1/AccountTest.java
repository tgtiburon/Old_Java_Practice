/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//inputting and outputting floating point  numbers with account
// objects

package account1;

import java.util.Scanner;

/**
 *
 * @author Tony
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    // main method begins execution of java application
    public static void main(String[] args) {
        // TODO code application logic here
        Account account1 = new Account(50.00); //create account object
        Account account2 = new Account(-7.53); //create account object

        // display initial balance of each object
        System.out.printf("account1 balance: $%.2f\n",
                account1.getBalance());
        System.out.printf("Account2 balance: $%.2f\n",
                account2.getBalance());

        // create scanner to obtain input from command window
        Scanner input = new Scanner(System.in );
        double depositAmount;// deposit amount read from user
        System.out.printf("Enter deposit amount for Account1: ");//prompt
        depositAmount = input.nextDouble(); //obtain user input
        System.out.printf("\nAdding %.2f to account1 balance\n\n",
                depositAmount);
        // add amount to account1 balance
        account1.credit(depositAmount);
        //display balance
        System.out.printf("Account1 balance: $%.2f\n",
                account1.getBalance());
        System.out.printf("Account2 balance: $%.2f\n\n",
                account2.getBalance());

        System.out.printf("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble(); //obtain user input
        System.out.printf("\nadding %.2f to account2 balance\n\n",
                depositAmount);
        account2.credit(depositAmount); //add to account2 balance

        //display balances
        System.out.printf("Account1 balance: $%.2f\n",
                account1.getBalance());
        System.out.printf("Account2 balance: $%.2f\n\n",
                account2.getBalance());
        



    }// end Main

}// end class AccountTest
