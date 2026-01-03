import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOStream1 {
    public static void main(String[] args) throws FileNotFoundException , IOException {
        
        //connecting to a file 
        FileOutputStream fos = new FileOutputStream("abc.txt");

        //writing data to a file
        fos.write(97);
        fos.write('b');
        fos.write(77);
        fos.write('t');
        fos.write('#');
        fos.write(115);
        System.out.println("data is saved");

        //closing fos connection
        fos.close();
    }
}
