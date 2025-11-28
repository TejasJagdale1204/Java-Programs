public class Finally_Block9 {
    public static void main (String [] args) {
        System.out.println(m1());
        m2();
    }
    static int m1() {
        System.out.println("Before try");
        
        try {
        System.out.println("In try");
        //return 10;
        //return 10/0;
        //Integer.parseInt("a");
        }
        catch(ArithmeticException e) {
            System.out.println("In Catch");
            return 20;
        }
        finally {
            System.out.println("In finally");
            return 30;
        }
        //System.out.println("After try/catch/finally");
    }

    static void m2() {
        try {
            System.out.println("In try");
            System.out.println(10/0);
        }
        finally {
            System.out.println("In finally");
            return;
        }
    }
}
