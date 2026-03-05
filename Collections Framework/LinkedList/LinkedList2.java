import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        // 1. adding objects
        ll.add("a");
        ll.add("b");
        ll.add(5);     // Auto Boxing applied by compiler
        ll.add(6.7);
        ll.add('p');
        ll.add(true);
        ll.add(null);
        ll.add("a");
        ll.add(5);
        ll.add(null);

        System.out.println("array : " + ll);
        System.out.println("size : " + ll.size());

        ll.add(new Example(5, 6));
        ll.add(new Sample(5, 6));

        System.out.println();
        System.out.println("array : " + ll);
        System.out.println("size : " + ll.size());

        //2. searching object [linear searching algorithm]
        System.out.println("=======================");
        System.out.println(ll);
		System.out.println(ll.contains("a")); 				        //"a".equals(ele) 	in loop starts with first node
		System.out.println(ll.contains(6.7)); 				        //6.7.equals(ele) 	in loop starts with first node
		System.out.println(ll.contains(null)); 				        //null==ele 		in loop starts with first node
		System.out.println(ll.contains(new String("a")));     //new S("a").eq(ele)in loop starts with first node
		System.out.println(ll.contains(new Integer(5))); 	    //new I(5).eq(ele)	in loop starts with first node
		System.out.println(ll.contains(new Example(5, 6))); 	    //new Example(5,6).eq(ele)in loop starts with first node
		System.out.println(ll.contains(new Sample(5, 6))); 		//new Sa(5,6).eq(ele)in loop starts with first node
		
        System.out.println("=======================");

        Example e2 = new Example(7,  8);
		ll.add(e2);
		System.out.println(ll.contains(new Example(7, 8)));	//new Example(7,8).eq(ele)
		System.out.println(ll.contains(e2));			           //e2.eq(e2)
			
		Example e3 = new Example(10,  20);
		Example e4 = new Example(10,  20);
		ll.add(e3);
		System.out.println(ll.contains(new Example(10, 20)));	
		System.out.println(ll.contains(e4));			
		
		Example e5 = new Example(12,  13);
		Example e6 = e5;
		ll.add(e5);
		System.out.println(ll.contains(new Example(12, 13)));	
		System.out.println(ll.contains(e6));		
    }
}
