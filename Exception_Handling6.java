/* Develop a program to read a number as argumnet
check whether it is even or not

if not even, throw exception IllegalStateException 
with error message Do not pass odd number

if passed number is even, 
print number is even

In caling method, read number from keyboard */

import java.util.Scanner;
public class Exception_Handling6 {
    static void isEven(int num) throws IllegalStateException {
        if (num%2==0) {
            System.out.println(num+" is even");
        }
        else {
            throw new IllegalStateException("Do not pass odd number");
        }
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        try {
            Exception_Handling6.isEven(num);
        }
        catch(IllegalStateException e) {
            System.out.println("Error : "+e.getMessage());
        }
    }
}
