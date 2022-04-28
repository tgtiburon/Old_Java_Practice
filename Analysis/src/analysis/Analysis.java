/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package analysis;
import java.util.Scanner;

/**
 *
 * @author Tony
 */
public class Analysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        // create scanner
        Scanner input = new Scanner(System.in);

        // initialization of variables
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        int result; // one exame result gets value from user
        // process 10 students usiing counter controlled loop
        while(studentCounter<= 10)
        {
           // prompt user for input and obtain value from user
            System.out.printf("Enter result (1=pass, 2=fail):");
            result = input.nextInt();

            // if...else nested in while
            if (result == 1) // passed
                passes = passes +1;
            else
                failures = failures + 1;

            // increment studentCounter so loops eventually ends
            studentCounter = studentCounter+1;


        }// end while

        // termination phase: prepare and display results
        System.out.printf("Passed: %d\nFailed: %d\n",passes, failures);

        // determine whether more than 8 students passed
        if (passes > 8)
            System.out.printf("Bonus to instructor!");

    }// end main

}// end class analyysis
