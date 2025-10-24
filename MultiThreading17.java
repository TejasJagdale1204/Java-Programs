public class MultiThreading17 {
    public static void main (String [] args) {
        System.out.println("main start");

        MultiThreading15 mt1 = new MultiThreading15();
        mt1.start();

        System.out.println("main end");
    }
}
              