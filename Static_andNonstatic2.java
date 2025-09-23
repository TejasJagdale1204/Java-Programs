class Static_andNonstatic2 extends Static_andNonstatic1 {
    static int b = m3();
    static {
        System.out.println("Sample SB");
    }
    int y = m4();
    {
        System.out.println("Sample NSB");
    }
    Static_andNonstatic2() {
        System.out.println("Sample Constructor");
    }
    static int m3() {
        System.out.println("Sample SV is created");
        return 30;
    }
    int m4() {
        System.out.println("Sample NSV is created");
        return 40;
    }
    void abc() {
        System.out.println("Sample abc");
    }
    public static void main (String [] args) {
        System.out.println("Sample main");
        Static_andNonstatic2 s = new Static_andNonstatic2();
        s.abc();
        s.bbc();
    }
}
                    