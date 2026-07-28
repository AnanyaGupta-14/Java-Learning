package MultiDimensionalArrays;

import java.util.Scanner;

public class InOutIn2DArray {
    public static void main(String[] args) {
        // int[][] arr = new int[3][4];
        int[][] arr = {{6,0,7,6},{4,5,6,3},{2,7,9,1}};
        System.out.println("NO. of Rows: "+ arr.length);
        System.out.println("No if Columns: "+ arr[0].length);

        //To print the 2D Array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //To take input in the 2D array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] arr2 = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
