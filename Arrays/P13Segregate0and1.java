package Arrays;
// Segregate 0s and 1s
// Solved
// Difficulty: EasyAccuracy: 54.25%Submissions: 177K+Points: 2Average Time: 15m
// Given an array arr[] consisting of only 0's and 1's. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

// Examples :

// Input: arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
// Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
// Explanation:  After segregation, all the 0's are on the left and 1's are on the right. Modified array will be [0, 0, 0, 0, 0, 1, 1, 1, 1, 1].
public class P13Segregate0and1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate(arr);

        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }

    // public static void segregate(int[] arr){
    //     int n = arr.length;
    //     int numZeros = 0;
    //     int numOnes = 0;

    //     for(int i=0; i<n; i++){
    //         if(arr[i] == 0) numZeros += 1;
    //         else numOnes += 1;
    //     }

    //     for(int i=0; i<numZeros; i++){
    //         arr[i] = 0;
    //     }

    //     for(int j=numZeros; j<n; j++){
    //         arr[j] =1;
    //     }
    // }

    //MEthod 2
    public static void segregate(int[] arr){
        int n = arr.length;
        int i=0, j= n-1;

        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j) break;
            if(arr[i]==1 && arr[j]==0){
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}
