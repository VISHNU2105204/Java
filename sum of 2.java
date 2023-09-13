//1. WAJP to read the data from the user and calculate the sum of two numbers
import java.util.*;

public class AddTwoNumbers {
    public static void main(String[] args) {
      int num1,num2,sum;
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter First Number: ");
      num1 = sc.nextInt();
      System.out.println("Enter Second Number: ");
      num2 = sc.nextInt();
      sum = num1+num2;
      System.out.println("Sum of Two Numbers is: "+sum );
      
  }
}
