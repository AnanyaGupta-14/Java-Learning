package Arrays;
// Sort 0s, 1s and 2s
// Solved
// Difficulty: MediumAccuracy: 50.58%Submissions: 876K+Points: 4Average Time: 10m
// Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
// Note: You need to solve this problem without utilizing the built-in sort function.

// Examples:

// Input: arr[] = [0, 1, 2, 0, 1, 2]
// Output: [0, 0, 1, 1, 2, 2]
// Explanation: 0s, 1s and 2s are segregated into ascending order.

public class P17Sort012 {
    public static void main(String[] args) {
        int[] arr ={0, 1, 2, 0, 1, 2};
        sort012(arr);

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

    public static void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int numZeros = 0;
        int numOnes = 0;
        int numTwos = 0;
        
        for(int i=0; i<n; i++){
            if(arr[i]==0) numZeros += 1;
            else if(arr[i]==1) numOnes += 1;
            else numTwos += 1;
        }
        
        for(int i =0; i<numZeros; i++){
            arr[i] = 0;
        }
        int m = numZeros+numOnes;
        for(int j=numZeros; j<m; j++){
            arr[j] = 1;
        }
        
        for(int k=m; k<n; k++){
            arr[k] = 2;
        }
    }
}
