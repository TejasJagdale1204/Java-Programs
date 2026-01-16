import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOStream14 {
    public static void main(String[] args) {
        try(
            ObjectOutputStream oos = 
                new ObjectOutputStream(new FileOutputStream("student.ser"));
        ) {
            Student s1 = new Student();

            s1.setSno(101);
		    s1.setSname("Hari");
		    s1.setCourse("FSJD");
		    s1.setFee(20000);
		    s1.setUsername("HK");
		    s1.setPassword("NiT#1");

            oos.writeObject(s1);
            System.out.println("Student object data is saved");

            oos.close();
        }   
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}