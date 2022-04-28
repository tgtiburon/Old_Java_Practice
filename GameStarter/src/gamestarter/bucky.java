
package gamestarter;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Tony
 */
public class bucky
{
    public static void main(String args[])
    {
        DisplayMode dm= new DisplayMode(800,600,32,DisplayMode.REFRESH_RATE_UNKNOWN);
        bucky b = new bucky();
        b.run(dm);



    }// end main



    private Screen screen;
    private Image bg;
    private Animation animation;

    public void loadPics()
    {
        bg = new ImageIcon("C:\\JavaStuff\\ST.jpeg").getImage();
        Image face1 =  new ImageIcon("C:\\JavaStuff\\face1.jpeg").getImage();
        Image face2 =  new ImageIcon("C:\\JavaStuff\\face2.jpeg").getImage();
        animation = new Animation();
        animation.addScene(face1,250);
        animation.addScene(face2,250);


    }// end loadPics
    //main engine to run
    public void run(DisplayMode dm)
    {
        screen = new Screen();
        try {
            screen.setFullScreen(dm, new JFrame());
            loadPics();
            movieLoop();
        }finally {
            screen.restoreScreen();
        }

    }// end run
    // main movie loop
    public void movieLoop()
    {
        long startingTime = System.currentTimeMillis();
        long cumTime = startingTime;

        while(cumTime - startingTime < 5000) // runs for 5 sec
        {
            // timepassed = currenttime - cumulative time
            long timePassed = System.currentTimeMillis() -cumTime;
            cumTime += timePassed;
            animation.update(timePassed);
            // keeps totalling cumulative time each pass through

            Graphics g = screen.getFullScreenWindow().getGraphics();
            draw(g);
            g.dispose();

            try{
                Thread.sleep(20); // let system breath
            } catch (Exception ex) {}


        }// end while
    }// end movieLoop
    public void draw(Graphics g)
    {
        g.drawImage(bg,0,0,null);
        g.drawImage(animation.getImage(),0,0,null);  // draw current image

    }// end draw
}// end bucky

