import java.util.Scanner;
public class reverse2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s1 = scn.nextLine();
        String s2 = reverse1.reverse(s1);    //reverse1 is the class name & reverse is the method name in the reverse1 class

        System.out.println("Original String : " + s1 + "\t" + s1.length());
        System.out.println("Reversed String : " + s2 + "\t" + s2.length());
    }
}
