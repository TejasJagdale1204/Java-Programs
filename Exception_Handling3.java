//NegativeNumberException also includes
class Exception_Handling3 {
    static int add(int a,int b) throws Exception_Handling2 {
        if(a<0 || b<0) {
            throw new Exception_Handling2("Do not pass negative number");
        }
        int res = a + b;
        return res;
    }
}
