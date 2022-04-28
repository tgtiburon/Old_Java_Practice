package project9;

import project9.Gendreau.Util.Console;

public class ConsoleTestApp
{
	public static void main(String args[])
	{
		// create the Console object
		Console c = new Console();
                 //new eric.Console();

		// display a welcome message
		c.println("Welcome to the Console Tester application");
		c.println();

		// int
		c.println("Int Test");
		int i = c.getIntWithinRange("Enter an integer between -100 and 100: ", -101, 101);
		c.println();

		// double
		c.println("Double Test");
		double d = c.getDoubleWithinRange("Enter any number between -100 and 100: ", -101, 101);
		c.println();

		// required string
		c.println("Required String Test");

                String s1 = c.getRequiredString("Enter your email address: ");
		c.println();

		// string choice
		c.println("String Choice Test");
		String s2 = c.getChoiceString("Select one (x/y): ", "x", "y");
		c.println();


	}
}