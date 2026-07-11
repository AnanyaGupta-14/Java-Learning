package PatternPrinting;
//Print inverted triangle
import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ener the number of rows: ");
        int n = sc.nextInt();
        
        //Method 1
        // for(int i=1;i<=n;i++){
        //     for(int j=1; j<=n+1-i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Method 2
        for(int i=1;i<=n;i++){
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
