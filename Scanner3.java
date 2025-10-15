import java.util.Scanner;
class Scanner3 {
    public static void main (String [] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = scn.nextInt();
        
        System.out.print("Enter Second Number : ");
        int b = scn.nextInt();

        int c = a + b;
        System.out.println("Result = "+c);
    }
}
//Run in Terminal