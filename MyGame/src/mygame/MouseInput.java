

package mygame;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;


/**
 *
 * @author Tony
 */
public class MouseInput extends Core implements KeyListener, MouseMotionListener,
        MouseListener, MouseWheelListener
{
    public static void main(String[] args)
    {
        new MouseInput().run();



    }// end main()

    private String message = "";
    //init method calls super init
    public void init()
    {
        super.init();
        Window w = s.getFullScreenWindow();
        w.addMouseListener(this);// for mouse buttons
        w.addMouseMotionListener(this);// for mouse movement
        w.addMouseWheelListener(this);// for center wheel
        w.addKeyListener(this);// for escape key to exit game


    }
    //draw
    public synchronized void draw (Graphics2D g )
    {
        Window w = s.getFullScreenWindow();
        g.setColor(w.getBackground());
        g.fillRect(0,0,s.getWidth(),s.getHeight());
        g.setColor(w.getForeground());
        g.drawString(message,40,50);
        
    }

    // mouse listener interface
    public void mousePressed(MouseEvent e)
    {
        message = "you pressed down the mouse";

    }//end MousePressed()
    public void mouseReleased(MouseEvent e )
    {
        message = "you released the mouse";

    }// end mouseReleased()
    // make a blacnk mouseclicked or it screws up the ones above for now
    public void mouseClicked(MouseEvent e )
    {
        // blank
    }//end mouseClicked()

    public void mouseEntered(MouseEvent e)
    {
        //blank
        // useless w/ full screen
    }// end mouseEntered
    public void mouseExited(MouseEvent e)
    {
        //blank
        // useless w/ full screen
    }// end mouseExited()

    //mouse motion interface
    //mouse button held and dragged
    public void mouseDragged(MouseEvent e)
    {
        message = "you are dragging the mouse";

    }//end mouseDragged()
    //mouse moved but button not held
    public void mouseMoved(MouseEvent e)
    {
        message = "you are moving the mouse";


    }//end mouseMoved()

    // wheel interface
    public void mouseWheelMoved(MouseWheelEvent e)
    {
        message = "moving mouse wheel";

    }

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


}// end MouseInput()
