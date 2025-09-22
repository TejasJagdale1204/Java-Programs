class Non_Static_Members2 {
    int x = m1(); 
    int m1() {
        System.out.println("NSV1 is executed");
        return 10;
    }
    {
        System.out.println("NSB1 is executed");            
    }
    Non_Static_Members2() {
        System.out.println("NPC is executed");
    }
    Non_Static_Members2(String s) {
        System.out.println("SPC is executed");
    }
    {
        System.out.println("NSB2 is executed");               
    }
    int y = m2();
    int m2() {
        System.out.println("NSV2 is executed");
        return 20;
    } 
    public static void main (String [] args) {
        System.out.println("MM execution start");
        Non_Static_Members2 t1= new Non_Static_Members2();
        Non_Static_Members2 t2= new Non_Static_Members2("TEJAS");
        System.out.println("MM execution end");
    }
    int z = m3();
    int m3() {
        System.out.println("NSV3 is executed");
        return 30;
    }
    {
        System.out.println("NSB3 is executed");
    }
    void m4() {
        System.out.println("NSM is executed");
    }
}
