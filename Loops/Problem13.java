//Print all the factors of the n
import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i =1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.print(i+" ");
                System.out.print((n/i)+" ");
            }
        }
    }
}
