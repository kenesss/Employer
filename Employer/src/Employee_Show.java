import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Employee_Show {
    public void viewFile(String id) throws IOException{
        File file = new File(id);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        System.out.println("<<<Press Enter>>>");
    }
}
