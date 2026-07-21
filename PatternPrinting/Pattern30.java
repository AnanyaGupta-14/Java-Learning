package PatternPrinting;

import java.util.Scanner;

//Print number spiral
public class Pattern30 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int col = 1;
        for(int i =1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                int a=i;
                int b =j;
                if(i>n) a = 2*n - i;
                if(j>n) b = 2*n - j;
                System.out.print(Math.min(a,b)+ " ");
            }
            System.out.println();
        }

    }
}
