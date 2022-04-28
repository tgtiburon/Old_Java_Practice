/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaman;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*;


/**
 *
 * @author Tony
 */
 /////////public class Runner extends Thread
//////////    {
//////////       int UP = 0, DOWN  = 1, RIGHT = 2, LEFT = 3;
//////////    int direction = LEFT;
//////////    int positionX =1, positionY =1;
//////////        public void run()
//////////        {
//////////            while(true)
//////////            {
//////////                try
//////////                {
//////////                    if(direction == RIGHT)
//////////                    {
//////////                        javaMan.setBounds(javaMan.getX() +50, javaMan.getY(),
//////////                                50,50);
//////////                        positionX++;
//////////                        if(arena[positionX][positionY].equals("#"))
//////////                        {
//////////                            javaMan.setBounds(javaMan.getX()-50,javaMan.getY(),
//////////                                    50,50);
//////////                            positionX--;
//////////                        }//end if(arena
//////////                        cont.setComponentZOrder(javaMan,1);
//////////
//////////                    }// end if RIGHT
//////////                    if(direction == LEFT)
//////////                    {
//////////                        javaMan.setBounds(javaMan.getX() -50, javaMan.getY(),
//////////                                50,50);
//////////                        positionX--;
//////////                        if(arena[positionX][positionY].equals("#"))
//////////                        {
//////////                            javaMan.setBounds(javaMan.getX()+50,javaMan.getY(),
//////////                                    50,50);
//////////                            positionX++;
//////////                        }//end if(arena
//////////                        cont.setComponentZOrder(javaMan,1);
//////////
//////////                    }// end if LEFT
//////////                    if(direction == UP)
//////////                    {
//////////                        javaMan.setBounds(javaMan.getX(), javaMan.getY()-50,
//////////                                50,50);
//////////                        positionY--;
//////////                        if(arena[positionX][positionY].equals("#"))
//////////                        {
//////////                            javaMan.setBounds(javaMan.getX(),javaMan.getY()+50,
//////////                                    50,50);
//////////                            positionY++;
//////////                        }//end if(arena
//////////                        cont.setComponentZOrder(javaMan,1);
//////////
//////////                    }// end if UP
//////////                    if(direction == DOWN)
//////////                    {
//////////                        javaMan.setBounds(javaMan.getX(), javaMan.getY()+50,
//////////                                50,50);
//////////                        positionY++;
//////////                        if(arena[positionX][positionY].equals("#"))
//////////                        {
//////////                            javaMan.setBounds(javaMan.getX(),javaMan.getY()-50,
//////////                                    50,50);
//////////                            positionY--;
//////////                        }//end if(arena
//////////                        cont.setComponentZOrder(javaMan,1);
//////////
//////////                    }// end if DOWN
//////////                    cont.validate();
//////////                    Thread.sleep(300);
//////////
//////////                }// end try
//////////                catch(Exception e){}
//////////            }// end while(true)
//////////
//////////        }// end run
//////////    }// end public class Runner