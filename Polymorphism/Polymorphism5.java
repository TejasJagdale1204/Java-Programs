class Polymorphism5 {
    public static void main (String [] args) {

        //static nature code or tight coupled , 
        //sub class ref var with sub type object 
        Polymorphism2 r1 = new Polymorphism2(5,6);
        r1.area();
        Polymorphism3 s1 = new Polymorphism3(4);
        s1.area();
        Polymorphism4 c1 = new Polymorphism4(3);
        c1.area();

        System.out.println();
        
        //Dynamic nature code or loosely coupled code
        //super class ref var with sub type object
        Polymorphism1 s;

        s = new Polymorphism2(5,6);
        s.area();
        s = new Polymorphism3(4);
        s.area();
        s = new Polymorphism4(3);
        s.area();
    }
}
