package PatternPrinting;
//Print this pattern
//1111
// 2222
// 3333
// 4444
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ener the number of rows or columns");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1; j<=n; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
