public class matrix_3_by_3 {
    public static void main (String [] args) {
        int arr3d[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(arr3d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
