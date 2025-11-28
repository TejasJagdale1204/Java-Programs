class Abstraction3 {
    public static void main (String [] args) {
        // Example e1=new Example();
        // e1.m1();

        Abstraction2 s1 = new Abstraction2();
        s1.m1();

        Abstraction1 e1 = new Abstraction2();
        e1.m1();
    }
}
