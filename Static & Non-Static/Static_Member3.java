class Static_Member3 {
    static int m1() {
        System.out.println("C SV");
        return 10;
    }

    static {
        System.out.println("C SB");
    }

    static int a = m1();

    public static void main(String[] args) {
        System.out.println("C MM");
    }
}