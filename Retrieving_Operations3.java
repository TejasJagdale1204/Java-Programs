import java.util.Scanner;

public class Retrieving_Operations3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Password : ");
        String password = sc.nextLine();

        int len = password.length();
        if (len < 8 || len > 32) {
            System.out.println("Error : Password length must be greater than or equal to 8 and  than less or equal to 32");
            return;
        }
        
        boolean upperCaseLetterFound = false;
        boolean digitFound = false;
        boolean specialCharacterFound = false;
        
        for (int i = 0; i < len; i++) {
            char ch = password.charAt(i);

            if (ch == ' ') {
                System.out.println("Error : Password cannot have space");
                return;
            } 
            else if (ch >= 'A' && ch <= 'Z') {
                upperCaseLetterFound = true;
            } 
            else if (ch >= '0' && ch <= '9') {
                digitFound = true;
            } 
            else if (!(ch >= 'a' && ch <= 'z')) { // if not Uppercase , not Lowercase and not digit then it is
                                                    // special character
                specialCharacterFound = true;
            }
        }
        if(!(upperCaseLetterFound && digitFound && specialCharacterFound)) {
            System.out.println("Error : Password must contain one uppercaseletter , digit and special character.");
        } 
        else {
            System.out.println("Valid Password");
        }
    }
}
