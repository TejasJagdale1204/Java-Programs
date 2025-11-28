public class Finally_Block3 {
    public static void main (String [] args) {
        System.out.println("From main result : "+ m1());
    }
    static int m1() {
        System.out.println("Before Try");
        System.out.println(10/0);

        try {
            System.out.println("In Try");
        }
        catch (ArithmeticException e) {
            System.out.println("In Catch");
        }
        finally {
            System.out.println("In Finally");
        }
        System.out.println("After try/catch/finally");
        return 20;
    }
}
