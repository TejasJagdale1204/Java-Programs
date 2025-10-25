public class MultiThreading19 {
    public static void main (String [] args) throws InterruptedException {
        System.out.println("Main End");
        MultiThreading18 mt1 = new MultiThreading18();
        
        System.out.println("In main #1 : "+mt1.getState());
        mt1.start();
        
        System.out.println("In main #2 : "+mt1.getState());
        
        Thread.sleep(2000);   //for pausing main thread for allowing custom thread to run.
        System.out.println("In main #4 : "+mt1.getState());
        
        Thread.sleep(7000);
        System.out.println("In main #5 : "+mt1.getState());
        
        System.out.println("Main End");
    }
}
