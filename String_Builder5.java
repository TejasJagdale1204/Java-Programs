public class String_Builder5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tejas J Jagdale");
        System.out.println(sb);

        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(2));

        sb.setCharAt(1,'T');
        System.out.println(sb);

        sb.setCharAt(2,'e');
        System.out.println(sb);
    }
}
