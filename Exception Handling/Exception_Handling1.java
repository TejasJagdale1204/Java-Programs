public class Exception_Handling1 {
    static int add (int a , int b) throws IllegalArgumentException {
        if (a<0||b<0) {
            throw new IllegalArgumentException("Do not pass negative numbers");
        }
        else {
            return a+b;
        }
    }
    public static void main(String[] args) {
        try {
            int res=Exception_Handling1.add(7,13);
            System.out.println("Result = "+res);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error : "+e.getMessage());
        }
    }
}
