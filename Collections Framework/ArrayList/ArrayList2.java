import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();

        al.add(new Example(5, 6));
        al.add(new Sample(10,23));

        // 1. searching object
        System.out.println("===================");
        System.out.println(al.contains(new Example(5,7)));
        System.out.println(al.contains(new Sample(10,23)));

        System.out.println("===================");
        Example e1 = new Example(4,5);
        al.add(e1);
        System.out.println(al.contains(new Example(4,5)));
        System.out.println(al.contains(e1));

        System.out.println("===================");
        Example e2 = new Example(10,20);
        Example e3 = new Example(10,20);
        al.add(e2);

        System.out.println(al.contains(new Example(10,20)));
        System.out.println(al.contains(e3));

        System.out.println("===================");
        Example e4 = new Example(12,13);
        Example e5 = e4;
        al.add(e4);

        System.out.println(al.contains(new Example(12,13)));
        System.out.println(al.contains(e5));
        
        System.out.println("===================");
    }
}