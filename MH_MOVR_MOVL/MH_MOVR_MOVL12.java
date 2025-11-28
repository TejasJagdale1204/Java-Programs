public class MH_MOVR_MOVL12 extends MH_MOVR_MOVL11{
    public static void main(String[] args) {
        MH_MOVR_MOVL11 m = new MH_MOVR_MOVL11();

        System.out.println("Sum of 2 ints: " + m.add(5, 10));
        System.out.println("Sum of 3 ints: " + m.add(2, 4, 6));
        System.out.println("Sum of doubles: " + m.add(2.5, 3.5));
    }
}
