import java.util.Scanner;
public class checking_operation3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter the Mobile Number : ");
            String mobile = sc.nextLine();

            try {
                long mobilenumber = Long.parseLong(mobile);
                if(mobile.length()==10) {
                    System.out.println("OTP is send to your mobile");
                    break;
                }
                else {
                    System.out.println("Mobile number must have 10 digits");
                }
            }
            catch(NumberFormatException e) {
                System.out.println("Mobile number must have only digits");
            }
            System.out.println();
        }
    }
}
 