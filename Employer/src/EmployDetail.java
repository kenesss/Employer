import java.util.Scanner;

public class EmployDetail {
    String name;
    int age;
    String email;
    String position;
    int id;
    float employ_salary;
    long employ_contact;

    public void employee_detail(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee's name : ");
        name = sc.nextLine();

        System.out.print("Enter Employee's age : ");
        age = sc.nextInt();

        System.out.print("Enter Employee's ID : ");
        id = sc.nextInt();

        System.out.print("Enter Employee's Email ID : ");
        email = sc.next();

        System.out.print("Enter Employee's Position : ");
        position = sc.next();

        System.out.print("Enter Employee contact Info : ");
        employ_contact = sc.nextLong();

        System.out.print("Enter Employee's Salary : ");
        employ_salary = sc.nextFloat();

        System.out.println("Employee has been Added");
    }
}
