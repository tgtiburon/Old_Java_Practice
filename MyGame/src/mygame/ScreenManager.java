

package mygame;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JFrame;


/**
 *
 * @author Tony
 */
public class ScreenManager
{
    private GraphicsDevice vc; // object to video card
    
    //Constructor for ScreenManager
    public ScreenManager() 
    {
        // give bc access to monitor
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        vc = e.getDefaultScreenDevice();
        
    }//end public ScreenManager()
    // get all compatible display modes from graphics card
    public DisplayMode[] getCompatibleDisplayModes() 
    {
        return vc.getDisplayModes();
        //returns an array of all the displaymodes the graphics device has
        
    }// end public DisplayMode[]
    
    // compares Displaymode passes into vc display modes and see if they match
    public DisplayMode findFirstCompatibleMode(DisplayMode modes[]) 
    {
        DisplayMode goodModes[] = vc.getDisplayModes();
        // Logic below compares our modes to the graphcis cards
        for(int x=0;x<modes.length;x++)
        {
            for(int y=0;y<goodModes.length;y++)
            {
                //compare mode we passed in to mode built in to graphics card
                if(displayModesMatch(modes[x],goodModes[y]))
                {
                    // if they match send modes[x] since they  are equal
                    // returns the modes[x]
                    return modes[x];
                }// end if(displayModesMatch)
                
            }//end for y=0
        }// end for(int x
        return null;
    }// end Public DisplayMode
    //get current Display Mode
    public DisplayMode getCurrentDisplayMode()
    {
       return vc.getDisplayMode();

    }//end public DisplayMode

    //compare our display modes to the graphics cards
    public boolean  displayModesMatch(DisplayMode m1, DisplayMode m2)
    {
        // check widths
        if (m1.getWidth() != m2.getWidth() || m1.getHeight() != m2.getHeight())
        {
            return false;
        }//end if(m1.getwidth
        // check the bitdepth
        if(m1.getBitDepth() != DisplayMode.BIT_DEPTH_MULTI && m2.getBitDepth()
                != DisplayMode.BIT_DEPTH_MULTI && m1.getBitDepth() != m2.getBitDepth() )
        {
            return false;
        }// end if(m1.getbit
        //check refreshrate
        if(m1.getRefreshRate() != DisplayMode.REFRESH_RATE_UNKNOWN && m2.getRefreshRate()
                != DisplayMode.REFRESH_RATE_UNKNOWN && m1.getRefreshRate() != m2.getRefreshRate())
        {
            return false;
        }
        // all tests passed...must match displaymode
        return true;

    }// end public boolean displayModesMatch

    // make frame full screen
    public void setFullScreen(DisplayMode dm)
    {
        JFrame f = new JFrame();
        f.setUndecorated(true); // undecorate window
        f.setIgnoreRepaint(true);
        f.setResizable(false);
        vc.setFullScreenWindow(f); // set the frame we made to full screen

        if(dm != null && vc.isDisplayChangeSupported())
        { //try and change display mode
            try
            {
                vc.setDisplayMode(dm);

            }// end try
            catch(Exception ex)
             {

            }//end catch
        }// end if
        f.createBufferStrategy(2);//double  buffer


    }//end setFullScreen

    //we will set Graphics object = to this
    public Graphics2D getGraphics()
    {
        Window w = vc.getFullScreenWindow();// store full screen into w
        if(w != null)
        {
           BufferStrategy s = w.getBufferStrategy();
           return(Graphics2D)s.getDrawGraphics();
        }// if(w !=
        else
        {
            // did not return window with graphics
            return null;
        }//end else
    }// end public Graphics2D

    // updates display
    public void update()
    {
        Window w = vc.getFullScreenWindow();
        if (w != null)//if you see something
        {
            BufferStrategy s = w.getBufferStrategy();
            // only shows contents if it's good
            if(!s.contentsLost())
               {
                    s.show();
               }
        }// end if
    }// end public void update

    //return full screen window
    public Window getFullScreenWindow()
    {
        return vc.getFullScreenWindow();
    }// end Window

    public int getWidth()
    {
        Window w = vc.getFullScreenWindow();
        if(w != null)
        {
            return w.getWidth();
        }// end if
        else
        {
            return 0;
        }// end else
    } // end public int getwidth

    public int getHeight()
    {
        Window w = vc.getFullScreenWindow();
        if(w != null)
        {
            return w.getHeight();
        }// end if
        else
        {
            return 0;
        }// end else
    } // end public int getHeight

    //Get out of full screen
    public void restoreScreen()
    {
        Window w = vc.getFullScreenWindow();
        if (w!= null)
        {
            w.dispose();
        }
        vc.setFullScreenWindow(null);
    }// end public void restorescreen

    // create image compatible with monitor
    public BufferedImage createCompatibleImage(int w, int h, int t)
    {
        Window win = vc.getFullScreenWindow();
        if(win != null)
        {
            //gets characteristics of window
           GraphicsConfiguration gc = win.getGraphicsConfiguration();
           return gc.createCompatibleImage(w,h, t);

        }// end if
        return null; // if things go bad return nothing
    }// end BufferedImage
    
}// end public class ScreenManager
