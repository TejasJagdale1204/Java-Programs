import java.util.Scanner;
public class MultiThreading6 {
    static void m1() {
        System.out.println("m1 start");
        System.out.println("m1 end");
    }
    static void m2() {
        System.out.println("m2 start");

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scn.nextInt();
        System.out.println("Entered number is : "+num);

        System.out.println("m2 end");
    }
    static void m3() {
        System.out.println("m3 start");
        System.out.println("m3 end");
    }
}