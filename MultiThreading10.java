public class MultiThreading10 {
    public static void main (String [] args) {
        System.out.println("main start");

        MultiThreading7 mt1 = new MultiThreading7();
        MultiThreading8 mt2 = new MultiThreading8();
        MultiThreading9 mt3 = new MultiThreading9();

        mt1.start();
        mt2.start();
        mt3.start();

        System.out.println("main end");
    }
}
