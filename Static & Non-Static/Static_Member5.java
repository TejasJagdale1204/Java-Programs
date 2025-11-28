class Static_Member5 {
    static int m1() {
        System.out.println("E SV");
        return 10;
    }

    static {
        System.out.println("E SB");
    }

    static int a = m1();

    public static void main(String[] args) {
        System.out.println("E MM");
    }
}