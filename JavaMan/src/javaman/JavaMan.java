
package javaman;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*;



public class JavaMan extends JFrame implements KeyListener
{
    
    int UP = 0, DOWN  = 1, RIGHT = 2, LEFT = 3;
    int direction = RIGHT;
    int positionX =1, positionY =1;
    int score = 0;
    // Container
    Container cont;
    // the 2 dimensional array
    String arena [][]=
    {
     {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"},
     {"#"," "," "," ","#"," "," "," "," "," "," ","#"," "," "," "," ","#"},
     {"#"," ","#"," "," "," "," "," "," "," "," ","#"," "," "," "," ","#"},
     {"#"," ","#"," "," ","#"," ","#"," "," "," "," "," "," ","#","#","#"},
     {"#"," ","#"," "," ","#"," "," ","#","#"," "," "," "," "," "," ","#"},
     {"#"," "," "," "," "," "," "," "," "," "," "," "," "," ","#"," ","#"},
     {"#"," "," "," "," ","#"," "," ","#","#","#"," "," "," ","#"," ","#"},
     {"#","#","#","#"," ","#"," "," "," "," "," "," "," "," ","#"," ","#"},
     {"#"," "," "," "," ","#"," "," "," "," "," "," ","#"," ","#","#","#"},
     {"#"," "," "," "," "," "," "," "," "," "," "," ","#"," "," ","#","#"},
     {"#"," ","#"," "," ","#"," "," "," "," "," "," ","#"," ","#","#","#"},
     {"#","#","#"," "," ","#"," ","#"," ","#","#"," ","#"," ","#","#","#"},
     {"#"," "," "," "," ","#"," "," "," "," "," "," ","#"," "," "," ","#"},
     {"#"," "," "," "," "," "," "," "," ","#","#"," ","#"," "," "," ","#"},
     {"#"," "," "," ","#"," "," "," "," "," "," "," "," "," "," "," ","#"},
     {"#"," "," "," ","#"," "," "," "," "," "," "," "," "," "," "," ","#"},
     {"#"," "," "," ","#"," "," "," "," "," "," "," "," "," "," "," ","#"},
     {"#"," "," "," ","#"," "," "," "," "," "," ","#"," "," "," "," ","#"},
     {"#"," "," "," ","#"," "," ","#","#"," "," ","#"," "," ","#","#","#"},
     {"#"," "," "," ","#"," "," ","#","#"," "," ","#"," "," ","#","#","#"},
     {"#"," "," "," ","#"," "," ","#","#"," "," ","#"," "," ","#","#","#"},
     {"#"," "," "," ","#"," "," "," "," "," "," ","#"," "," "," "," ","#"},
     {"#"," "," "," ","#"," "," "," "," "," "," ","#"," "," "," "," ","#"},
     {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"}
    };//end of String arena array

    // Images
    //abi_monster.png
    //mateo


    //JLabel javaMan = new JLabel(new ImageIcon("c:\\javastuff\\mateo_rangers_50.PNG"));
     JLabel javaMan = new JLabel(new ImageIcon("c:\\javastuff\\mateo_game_50.PNG"));
      //JLabel javaMan = new JLabel(new ImageIcon("c:\\javastuff\\mateo_ranger_50.PNG"));
      JLabel enemies[] =
      {
            new JLabel(new ImageIcon("C:\\javastuff\\abi_monster_50.PNG")),
            new JLabel(new ImageIcon("C:\\javastuff\\abi_monster_50.PNG")),
            new JLabel(new ImageIcon("C:\\javastuff\\abi_monster_50.PNG")),
            new JLabel(new ImageIcon("C:\\javastuff\\abi_monster_50.PNG")),
            new JLabel(new ImageIcon("C:\\javastuff\\abi_monster_50.PNG"))
      };// end JLabel
      int dotsLeft = 254;

    // Constructor for JavaMan
    public JavaMan()
    {
        //setup the game window
        super("JavaMan");
        setSize(1200,900);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cont = getContentPane();
        cont.setLayout(null);

        addKeyListener(this);

        cont.setBackground(Color.BLACK);

        // Add JavaMan
        cont.add(javaMan);
        javaMan.setBounds(50,50,50,50);



        // this loop examines each element in the array.
        // Position of elements in 2D array should correspond with
        // their placement in the JFramme.
        // " " = track_full.png
        // "#" = border.png

        for(int i = 0; i<arena.length; i++)
        {
            for(int j= 0; j<arena[0].length; j++)
            {
                JLabel lbl = null;
                if(arena[i][j].equals("#"))
                {
                    lbl = new JLabel(new ImageIcon("c:\\javastuff\\border_50.png"));


                }// end if arena
                else
                {
                    lbl=new JLabel(new ImageIcon("c:\\javastuff\\track_full_50.png"));
                }// end else
                cont.add(lbl);
                lbl.setBounds(i*50,j*50,50,50);
                System.out.println("X: "+i*50+"--Y: "+j*50);


            }//end for j
        }//end for i


        
        //Set the position of the enemies
        cont.add(enemies[0]);
        enemies[0].setBounds(50,500,50,50);
        cont.setComponentZOrder(enemies[0],1);
        cont.add(enemies[1]);
        enemies[1].setBounds(1000,500,50,50);// might need to change
        cont.setComponentZOrder(enemies[1],1);
        cont.add(enemies[2]);
        enemies[2].setBounds(50,500,50,50);// might need to change
        cont.setComponentZOrder(enemies[2],1);
        cont.add(enemies[3]);
        enemies[3].setBounds(1000,50,50,50);// might need to change
        cont.setComponentZOrder(enemies[3],1);
        cont.add(enemies[4]);
        enemies[4].setBounds(1000,500,50,50);// might need to change
        cont.setComponentZOrder(enemies[4],1);

        

        repaint();
        cont.validate();
        Runner run = new Runner();
        run.start();
        setContentPane(cont);



    }// end public JavaMan



    public class Runner extends Thread
    {
        public void run()
        {
            while(true)
            {
                try
                {
                    // check if JavaMan wins
                    if(dotsLeft<= 0)
                    {
                        JOptionPane.showMessageDialog(null,"You Win!");
                        Thread.sleep(1000000);
                    }//end dotsLeft''==


                    // enemy logic
                    int dir[] = new int[5];
                    for(int i = 0; i <dir.length;i++)
                    {
                        dir[i] = (int)(Math.random()*4);
                        if(dir[i] == UP)
                        {
                            enemies[i].setBounds(enemies[i].getX(), enemies[i].getY()-50,
                                          50,50);
                            if(arena[enemies[i].getX()/50][enemies[i].getY()/50].equals("#"))
                                    {
                                        enemies[i].setBounds(enemies[i].getX(),
                                                enemies[i].getY()+50,50,50);
                                
                                     }// end crazy line
                        }// end UP
                         if(dir[i] == DOWN)
                        {
                            enemies[i].setBounds(enemies[i].getX(), enemies[i].getY()+50,
                                          50,50);
                            if(arena[enemies[i].getX()/50][enemies[i].getY()/50].equals("#"))
                                    {
                                        enemies[i].setBounds(enemies[i].getX(),
                                                enemies[i].getY()-50,50,50);

                                     }// end crazy line
                        }// end UP
                         if(dir[i] == LEFT)
                        {
                            enemies[i].setBounds(enemies[i].getX()-50, enemies[i].getY(),
                                          50,50);
                            if(arena[enemies[i].getX()/50][enemies[i].getY()/50].equals("#"))
                                    {
                                        enemies[i].setBounds(enemies[i].getX()+50,
                                                enemies[i].getY(),50,50);

                                     }// end crazy line
                        }// end UP
                         if(dir[i] == RIGHT)
                        {
                            enemies[i].setBounds(enemies[i].getX()+50, enemies[i].getY(),
                                          50,50);
                            if(arena[enemies[i].getX()/50][enemies[i].getY()/50].equals("#"))
                                    {
                                        enemies[i].setBounds(enemies[i].getX()-50,
                                                enemies[i].getY(),50,50);

                                     }// end crazy line
                        }// end UP
                    //}// end enemy moves

                        // you lose?
                        if(enemies[i].getX()/50 == positionX && enemies[i].getY()/50
                                == positionY)
                        {
                            JOptionPane.showMessageDialog(null,"You Lose!");
                            System.out.println("You Lose");
                            

                        }// end enemies[i]
                        cont.setComponentZOrder(enemies[i],1);

                }// end ENEMY MOVES
                    // remove circles we go over
                    if(arena[positionX][positionY].equals(" "))
                    {
                        arena[positionX][positionY] = ".";
                        dotsLeft--;
                        JLabel lbl = new JLabel(new ImageIcon("c:\\javastuff\\track_empty_50.PNG"));
                        cont.add(lbl);
                        lbl.setBounds(positionX*50, positionY*50,50,50);
                        cont.setComponentZOrder(lbl,1); 
                        score++;
                    }// end check for circles



                    // MOVE JAVAMAN
                        if(direction == RIGHT)
                        {
                            javaMan.setBounds(javaMan.getX() +50, javaMan.getY(),
                                50,50);
                            positionX++;
                            if(arena[positionX][positionY].equals("#"))
                            {
                                javaMan.setBounds(javaMan.getX()-50,javaMan.getY(),
                                    50,50);
                                positionX--;
                            }//end if(arena
                            cont.setComponentZOrder(javaMan,1);

                        }// end if RIGHT
                        if(direction == LEFT)
                        {
                            javaMan.setBounds(javaMan.getX() -50, javaMan.getY(),
                                50,50);
                            positionX--;
                            if(arena[positionX][positionY].equals("#"))
                            {
                                javaMan.setBounds(javaMan.getX()+50,javaMan.getY(),
                                    50,50);
                                positionX++;
                            }//end if(arena
                            cont.setComponentZOrder(javaMan,1);

                        }// end if LEFT
                        if(direction == UP)
                        {
                            javaMan.setBounds(javaMan.getX(), javaMan.getY()-50,
                                50,50);
                            positionY--;
                            if(arena[positionX][positionY].equals("#"))
                            {
                                javaMan.setBounds(javaMan.getX(),javaMan.getY()+50,
                                    50,50);
                                positionY++;
                            }//end if(arena
                            cont.setComponentZOrder(javaMan,1);

                        }// end if UP
                        if(direction == DOWN)
                        {
                            javaMan.setBounds(javaMan.getX(), javaMan.getY()+50,
                                50,50);
                            positionY++;
                            if(arena[positionX][positionY].equals("#"))
                            {
                                javaMan.setBounds(javaMan.getX(),javaMan.getY()-50,
                                    50,50);
                                positionY--;
                            }//end if(arena
                            cont.setComponentZOrder(javaMan,1);

                        }// end if DOWN
                        cont.validate();
                        Thread.sleep(400);

                 }// end try
                    catch(Exception e)
                    {
                        System.out.println("Major Malfunction Will Robinson");
                        JOptionPane.showMessageDialog(null,"Major Malfunction Will Robinson");
                        
                               
                    }// catch
                }// end while(true)

           }// end run
    }// end public class Runner
    public void keyTyped(KeyEvent e)
    {
        if(e.getKeyChar()=='8') direction = UP;
        if(e.getKeyChar()=='4') direction = LEFT;
        if(e.getKeyChar()=='2') direction = DOWN;
        if(e.getKeyChar()=='6') direction = RIGHT;
        
    }// end keyTyped()
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public static void main(String[] args)
    {
        new JavaMan();
    }// end main

}// end public class JavaMan
