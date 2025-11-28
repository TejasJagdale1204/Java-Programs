public class trimming1 {
    public static void main(String[] args) {
        String s1 = "  Tejas Jagdale       ";
        System.out.println("Length of the String s1 is : " + s1.length());
        String s2;
        s2=s1.trim();  // Removes all left and right spaces
        System.out.println(s2 + " " + ", Length of the String is : " + s2.length());
    }
}
