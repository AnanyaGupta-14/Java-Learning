package Arrays;
//Multiply odd indexed element by 2 and add 10 to even indexed elements
public class P6OperationOnIndex {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,2,8,5};
        print(arr);

        for(int i=0; i<arr.length; i++){
            if(i%2==0) arr[i] = arr[i]+10;
            else arr[i] = arr[i]*2;
        }

        System.out.println("Afer performing:");
        print(arr);
    }

    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
