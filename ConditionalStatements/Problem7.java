package ConditionalStatements;
//Take a postive integer input and print if it is 4 Digit or not
import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();

        if(num>999 && num<10000){
            System.out.println("It is a 4 digit number");
        }
        else{
            System.out.println("Not a 4 digit number");
        }
        sc.close();
    }
}
