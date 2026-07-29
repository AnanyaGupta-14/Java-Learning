package MultiDimensionalArrays;

public class P8SnakePatternColumnWise {
    public static void main(String[] args) {
        int[][] arr = {{6,0,7,6},{4,5,6,3},{2,7,9,1}};

        for(int i=0; i<arr[0].length; i++){
            if(i%2==0){
                for(int j=0; j<arr.length; j++){
                System.out.print(arr[j][i]+" ");
            }
            }

            else{
               for(int j=arr.length-1; j>=0; j--){
                System.out.print(arr[j][i]+" ");
            } 
            }
            System.out.println();
        }
    }
}
