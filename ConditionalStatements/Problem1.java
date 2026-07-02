package ConditionalStatements;

//Take positive integer input and tell if it is odd or not
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a positive integer:");
            int num = sc.nextInt();
            if (num%2 ==0){
                System.out.println("Even Number");
            }
            else{
                System.out.println("Odd Number");
            }
        }
    }
}
