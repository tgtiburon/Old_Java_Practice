
package mygame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author Tony
 */
public class Look extends Core implements MouseMotionListener, KeyListener {
    public static void main(String[] args)
    {
        new Look().run();
    }// end main()
    
    private Image bg; // background
    private Robot robot; // robot class?
    private Point mouse; // mouse location
    private Point center;//center of screen
    private Point image; // background image
    private boolean centering; //mouse in center of screen

    //init
    public void init()
    {
        super.init();
        mouse = new Point();
        center = new Point();
        image = new Point();
        centering = false;

        try
        {
            robot = new Robot();
            recenterMouse();// used to recenter the mouse
            mouse.x = center.x; //center of screen
            mouse.y = center.y;

        } catch(Exception ex)
        {
            System.out.println("Exception 1");
        }//end catch

        Window w = s.getFullScreenWindow();
        w.addMouseMotionListener(this);
        w.addKeyListener(this);
        bg = new ImageIcon("C:\\Javastuff\\ST.jpeg").getImage();

    }// end init()
    // draw
    public synchronized void draw(Graphics2D g)
    {
        int w = s.getWidth();// screen width
        int h = s.getHeight();// screen height

        image.x %= w;
        // if location image x is less then screen
        // will use image width, if it's more than screen then will give
        // amount left over  If image = 700 and screen 1000 it will equal 700
        // if image = 1000 and screen 700, will equal 300
        image.y %= h;
        // makes sure to keep image in screen
        if(image.x < 0)
        {
            image.x += w;
        }
        if(image.y < 0)
        {
            image.y += h;
        }

        int x = image.x;
        int y = image.y;
        //drawing 4 tiles
        g.drawImage(bg,x,y,null);
        g.drawImage(bg,x-w,y,null); // left a width
        g.drawImage(bg,x,y-h,null); // above a heightt
        g.drawImage(bg,x-w,y-h,null); // left and up a height and width



    }// end draw

    //recent the mouse using robot
    private synchronized void recenterMouse()
    {
        Window w = s.getFullScreenWindow();
        if(robot!= null && w.isShowing())//we have a robot and window is showing
        {
            center.x = w.getWidth()/2; // half screen width
            center.y = w.getHeight()/2; // half screen height
            // takes point and converts it to w's center
            SwingUtilities.convertPointToScreen(center, w);
            centering = true;
            robot.mouseMove(center.x,center.y); // move mouse to center screen



        }//end if
    }// end recenterMouse()
    // mousemotion listener method
    public void mouseDragged(MouseEvent e)
    {
        mouseMoved(e);
    }
    public synchronized void mouseMoved(MouseEvent e)
    {
        // if mouse is already centered
        if(centering && center.x == e.getX() && center.y == e.getY())
        {
            centering = false; // done centering
        }//end if
        else
        {
            int dx = e.getX() - mouse.x; // distance mouse moved
            int dy = e.getY() - mouse.y; // distance moved y
            image.x += dx;
            image.y += dy;
            recenterMouse();

        }//end else
        mouse.x = e.getX();//set mouse points to where mouse actually is
        mouse.y = e.getY();

    }//end mouseMoved()

    // keylistner interface
    public void keyPressed(KeyEvent e )
    {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            stop();//inherited
        }//end if
    }// end keyPressed(()
    //do nothing with these
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}


}//end look
