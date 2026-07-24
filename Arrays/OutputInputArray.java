package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        //Print elements of array
        // int[] arr = {5, -8, 2, 67, 43, -97};
        // System.out.println(arr.length);
        // int n = arr.length;
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i]+" ");
        // }

        //Taking input if elements in array
        Scanner sc = new Scanner(System.in);

        int[] a = new int[7];
        //default values
        System.out.println("Initially array has :");
        for(int i = 0; i<7; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        //TAking input
        for(int i =0; i<7; i++){
            System.out.print("Enter element "+ (i+1) + " ");
            a[i] = sc.nextInt();
            System.out.println();
        }

        //Print input array
        for(int i =0; i<7; i++){
            System.out.print(a[i]+ " ");
        }

    }
}
