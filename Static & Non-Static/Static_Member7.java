class Static_Member7 {
    static int a = 10;
    static {
        System.out.println("In G SB");
        System.out.println("a : "+a);
        //System.out.println("b : "+b);
        System.out.println("b : "+Static_Member8.b);
        System.out.println("b : "+Static_Member8.getB());
    }
}
