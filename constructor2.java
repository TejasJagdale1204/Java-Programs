class constructor2 {
    
    constructor2(int a) {
        System.out.println("IPC");
    } 
    
    void display() {
        System.out.println("Hi");
    }
    
    public static void main (String [] args) {
        System.out.println("main");

        constructor2 e1 = new constructor2(); //compile time error; because no param constructor 
                                    //(NPC) or default constructor(DC) is not available.
        e1.display();
    }
}