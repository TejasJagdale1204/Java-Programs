//Develop a program to modify file data in the same file . Replace abc with xyz in the same file.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
public class IOStream9 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

        //copying file content into StringBuffer Object
        StringBuilder sb = new StringBuilder();
        while(br.ready()) {
            sb.append(br.readLine());
            sb.append("\n");
        }

        //converting StringBuffer Object into String
        String s1 = sb.toString().replace("abc","xyz");
        
        //Writing modified content into file
        FileWriter fw = new FileWriter("abc.txt");
        fw.write(s1);

        fw.flush();
        System.out.println("file content is modified");

        br.close();
        fw.close();
    }
}