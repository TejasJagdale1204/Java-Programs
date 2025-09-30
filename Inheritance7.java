class Inheritance7 {
    int x = m1();

    int m1() {
        System.out.println("Ex NSV");
        return 10;
    }

    {
        System.out.println("Ex NSB");
    }

    Inheritance7() {
        System.out.println("Ex NPC");
    }

    void m2() {
        System.out.println("Ex NSM");
    }

}