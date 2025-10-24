//Q.The problem in approach #1 we cannot execute different logic  
//To execute different logic we must create multiple sub classes
//Develop multiple custom threads to execute two tasks adding and subtracting 
//given sequence of numbers
//Task1 : Add numbers 1-10
//Task2 : Subtract numbers 1-10
//Print the result in each iteration 

class MultiThreading11 extends Thread {
    @Override
    public void run() {
        int sum = 1;
        for (int i=2;i<=10;i++) {
            sum = sum + i;
            System.out.println("Summation : "+sum);
        }
    }
}