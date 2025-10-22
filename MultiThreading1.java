//package Example1;
public class MultiThreading1 implements Runnable {
    @Override
    public void run () {
        System.out.println("run executed");
    }
    public static void main (String [] args) {
        System.out.println("main start");

        MultiThreading1 mr = new MultiThreading1();
        //mr.start();

        Thread th1 = new Thread(mr);
        th1.start();
        //JVM calls run() from CO class thread

        System.out.println("main end");
    }
}