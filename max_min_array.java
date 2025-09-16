public class max_min_array {
    public static void main (String [] args) {
        int ar[] = {44,33,77,55,66,99};
        System.out.println("Length of Array is : "+ar.length);

        int min = ar[0];
        int max = ar[0];

        for (int i=1; i < ar.length; i++) {
            if(ar[i] < min) {
                min = ar[i];
            }
            if(ar[i] > max) {
                max = ar[i];
            }
        }

        System.out.println("Minimum Array is : "+min);
        System.out.println("Maximum Array is : "+max);
    }
}