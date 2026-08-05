package MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class P11PascalsTriangle {
    public static void main(String[]args){
        int n=5;
        List<List<Integer>> ans = generate(n);
        for(int i=0; i<ans.size(); i++){
            for(int j=0; j<ans.get(i).size(); j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0; i<n; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++){
                list.add(1);
            }
            ans.add(list);
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<=i;j++){
                if(j==0 || j==i){
                    ans.get(i).set(j, 1);
                }
                else{
                    int a = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    ans.get(i).set(j,a);
                }
            }
        }
        return ans;
    }
}
