import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {
        File delete=new File("D:\\project.java");
        try{
            if (delete.exists()){
                System.out.println("Deleted"+delete.getName());
            }
            else {
                System.out.println("Failed to delete the file");
            }
        }catch (Exception e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
