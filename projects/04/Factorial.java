/* Factorial.java displays factorial of n.
 *
 * Input: An integer.
 * 
 * Output: A factorial value of N
 * 
 * Completed by: David Choi
 ********************************************************/
import java.util.Scanner; 		// Get input

class Factorial{

  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
    System.out.println("To calculate n!, enter n: ");
   
    double n = keyboard.nextDouble(); //input
    double b = 1; //answer
    
    for(int i = 2; i <= n ; i++)
    	b *= i;
    System.out.println("Factorial of " + n + " is " + b);
  }
}

