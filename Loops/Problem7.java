import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to print: ");
        int n = sc.nextInt();

        //METHOD 1
        // for(int i=2; i<=(3*n-1); i+=3){
        //     System.out.print(i+" ");
        // }

        //METHOD 2
        int a =4, d= 2;
        for(int i = 0; i<n ; i++){
            System.out.print(a+" ");
            a += d;
        }
}
}
