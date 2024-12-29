import java.io.*;

public class Employee_Add extends EmployDetail{
    public void createFile() throws IOException {
        employee_detail();
        File file = new File(Integer.toString(id));

        if(file.exists()){
            System.out.println("This employee is already in the database.");

        }else {
            PrintWriter pw = new PrintWriter(Integer.toString(id));
            pw.println("Enter Employee's ID : " + id);
            pw.println("Enter Employee's Name : " + name);
            pw.println("Enter Employee's Age : " + age);
            pw.println("Enter Employee's Contact : " + employ_contact);
            pw.println("Enter Employee's Email : " + email);
            pw.println("Enter Employee's Postition  : " + position);
            pw.println("Enter Employee's Salary : " + employ_salary);
            pw.close();
        }
    }
}
