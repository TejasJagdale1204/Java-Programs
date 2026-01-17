import java.io.File;
import java.io.IOException;
public class IOStream18 {
    public static void main(String[] args) throws IOException {

        File f1 = new File("XYZ","ABC");   
        f1.mkdirs();
    }
}