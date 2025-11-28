import java.util.Scanner;
public class program2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        if(a>=1 && a<=5) {
            switch (a) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                default:
                    System.out.println("Invalid Choise !!");
                    break;
            }
        }
    }
}
