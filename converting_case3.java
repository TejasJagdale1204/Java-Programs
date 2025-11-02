public class converting_case3 {
    public static void main(String[] args) {
        String s1 = "bbc";
        String s2 = s1.toLowerCase();
        System.out.println(s1==s2); 
        
        String s3 = "BBcc";
        String s4 = s3.toLowerCase();
        System.out.println(s3==s4);

        String s5 = "ABC";
        String s6 = s5.toUpperCase();
        System.out.println(s5==s6);

        String s7 = "ccdEE";
        String s8 = s7.toUpperCase();
        System.out.println(s7==s8);
    }
}
