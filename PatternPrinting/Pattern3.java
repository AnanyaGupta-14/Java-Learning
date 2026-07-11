package PatternPrinting;
//Print Number Square
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ener the number of rows");
        int rows = sc.nextInt();
        
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
