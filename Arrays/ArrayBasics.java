package Arrays;

public class ArrayBasics{
    public static void main(String[] args) {
       int[] x = {6,19,7,9,69,171,5};

       //Indexing
       System.out.println(x[0]); //accessing the element
       System.out.println(x[4]);

       //Updating elements of array - array is mutable 
       x[3] = 89;
       System.out.println(x[3]);

        int[] arr = new int[4];  //Creates an empty arrray of size 4
        arr[0] = 12;
        arr[1] = 14;
        arr[2] = 16;
        arr[3] = 18;
    }
}