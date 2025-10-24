class MultiThreading13 extends Thread{
    @Override
    public void run() {
        int multi = 1;
        for(int i=2;i<11;i++) {
            multi = multi * i;
            System.out.println("Multiplication : "+multi);
        }
    }
}
