class Static_Member10 extends Static_Member9 {
    static int b = 20;
    static {
        System.out.println("In J SB");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
    public static void main (String [] args) {
        System.out.println("In J MM");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}