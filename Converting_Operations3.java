public class Converting_Operations3 {
    public static void main(String[] args) {
        String s1 = String.valueOf(10);      //converts int value to the string   
        System.out.println(s1);

        String s2 = String.valueOf(10.5);    //converts double value to the string 
        System.out.println(s2);

        System.out.println(10 + 10.5);         //this is only addition and stores in int 

        System.out.println("10" + "10.5");     //this is concatenation does not perform the addition 

        System.out.println(s1 + s2);           //this is the proof of valueOf method
                                               //here s1 is int and s2 is double but the additiion is String
    }
}
