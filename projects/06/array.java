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

