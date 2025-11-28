public class palindrome1 {
    public static String palindrome (String s) {
        String result = "";
        for (int i=s.length()-1 ; i>=0 ; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
