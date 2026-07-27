package Arrays;

public class P8TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2,6};
        int target  = 20;

        boolean x = twoSum(arr, target);
        if(x) System.out.println("true");
        else System.out.println("false");
    }

    public static boolean twoSum(int arr[], int target) {
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
