public class Comparing_Operations8 {
    public static void main (String [] args) {
        String s1 = "a";
        String s2 = "b";
        System.out.println(s1.compareTo(s2));  // It will give the difference between ascii numbers

        String s3 = "ab";
        String s4 = "ac";
        System.out.println(s3.compareTo(s4));  // a-a=0 & b-c=1

        String s5 = "abc";
        String s6 = "abc";
        System.out.println(s5.compareTo(s6));  // differnce is 0

        String s7 = "ABC";
        String s8 = "SJI";
        System.out.println(s7.compareTo(s8));  // it will check first character of two strings 
                                               // if it is zero then it will move to the second character
                                               // if second character is non-zero then it checks the difference 
                                               // and terminates the process 
                                               // A-S means 65-83=(-18)

        String s9 = "b";
        String s10 = "a";
        System.out.println(s9.compareTo(s10));    
        
        String s11 = "SBC";
        String s12 = "SBI";
        System.out.println(s11.compareTo(s12));

        String s13 = "T";
        String s14 = "t";
        System.out.println(s13.compareTo(s14));
    }
}
