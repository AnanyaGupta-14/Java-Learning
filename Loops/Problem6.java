//Print the numbers in reverse from given n to 1
import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print in reverse: ");
        int n = sc.nextInt();

        for(int i = n; i>=1; i--){
            System.out.print(i+" ");
        }
    }
}
