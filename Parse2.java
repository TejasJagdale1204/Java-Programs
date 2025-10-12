class Parse2 {
    public static void main (String [] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a + b;

        System.out.println(args[0]);
        System.out.println(args[1]);

        int d = Integer.parseInt(args[2]);
        int e = Integer.parseInt(args[3]);
        double f = (d/e);

        System.out.println("Result = "+c);
        System.out.println("Result = "+f);
    }
}