import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStream12 {
    public static void main(String[] args) {

        try(
            FileOutputStream fos = new FileOutputStream("abc.txt");
            DataOutputStream dos = new DataOutputStream(fos);
        ) {
            dos.writeByte(97);
            dos.writeShort(98);
            dos.writeInt(99);
		    dos.writeLong(100);
		    dos.writeFloat(101.0f);
		    dos.writeDouble(102.0);
		    dos.writeChar('g');
		    dos.writeBoolean(true);
		    dos.writeUTF("Hari");
		
		    System.out.println("data is saved");
            dos.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}