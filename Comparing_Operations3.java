public class Comparing_Operations3 {
    public static void main (String [] args) {
        String s1 = "a";
        String s2 = "a";
        String s3 = "A";
        String s4 = "A";

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));
    }
}
