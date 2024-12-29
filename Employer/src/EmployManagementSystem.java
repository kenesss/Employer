import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class EmployManagementSystem{
    public static void main(String[] args) throws IOException {
        Employee_Show show = new Employee_Show();
        CodeExit exit = new CodeExit();
        Employee_Remove remove = new Employee_Remove();
        Employee_Update update = new Employee_Update();
        Employee_Add add = new Employee_Add();
        MainMenu menu = new MainMenu();
        menu.menu();

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i > 6 || i <= 0) {
            System.out.print("Please Enter choice : ");
            i = sc.nextInt();
            sc.nextLine();
        }

            switch (i) {
                case 1: {
                    add.createFile();
                    break;
                }
                case 2: {
                    System.out.print("\nPlease Enter Employee's id : ");
                    String s = sc.nextLine();

                    try {
                        show.viewFile(s);
                    } catch (FileNotFoundException e) {
                        System.out.println("\nEmployee does not exists in database");
                    }
                    break;
                }
                case 3: {
                    System.out.print("\nPlease Enter Employee's id : ");
                    String a = sc.next();
                    remove.removeFile(a);
                    break;
                }
                case 4: {
                    System.out.print("\nPlease Enter Employee's id : ");
                    String a = sc.nextLine();
                    System.out.print("Old word: ");
                    String o = sc.nextLine();
                    System.out.print("New word: ");
                    String n = sc.nextLine();
                    update.updateFile(a, o, n);
                    break;
                }
                case 5: {
                    exit.out();
            }
        }
    }
}
