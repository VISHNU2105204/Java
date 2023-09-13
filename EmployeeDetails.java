/*WAJP to read the data from the user to provide Employee Name,
  Employee Id, Salary, Department Name, and Designation*/

    
import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter Department Name: ");
        String departmentName = sc.nextLine();

        System.out.print("Enter Designation Code: ");
        int designationCode = sc.nextInt();


        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Department Name: " + departmentName);
        System.out.println("Designation Code: " + designationCode);
    }
}
