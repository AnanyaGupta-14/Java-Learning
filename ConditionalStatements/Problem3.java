package ConditionalStatements;
//Take integer input and print its absoulte value
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Absolute value is: "+(-num));
        }
        else{
            System.out.println("Absolute value is: "+num);
        }
        sc.close();
    }
}
