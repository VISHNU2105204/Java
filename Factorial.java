//WAJP to find factorial of a given number.

package Factorial;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Number : ");
		int number = sc.nextInt();
		
		long factorial = calculateFactorial(number);

		System.out.println("Factorial of "+number+" is : " +factorial);
	}
	 public static long calculateFactorial(int n) 
  {
	        if (n == 0 || n == 1) 
          {
	            return 1;
	        }
          else 
          {
	            return n * calculateFactorial(n - 1);
	        }
	    }
	}
