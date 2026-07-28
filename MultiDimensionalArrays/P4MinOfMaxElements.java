package MultiDimensionalArrays;
//Print the minimum element out of all the maximm elements of each row
public class P4MinOfMaxElements {
    public static void main(String[] args) {
        int[][] arr = {{6,0,7,6},{4,5,6,5},{2,7,9,1}};

        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            int max = 0;
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]>max) max = arr[i][j];
            }
            if(max<min) min = max;
        }

        System.out.println(min);
    }
}
