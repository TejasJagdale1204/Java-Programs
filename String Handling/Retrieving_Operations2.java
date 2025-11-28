import java.util.Scanner;
public class Retrieving_Operations2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        String s1 = sc.nextLine().toLowerCase();

        int vowelsCount=0;
        int consonentsCount=0;

        for(int i=0;i<s1.length();i++) {
            char ch = s1.charAt(i);
            
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                vowelsCount++;
            }
            else {
                consonentsCount++;
            }
        }
        System.out.println("Vowels Count : " + vowelsCount);
        System.out.println("Consonents Count : " + consonentsCount);
    }
}
