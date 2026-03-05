import java.util.ArrayList;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(5);
        al.add(7);
        al.add(3);
        System.out.println(al);   // [5, 7, 3]
                                  // ArrayList does not store objects in sorting order 

        System.out.println("=============");

        al.sort(null);          // Storing elements in ArrayList in Ascending order                
        System.out.println(al);   // [3, 5, 7]

        System.out.println("=============");
        
        al.sort((i1, i2) -> i2 - i1);   // Passing custom Comparator for storing integers in descending order
        System.out.println(al);         // [7, 5, 3]
    }
}