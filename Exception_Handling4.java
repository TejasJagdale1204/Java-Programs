//NegativeNumberException & Addition1 also includes
import java.util.InputMismatchException;
class Exception_Handling4 {
    public static void main (String [] args) {
        java.util.Scanner scn = new java.util.Scanner(System.in);

        try {
            System.out.print("Enter FNO : ");
            int a = scn.nextInt();
            System.out.print("Enter SNO : ");
            int b = scn.nextInt();
            int res = Exception_Handling3.add(a,b);
            System.out.println("Result : "+res);
        }
        catch(InputMismatchException e) {
            System.out.println("Error : pass only integers");
        }
        catch(Exception_Handling2 e) {
            System.out.println("Error : "+e.getMessage());
        }
    }
}
