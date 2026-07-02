import java.util.Scanner;
public class Q4SumOfTwo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter value of num1:");
        int a = num.nextInt();
        System.out.print("Enter value of num2:");
        int b = num.nextInt();
        int sum = a+b;
        System.out.println("Sum of Two NUmbers is:"+ sum);
        num.close();
    }
}
