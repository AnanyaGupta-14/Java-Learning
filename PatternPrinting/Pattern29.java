package PatternPrinting;

import java.util.Scanner;

//Print Bridge
public class Pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i =1; i<=2*n-1; i++){
            System.out.print("* ");
        }
        System.out.println();

        int nsp =1;
        int nst = n-1;
        for(int i =1; i<=n-1; i++){
            for (int j=1; j<=nst;j++){
                System.out.print("* ");
            }

            for(int k=1; k<=nsp; k++){
                System.out.print("  ");
            }

            for(int l=1; l<=nst; l++){
                System.out.print("* ");
            }

            nsp += 2;
            nst--;
            System.out.println();
        }

    }
}
