//WAJP to print the number from the user entered range.

import java.util.Scanner;

public class PrintNumbersInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Starting Number : ");
		int start = sc.nextInt();
		System.out.println("Enter End Number : ");
		int end = sc.nextInt();
		
		if(start>end)
		{
			System.out.println("Invalid Details,Starting Must Be Lesser or Equal to End Number ");
		}
		System.out.println("The Between"+start+"and"+end+"is : ");
		for(int i=start;i<=end;i++)
		{
			System.out.println(i);
		}

	}

}
