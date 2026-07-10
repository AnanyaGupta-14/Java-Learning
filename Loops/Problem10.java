//Take n as input and print the sequence
// 1, n, 2, n-1, 3, n-2, 4,.... 
import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n = sc.nextInt();
        int m = n;
        for(int i =1; i<=n; i++){
            System.out.println(i);
            System.out.println(m);
            m = n-i;
        }

    }
}
