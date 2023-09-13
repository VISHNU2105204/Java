/*WAJP to read the number from the user and find the factor of the
  even number.*/

import java.util.Scanner;

public class FactorsOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an even number: ");
        int number = sc.nextInt();


        if (number % 2 != 0)
        {
            System.out.println("Please enter an even number.");
            return;
        }

        System.out.println("Factors of " + number + ":");
        for (int i = 1; i <= number; i++) 
        {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
