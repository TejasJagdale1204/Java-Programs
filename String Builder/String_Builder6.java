public class String_Builder6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tejas J Jagdale");

        sb.replace(0,5,"Shivtej");
        System.out.println(sb);

        sb.replace(0,9,"Raj");
        System.out.println(sb);
    }
}
