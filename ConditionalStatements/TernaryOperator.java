package ConditionalStatements;
//Check whether entered number is even or odd using ternary operator
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();

        System.out.println(num+" is "+ ((num%2==0)? "Even":"Odd"));
}
}
