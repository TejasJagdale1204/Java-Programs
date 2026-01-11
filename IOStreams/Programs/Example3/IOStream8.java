import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IOStream8 {
    public static void main (String [] args) throws IOException {
        FileReader fr = new FileReader("abc.txt");
        FileWriter fw = new FileWriter("bbc.txt");

        int data;
        while((data=fr.read()) != -1) {
            fw.write(data);
        }

        System.out.println("Data is copied");
        fw.flush();
        fr.close();
        fw.close();
    }
}