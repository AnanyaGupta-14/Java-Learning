//WAP to check the given number is composite or prime
import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int x =0;
        for (int i = 2 ; i<=Math.sqrt(n); i++){
            if(n%i==0){
                x = 1;
                break;
            }
        }
        if(n==1) System.out.println("Neither prime nr composite");
        else if(x==1) System.out.println("Composite Number");
        else System.out.println("Prime Number");
    }
}
