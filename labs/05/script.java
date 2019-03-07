Script started on Fri 01 Mar 2019 12:20:00 AM EST
wc25@gold19:~/CS214/labs/05$ cat Split.java
/* Split.java is a class and program that splits a string
 * into two substrings.
 * 
 * Begun by: Serita Nelesen
 * Completed by: David Choi
 ***************************************************************/

import java.util.Scanner;

// java class Split
public class Split
{
  // main program
  public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      // prompt for the string
      System.out.println("\nTo split a string, enter the string: ");
      String theString = keyboard.next();
      
      // prompt for splitting position
      System.out.println("\nEnter the split position: ");
      int position = keyboard.nextInt();

      //Create list, compute results and print
      String [] resultList = new String[2];
      splitter(theString, position, resultList);
      System.out.println("\nThe first part is " + resultList[0] + "\n and the second part is " + resultList[1]);
      
    }

  public static void splitter(String theStr, int thePos, String[] result){
  	result[0] = theStr.substring(0, thePos);
  	result[1] = theStr.substring(thePos, theStr.length());
  }
}

wc25@gold19:~/CS214/labs/05$ javac -deprecation Split.java
wc25@gold19:~/CS214/labs/05$ java Split

To split a string, enter the string: 
COMPUTERSCIENCE

Enter the split position: 
5

The first part is COMPU
 and the second part is TERSCIENCE
wc25@gold19:~/CS214/labs/05$ exit

Script done on Fri 01 Mar 2019 12:20:36 AM EST
