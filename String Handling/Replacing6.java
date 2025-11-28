import java.util.Scanner;
public class Replacing6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = scn.nextLine();

        String convertedName = "";
        String[] words = name.split(" ");

        for(int i=0;i<words.length;i++) {
            String word = words[i];
            convertedName = convertedName + 
                (word.substring(0,1).toUpperCase()
                    + word.substring(1) + " ");
        }
        convertedName = convertedName.trim();
        System.out.println(name + " " + name.length());
        System.out.println(convertedName + " " + convertedName.length());
    }
}