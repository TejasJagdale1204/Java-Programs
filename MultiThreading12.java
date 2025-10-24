class MultiThreading12 extends Thread{
    @Override
    public void run() {
        int sub = 1;
        for(int i=2;i<=10;i++) {
            sub = sub - i;
            System.out.println("Subtraction : "+sub);
        }
    }
}
