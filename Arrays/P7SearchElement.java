package Arrays;

import java.util.Scanner;

public class P7SearchElement {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] arr = {5,2,3,4,1,7, 2};
        System.out.println("The GIven Array is:");
        print(arr);
        System.out.print("Enter the element to be searched in the given array: ");
        int x = sc.nextInt();

        boolean flag = false;   //False = Element not in array
        for(int i=0; i<arr.length; i++){
            if(x == arr[i]) {
                flag = true;   //True = Element in the array
                break;
            }   
        }

        if(flag) System.out.println("Element Exits in the array");
        else System.out.println("Element not present in the array");

    }

    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
