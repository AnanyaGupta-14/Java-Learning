package MultiDimensionalArrays;
//Print the Maximum Elemen in the 2D Array
public class P2MaxElement {
    public static void main(String[] args) {
        int[][] arr = {{6,0,7,6},{4,5,6,30},{2,7,9,1}};
        int max = arr[0][0];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]>max) max = arr[i][j];
            }
        }

        System.out.println(max);

    }
}
