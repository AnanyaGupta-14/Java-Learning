package ConditionalStatements;
//Take input of 3 numbers and print the greatest number
import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 NUmbers: ");
        System.out.print("Enter 1st: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd: ");
        int c = sc.nextInt();

        //Method 1
        // if (a>=b && a>=c) System.out.println(a);
        // else if (b>=a && b>=c) System.out.println(b);
        // else System.out.println(c);

        //Method 2
        if (a>=b){
            if (a>=c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if (b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
    }
}
