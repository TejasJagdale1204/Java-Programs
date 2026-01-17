import java.io.File;
import java.io.IOException;
public class IOStream17 {
    public static void main(String[] args) throws IOException {

        File f1 = new File("XYZ");   
        boolean created = f1.mkdir();  
        System.out.println(created);
        if(created) {
            System.out.println("Directory is created");
        }
        else {
            System.out.println("Directory is not created");
        }

        //==============================================================

        File f2 = new File("XYZ\\pqr.txt");
        f2.createNewFile();

        //==============================================================

        File f3 = new File("XYZ\\ABC");
        f3.mkdir();
    }
}