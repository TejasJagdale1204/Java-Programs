class Static_Member15 extends Static_Member14 {
    static int b = 20;

    static {
        System.out.println("class B SB is executed");
    }

    public static void main(String[] args) {
        System.out.println("B main");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
