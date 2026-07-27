package Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //To Insert Values
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        //To print array values
        System.out.println(arr.get(2));
        System.out.println(arr.get(3));

        //To change Values
        arr.set(2, 20);     //arr[2] = 20
        System.out.println(arr.get(2)); 

        //To  print whole array
        System.out.println(arr);

        //Length od array = size of arraylist
        int n = arr.size();
        for(int i =0; i<n; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        arr.add(60);
        arr.add(1, 10);
        System.out.println(arr);

        //Remove element
        arr.remove(arr.size() - 1);
        System.out.println(arr);

        //Reverse the arraylist
        Collections.reverse(arr);
        System.out.println(arr);

        //MEthod 2
        int i=0;
        int j= arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);


        //To create arraylist of other data types
        ArrayList<Character> arr2 = new ArrayList<>();
        ArrayList<Double> arr3 = new ArrayList<>();
    }
}
