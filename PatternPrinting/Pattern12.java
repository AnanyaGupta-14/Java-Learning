package PatternPrinting;
// Print thismfor given value of n
// 1
// AB
// 123
// ABCD
import java.util.Scanner;

public class Pattern12 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ener the number of rows");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i%2==0) System.out.print((char)(j+64)+" ");
                else System.out.print(j+" ");
            }
            System.out.println();
        }
}
}
