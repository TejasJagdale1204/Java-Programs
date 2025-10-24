public class MultiThreading15 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread11.run()  start");
        
        MultiThreading16 mt2 = new MultiThreading16();
        mt2.start();

        System.out.println("MyThread11.run()  end");
    }
}
