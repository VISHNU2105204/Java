import java.util.*;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Name Of The Student :" );
	    String name = sc.nextLine();
		System.out.println("Enter Enrollment_No. of Student : ");
		String EnrollmentNo = sc.nextLine();
		System.out.println("Enter Student Address : ");
		String Address = sc.nextLine();
		System.out.println("Enter Division Of Student : ");
		String Division = sc.nextLine();
		
		System.out.println("Name of Student is : " +name);
		System.out.println("Enter Enrollment Number : "+EnrollmentNo);
		System.out.println("Enter Address : "+Address);
		System.out.println("Enter Division Number : "+Division);

	}

}
