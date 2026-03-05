import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        //1. counting elements [only size]
        System.out.println("size : " + ll.size());

        //2. printing elements
        System.out.println("array : " + ll.toString());

        //3. adding objects
        ll.add("a");
        ll.add("b");
        ll.add(5);
        ll.add(6.7);
        ll.add('p');
        ll.add(true);
        ll.add(null);
        ll.add("a");
        ll.add(5);
        ll.add(null);

        System.out.println();
        System.out.println("size : " + ll.size());
        System.out.println("array : " + ll);

        ll.add(new Example(5,6));
        ll.add(new Sample(5,6));

        System.out.println();
        System.out.println("size : " + ll.size());
        System.out.println("array : " + ll);

        //4. retrieving objects randomly (Internally it is sequential)
        Object obj1 = ll.get(1);
        Object obj2 = ll.get(3);
        Object obj3 = ll.get(8);
        Object obj4 = ll.get(0);
        Object obj5 = ll.get(ll.size()-1);

        System.out.println();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);

        //5. retrieving objects sequentially
        System.out.println();
        for(int i=0; i<ll.size(); i++) {
            System.out.println(ll.get(i));
        }
    }
}