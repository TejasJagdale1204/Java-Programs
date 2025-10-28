import java.util.Scanner;
public class Comparing_Operations6 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the username : ");
        String username = sc.nextLine();
        System.out.print("Enter the password : ");
        String password = sc.nextLine();

        String s1 = "hari";
        String s2 = "NiT#1";

        if(s1.equals(username) && s2.equals(password)) {
            System.out.println("Welcome to NIT");
        }
        else {
            System.out.println("Invalid username or password");
        }
    }
}
