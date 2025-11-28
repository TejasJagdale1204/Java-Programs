public class palindrome3 {
    public static String reverse (String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static boolean isPalindrome(String s) {
        String reverse = reverse(s);
        return s.equals(reverse);
    }
}