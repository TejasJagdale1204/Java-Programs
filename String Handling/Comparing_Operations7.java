import java.util.Scanner;

public class Comparing_Operations7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the username : ");
            String username = sc.nextLine();
            System.out.print("Enter the password : ");
            String password = sc.nextLine();

            String s1 = "hari";
            String s2 = "NiT#1";

            if (s1.equalsIgnoreCase(username) && s2.equals(password)) { // equalsIgnoreCase is used because username is
                System.out.println("Welcome to NIT");                    // case sensitive
                break;
            } else {
                System.out.println("Invalid username or password");
            }
        }
    }
}
