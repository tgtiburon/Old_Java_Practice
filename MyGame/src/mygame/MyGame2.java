
package mygame;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;


/**
 *
 * @author Tony
 */
public class MyGame2
{
    public static void main(String args[])
    {
        DisplayMode dm= new DisplayMode(800,600,32,DisplayMode.REFRESH_RATE_UNKNOWN);
        MyGame2 mg = new MyGame2();
        mg.run();




    }// end main

        private Sprite sprite;
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

            // create a new sprite object
            // set initial velocities as well
            sprite = new Sprite(a);// use the animation as the sprite
            sprite.setVelocityX(0.3f);
            sprite.setVelocityY(0.3f);

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
                update(timePassed);
                // we update animation because we updated in
                // sprite class

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

            // draw sprite, rounding x and y values to nearest pixels
            g.drawImage(sprite.getImage(),Math.round(sprite.getX()),
                    Math.round(sprite.getY()),null); //get appropriate image
          }// end draw

        //update sprite positioning
        // check if sprite is offscreen and if it is
        //put it back on screen
        public void update(long timePassed)
       {
            // check left and right of object moving and screen
            if(sprite.getX() < 0)
            {
                //reverses the velocity
                sprite.setVelocityX(Math.abs(sprite.getVelocityX()));
               // right edge of image hit right edge of screen
            }else if(sprite.getX()+ sprite.getWidth()> s.getWidth())
            {
                // reverse the velocity
                sprite.setVelocityX(-Math.abs(sprite.getVelocityX()));
            }
            // check up and down of object moving and screen
             if(sprite.getY() < 0)
            {
                //reverses the velocity
                sprite.setVelocityY(Math.abs(sprite.getVelocityY()));
               // right edge of image hit right edge of screen
            }else if(sprite.getY()+ sprite.getHeight()> s.getHeight())
            {
                // reverse the velocity
                sprite.setVelocityY(-Math.abs(sprite.getVelocityY()));
            }
            sprite.update(timePassed);


        }// end update()




}// end MyGame2


