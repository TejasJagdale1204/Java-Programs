class Finally_Block2 {
    public static void main (String [] args) {
        System.out.println("From main result : "+ m1());
    }
    static int m1() {
        System.out.println("Before Try");

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