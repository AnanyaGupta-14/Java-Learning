package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class P15AdditionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {9,9,9,9,9};
        int[] arr2 = {9,9,9};
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0;
        int n1= arr1.length-1;
        int n2 = arr2.length-1;

        while(n1>=0 || n2>=0){
            int digit1;
            if(n1>=0) digit1 = arr1[n1];
            else digit1=0;

            int digit2;
            if(n2>=0) digit2 = arr2[n2];
            else digit2=0;

            int sum = carry + digit1 + digit2;
            
            ans.add(sum%10);
            carry = sum/10;

            n1--;
            n2--;
        }
        if(carry>0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
