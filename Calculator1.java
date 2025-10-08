public class Calculator1 {
    int addition(int a , int b) {
        int add = a + b;
        System.out.println("Addition of two numbers is : "+add);
        return add;
    }
    int subtraction(int a , int b) {
        int subtract = a - b;
        System.out.println("Subtraction of two numbers is : "+subtract);
        return subtract;
    }
    int multiplication(int a , int b) {
        int multiply = a * b;
        System.out.println("Multiplication of two numbers is : "+multiply);
        return multiply;
    }
    int division(int a , int b) {
        int division = a / b;
        System.out.println("Division of two numbers is : "+division);
        return division;
    }
    int modulas(int a , int b) {
        int remainder = a % b;
        System.out.println("Remainder of two numbers is : "+remainder);
        return remainder;
    }
}
