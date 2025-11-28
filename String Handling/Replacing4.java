public class Replacing4 {
    public static void main(String[] args) {
        String s1 = "abcd acbd adbc";
        String s2 = s1.replaceFirst("[ab]","%#@");    //only replacement of 'a' because it comes first
        System.out.println(s2);

        String s3 = "abc abc abc";
        String s4 = s3.replaceFirst("[cb]","%#@");    //only replacement of 'b' because it comes first
        System.out.println(s4);

        String s5 = "cabe ssaab";
        String s6 = s5.replaceFirst("[dcba]","%#@");  //only replacement of 'c' because it comes first
        System.out.println(s6);

        String s7 = "tejas jagdale";
        String s8 = s7.replaceFirst("[g]","%#@");    //only replacement of 'g' because it comes first
        System.out.println(s8); 
    }
}
