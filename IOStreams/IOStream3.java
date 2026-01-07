import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOStream3 {
    public static void main(String[] args) throws FileNotFoundException , IOException {

        //connecting to a file 
        FileInputStream fis = new FileInputStream("abc.txt");

        //reading data (1 byte) from a file 
        int data;
        while((data=fis.read()) != -1) {
            System.out.println(data);
        }

        //closing the connection
        fis.close();
    }
}