package ConditionalStatements;
//Take integer input and print if its magnitude is less than 69 or not
import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ") ;
       int num = sc.nextInt();
       if (num < 0) num = -num;
       if (num<69) System.out.println("Magnitude is less than 69");
       else System.out.println("Magnitude is not less than 69");
       sc.close();
    }

}
