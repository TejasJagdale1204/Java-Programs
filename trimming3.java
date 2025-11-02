public class trimming3 {
    public static void main(String[] args) {
        String s1 = "    \0  Tejas Jagdale       \0             ";
        System.out.println(s1);

        String s2 = s1.trim();    // removes all the blank space with null character
        System.out.println(s2);

        String s3 = s1.strip();   // only removes blank space 
        System.out.println(s3);

        String s4 = s1.stripTrailing();   // only removes right side blank space 
        System.out.println(s4);

        String s5 = s1.strip();   // only removes left side blank space 
        System.out.println(s5);
    }
}
