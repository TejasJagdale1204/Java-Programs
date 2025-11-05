public class String_Builder7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tejas J Jagdale");
        System.out.println(sb);

        sb.deleteCharAt(6);
        System.out.println(sb);

        System.out.println(sb.length());

        sb.deleteCharAt(5);
        System.out.println(sb);

        sb.delete(5,13);
        System.out.println(sb);
    }
}
