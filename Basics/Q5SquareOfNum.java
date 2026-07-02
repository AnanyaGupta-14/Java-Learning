import java.util.Scanner;
public class Q5SquareOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its square:");
        int num = sc.nextInt();
        int square = num * num;
        System.out.println("Square of the entered number is:"+ square);
        sc.close();
}
}
