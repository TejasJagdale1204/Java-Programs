import java.util.Scanner;
public class Retrieving_Operations7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s1 = sc.nextLine();
        String s2 = s1.toLowerCase(); // all characters converted in lower case for comparing 

        int start = s2.indexOf("program");
        if(start != -1) {
            int end = start + 7;  // adding number of characters of the word to find the end index

            String s3 = s1.substring(start,end);
            System.out.println("The word \"" + s3 + "\" is found");
        }
        else {
            System.out.println("Error : The word \"Program\" is not found");
        }
    }
}
