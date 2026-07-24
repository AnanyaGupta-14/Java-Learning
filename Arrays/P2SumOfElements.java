package Arrays;

import java.util.Scanner;

//Print the sum of all the elements of the array
public class P2SumOfElements {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elemnts of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum =0 ;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }

        System.out.println("Sum of all elemnts is: "+ sum);
    }
}
