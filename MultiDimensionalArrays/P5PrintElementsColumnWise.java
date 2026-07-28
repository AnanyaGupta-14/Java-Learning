package MultiDimensionalArrays;
//Print the elements of 2D Array column wise
public class P5PrintElementsColumnWise {
    public static void main(String[] args) {
        int[][] arr = {{6,0,7,6},{4,5,6,3},{2,7,9,1}};

        //To print the 2D Array normally
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        //printarray column wise
        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
