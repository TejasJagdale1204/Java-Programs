public class Split_Operations1 {
    public static void main(String[] args) {
        String s1 = "Java Programming Language";
        System.out.println(s1);
        System.out.println();

        String[] a = s1.split("");
        String[] b = s1.split(" ");

        System.out.println(a[0]);
        System.out.println(a[1]);

        System.out.println();
        
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
    }
}
