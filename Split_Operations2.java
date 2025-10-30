import java.util.Arrays;
public class Split_Operations2 {
    public static void main(String[] args) {
        String s1 = "Java Programming Language";
        System.out.println(s1);
        System.out.println();

        String[] a = s1.split("");
        String[] b = s1.split(" ");
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}