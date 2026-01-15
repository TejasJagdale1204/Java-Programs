import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class IOStream13 {
    public static void main(String[] args) {
        
        try(
            FileInputStream fis = new FileInputStream("abc.txt");
            DataInputStream dis = new DataInputStream(fis);
        ) {

            byte byte1 = dis.readByte();
            short short1 = dis.readShort();
            int int1 = dis.readInt();
            long long1 = dis.readLong();
            float float1 = dis.readFloat();
            double double1 = dis.readDouble();
            char char1 = dis.readChar();
            boolean boolean1 = dis.readBoolean();
            String utf = dis.readUTF();

            System.out.println(byte1);
            System.out.println(short1);
            System.out.println(int1);
            System.out.println(long1);
            System.out.println(float1);
            System.out.println(double1);
            System.out.println(char1);
            System.out.println(boolean1);
            System.out.println(utf);

		    dis.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
