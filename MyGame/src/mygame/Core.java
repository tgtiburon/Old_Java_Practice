
package mygame;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Tony
 */
public abstract class Core
{
    private static DisplayMode modes[] =
 {
            new DisplayMode(1024,768,32,0),
            new DisplayMode(1024,768,24,0),
            new DisplayMode(1024,768,16,0),
            new DisplayMode(800,600,32,0),
            new DisplayMode(800,600,24,0),
            new DisplayMode(800,600,16,0),
    }; // end DisplayMode
    private boolean running; // says if gameloop is running
    protected ScreenManager s;

    // public void stop()
    public void stop()
    {
        running = false; //breaks out of main loop
    } // end stop()
    //call init and gameloop
    public void run()
    {
        try
        {
            init();
            gameLoop();
        }finally
        {
            s.restoreScreen();//exit full screen
        }


    }//end run()
    public void init()
    {
        s=new ScreenManager();
        DisplayMode dm = s.findFirstCompatibleMode(modes);
        s.setFullScreen(dm);

        Window w = s.getFullScreenWindow();
        w.setFont(new Font("Arial",Font.PLAIN,20));
        w.setBackground(Color.green);
        w.setForeground(Color.white);
        running = true;


    }// end init()
    public void gameLoop()
    {
        long startTime = System.currentTimeMillis();
        long cumTime = startTime;
        while (running)
        {
            long timePassed = System.currentTimeMillis() - cumTime;
            cumTime += timePassed;

            update(timePassed);

            Graphics2D g = s.getGraphics();
            draw(g);
            g.dispose();
            s.update();

            try{
                Thread.sleep(20);
            }catch(Exception ex) {}//do nothing with exception

            }//end while

        }// end gameloop
    //update animation
    public void update(long timePassed)
    {
       // we will override all  these methods so empty is fine
    }// end update

    // draw method to screen
    public abstract void draw(Graphics2D g);


    }//end core


