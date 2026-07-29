package MultiDimensionalArrays;

public class P7ReverseRowsAndColumns {
    public static void main(String[] args) {
        int[][] arr = {{6,0,7,6},{4,5,6,3},{2,7,9,1}};
        
        for(int i=arr.length-1; i>=0; i--){
            for(int j=arr[0].length-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
