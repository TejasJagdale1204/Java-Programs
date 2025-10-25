public class MultiThreading18 extends Thread {
    @Override
    public void run() {
        System.out.println("run start");
        System.out.println("In run #3 : "+getState());

        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run end");
    }
}

