import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
public class BufferedReader2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        FileWriter fw = new FileWriter("bbc.txt");

        String line;
        while((line = br.readLine()) != null) {
            if(line.contains("a")) {
                fw.write(line + "\n");
            }
        }
        
        fw.flush();
        System.out.println("file copied");
        
        fw.close();
        br.close();
    }
}
