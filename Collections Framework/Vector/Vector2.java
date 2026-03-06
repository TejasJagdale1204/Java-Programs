import java.util.Vector;
public class Vector2 {
    public static void main(String[] args) {
        
        Vector<Object> v1 = new Vector<Object>();

        //1. counting elements [capacity and size]
        System.out.println("capacity : " + v1.capacity());
        System.out.println("size : " + v1.size());

        //2. printing elements
        System.out.println();
        System.out.println("array : " + v1.toString());

        //3. adding objects
        v1.add("a");
        v1.add("b");
        v1.add(5);     //auto-boxing applied by compiler
        v1.add(6.7);
        v1.add('p');
        v1.add(true);
        v1.add(null);
        v1.add("a");
        v1.add(5);
        v1.add(null);
        
        System.out.println();
        System.out.println("capcity: " + v1.capacity());
		System.out.println("size   : " + v1.size());
        System.out.println("array : " + v1);

        v1.add("1");
        v1.add("2");
        v1.add("3");

        System.out.println();
        System.out.println("capcity: " + v1.capacity());
		System.out.println("size   : " + v1.size());
        System.out.println("array : " + v1);

        v1.add(new Example(5,10));
        v1.add(new Sample(15,35));

        System.out.println();
        System.out.println("capcity: " + v1.capacity());
		System.out.println("size   : " + v1.size());
        System.out.println("array : " + v1);

        //4. retrieving objects randomly
        System.out.println();

        Object obj1 = v1.get(3);
        System.out.println(obj1);

        Object obj2 = v1.get(5);
        System.out.println(obj2);
        
        Object obj3 = v1.get(9);
        System.out.println(obj3);
        
        Object obj4 = v1.get(v1.size()-1);
        System.out.println(obj4);

        //5. retrieving objects sequentially
        System.out.println();
        for(int i=0; i<v1.size(); i++) {
            System.out.println("Object at index " + i + " : " + v1.get(i));
        }

        //6. searching for the object in the collection
        System.out.println();
        
        System.out.println(v1.contains("a"));   //"a".equals(eD[i])  	-> true
        System.out.println(v1.contains(5));	   //5.equals(eD[i])		-> true

        System.out.println(v1.contains(new String("b")));   //new String("a").eq(eD[i])	-> true
        System.out.println(v1.contains(new Integer(5)));       //new Integer(5).eq(eD[i])	-> true

        System.out.println(v1.contains(new String("c")));   //false

        System.out.println(v1.contains(new Example(5,10)));  //false because equals() method is not overridden in Example class

        System.out.println(v1.contains(new Sample(15,35)));  //true because equals() method is overridden in Sample class
    }
}