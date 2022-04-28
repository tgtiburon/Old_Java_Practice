/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package game1;

import javax.swing.*;
/**
 *
 * @author Tony
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        // this is how many .5 seconds the user gets
        int difficulty;
        // new eric.Console();
        difficulty = Integer.parseInt(JOptionPane.showInputDialog("How good are "
                + "you?\n" + "1 = Genius like me...\n" + "10 = Paste Eater"));
        // this will tell the loop whether to continue or not:
        boolean cont = false ;
        
        // the contents of the main method are about to be enclosed
        // in a do while loop....
        do
        {
            //reset cont  to false
            cont = false;
            
            //random numbers for the equation
            double num1 = (int)(Math.round(Math.random()*10));
            
            //this do..while loop prevents exceptions
            //num2 must be declared outside of the do while so
            // the "while" part can see it.  It will be initialized
            // inside the  do part, though
          
            double num2;
            do
            {
                  // intit num2
            num2 =(int)(Math.round(Math.random()*10));

            }// end second do
            while(num2==0.0); // if it is 0 do it again
            //random number for the sign
            int sign = (int)(Math.round(Math.random()*3));
            // will store the answer
            double answer = 0;

            //make stuff noticable
            System.out.println("\n\n*****");

            if(sign==0)
            {
                // tell user to calculate answer
                System.out.println(num1+" times " +num2);
                answer=num1*num2;

            }
            else if (sign==1)
            {
                 // tell user to calculate answer
                System.out.println(num1+" divided by " +num2);
                answer=num1/num2;
            }
         else if (sign==2)
            {
                 // tell user to calculate answer
                System.out.println(num1+" plus " +num2);
                answer=num1+num2;
            }
          else if (sign==3)
            {
                 // tell user to calculate answer
                System.out.println(num1+" minus " +num2);
                answer=num1- num2;

            }
              else if (sign==1)
            {
                 // tell user to calculate answer
                System.out.println(num1+" % " +num2);
                answer=num1%num2;
            }

            // make  it easier to read
            System.out.println("*****\n");

            // count down difficulty ..use a for loop
            for(int i = difficulty;i>=0;i--)
            {
                   // count down at double speed
                System.out.println(i+ ".....");

                //instead of waiting a second
                //this time only wait 1/2 second
                // per difficulty level
                Thread.sleep(500);

            }// end for
            //print the answer
            System.out.println("Answer: " + answer);

            // ask user if he wants to play again
            String again;
            again = JOptionPane.showInputDialog("Play Again?");
            // if user says yes set cont to true
            if(again.equals("yes")) cont = true;



            
        }// end do
        while(cont); // Keep going until false
        
        // TODO code application logic here
    }// Main

}// end Game1
