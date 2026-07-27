package Arrays;

public class ForEachLoop {
   public static void main(String[] args) {
    int[] arr = {5,3,6,8,2};

    for(int ele : arr){
        System.out.print(ele);
    }

    System.out.println();
    for(int ele:arr){
        ele +=2;
    }

    for(int ele : arr){
        System.out.print(ele);
    }
   } 
}
