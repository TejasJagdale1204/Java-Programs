class Static_Member9 {
    static int a=10;
    static {
        System.out.println("In I SB");
        System.out.println("a : "+a);
        System.out.println("b : "+Static_Member10.b);
    }
    public static void main (String [] args) {
        System.out.println("In I MM");
        System.out.println("a : "+a);
        System.out.println("b : "+Static_Member10.b);
    }
}
