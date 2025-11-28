class MultiThreading2 extends Thread {
    @Override
    public void run() {
        //Task 1 : printing 20-1
        for(int i=20;i>=1;i--) {
            System.out.println("run : "+i);
        }
    }
}
