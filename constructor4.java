class constructor4 {
    constructor4(int a) {
        System.out.println("IPC");
    } 
    
    void display() {
        System.out.println("Hi");
    }
    
    public static void main (String [] args) {
        System.out.println("main");

        constructor4 e3=new constructor4(5); 
        e3.display();
    }
}
