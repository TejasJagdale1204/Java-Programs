// Develop a program to copy file data from abc.txt to bbc.txt

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
class IOStream5 {
    public static void main(String[] args) throws FileNotFoundException , IOException {

        FileInputStream fis = new FileInputStream("abc.txt");
        FileOutputStream fos = new FileOutputStream("bbc.txt",true);

        int data;
        while((data=fis.read()) != -1) {
            fos.write(data);
        }

        System.out.println("File is copied");
        fis.close();
        fos.close();
    }
}