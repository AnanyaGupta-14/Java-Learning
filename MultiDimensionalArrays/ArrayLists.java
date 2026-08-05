package MultiDimensionalArrays;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(3); a.add(4);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(11); b.add(22); b.add(35);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(134); c.add(222);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);

        System.out.println(arr);

        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

        for(ArrayList<Integer> list : arr){
            for(int ele: list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
     }
}
