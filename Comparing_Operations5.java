public class Comparing_Operations5 {
    public static void main (String [] args) {
        String s1 = "a";
        String s2 = "f";
        String s3 = "A";
        String s4 = "B";

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
// equalsIgnoreCase checks similar letter to letter. Ex) A and a  