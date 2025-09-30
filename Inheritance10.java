class Inheritance10 extends Inheritance9 {
    int y = 20;
    {
        System.out.println("Sample NSB");
    }
    Inheritance10() {
        System.out.println("Sample Constructor");
    }
    public static void main (String [] args) {
        Inheritance10 s1 = new Inheritance10();
        Inheritance9 e1 = new Inheritance9();
    }
}
