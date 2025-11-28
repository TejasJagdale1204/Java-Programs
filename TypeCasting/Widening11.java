class Widening11 {
    static void m1(int a) {
        System.out.println("int-param");
    }
    static void m1(long l) {
        System.out.println("long-param");
    }
    static void m1(float f) {
        System.out.println("float-param");
    }
    static void m1(double d) {
        System.out.println("double-param");
    }
    static void m1(Integer io) {
        System.out.println("Integer-param");
    }
    static void m1(Long lo) {
        System.out.println("Long-param");
    }
    static void m1(Number no) {
        System.out.println("Number-param");
    }
    static void m1(Object a) {
        System.out.println("Object-param");
    }
    static void m1(int... i) {
        System.out.println("int var arg-param");
    }
    static void m1(long... l) {
        System.out.println("long var arg-param");
    }
    static void m1(float... f) {
        System.out.println("float var arg-param");
    }
    static void m1(double... d) {
        System.out.println("double var arg-param");
    }
    static void m1(Integer... io) {
        System.out.println("Integer var arg-param");
    }
    static void m1(Long... lo) {
        System.out.println("Long var arg-param");
    }
    static void m1(Number... no) {
        System.out.println("Number var arg-param");
    }
    static void m1(Object... a) {
        System.out.println("Object var arg-param");
    }

    public static void main (String [] args) {
        m1(5);
    }
}

// ambiguous error happens sometimes if syntax is wrong 