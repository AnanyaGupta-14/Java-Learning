//Print Ananya n time where n is input from user
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number times to print Ananya: ");
        int n = sc.nextInt();

        int i;
        for(i=0; i<n; i++){
            System.out.println("Ananya");
        }
        sc.close();
    }
}
