import java.util.InputMismatchException;
import java.util.Scanner;
class Exception_Handling8 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println(sc);
        try {
            System.out.print("Enter first number : ");
            int a = sc.nextInt();
            System.out.print("Enter second number : ");
            int b = sc.nextInt();
            
            int c = a/b;
            System.out.println("Result : "+c);
        }
        catch(InputMismatchException e) {
            System.out.println("\nError : pass only integer");
        }
        catch(ArithmeticException e) {
            System.out.println("\nError : Do not pass zero as second value");
        }
    }
}
