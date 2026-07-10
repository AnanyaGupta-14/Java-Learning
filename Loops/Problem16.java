//Calculate sum of digits of n
import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if(n<0) n = -n;
        int sum = 0;
        while(n!=0){
            sum = sum + (n%10);
            n/=10;
        }
        System.out.println(sum);
    }
}
