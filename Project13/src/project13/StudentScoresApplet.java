/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project13;

import javax.swing.JApplet;
import javax.swing.JPanel;

 
public class StudentScoresApplet extends JApplet
{
    
    public void init()
    {
        //Make the panel and add it
        JPanel panel = new StudentScoresPanel();
        this.add(panel);
    }
    
    
    
}//end StudentScoresApplet
