class Static_Member8 extends Static_Member7 {
    static int b = 20;

    static {
        System.out.println("In H SB");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("b : " + getB());
    }

    static int getB() {
        return b;
    }

    public static void main(String[] args) {
        System.out.println("In H MM");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
