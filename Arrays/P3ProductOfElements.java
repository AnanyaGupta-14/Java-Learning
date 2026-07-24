package Arrays;
import java.util.Scanner;

//print the product of all the elements of the array
public class P3ProductOfElements {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elemnts of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int prod = 1 ;
        for(int i=0; i<n; i++){
            prod *= arr[i];
        }

        System.out.println("Prduct of all elemnts is: "+ prod);
    }
}


