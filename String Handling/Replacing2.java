public class Replacing2 {
    public static void main(String[] args) {
        String s1 = "abc seed free ee ateebcc";
        String s2 = s1.replace("ee","*");
        System.out.println(s2);

        System.out.println();

        String s3 = "abcd abcd cdba acbd abcd";
        String s4 = s3.replace("bc","@#$%");
        System.out.println(s4);
    }
}
