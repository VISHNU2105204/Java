/*WAJP to read range from the user and print the count of odd nu
present in between the range.*/


import java.util.*;
public class CountOddNumbersInRange {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int count=0;
		
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
			if(i%2!=0)
			{
				count++;
			}
		}
		System.out.println("Number of numbers between " +start+ " and " +end+ " is " +count);

	}

}
