package Arrays;
//Reverse the given array using 2 pointer/variable technique
public class P10ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,6,2,9,10,20,30,40};
        int n = arr.length;

        // //Method 2
        // for(int i =0; i<(n/2); i++){
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        
        //Method 1
        // int i=0 , j=n-1;
        // while(i<j){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp; 
        //     i++;
        //     j--;
        // }

        // System.out.println("Reversed array");
        // for(int ele:arr){
        //     System.out.print(ele+" ");
        // }



        //Reverse the array from index a to b
        int a =2, b= 6;
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }

        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
