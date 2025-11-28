class Static_Member4 extends Static_Member3 {
    static int b = m2();

    static int m2() {
        System.out.println("D SV");
        return 20;
    }

    static {
        System.out.println("D SB");
    }

    public static void main(String[] args) {
        System.out.println("D MM");
        System.out.println(a);
        System.out.println(b);
    }
}
