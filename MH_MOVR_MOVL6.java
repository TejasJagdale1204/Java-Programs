//method overloading with inheritance
public class MH_MOVR_MOVL6 {
    public static void main (String [] args) {
        
/*      MH_MOVR_MOVL4 e1 = new MH_MOVR_MOVL4();
        e1.m1(5);
        e1.m1(9.85F);   */  //CE

        MH_MOVR_MOVL5 s1 = new MH_MOVR_MOVL5();
        s1.m1(5);
        s1.m1(9.85F); //Executed successfully
        

/*      MH_MOVR_MOVL4 e2 = new MH_MOVR_MOVL5();
        e2.m1(5);
        e2.m2(9.85F);   */  //CE

/*      MH_MOVR_MOVL5 s2 = new MH_MOVR_MOVL4();
        s2.m1(5);
        s2.m1(9.85F);   */  //CE
    }
}
