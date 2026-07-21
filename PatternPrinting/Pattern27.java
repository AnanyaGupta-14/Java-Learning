package PatternPrinting;
//Prnt Pyramid
import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        //Method 1
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i;j++){
                System.out.print("  ");
            }

            for(int k=1; k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //MEthod 2
        

    }
}
