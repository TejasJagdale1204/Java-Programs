class Widening6 {
    static void m1(Widening4 e) {
        System.out.println("Widening4-Param");
    }
    public static void main (String [] args) {
        m1(new Widening4());
        m1(new Widening5());
        m1(null);

       // m1(new C());
       // m1("abc");
    }
}
