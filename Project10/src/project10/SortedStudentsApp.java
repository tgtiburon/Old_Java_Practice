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


import java.util.Scanner;
import java.util.Arrays;

public class SortedStudentsApp
{
       //some declarations
	static Scanner sc = new Scanner(System.in);// get a scanner
        public static String userChoice;
     


	public static void main(String[] args)
	{
               // print welcome
		System.out.println("Welcome to the Student Scores Application.");
                System.out.println();


                // get number of students
                int numberOfStudents = getStudentCount();

               //get the method the user wants to use to sort
               userChoice = getString("Do you want to sort by name or score? (n/s)");

               
                Student[] students = new Student[numberOfStudents];
                for(int i = 0; i< numberOfStudents;i++)
                {
                    //make some temporary strings
                    String tmpLastName;
                    String tmpFirstName;
                    // make a temporary int
                    int tmpInt;
                   
                    //get last name of student
                   tmpLastName = getString("Student "+ (i+1) + " last name: ");
                   //get first name of  student
                   tmpFirstName = getString("Student "+ (i+1) + " first name: ");
                   // get the student's score
                   tmpInt = getScore("Student "+ (i+1) + " score: ");
                   // store the info in a new student object
                   students[i] = new Student(tmpFirstName, tmpLastName, tmpInt);




                }//end for loop

                // Call the array sort
                Arrays.sort(students);

                //loop to print results
                int i = 0;
                for(Student s : students)
                {
                    

                    System.out.println(students[i].lastName+", " + students[i].firstName +
                            ": " + students[i].score);
                    i += 1;
                }//end for


	}//end main


        

	public static int getStudentCount()
	{
		int studentCount = 0;
		boolean isValid = false;

		while (!isValid)
		{
			System.out.print("\nEnter number of students to enter: " );
			if (sc.hasNextInt())				// make sure the next token is an integer
			{
				studentCount = sc.nextInt();	// discard the entire line if it isn't
				if (studentCount > 0)			// make sure it is greater than zero
					isValid = true;
			}
			sc.nextLine();						// discard any remaining data
		}
		return studentCount;					// return the studentCount
	}
	public static String getString(String prompt)
	{
		String s = "";
		boolean isValid = false;

		while (!isValid)						// loops until user enters a non-blank line
		{
			System.out.print(prompt);
			s = sc.nextLine();
			if (!s.equals(""))
				isValid = true;
		}// end while
		return s;
	}// end getString

	public static int getScore(String prompt)
	{
		int score = 0;
		boolean isValid = false;

		while (!isValid)
		{
			System.out.print(prompt);
			if (sc.hasNextInt())					// make sure the next token is an integer
			{
				score = sc.nextInt();				// discard the entire line if it isn't
				if (score >= 0 && score <= 100)		// make sure it is in the range 0 to 100
					isValid = true;
			}//end if (sc.hastNextInt())
			sc.nextLine();							// discard any remaining data
		}//end while
		return score;								// return the score
	}//end getScore()

}//end SortedStudentsApp