import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File read=new File("D:\\project.java");
            Scanner myRead=new Scanner(read);
            while (myRead.hasNextLine()){
                String data=myRead.nextLine();
                System.out.println(data);
            }
            myRead.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
