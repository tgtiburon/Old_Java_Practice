 /**
 * Project: Project 5
 * Author: Tony Gendreau
 * Date: March 14, 2011
 */

package project5;

import java.util.Scanner;
import java.text.NumberFormat;



public class Project5
{

    public static void main(String[] args) {

         // Add eric for capture
        new eric.Console();
      //Welcome to program
        System.out.println("Welcome to the Loan Calculator");


       
        // Print a blank line
        System.out.println();
        // Make a scanner to read the keyboard
        Scanner sc = new Scanner(System.in);
        String choice = "y";
       // boolean isChoiceValid = false;//to validate the continue? (y/n)

         // While loop to allow for people to repeat the program
         while (choice.equals("y"))
         {
              System.out.println("DATA ENTRY");
               // Ask for  loan amount between 0 and 1,000,00 in decimal
              double loanAmount = getDoubleWithinRange(sc, "Enter "
                      + "loan amount:               ", 0,1000000);
              // Ask user for interest rate between 0 and 20 in decimal
              double interestRate = getDoubleWithinRange(sc,"Enter "
                      + "interest rate:             ", 0,20);

              // Ask user for Number of years between 0 and 100 in integer
              int numYears = getIntWithinRange(sc,"Enter "
                      + "number of years:           ",0,100);

            // Calculate monthlypayment
             double monthlyPayment = getMonthlyPayment(loanAmount,interestRate,
                                numYears);

            



          


           //
           // PRINT RESULTS
           //
          
           // Print out blank line and title of results
           System.out.println();
           System.out.println("FORMATTED RESULTS");

           // Format and Print out Loan Amount
           NumberFormat currency = NumberFormat.getCurrencyInstance();      
           String loanAmountString = currency.format(loanAmount);
           System.out.println("Loan amount:                 "+loanAmountString );

           // Format and Print out interest rate
           NumberFormat percent = NumberFormat.getPercentInstance();
           percent.setMinimumFractionDigits(1);
           String interestRateString = percent.format(interestRate/100);
          
           System.out.println("Yearly interest rate:        "+ interestRateString);

           // Format and print Print out number of years
           System.out.println("Number of years:             "+ numYears);

           // Format and Print  out Montly Payment
           String monthlyPaymentString = currency.format(monthlyPayment);
           System.out.println("Monthly Payment:             " +monthlyPaymentString);
          
           

           
           // Print a blank  line
            System.out.println();

           // see if the user wants to continue and validate data
           
            do
            {
                // Ask user if they want to continue
                System.out.print("Continue? (y/n):   ");
                // Store answer into choice
                choice = sc.nextLine();

                  if(choice.equals("y") || choice.equals("n"))
                {
                      // print a blank line and exit the do while
                    System.out.println();
                    break;
                }// end if
                    // if person typed nothing and hit enter print error
                if (choice.isEmpty() )
                    {
                    
                        System.out.println("Error! This entry is required. Try again.");
                        
                      
                
                    }//end if
                // if person typed something other then n or y print error
                  else if (!choice.equals("y") || !choice.equals("n"))
                    {
                        System.out.println("Error! Entry must be a 'y' or 'n'."
                                + " Try Again.");
                        
                    
                    }//end else if
            
                    
              
            }
            while(!choice.equals("y") || !choice.equals("n"));// end choice while loop
            

         }// end while
      


    }// end main


// ----------------------------------------------------------------
// getDoubleWithinRange -- get and validate a double from the user
//                         including a range
// parameters  --   scanner,String prompt, min ,and max allowed numbers
//
// return value -- d a decimal that has been verified
//-----------------------------------------------------------------

  public static double getDoubleWithinRange(Scanner sc, String prompt,
    double min, double max)
    {
        double d = 0;
        boolean isValid = false;
        boolean isValid2 = false;
         while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
                 while (isValid2 == false)
                {
                    //d = getDouble(sc, prompt,min,max);
                    if (d <= min)
                         {
                            System.out.println(
                            "Error! Number must be greater than " + min);
                           
                            isValid = false;
                            break;
                         }
                    else if (d >= max)
                         {
                            System.out.println(
                             "Error! Number must be less than " + max);
                            isValid = false;
                            break;
                         }
                    else
                            isValid2 = true;
                }
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
       
        return d;
    }

// ----------------------------------------------------------------
// getIntWithinRange -- get and validate a int from the user, including a
//                       particular range
// parameters  --   scanner and String prompt and the min and max allowed numbers
//
// return value -- i an integer that has been verified
//-----------------------------------------------------------------

  public static int getIntWithinRange(Scanner sc, String prompt,
    int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        boolean isValid2 = false;
         while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
                 while (isValid2 == false)
                {
                   
                    if (i <= min)
                         {
                            System.out.println(
                            "Error! Number must be greater than " + min);
                            //isValid = false;
                            isValid = false;
                            break;
                         }
                    else if (i >= max)
                         {
                            System.out.println(
                             "Error! Number must be less than " + max);
                            isValid = false;
                            break;
                         }
                    else
                            isValid2 = true;
                }
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }

        return i;
    }
// ----------------------------------------------------------------
// getMonthlyPayment -- get and validate a int from the user, including a
//                       particular range
// parameters  --   loanAmt, interestRt, numYears
//
// return value -- a double that shows montlypayment
//-----------------------------------------------------------------

  public static  double  getMonthlyPayment(double loanAmt, double interestRt, int numYrs)
    {
    
        double d = 0;
        // Convert it to montly interest rate
        interestRt = interestRt/12/100;
       /// System.out.println("Interest Rate: " +interestRt);
        d = loanAmt * interestRt/(1-1/Math.pow(1+interestRt,(numYrs *12)));




        return d;
    }

}// end project5
