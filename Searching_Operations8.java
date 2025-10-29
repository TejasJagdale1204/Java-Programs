import java.util.Scanner;

public class Searching_Operations8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the filename : ");
            String filename = sc.nextLine();

            if(filename.endsWith(".txt")) {
                System.out.println(filename + " is a txt file");
                break;
            }
            else {
                System.out.println(filename + " is not a txt file ");
            }
        }
    }
}
