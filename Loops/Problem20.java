//Print a raise to power b
import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number:");
        int a = sc.nextInt();
        System.out.print("Enter the power number:");
        int b = sc.nextInt();

        int pow = 1;
        for (int i = 1; i<=b; i++){
            pow = pow * a;
        }
        System.out.println(a+" raised to power "+b+ " is "+pow);
    }
}
