class Polymorphism4 extends Polymorphism1 {
    private static final float pi=3.14f;
    private int r;
    
    Polymorphism4 (int r) {
        this.r=r;
    }
    void area() {
        System.out.println("Area of Circle : "+(pi*r*r));
    }
}
