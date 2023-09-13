/*WAJP to read a number from user and calculate the sum of digit
  of the number.*/

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();


        int sum = calculateSumOfDigits(number);

        System.out.println("Sum of the digits in the entered number: " + sum);
    }

    public static int calculateSumOfDigits(long n) {
        int sum = 0;

        while (n != 0) 
        {
            sum +=  n % 10; 
            n /= 10;       
        }

        return sum;
    }
}
