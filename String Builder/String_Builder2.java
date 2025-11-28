public class String_Builder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("SCOE");
        System.out.println(sb);

        sb.insert(0,"PUNE");
        System.out.println(sb);

        sb.insert(4," ");
        System.out.println(sb);

        sb.insert(9," CSE");
        System.out.println(sb);

        sb.insert(13,1);
        System.out.println(sb);
    }
}
