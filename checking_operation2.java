import java.util.Scanner;

public class checking_operation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name : ");
        String username = sc.nextLine();

        if (username.isEmpty()) {
            System.out.println("Username cannot be Empty");
        } 
        else if (username.isBlank()) {
            System.out.println("Username cannot be Blank");
        } 
        else {
            System.out.println("Hello " + username + "\nWelcome to NareshIT");
        }
        System.out.println("Length of " + username + " is : " + username.length());
    }
}
