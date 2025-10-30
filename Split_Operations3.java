import java.util.Arrays;
public class Split_Operations3 {
    public static void main(String[] args) {
        String s1 = "Java Programming Language";
        System.out.println();

        String [] a = (s1.split("v"));
        System.out.println(a.length + "\t" + Arrays.toString(a));

        String [] b = (s1.split("P"));
        System.out.println(b.length + "\t" + Arrays.toString(b));
             
        String [] c = (s1.split("m"));
        System.out.println(c.length + "\t" + Arrays.toString(c));

        String [] d = (s1.split("a"));
        System.out.println(d.length + "\t" + Arrays.toString(d));

        String [] e = (s1.split("Java Programming Language"));
        System.out.println(e.length + "\t" + Arrays.toString(e));

        String [] f = (s1.split("e"));
        System.out.println(f.length + "\t" + Arrays.toString(f));
    }
}
