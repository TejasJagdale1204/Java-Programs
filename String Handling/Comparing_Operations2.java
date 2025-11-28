public class Comparing_Operations2 {
    public static void main (String [] args) {
        String s1 = new String("a");
        String s2 = new String("a");
        String s3 = new String("A");
        String s4 = new String("A");

        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1==s3);
        System.out.println(s2==s4);
        System.out.println(s1==s4);
    }
}
