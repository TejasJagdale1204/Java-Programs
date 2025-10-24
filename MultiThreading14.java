public class MultiThreading14 {
    public static void main (String [] args) {
        MultiThreading11 t1 = new MultiThreading11();
        MultiThreading12 t2 = new MultiThreading12();
        MultiThreading13 t3 = new MultiThreading13();

        t1.start();
        t2.start();
        t3.start();
        
        t1.run();
        t2.run();
        t3.run();
    }
}