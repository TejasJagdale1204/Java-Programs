class Widening1 {
    void add(int a,int b) {
        System.out.println("Widening1 int,int");
    }

    void add(String a,float b) {
        System.out.println("Widening1 String,float");
    }
    
    int add(String s1,String s2) {
        System.out.println("Widening1 String,String");
        return 10;
    }
}
 