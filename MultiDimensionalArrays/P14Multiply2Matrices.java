package MultiDimensionalArrays;

import java.util.ArrayList;

public class P14Multiply2Matrices {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] b = { {7,8,9}, {10,11,12}};
        ArrayList<ArrayList<Integer>> c = multiply(a,b);
        System.out.println(c);

    }

    public static ArrayList<ArrayList<Integer>> multiply(int[][] a, int[][] b) {
         int n = a.length;
         int[][] c = new int[n][n];
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

         for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
         }

         for(int i=0; i<n; i++){
            ans.add(new ArrayList<>());
            for(int j=0; j<n; j++){
                ans.get(i).add(c[i][j]);
            }
         }

         //Method 2
        //  for(int i=0; i<n; i++){
        //     ans.add(new ArrayList<>());
        //     for(int j=0; j<n; j++){
        //         int sum = 0;
        //         for(int k=0; k<n; k++){
        //             sum += a[i][k] * b[k][j];
        //         }
        //         ans.get(i).add(sum);
        //     }
        //  }
        
        return ans;

    }
}
