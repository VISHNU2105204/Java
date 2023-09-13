/*WAJP to read starting number and ending nu from the user and print
the number which is divisible by 3 and 5.*/

import java.util.*;

public class Divisibleby3and5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Start Number : ");
		int start = sc.nextInt();
		System.out.println("Enter End Number :");
		int end = sc.nextInt();
		
		if(start>end)
		{
			System.out.println("Invalid Details,Starting Number is Lesser Than or Equal To End Number");
		}
		for(int i=start;i<=end;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}

	}

}
