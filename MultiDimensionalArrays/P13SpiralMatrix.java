package MultiDimensionalArrays;

import java.util.ArrayList;

public class P13SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18}, {19,20,21,22,23,24}, {25,26,27,28,29,30}};
        ArrayList<Integer> ans = spiralMatrix(arr);
        System.out.println(ans);
    }

    public static ArrayList<Integer> spiralMatrix(int[][] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int m= arr.length, n= arr[0].length;
        int fr=0, fc=0, lr=m-1, lc=n-1;

        while(fr<=lr && fc<=lc){
            //right
            for(int i=fc; i<=lc; i++){
                ans.add(arr[fr][i]);
            }
            fr++;
            if(fr>lr || fc>lc) break;
            //down
            for(int i=fr; i<=lr; i++){
                ans.add(arr[i][lc]);
            }
            lc--;
            if(fr>lr || fc>lc) break;
            //left
            for(int i=lc; i>=fc; i--){
                ans.add(arr[lr][i]);
            }
            lr--;
            if(fr>lr || fc>lc) break;
            //up
            for(int i=lr; i>=fr; i--){
                ans.add(arr[i][fc]);
            }
            fc++;

        }
        return ans;
    }
}
