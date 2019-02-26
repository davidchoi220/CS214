Script started on Tue 26 Feb 2019 05:20:50 PM EST
wc25@gold33:~/CS214/projects/04$ cat Factorial.java
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

wc25@gold33:~/CS214/projects/04$ javac -deprecation Factorial.java
wc25@gold33:~/CS214/projects/04$ java Fc actorial
To calculate n!, enter n: 
5
Factorial of 5.0 is 120.0
wc25@gold33:~/CS214/projects/04$ exit

Script done on Tue 26 Feb 2019 05:21:22 PM EST
