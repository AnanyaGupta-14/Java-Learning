package Arrays;
// Missing in Array
// Solved
// Difficulty: EasyAccuracy: 29.59%Submissions: 1.7MPoints: 2Average Time: 15m
// You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

// Examples:

// Input: arr[] = [1, 2, 3, 5]
// Output: 4
// Explanation: All the numbers from 1 to 5 are present except 4.
public class P12MissingInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5} ;
        int x= missingEle(arr);
        System.out.println("Missing Element is: "+ x);
    }

    public static int missingEle(int[] arr){
        int m = arr.length + 1;
        int sum = m*(m+1)/2;
        int arraySum = 0;

        for (int ele: arr){
            arraySum+=ele;
        }

        return sum-arraySum;
    }
}
