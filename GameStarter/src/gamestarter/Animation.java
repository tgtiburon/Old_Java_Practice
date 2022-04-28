package gamestarter;

import java.awt.Image;
import java.util.ArrayList;

//package GameStarterKit_1_1;


public class Animation
{
    private ArrayList scenes;
    private int sceneIndex;
    private long movieTime; //total time animation is running
    private long totalTime; //total time   is movie>total...need to clip

    // Constructor
    public Animation(){
        scenes = new ArrayList();//makes sure it's fresh
        totalTime = 0;
        start();
    }// end connstructor of Animation

    // add scence to arraylist and setTime for each scene
    public synchronized void addScene(Image i, long t)  
    {
                        // only run this method at a time
                        // so you can't have two things change a variable at 
                        // same time
        totalTime +=t; // total time of all the scenes
        scenes.add(new OneScene(i, totalTime)); // each picture is a scene
        
    }// end addScene
    
    //start animation from beginning
    public synchronized void start()
    {
        movieTime = 0;
        sceneIndex = 0;
        // new scene new movietime..start at first picture
        
    }// end start
    
    // change scenes
    public synchronized void update(long timePassed)
    {
        if(scenes.size()>1){
           //checks to see if  it's animation and not picture
            movieTime += timePassed; // movieTime is sum of all time passed
                                    // since update.
            if (movieTime>= totalTime) {
                // if animation is done before time..then restart animation
                movieTime = 0;
                sceneIndex = 0;
                
                  
            }// end movietime>=totaltime
            while(movieTime> getScene(sceneIndex).endTime)
            
            {
               sceneIndex++;
               
            }//end movietime>getscene
        }// end iff
    
    }// end update
    //get animation current scene (aka image)
    public synchronized  Image getImage()
    {
        if(scenes.size()== 0){
            return null; // nothing in scene..return nothing
        }else{
            return getScene(sceneIndex).pic; //have something in the scene
        }// end if scenes
    }//end getImage
    // get scene
    private OneScene getScene(int x)
    {
        return (OneScene)scenes.get(x);
    }// end onescene
    
    //// private innerclass ////////
    private class OneScene{
        // makes each image its own object
        Image pic;
        long endTime;
        
        public OneScene(Image pic, long endTime)
        {
            this.pic = pic;
            this.endTime = endTime;
        }// end OneScene
    }// end oneScene
}// Animation
