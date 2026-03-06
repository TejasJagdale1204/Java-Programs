import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        System.out.println("============================================");

        Vector<Object> v1 = new Vector<Object>();
        
        System.out.println(v1.capacity());
        System.out.println(v1.size());
        System.out.println(v1);

        System.out.println("============================================");

        Vector<Object> v2 = new Vector<Object>();
        
        System.out.println(v2.capacity());
        System.out.println(v2.size());
        System.out.println(v2);

        v2.add("a");
        v2.add("b");
		v2.add("c");
		v2.add("d");
        System.out.println();

        System.out.println(v2.capacity());
        System.out.println(v2.size());
        System.out.println(v2);

        System.out.println("============================================");

        Vector<Object> v3 = new Vector<Object>(3,5);
        
        System.out.println(v3.capacity());
		System.out.println(v3.size());
		System.out.println(v3);
        System.out.println();
		
		v3.add("a");
		v3.add("b");
		v3.add("c");
		v3.add("d");
		v3.add("e");
		v3.add("f");

		System.out.println(v3.capacity());
		System.out.println(v3.size());
		System.out.println(v3);

        System.out.println("============================================");

        Vector<Object> v4 = new Vector<Object>(v3);

        System.out.println(v4.capacity());
		System.out.println(v4.size());
		System.out.println(v4);

        v4.add("1");
		v4.add("2");
		v4.add("3");
		v4.add("4");
		v4.add("5");
		v4.add("6");
		v4.add("7");
		v4.add("8");
        System.out.println();

        System.out.println(v4.capacity());
		System.out.println(v4.size());
		System.out.println(v4);

        System.out.println("============================================");
    }
}