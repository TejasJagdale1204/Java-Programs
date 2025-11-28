import java.util.Scanner;
public class concatenating7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the First Name : ");
        String s1 = scn.nextLine();
        
        System.out.print("Enter the Last Name : ");
        String s2 = scn.nextLine();

        String s3 = String.join(" " , "Hi",s1,s2);
        System.out.println(s3);
        System.out.println("Welcome to NareshIT");
    }
}