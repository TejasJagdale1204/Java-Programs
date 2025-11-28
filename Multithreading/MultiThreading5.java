public class MultiThreading5 {
    public static void main (String [] args) {

        MultiThreading4 mr = new MultiThreading4();
        Thread th1 = new Thread(mr);
        th1.start();

        //Task 1 : printing 1-20
        for(int i=1;i<=20;i++) {
            System.out.println("main : "+i);
        }
    }
}
