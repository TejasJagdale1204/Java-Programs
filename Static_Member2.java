class Static_Member2 extends Static_Member1 {
    static int b = m2();

    static int m2() {
        System.out.println("B SV");
        return 20;
    }

    static {
        System.out.println("B SB");
    }

    public static void main(String[] args) {
        System.out.println("B MM");
        System.out.println(a);
        System.out.println(b);
    }
}
