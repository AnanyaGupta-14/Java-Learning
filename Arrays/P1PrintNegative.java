package Arrays;

import java.util.Scanner;
public class P1PrintNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elemnts of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Print the negative values
        System.out.println("The negative elements are: ");
        for(int i=0; i<n; i++){
            if(arr[i]<0)
            System.out.print(arr[i]+" ");
        }
    }
}
