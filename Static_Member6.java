class Static_Member6 extends Static_Member5 {
    static int b = m2();

    static int m2() {
        System.out.println("F SV");
        return 20;
    }

    static {
        System.out.println("F SB");
    }

}