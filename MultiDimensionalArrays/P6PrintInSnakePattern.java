package MultiDimensionalArrays;
//Give array is
// 6076
// 4563
// 2791
// Now print in Snake PAttern
// 6076
// 3654
// 2791
public class P6PrintInSnakePattern {
    public static void main(String[] args) {
        int[][] arr = {{6,0,7,6},{4,5,6,3},{2,7,9,1}};

        for(int i=0; i<arr.length; i++){
            if(i%2==0){
               for(int j=0; j<arr[0].length; j++){
                    System.out.print(arr[i][j]+" ");
            } 
            }
            else{
                for(int j=arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
            }
            }
            System.out.println();

        }
    }
}
