package MultiDimensionalArrays;

public class P1SumOfELements {
    public static void main(String[] args) {
        int[][] arr = {{6,0,7,6},{4,5,6,3},{2,7,9,1}};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum+=arr[i][j];
            }
        }
         System.out.println(sum);
    }
}
