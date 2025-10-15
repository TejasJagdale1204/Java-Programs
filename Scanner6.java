import java.util.Scanner;
class Scanner6 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("\nYou Entered : ");
        System.out.println("Student Number is : "+num);
        System.out.println("Student Name is : "+name);
    }
}
//Run in Terminal