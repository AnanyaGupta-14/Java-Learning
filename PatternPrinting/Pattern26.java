package PatternPrinting;

import java.util.Scanner;

//Print Double Flipped triangle
public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=2; j<=i;j++){
                System.out.print("  ");
            }

            for(int k=n; k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
