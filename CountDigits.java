/*WAJP to read a number from the user and count the digit present
  in the number.*/

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();


        int count = countDigits(number);

        System.out.println("Number of digits in the entered number: " + count);
    }

    public static int countDigits(long n) {
        if (n == 0)
        {
            return 1; 
        }

        int count = 0;

        while (n != 0) 
        {
            n /= 10; 
            count++;
        }

        return count;
    }
}
