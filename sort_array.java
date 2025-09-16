import java.util.Arrays;

public class sort_array {
    
    public static void main(String[] args) {
        int arr[] = {25, 11, 7, 75, 56};

        // Sort the array
        Arrays.sort(arr);

        // First element = minimum, last element = maximum
        int min = arr[0];
        int max = arr[arr.length - 1];

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }

}
