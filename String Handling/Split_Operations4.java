import java.util.Arrays;
public class Split_Operations4 {
    public static void main(String[] args) {
        String s1 = "a1b2c3D4";
        
        String [] a = s1.split("123");
        System.out.println(a.length + "\t" + Arrays.toString(a));

        String [] b = s1.split("1");
        System.out.println(b.length + "\t" + Arrays.toString(b));

        String [] c = s1.split("[123]");
        System.out.println(c.length + "\t" + Arrays.toString(c));

        String [] d = s1.split("[0-9]");
        System.out.println(d.length + "\t" + Arrays.toString(d));

        String [] e = s1.split("[a-z]");
        System.out.println(e.length + "\t" + Arrays.toString(e));

        String [] f = s1.split("[A-Z]");
        System.out.println(f.length + "\t" + Arrays.toString(f));
    }
}
