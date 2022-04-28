
package gamestarter;

import java.awt.*;
import javax.swing.JFrame;



public class Screen
{
    private GraphicsDevice vc; // gives an interface to video card

    // constructor
    public Screen()
    {
        //env is environment variable...all graphics control objects
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        vc = env.getDefaultScreenDevice(); //have access to comp.Screen


    }//end Screen()
    public void setFullScreen(DisplayMode dm, JFrame window){
        window.setUndecorated(true); // nothing but window
        window.setResizable(false);
        vc.setFullScreenWindow(window);//takes  window and makes it full screen

        // if display mode is there and display can change then do following
        if(dm != null  && vc.isDisplayChangeSupported())
        {
            try{
                vc.setDisplayMode((dm)); //try and set the new display mode

            } catch(Exception ex){}//it failed but do nothing
        }

    }// end setFullScreen

    //method to return the window
    public Window getFullScreenWindow(){
        return vc.getFullScreenWindow();
    }
    //method return screen to normal
    public void restoreScreen(){
        Window w = vc.getFullScreenWindow();
        if(w != null){
            w.dispose();//releases resources back after  getting rid of window

        }
        vc.setFullScreenWindow(null); //takes away full screen

    }

 //  public static void main(String[] args)
 //   {



   // }// end main

}// end public class Screen