import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class BufferedReader1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        fr.close();
        br.close();
    }
}
