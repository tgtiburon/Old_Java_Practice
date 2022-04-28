// Assign 9 CITP 190

/**
 * Project: Project 8
 * Author: Tony Gendreau
 * Date: April 10, 2011
 *
 * Purpose:  This class is designed to act as a Console for any project that
 * requires input from the user that needs to be validated.
 */

package project9.Gendreau.Util;

import java.util.Scanner;


public class Console
{

   
    Scanner sc = new Scanner(System.in);
    // constructor
    public Console()
    {
      
        // Start the scanner
        this.sc = sc;

    }// end constructor for Console
////    
////    This section is for the OUTPUT
////


/** ----------------------------------------------------------------
// print(String s) -- prints the string to the console that is passed to it
// parameters  --   string s
//
// return value -- none
//-----------------------------------------------------------------*/
    public void print(String s)
    {
        // print the string
        System.out.print(s);
    }// end public void print




/** ----------------------------------------------------------------
// println(String s) -- prints the string passed to the console and ends the line
// parameters  --   String s
//
// return value -- none
//-----------------------------------------------------------------*/
    public void println(String s)
    {
        //print string and new line
        System.out.println(s);

    }// end public void println




/**********************************************************************
// println -- causes a blank line to be printed
// parameters  --   none
//
// return value -- none
***********************************************************************/
    public void println()
    {
        //new line
        System.out.println();
    }// end public void printlln()

////
////  This section  is for INPUT
////




/** ----------------------------------------------------------------
// getRequiredString -- validates a string
// parameters  --   none
//
// return value -- String tempString
//-----------------------------------------------------------------*/
    public String getRequiredString (String prompt)
    {
        //set string to ''
        String s = "";
        //set variables
		boolean isValid = false;
		while (isValid == false)
		{
                    // print prompt and wait for input
			System.out.print(prompt);
			s = sc.nextLine();
                        //make sure they typed something
			if (s.equals(""))
			{
				System.out.println("Error! This entry is required. Try again.");
			}
			else
			{
				isValid = true;
			}
		}
                //return the string
		return s;
     

    }// end getRequiredString



/** ----------------------------------------------------------------
// getChoiceString -- gets a valid choice from the user
// parameters  --   String s1, String s2
//
// return value -- String tempString
//-----------------------------------------------------------------*/
    public String getChoiceString(String prompt, String s1, String s2)
    {
        //set up variables
        String s = "";
		boolean isValid = false;
		while (isValid == false)
		{
                    //send prompt to getRequiredString
			s = this.getRequiredString(prompt);
                        //make sure the string is one of the two choices
			if (
                                //it is not equal to either
				!s.equalsIgnoreCase(s1) &&
				!s.equalsIgnoreCase(s2)
				)
			{
				System.out.println("Error! Entry must be '"+
					s1 +"' or '"+ s2 +"'. Try again.");
			}
			else
			{
                            //it is valid
				isValid = true;
			}
		}
                //return the string
		return s;
       
    }// end getChoiceString



/** ----------------------------------------------------------------
// getInt -- gets and checks an int from user
// parameters  --   String prompt
//
// return value -- return tempInt
//-----------------------------------------------------------------*/
    public int getInt(String prompt)
    {
        //set up variables
        int i = 0;
		boolean isValid = false;
		while (isValid == false)
		{
                    // send prompt to getRequiredString
			String s = getRequiredString(prompt);
                        // string was ok...now is it an integer?
			try
			{
				i = Integer.parseInt(s);
				isValid = true;
			}
                        //not an integer so catch exception from parseInt
			catch(NumberFormatException nfe)
			{
				System.out.println("Error! Invalid integer value. Try again.");
			}
		}
                //return the integer
		return i;
    }// end getInt


/** ----------------------------------------------------------------
// getIntWithinRange -- get an int from user withing int range
// parameters  --   String prompt, int min, int max
//
// return value -- return tempInt
//-----------------------------------------------------------------*/
    public int getIntWithinRange(String prompt, int min, int max)
    {

        //setup variables
        int i = 0;
		boolean isValid = false;
		while (isValid == false)
		{
                    //send prompt to getInt
			i = getInt(prompt);
                        //It is an int...but is it in the range?
			if (i <= min)
				System.out.println(
					"Error! Number must be greater than " + min);
			else if (i >= max)
				System.out.println(
					"Error! Number must be less than " + max);
			else
				isValid = true;
		}
                // return the integer
		return i;
      
    }//public getIntWithinRange



/** ----------------------------------------------------------------
// getDouble -- get a double from user and validate
// parameters  --   String prompt
//
// return value -- return tempDouble
//-----------------------------------------------------------------*/
    public double getDouble(String prompt)
    {

        //set up the variables
        double d = 0;
		boolean isValid = false;
		while (isValid == false)
		{
                    //print the prompt
			System.out.print(prompt);

                        //send prompt to getRequiredString and set to s

                          String s = getRequiredString(prompt);
			try
			{
                            //check if it is a double
				d = Double.parseDouble(s);
				isValid = true;
			}
                        //was not a double so parseDouble threw an exception
			catch(NumberFormatException nfe)
			{
				System.out.println("Error! Invalid integer value. Try again.");
			}
                         // sc.nextLine(); //discard other data on the line

                 }
                //return the double

		return d;
        
    }//end getDouble




/** ----------------------------------------------------------------
// getDoubleWithinRanage -- gets and validates a double within a range
// parameters  --   String prompt, double min, double max
//
// return value -- return tempDouble
//-----------------------------------------------------------------*/
    public double getDoubleWithinRange(String prompt, double min, double max)
    {

        //set up variables

        double d = 0;
		boolean isValid = false;
		while (isValid == false)
		{
                    //send prompt to getDouble
			d = getDouble(prompt);
                        //have the double, check if it is in the range
			if (d <= min)
				System.out.println(
					"Error! Number must be greater than " + min);
			else if (d >= max)
				System.out.println(
					"Error! Number must be less than " + max);
			else
				isValid = true;
		}
                //return the double
		return d;
        

    }// end getDoubleWithinRange







}//end public class Console
