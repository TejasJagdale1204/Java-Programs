//Type conversion AND Type casting

class Down_Casting1 {
    public static void main (String [] args) {
        // int i1=70;
        // char c1=i1;
        //System.out.println(i1);
        //System.out.println(c1);
        //above 4 statements leads to compile time error CE
        //we cannot store int value(i1) in char data type so we use down casting 

        int i1 = 70;
        char c1 = (char)i1;
        System.out.println(i1);
        System.out.println(c1);
    }
}
