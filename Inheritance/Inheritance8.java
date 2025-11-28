class Inheritance8 extends Inheritance7 {
    int y = m3();
    int m3() {
        System.out.println("Sa NSV");
        return 20;
    }
    { 
        System.out.println("Sa NSB"); 
    }
    Inheritance8(){
        System.out.println("Sa NPC");
    }
    void m4(){
        System.out.println("Sa NSM");
    }
    public static void main (String [] args) {
        Inheritance8 s1 = new Inheritance8();
    }
}