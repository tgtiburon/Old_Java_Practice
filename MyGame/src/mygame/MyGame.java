

package mygame;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Tony
 */
public class MyGame
{
    public static void main(String args[])
    {
        DisplayMode dm= new DisplayMode(800,600,32,DisplayMode.REFRESH_RATE_UNKNOWN);
        MyGame mg = new MyGame();
        mg.run();
        
        
        

    }// end main

        private Animation a;
        private ScreenManager s;
        private Image bg;

        private static final DisplayMode modes1[] =
        {
            new DisplayMode(1024,768,32,0),
            new DisplayMode(1024,768,24,0),
            new DisplayMode(1024,768,16,0),
            new DisplayMode(800,600,32,0),
            new DisplayMode(800,600,24,0),
            new DisplayMode(800,600,16,0),




         }; // END DISPLAYMODE

        //load images and add scenes
        public void loadImages()
       {
            bg = new ImageIcon("C:\\Javastuff\\ST.jpeg").getImage();
            Image face1 =  new ImageIcon("C:\\Javastuff\\face1.jpeg").getImage();
            Image face2 =  new ImageIcon("C:\\Javastuff\\face2.jpeg").getImage();

            a = new Animation(); // now we can add animation from animation class
            a.addScene(face1,250);
            a.addScene(face2,250);

        }// end loadImages

        //main method called from main
        public void run()
    {
            s = new ScreenManager();// now we can use crap from screenmanager class
            try
            {
                DisplayMode dm = s.findFirstCompatibleMode(modes1);
                s.setFullScreen(dm);
                loadImages();
                movieLoop();

            }// end try
           // catch
           // {


            //}// end catch
          finally
          {
              s.restoreScreen();
          }//end finally

         }//end public void run

    // play movie now
        public void movieLoop()
       {
            long startingTime = System.currentTimeMillis();
            long cumTime = startingTime;
            while(cumTime - startingTime < 5000)
            {
                long timePassed = System.currentTimeMillis() - cumTime;
                cumTime += timePassed;
                a.update(timePassed);

                // draw and update screen
                Graphics2D g = s.getGraphics();
                draw(g);
                g.dispose();
                s.update();
                try {
                    Thread.sleep(20);
                } catch(Exception ex) {}

            }// end while
        }// end movieLoop

        //draws graphics
        public void draw(Graphics g)
         {
            g.drawImage(bg,0,0,null);
            g.drawImage(a.getImage(),0,0,null); //get appropriate image
          }// end draw



    
}// end MyGame


