/* quad.java computes the quadratic of a b and c 
 * Completed by: David Choi
 ***************************************************************/

import java.util.Scanner;

// java class Split
public class quad
{
  // main program
  public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      double a, b, c;
      System.out.println("\nPlease enter the value of A: ");
      a = keyboard.nextDouble();

      System.out.println("\nPlease enter the value of B: ");
      b = keyboard.nextDouble();

      System.out.println("\nPlease enter the value of C: ");
      c = keyboard.nextDouble();

    
      double[] results = quadRoots(a, b, c);
      System.out.println("The quadratic equation of these values are " + results[0] + " " + results[1] + "\n");
    }

  public static double[] quadRoots(double a, double b, double c){
  	double[] roots = new double[2];
  	if( a != 0){
  		double arg = Math.pow(b, 2.0) - 4 * a * c;
  		if ( arg >= 0){
  			roots[0] = (-b + Math.sqrt(arg))/(2*a);
  			roots[1] = (-b - Math.sqrt(arg))/(2*a);
  			return roots;
		}else{
			System.out.println("Error: quadRoots(): b^2 - 4ac is negative!");
			roots[0] = roots[1] = 0.0;
			return roots;
			}
		}else{
			System.out.println("Error: quadRoots():: a is zero!");
			roots[0] = roots[1] = 0.0;
			return roots;
		}
	}
}

