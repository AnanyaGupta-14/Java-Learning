package MultiDimensionalArrays;

public class P10RotateBy90Degree {
    public static void main(String[] args) {

        int[][] arr = {{2,8,3,4}, {7,2,1,6}, {5,5,4,1}, {3,1,8,2}};
        print(arr);
        System.out.println();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Transpose of matrix:");
        print(arr);

        for(int i=0; i<arr.length; i++){
            int st =0;
            int end = arr[0].length -1;
            while(st <end){
                int temp = arr[i][st];
                arr[i][st] = arr[i][end];
                arr[i][end] = temp;
                st ++;
                end --;
            }
        } 
        System.out.println("90 rotated matrix:");
        print(arr);
    }

    public static void print(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
