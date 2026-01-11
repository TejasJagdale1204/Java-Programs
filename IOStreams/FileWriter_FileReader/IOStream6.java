import java.io.FileWriter;
import java.io.IOException;
public class IOStream6 {
    public static void main (String [] args) throws IOException {

        FileWriter fw = new FileWriter("abc.txt");

        fw.write(97);
        fw.write('b');
        fw.write(260);
        fw.write(65000);
        fw.write(66000);    //decreased to the range of 0-65535
        fw.write("Hari");
        fw.write("Krishna");
        fw.write(-91);        //decreased to the range of 0-65535
        
        // fw.write(5L);      //CE
        // fw.write(9.8);     //CE
        // fw.write(true);    //CE

        fw.flush();
        System.out.println("Data is saved");

        fw.close();
    }
}