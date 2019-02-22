/* grades.java is a driver for function grade().
 *
 * Begun by: David Choi, for CS 214 at Calvin College.
 ****************************************************************/

import java.util.Scanner;

public class grades{

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nEnter your grade: "); // prompt

      int grade = keyboard.nextInt();       // read grade
      System.out.println(letterGrade(grade)); // display letter grade
   }

   /***************************************************************
    * letterGrade() converts an average grades into letter grades.
    *
    * Receive: grade, an  int.
    * PRE: grade is one of {10, 9, 8, 7, 5, 4, 3, 2, 1}.
    * Return: the letter grade corresponding to average grade.
    */
   public static char letterGrade(int average)
   {
   	switch (average / 10){
   		case 10: case 9:
   		return 'A';

   		case 8:
   		return 'B';

   		case 7:
   		return 'C';

   		case 6:
   		return 'D';

   		default:
   		return 'F';

	}
}
}
