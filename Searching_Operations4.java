import java.util.Scanner;

public class Searching_Operations4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the Email : ");
            String email = sc.nextLine();

            if (email.contains("@") && email.contains(".")) {
                System.out.println("Valid Email-Id");
                break;
            } 
            else {
                System.out.println("InValid Email-Id");
            }
        }
    }
}
