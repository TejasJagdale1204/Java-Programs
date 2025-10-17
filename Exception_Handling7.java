class Exception_Handling7 {
    static void sam(int a , int b) throws ArithmeticException {
        if (b==0) 
            throw new ArithmeticException("Error : Do not pass zero as second value");
            int c=a*b;
            System.out.println("Result : "+c);       
    }
    public static void main (String [] args) {
        try {
            Exception_Handling7.sam(10,0);
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}