public class String_Builder3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("India");
        System.out.println(sb);
        
        sb.insert(sb.length()," Maharashtra");
        System.out.println(sb);

        sb.insert(sb.length()," Sangli");
        System.out.println(sb);

        sb.insert(sb.length()," Kadegaon");
        System.out.println(sb);

        sb.insert(sb.length()," Ambak");
        System.out.println(sb);
    }
}
