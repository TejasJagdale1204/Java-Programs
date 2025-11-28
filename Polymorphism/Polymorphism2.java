class Polymorphism2 extends Polymorphism1 {
    private int l;
    private int b;

    Polymorphism2(int l,int b) {
        this.l=l;
        this.b=b;
    }
    void area() {
        System.out.println("Area of Rectangle : "+(l*b));
    }
}
