class Polymorphism3 extends Polymorphism1 {
    private int s;
    
    Polymorphism3(int s) {
        this.s=s;
    }
    void area() {
        System.out.println("Area of Square : "+(s*s));
    }
}
