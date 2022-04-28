// Assign 10 CITP 190

/**
 * Project: Project 10
 * Author: Tony Gendreau
 * Date: April 18, 2011
 *
 * Purpose:  This class is designed to act as a Console for any project that
 * requires input from the user that needs to be validated.
 */


package project10;

import java.util.*;
import javax.naming.spi.DirStateFactory.Result;


public class Student implements Comparable
{
    //declare some strings
    String lastName;
    String firstName;
    int score;




    //student constructor
        public Student(String firstName, String lastName, int score)
    {
        this.firstName = firstName;// Initializes all the below
        this.lastName = lastName;
        this.score = score;

       


        
    }// end Student

        // Setters and Getters

/** ----------------------------------------------------------------
// setFirstname(String s) -- set the firstName
// parameters  --   string s
//
// return value -- none
//-----------------------------------------------------------------*/
        public void setFirstName(String s)
       {
            this.firstName = s;

        }//end setFirstname





/** ----------------------------------------------------------------
// getFirstName -- gets the first name
// parameters  --   NONE
//
// return value -- String firstName
//-----------------------------------------------------------------*/
        public String getFirstName()
        {
            return firstName;
        }// end getFirstName




/** ----------------------------------------------------------------
// setLastName(String s) -- sets the last name
// parameters  --   string s
//
// return value -- none
//-----------------------------------------------------------------*/
        public void setLastName(String s)
       {
            this.lastName = s;

        }//end setLastName






/** ----------------------------------------------------------------
// getLastname -- gets the students last name
// parameters  --   NONE
//
// return value -- string lastName
//-----------------------------------------------------------------*/
        public String getLastName()
        {
            return lastName;
        }// end getLastName





/** ----------------------------------------------------------------
// setScore(int i) -- sets the students score
// parameters  --   int i
//
// return value -- none
//-----------------------------------------------------------------*/
        public void setScore(int i)
       {
            this.score = i;

        }//end setScore






/** ----------------------------------------------------------------
// getScore() -- gets the students score
// parameters  --   none
//
// return value -- int score
//-----------------------------------------------------------------*/
        public int getScore()
        {
            return score;
        }// end getScore
   



/** ----------------------------------------------------------------
// compareTo -- compares either integers or strings and orders them
// parameters  --   Object o
//
// return value -- int result
//-----------------------------------------------------------------*/
    public int  compareTo(Object o)
    {
        // DEFAULT CODE
        Student i = (Student)o;
        // declare and set result to 0
        int result = 0;
        //user wants to sort by names
        if(SortedStudentsApp.userChoice.equalsIgnoreCase("n"))
        {
              //result = string compare
              result = this.lastName.compareTo(i.lastName) ;
              //last names are the same so check first names
              if(result == 0)
              {
                  result = this.firstName.compareTo((i.firstName));

              }//end result
              //return result;
        }//end if
        //user wants to compare scores
         if(SortedStudentsApp.userChoice.equalsIgnoreCase("s"))
        {
             //compare scores
           
            if(this.getScore() < i.getScore())
            {
               
                result = -1;
            }//end if
            else if(this.getScore() > i.getScore())
            {
                
                result = 1;
            }//end else if
            //scores are the same, use last name to sort
            else if(this.getScore() == i.getScore())
            {
                 result = this.lastName.compareTo(i.lastName) ;
                 // last names are also the same, use first names
                  if(result == 0)
                  {
                        result = this.firstName.compareTo((i.firstName));

                  }//end result

            }//end else if
            else
            {
            result =  0;
            }//end else
        }//end if
        return result;
       


      

     
    }//end compareTo

}//end public class Student
