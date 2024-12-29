import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee_Update {
    public void updateFile(String id, String o, String n) throws IOException {

        File file = new File(id);
        Scanner sc = new Scanner(file);
        String text = "";
        while (sc.hasNextLine()){
            text = text + "\n" + sc.nextLine();
        }
        FileWriter fw = new FileWriter(id);
        text = text.replaceAll(o, n);
        fw.write(text);
        fw.close();
        System.out.println("File updated successfully");
    }
}
