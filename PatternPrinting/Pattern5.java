package PatternPrinting;
//Print the small case alphabet square
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ener the number of rows");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+96)+ " ");
            }
            System.out.println();
        }
    }
}
