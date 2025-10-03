class MH_MOVR_MOVL3 {
    public static void main (String [] args) {
        
        MH_MOVR_MOVL1 a1 = new MH_MOVR_MOVL1();
        System.out.println(a1.a);
        System.out.println(a1.x);
        a1.m1();
        a1.m2();
      //a1.m3();  //CE
        System.out.println();
        
        MH_MOVR_MOVL2 b1 = new MH_MOVR_MOVL2();
        System.out.println(b1.a);
        System.out.println(b1.x);
        b1.m1();
        b1.m2();
        b1.m3();
        System.out.println();

        MH_MOVR_MOVL1 a2 = new MH_MOVR_MOVL2();
        System.out.println(a2.a);
        System.out.println(a2.x);
        a2.m1();
        a2.m2();
      //a2.m3();      //CE
        System.out.println();

      //B b2 = new A();     //CE
    }
}
/* Output is :

10
20
A m1
A m2

50
60
B m1
B m2
B m3

10
20
A m1
B m2  // If there is refrenced variable of super class & new object of sub class 
      // then static method is executed from super class & non-static method is executed from sub class

*/