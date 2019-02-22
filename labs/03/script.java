Script started on Thu 14 Feb 2019 02:07:49 PM EST
wc25@gold14:~/CS214/labs/03$ cat YearCodes.java
/* YearCodes.java is a driver for function yearCode().
 *
 * Begun by: Prof. Adams, for CS 214 at Calvin College.
 ****************************************************************/

import java.util.Scanner;

public class YearCodes {

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nEnter your academic year: "); // prompt

      String year = keyboard.next();       // read year
      System.out.println(yearCode(year)); // display its code
   }

   /***************************************************************
    * yearCode() converts an academic year into its integer code.
    *
    * Receive: year, a string.
    * PRE: year is one of {freshman, sophomore, junior, or senior}.
    * Return: the integer code corresponding to year.
    */

   // REPLACE THIS LINE WITH THE DEFINITION OF yearCode()
public static int yearCode(String year)
{
 if (year.equals("freshman"))
      return 1;
   else if (year.equals("sophomore"))
      return 2;
   else if (year.equals("junior"))
      return 3;
   else if (year.equals("senior"))
      return 4;
   else
      return 0;
}

}
wc25@gold14:~/CS214/labs/03$ javac -deprecation Yearcodes.      Codes.java
wc25@gold14:~/CS214/labs/03$ java YearCodes

Enter your academic year: 
freshman
1
wc25@gold14:~/CS214/labs/03$ java YearCodes

Enter your academic year: 
sophomore
2
wc25@gold14:~/CS214/labs/03$ java YearCodes

Enter your academic year: 
junior
3
wc25@gold14:~/CS214/labs/03$ java YearCodes

Enter your academic year: 
senior
4
wc25@gold14:~/CS214/labs/03$ java YearCodes

Enter your academic year: 
supersenior
0
wc25@gold14:~/CS214/labs/03$ exit

Script done on Thu 14 Feb 2019 02:09:19 PM EST
