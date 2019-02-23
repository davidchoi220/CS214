Script started on Fri 22 Feb 2019 07:49:22 PM EST
wc25@gold07:~/CS214/labs/04$ cat LogTable.java
/* LogTable.java displays a table of logarithms.
 *
 * Input: start, stop and increment, three doubles.
 * PRE: start < stop && increment > 0.
 * Output: A table of logarithms from start to stop,
 *         with increment as the step value.
 * Begun by: Nelesen, for CS 214 at Calvin College.
 * Completed by: David Choi
 ********************************************************/
import java.util.Scanner; 		// Get input

class LogTable{

  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("To display a table of logarithms,");
    System.out.println("enter the start, stop and increment values: ");
    double start, stop, increment;
    start = keyboard.nextDouble();
    stop = keyboard.nextDouble();
    increment = keyboard.nextDouble();

    while(start <= stop){
    	System.out.println("The log of " + start + " is " + Math.log10(start));
    	start = start + increment;
    }

  }
}

wc25@gold07:~/CS214/labs/04$ javac -deprecation LogTable.java
wc25@gold07:~/CS214/labs/04$ java LogTable
To display a table of logarithms,
enter the start, stop and increment values: 
1 5 0.5
The log of 1.0 is 0.0
The log of 1.5 is 0.17609125905568124
The log of 2.0 is 0.3010299956639812
The log of 2.5 is 0.3979400086720376
The log of 3.0 is 0.47712125471966244
The log of 3.5 is 0.5440680443502757
The log of 4.0 is 0.6020599913279624
The log of 4.5 is 0.6532125137753437
The log of 5.0 is 0.6989700043360189
wc25@gold07:~/CS214/labs/04$ exit

Script done on Fri 22 Feb 2019 07:50:12 PM EST
