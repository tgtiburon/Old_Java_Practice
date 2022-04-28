

package mygame;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 *
 * @author Tony
 */
// inherits everything from core
// implements KeyListener to get info from user
public class KeyTest extends Core implements KeyListener
{
    public static void main(String[] args)
    {
        new KeyTest().run();
    }// end Main()
    private String message = "";


    // init also call init from superclass
    public void init()
    {
        super.init();
        Window w = s.getFullScreenWindow();
        // make tab and other control buttons act like normal buttons
        w.setFocusTraversalKeysEnabled(false);
        //add the keyListner to window
        w.addKeyListener(this) ;
        message = "press escape to exit";


    }// end init

    // keypPressed
    public void keyPressed(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        if(keyCode == KeyEvent.VK_ESCAPE)
        {
            // Player wants to exit
            stop();

        }// end keyCode Escape
        else
        {
            message = "Pressed: " + KeyEvent.getKeyText(keyCode);
            //stops alt ctrl etc from waiting for next key
            // alt is just alt..not a modifier
            e.consume();
        }// end else

    }//end keyPressed()
    // key is released
    public void keyReleased(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        // change method
        message = "Released: " + KeyEvent.getKeyText(keyCode);
        e.consume();

    }// end keyReleased()

    // last method from interface

    // not used for games...so ignore and eat key
    public void keyTyped(KeyEvent e)
    {
        e.consume();
    }// end keyTyped

    //draw...synchronized can only run by itself for a moment
    public synchronized void draw(Graphics2D g)
    {
        // window = screen
        Window w = s.getFullScreenWindow();
        g.setColor(w.getBackground());
        // color whole window
        g.fillRect(0,0,s.getWidth(),s.getHeight());
        g.setColor(w.getForeground());
        g.drawString(message,30, 30);


    }

}// end KeyTest()
