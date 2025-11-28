public class Replacing3 {
    public static void main(String[] args) {
        String s1 = "abcd acbd adbc";
        String s2 = s1.replaceAll("[ab]","%#@");
        System.out.println(s2);

        String s3 = "abcd acbd adbc";
        String s4 = s3.replaceAll("[c]","%#@");
        System.out.println(s4);
    }
}
