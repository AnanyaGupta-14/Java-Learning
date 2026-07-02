package ConditionalStatements;
//TAke 3 positive integer input and if they are sides of triangle or not
import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 sides of triangle: ");
    System.out.print("Enter 1st Side: ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd Side: ");
    int b = sc.nextInt();
    System.out.print("Enter 3rd Side: ");
    int c = sc.nextInt();
    if(a+b>c && b+c>a && c+a>b) System.out.println("Triangle is possible");
    else System.out.println("Triangle is not possible");
    sc.close();
    
}
}
