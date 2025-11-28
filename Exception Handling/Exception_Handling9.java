public class Exception_Handling9 {
    public static void main (String [] args) {
        System.out.println("main start");
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("Result = "+c);
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Pass two integers , only integers");
        }
        catch (ArithmeticException e) {
            System.out.println("Do not pass zero as second value");
        }
        System.out.println("main end");
    }
}
