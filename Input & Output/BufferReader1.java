import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class BufferReader1 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter 1st Number : ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Enter 2st Number : ");
        int b = Integer.parseInt(br.readLine());

        int c = a + b;
        System.out.println("Result = "+c);
    }
}
//Run in Terminal