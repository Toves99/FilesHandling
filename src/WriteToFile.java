import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("D:\\project.java");
            writer.write("This is a java file created in CreateFile java class");
            writer.close();
            System.out.println("Content successfully written to the file");
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
