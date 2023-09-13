/*WAJP to read a year from the user and check year is leap year or
  not.*/

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();


        boolean isLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            isLeapYear = true;
        }

        if (isLeapYear) 
        {
            System.out.println(year + " is a leap year.");
        } 
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }
}
