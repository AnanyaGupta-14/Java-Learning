//Print the sum of digits of the number and rever the digits
import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        int r= 0;
        int sum = 0;
        while(n!=0){
            r *= 10;
            r += (n%10);
            sum = sum + (n%10);
            n/=10;
        }
        System.out.println(sum);
        System.out.println(r);
    }
}
