public class checking_operation1 {
    public static void main (String [] args) {

        String s1 = "";         //empty string
        String s2 = " ";        //blank string
        String s3 = "  ";       //blank string
        String s4 = "abc";      //characters string  
        
        System.out.println(s1.isEmpty() + " " + s1.isBlank() + " " + s1.length());
        System.out.println(s2.isEmpty() + " " + s2.isBlank() + " " + s2.length());
        System.out.println(s3.isEmpty() + " " + s3.isBlank() + " " + s3.length());
        System.out.println(s4.isEmpty() + " " + s4.isBlank() + " " + s4.length());
    }    
}
