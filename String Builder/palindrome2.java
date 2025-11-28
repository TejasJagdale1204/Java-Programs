import java.util.Scanner;
public class palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s1 = sc.nextLine();

        String s2 = palindrome1.palindrome(s1);

        if(s1.equals(s2)) {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}