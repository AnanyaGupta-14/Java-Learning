// Display this GP 1,2,4,8,... upto 'n' terms
import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n = sc.nextInt();

        int a = 1, d = 2;
        for(int i =0; i<n; i++){
            System.out.print(a+" ");
            a *= d;
        }
    }
}
