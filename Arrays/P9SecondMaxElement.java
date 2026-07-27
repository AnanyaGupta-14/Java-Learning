package Arrays;

public class P9SecondMaxElement {
    public static void main(String[] args) {
        int[] arr = {2,3,7,4,5,1,6,7};

        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max) max = arr[i];
        }

        int secMAx = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secMAx && arr[i]!=max){
                secMAx = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(secMAx);
    }
}
