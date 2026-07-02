package ConditionalStatements;
//Take a positive integer input and tell if it is divisible by 3 or 5
import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        if(num%3==0 || num%5==0){
            System.out.println("Divisible by 3 or 5");
        }
        else {
            System.out.println("Not Divisible by 3 or 5");
        }
        sc.close();
        }
    }

