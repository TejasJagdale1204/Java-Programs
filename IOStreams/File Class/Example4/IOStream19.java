import java.io.File;
import java.io.IOException;
public class IOStream19 {
    public static void main(String[] args) throws IOException {

        File f1 = new File("D:\\BE SCOE\\Official Programs\\CORE JAVA\\IOStreams\\File Class\\Example4\\abc.txt");
        f1.createNewFile();

        File f2 = new File("D:\\BE SCOE\\Official Programs\\CORE JAVA\\IOStreams\\File Class\\Example4\\ABCD");
        f2.mkdir();
    }
}
