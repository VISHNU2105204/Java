import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

       System.out.print("Enter a year: ");
        int year = scanner.nextInt();

       scanner.close();

        int daysInMonth;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; 
                } else {
                    daysInMonth = 28; 
                }
                break;
            default:
                System.out.println("Invalid month entered.");
                return;
        }

        System.out.println("Number of days in the entered month: " + daysInMonth);
    }
}
