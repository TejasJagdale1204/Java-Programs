public class reverse1 {
    public static String reverse(String s) {
        String result = "";  //Empty String 
        for (int i=s.length()-1 ; i>=0 ; i--) {
            result +=  s.charAt(i);
        }
        return result;
    }
}