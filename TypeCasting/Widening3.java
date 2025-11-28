class Widening3 {
    public static void main (String [] args) { 
        
        Widening2 s = new Widening2();
        s.add(10,20);
        s.add("abc",20);
        s.add("abc","xyz");
        s.add("10",20.0);
        //s.add(10,20.0F);   // compile time error
        System.out.println();

        Widening1 r = new Widening1();
        r.add(10,20);
        r.add("abc",20);
        r.add("abc","xyz");
        //r.add(10,20.0);    // compile time error
    }
}
