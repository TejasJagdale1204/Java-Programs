public class MultiThreading3 {
    public static void main (String [] args) {
        MultiThreading2 mt1 = new MultiThreading2();
        mt1.start();

        //Task 1 : printing 1-20
        for(int i=1;i<=20;i++) {
            System.out.println("main : "+i);
        }
    }
}