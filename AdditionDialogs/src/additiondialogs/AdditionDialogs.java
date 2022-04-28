/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package additiondialogs;

import javax.swing.JOptionPane;

/**
 *
 * @author Tony
 */
public class AdditionDialogs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
      // Set up the variables
        int number1;
        int number2;
        int sum;

        // prompt user for first and second numbers
        String strNumber1 =
                JOptionPane.showInputDialog("Enter the first number:");
        String strNumber2 =
                JOptionPane.showInputDialog("Enter the second number: ");
        //need to convert the strings to integers
        number1 = Integer.parseInt(strNumber1);
        number2 = Integer.parseInt(strNumber2);
        // do the math
        sum = number1+number2;
        // make the answer string
        String message = String.format("The answer is: %d", sum);
        // display the answer
        JOptionPane.showMessageDialog(null, message);



        


    }// end Main

}// end Class AdditionDialogs
