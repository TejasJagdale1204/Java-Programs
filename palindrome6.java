import java.util.Scanner;
public class palindrome6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s1 = sc.nextLine();

        String s2 = palindrome5.reverseWords(s1);

        System.out.println("Original string : " + s1);
        System.out.println("Reverse String : " + s2);
    }
}
