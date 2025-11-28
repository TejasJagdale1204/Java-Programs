public class checking_operation4 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = "Programming";

        // HashCode values
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        System.out.println("s3 hashCode: " + s3.hashCode());
        System.out.println("s4 hashCode: " + s4.hashCode());

        // Checking equality with hashCode
        System.out.println("s1 and s2 same hash? " + (s1.hashCode() == s2.hashCode())); // true
        System.out.println("s1 and s3 same hash? " + (s1.hashCode() == s3.hashCode())); // true
        System.out.println("s1 and s4 same hash? " + (s1.hashCode() == s4.hashCode())); // false
    }
}
