package Arrays;

import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int[] x = arr; //x is shallow ocoy of arr

        x[2] = 100;
        System.out.println(arr[2]);

        int[] deep = Arrays.copyOf(arr, arr.length);    //Deep Copy
        deep[0] = 100;
        System.out.println(arr[0]);

        //Another way to create a deep copy
        // int[] brr = new int[arr.length];
        // for(int i=0; i<arr.length; i++){
        //     brr[i] = arr[i];
        // }

    }
}
