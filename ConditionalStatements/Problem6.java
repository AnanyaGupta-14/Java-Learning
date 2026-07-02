package ConditionalStatements;
// //Take positive integer input and print 
// if it is divisible by 3 or 5 or 5&3 both or not
import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Divisible by 3 and 5");
        }
        else if(num%3==0){
            System.out.println("Divisible by 3");
        }
        else if(num%5==0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not Divisible by 3 or 5");
        }
        sc.close();
    }

}
