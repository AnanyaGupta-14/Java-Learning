//Print the series 99, 95, 91, 87, .... upto all the erms which are positive
// import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of terms to print: ");
        // int n = sc.nextInt();

        int a = 99, d= -4;
         while(a>0){
                System.out.print(a+" ");
                a += d;
            
        }
    }
}
