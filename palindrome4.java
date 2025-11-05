import java.util.Scanner;
public class palindrome4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s1 = sc.nextLine();

        boolean pali = palindrome3.isPalindrome(s1);

        if(pali) {
            System.out.println(s1 + " is a palindrome");
        }
        else {
            System.out.println(s1 + " is not a palindrome");
        }
    }
}