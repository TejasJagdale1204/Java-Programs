import java.util.Arrays;
public class Converting_Operations2 {
    public static void main(String[] args) {
        String s1 = "abc";
        byte[] b1 = s1.getBytes();
        System.out.println(Arrays.toString(b1));

        String s2 = "ABCDEF";
        byte[] b2 = s2.getBytes();
        System.out.println(Arrays.toString(b2));
    }
}
