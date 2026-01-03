import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOStream2 {
    public static void main(String[] args) throws FileNotFoundException , IOException {

        //connecting to a file 
        FileInputStream fis = new FileInputStream("abc.txt");

        //reading data (1 byte) from a file 
        int data1 = fis.read();
        int data2 = fis.read();
        int data3 = fis.read();
        int data4 = fis.read();
        int data5 = fis.read();
        int data6 = fis.read();

        System.out.println(data1 + " " + (char)data1);
        System.out.println(data2 + " " + (char)data2);
        System.out.println(data3 + " " + (char)data3);
        System.out.println(data4 + " " + (char)data4);
        System.out.println(data5 + " " + (char)data5);
        System.out.println(data6 + " " + (char)data6);

        //closing the connection
        fis.close();
    }
}
