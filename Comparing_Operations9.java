public class Comparing_Operations9 {
    public static void main(String[] args) {
        String s1 = "B";
        String s2 = "b";
        System.out.println(s1.compareToIgnoreCase(s2));

        String s3 = "ab";
        String s4 = "ac";
        System.out.println(s3.compareToIgnoreCase(s4));

        String s5 = "abc";
        String s6 = "abc";
        System.out.println(s5.compareToIgnoreCase(s6));

        String s7 = "ABC";
        String s8 = "SJI";
        System.out.println(s7.compareToIgnoreCase(s8));

        String s9 = "eWO";
        String s10 = "AOE";
        System.out.println(s9.compareToIgnoreCase(s10));

        String s11 = "T";
        String s12 = "t";
        System.out.println(s11.compareToIgnoreCase(s12));
    }
}
