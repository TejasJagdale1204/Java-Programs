class Widening2 extends Widening1 {
    void add(int x,int y) {
        System.out.println("Widening2 int,int");
    }

    float add(float x,int y) {
        System.out.println("Widening2 float,int");
        return x+y;
    }

    String add(String x,double y) {
        System.out.println("Widening2 String,double");
        return x+y;
    }
}
