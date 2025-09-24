class constructor1  {
    constructor1 () {
        System.out.println("no param constructor");
    }
    constructor1 (int a) {
        System.out.println("int param constructor");
    }
    public static void main (String [] args) {
        System.out.println("main method");
        
        constructor1 e1=new constructor1();         //calling NPC
        constructor1 e2=new constructor1(10);     //calling IPC
        constructor1 e3=new constructor1('a');    //calling CPC , no CE , IPC is executed
        
        //constructor1 e4=new constructor1(5.6);    //calling DPC , CE
    }
}
