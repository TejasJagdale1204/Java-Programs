import java.util.Arrays;
public class Split_Operations5 {
    public static void main(String[] args) {
        String s1 = "abc | bbc | cbc";

        String [] a = s1.split("|");
        System.out.println(a.length + "\t" + Arrays.toString(a));

        String [] b = s1.split("\\|");
        System.out.println(b.length + "\t" + Arrays.toString(b));

        String s2 = "abc.bbc.cbc";

        String [] c = s2.split(".");
        System.out.println(c.length + "\t" + Arrays.toString(c));

        String [] d = s2.split("\\.");
        System.out.println(d.length + "\t" + Arrays.toString(d));
    }
}
