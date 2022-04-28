
package mygame;
import java.awt.Image;

/**
 *
 * @author Tony
 */
public class Sprite
{
    // we want sprit to move around screen and be animated (eyes blinking)
    private Animation a;
    private float x;// need float so we can move 1/10th of a pixel if needed
    private float y;
    private float vx; //velocity of x
    private float vy; // velocity of y


    //constructor
    public Sprite(Animation a)
    {
        //set this object equal to the object that was passed to it
        this.a=a;

    }// end of Sprite constructor

    // change position
    public void update(long timePassed)
    {
        // x =  x + (velocity *  delta time)
        x += vx *timePassed;
        y += vy * timePassed;
        // Where in animation should we be?
        // eyes open eyes closed?
        a.update(timePassed);




    }// end update

    // get x position of sprite
    public float getX()
    {
        return x;
    }//end getX()
    //get y position of sprite
    public float getY()
    {
        return y;
    }// end getY()

    //set sprite x pos
    public void setX(float x)
    {
        this.x = x;

    }//end setX
     //set sprite y pos
    public void setY(float y)
    {
        this.y = y;

    }//end setY
    // get the sprites width and height
    public int getWidth()
    {
        // gives you the width of the image
        return a.getImage().getWidth(null);

    }// end getWidth()

        public int getHeight()
    {
        // gives you the height of the image in pixels
        return a.getImage().getHeight(null);

    }// end getHeight()

     //get horizontal velocity
        public float getVelocityX()
    {
            return vx;

    }// end getVelocityX
         //get vertical velocity
        public float getVelocityY()
    {
            return vy;

    }// end getVelocityY

     //set horizontal velocity
        public void setVelocityX(float vx)
    {
            this.vx = vx;

        }//end setVelocityX
         //set vertical velocity
        public void setVelocityY(float vy)
    {
            this.vy = vy;

        }//end setVelocityY

        //get sprite /  image
        public Image getImage()
       {
         return a.getImage();
        }// end getImage()

}// end sprite
