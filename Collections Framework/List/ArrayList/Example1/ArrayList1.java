import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();

        // 1.counting elements [only size]
        System.out.println("size : " + al.size());

        // 2.printing elements
        System.out.println("array : " + al.toString());

        // 3.adding objects
        al.add("a");
        al.add("b");
        al.add(5);
        al.add(6.7);
        al.add('p');
        al.add(true);
        al.add(null);
        al.add("a");
        al.add(5);
        al.add(null);

        System.out.println();
        System.out.println("array : " + al);
        System.out.println("size : " + al.size());

        al.add(new Example(5, 6));
        al.add(new Sample(10,23));

        System.out.println();
        System.out.println("array : " + al);
        System.out.println("size : " + al.size());

        // 4.retrieving objects randomly
        Object obj1 = al.get(1);
        Object obj2 = al.get(3);
        Object obj3 = al.get(8);
        Object obj4 = al.get(0);
        Object obj5 = al.get(al.size() - 1);

        System.out.println();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);

        // 5. retrieving objects sequentially
        System.out.println();
        for (int i = 0; i < al.size(); i++) {
            System.out.println("Object at index " + i + " : " + al.get(i));
        }

        // 6. searching object
        System.out.println();
        System.out.println(al);
        System.out.println(al.contains("a"));
        System.out.println(al.contains(6.7));
        System.out.println(al.contains(null));
        System.out.println(al.contains(new String("a")));
        System.out.println(al.contains(new Integer(5)));

        System.out.println();
        System.out.println(al.contains(new Example(5,6)));
        System.out.println(al.contains(new Sample(10,23)));

        Example e2 = new Example(4,5);
        al.add(e2);
        System.out.println(al.contains(new Example(4,5)));
        System.out.println(al.contains(e2));

        Example e3 = new Example(10,20);
        Example e4 = new Example(10,20);
        al.add(e3);
        System.out.println(al.contains(new Example(10,20)));
        System.out.println(al.contains(e4));

        Example e5 = new Example(12,13);
        Example e6 = e5;
        al.add(e5);
        System.out.println(al.contains(new Example(12,13)));
        System.out.println(al.contains(e6));
    }
}