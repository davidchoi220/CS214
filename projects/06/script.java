Script started on Tue 12 Mar 2019 11:23:40 PM EDT
wc25@gold18:~/CS214/projects/06$ cat array.java
/* array.java creates an array, reads values, and prints it back out 
 * Completed by: David Choi
 ***************************************************************/

import java.io.*;
import java.util.Scanner;

// java class array
public class array
{
  // main program
  public static void main(String[] args){
  	Scanner keyboard = new Scanner(System.in);

  	System.out.println("\nEnter the size of the array: ");

  	int size = Integer.parseInt(keyboard.next());
  	double[] aArray = new double[size];

  	aArray = readArray(aArray, aArray.length, keyboard);
  	printArray(aArray);
  }
    

  public static double[] printArray(double[] aArray){
  	for(int i = 0; i < aArray.length; i++)
  		System.out.print(aArray[i] + "\n");
  	return aArray;
  }

  public static double[] readArray(double aArray[], int size, Scanner keyboard){
  	System.out.println("\nEnter the values for the array: ");
  	for(int i = 0; i < size; i ++)
  		aArray[i] = Double.parseDouble(keyboard.next());
  	return aArray;
  }
}

wc25@gold18:~/CS214/projects/06$ javac -deprecation array.java
wc25@gold18:~/CS214/projects/06$ a java array

Enter the size of the array: 
3

Enter the values for the array: 
1 2 3
1.0
2.0
3.0
wc25@gold18:~/CS214/projects/06$ exit

Script done on Tue 12 Mar 2019 11:24:47 PM EDT
