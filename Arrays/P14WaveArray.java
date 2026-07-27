package Arrays;
// Wave Array
// Solved
// Difficulty: MediumAccuracy: 63.69%Submissions: 299K+Points: 4Average Time: 20m
// Given an sorted array arr[] of integers. Sort the array into a wave-like array (In Place). In other words, arrange the elements into a sequence such that : arr[0] ≥ arr[1] ≤ arr[2] ≥ arr[3] ≤ arr[4] ≥ ... and so on. If there are multiple solutions, find the lexicographically smallest one.

// Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.

// Examples:

// Input: arr[] = [1, 2, 3, 4, 5]
// Output: [2, 1, 4, 3, 5]
// Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.
public class P14WaveArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sortInWave(arr);

        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }

    public static void sortInWave(int arr[]) {
        // code here
        int n= arr.length;
        for(int i=0; i<n-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        
    }
}
