/*WAJP to read a starting number and ending number from user
and count the number which are divisible by 7.*/

import java.util.*;

public class CountNumbersDivisibleBy7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		System.out.println("Enter Start Number : ");
		int start = sc.nextInt();
		System.out.println("Enter End Number : ");
		int end = sc.nextInt();
		
		if(start>end)
		{
			System.out.println("Invalid Details,Starting Number Must Be Lesser or Equal to End Number");
			}
		for(int i=start;i<=end;i++)
		{
			if(i%7==0)
			{
				count++;
			}
		}
		System.out.println("Number of Numbers Divisible By 7 "+start+" and "+end+" is : "+count);

	}

}
