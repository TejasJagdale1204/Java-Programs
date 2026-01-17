import java.io.File;
import java.io.IOException;
public class IOStream16 {
    public static void main(String[] args) throws IOException {

        File f1 = new File("pqr.txt");   //only object is created not file created
        boolean created = f1.createNewFile();     //now after calling this method file is created
        System.out.println(created);
        if(created) {
            System.out.println("File is created");
        }
        else {
            System.out.println("File is not created");
        }
    }
}
