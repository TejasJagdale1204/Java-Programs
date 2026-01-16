import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOStream15 {
    public static void main(String[] args) {
        try(
            ObjectInputStream ois = 
                new ObjectInputStream(new FileInputStream("student.ser"));
        ) {
            Object obj = ois.readObject();
		    Student st =(Student)obj;
		    System.out.println(st);
        }   
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}