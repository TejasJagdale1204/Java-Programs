class Finally_Block1 {
    public static void main (String [] args) {
        System.out.println("before try");
        try {
            System.out.println("in try");
        }
        catch(ArithmeticException e) {
            System.out.println("in catch");
        }
        finally {
            System.out.println("in finally");
        }
        System.out.println("after try/catch/finally");
        System.out.println();
//==============================================================================
        System.out.println("BEFORE TRY");
        try {
            System.out.println("IN TRY");
        }
        finally {
            System.out.println("IN FINALLY");
        }
        System.out.println("AFTER TRY/CATCH/FINALLY");
    }
}