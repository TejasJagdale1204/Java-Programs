public class Polymorphism9 {
    public static void main (String [] args) {
        
        Polymorphism6 a;   // reference variable of type Animal
        
        a = new Polymorphism7();  
        a.sound();  

        a = new Polymorphism8();
        a.sound();  
    }
}
