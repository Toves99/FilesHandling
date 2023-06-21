import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
       File myFile=new File("D:\\project.java");
       try{
           if(myFile.createNewFile()){
               System.out.println("File created:"+myFile.getName());
           }
           else {
               System.out.println("File already exit");
           }
       }catch (IOException e){
           System.out.println("Error occurred");
           e.printStackTrace();
       }
    }
}
