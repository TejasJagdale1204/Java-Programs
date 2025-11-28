class Non_Static_Members1 {
    int x = 10;

    {
        System.out.println("NSB1");
    }

    Non_Static_Members1() {
        System.out.println("NPC");
    }

    Non_Static_Members1(int x) {
        System.out.println("IPC");
    }

    {
        System.out.println("NSB2");
    }
    int y = 20;
    {
        System.out.println("NSB3");
    }

    public static void main(String[] args) {
        Non_Static_Members1 e1 = new Non_Static_Members1();
        Non_Static_Members1 e2 = new Non_Static_Members1(10);
    }
}
