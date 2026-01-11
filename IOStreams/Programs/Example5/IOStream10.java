// Develop a program to read and display employee names from a CSV file
// CSV file means a 'Comma Separated Values (CSV)' file
// The file extension also will be .csv
// Inside this file we must save names with , separated in one line

// names.csv
// Hari Krishna,Bala Krishna,Rama Krishna,Pavan Kalyan,Venkatesh

// Output
// Hari Krishna
// Bala Krishna 
// Rama Krishna 
// Pavan Kalyan
// Venkatesh

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
public class IOStream10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader
                    (new FileReader("names.csv"));
        String line;
        line = br.readLine(); 
        System.out.println(line);

        String [] names = line.split(",");
        int count = 0;
        for(String name : names) {
            System.out.println((count+1) + "." + name);
            count++;
        }
        System.out.println();
        System.out.println(count + " names are available");
    }
}
