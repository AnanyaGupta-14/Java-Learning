package MultiDimensionalArrays;
//The row NUmber with maximum sum of the elements and also the sum
public class P3MaxSumOFRow {
    public static void main(String[] args) {
        int[][] arr = {{6,0,7,6},{4,5,6,5},{2,7,9,1}};

        int MaxSum = 0;
        int rowNum = -1;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
            if(sum>MaxSum){
                MaxSum = sum;
                rowNum = i;
            }
            
        }

        System.out.println("Maximum sum is: "+MaxSum+" of row: "+ rowNum);
    }
}
