import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStream11 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        FileOutputStream fos = new FileOutputStream("output.txt");

        int byteCount = 0;
        int characterCount = 0;
        int data;

        while( (data=fis.read()) != -1) {
            fos.write(data);
            byteCount++;

            if(data != ' ' && data != '\n') {
                characterCount++;
            }
        }

        fos.close();
        fis.close();

        System.out.println(byteCount);
        System.out.println(characterCount);
    }
}