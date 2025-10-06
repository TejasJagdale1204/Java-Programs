class MH_MOVR_MOVL10 extends MH_MOVR_MOVL9 {
    public static void main (String [] args) {
        MH_MOVR_MOVL9.m1(5);
      //MH_MOVR_MOVL9.m1(5.0);  //Compile time error
        MH_MOVR_MOVL9.m1(5.0F);
        MH_MOVR_MOVL9.m1("Tejas");
    }
}
