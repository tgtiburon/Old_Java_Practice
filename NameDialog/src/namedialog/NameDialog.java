/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package namedialog;


import javax.swing.JOptionPane;


/**
 *
 * @author Tony
 */
public class NameDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //prompt user to input name
        String name =
                JOptionPane.showInputDialog("What is your name?");
      // create the message
        String message =
                String.format("Welcome %s, to Java Programming!", name );

        // display the message
        JOptionPane.showMessageDialog(null, message);

    }// end main

}// end class NameDialog
