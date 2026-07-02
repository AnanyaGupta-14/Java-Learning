package ConditionalStatements;
//Take a real number input and print if it is integer or not
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real Number:");
        double num = sc.nextDouble();
        int x = (int)num;
        //OPTION1
        // if(num-x >0) System.out.println("It is not an integer");
        // else System.out.println("It is an integer");

        //OPTION2
        if (num/x == 1){
            System.out.println("It is an integer");
        }
        else{
            System.out.println("It is not an integer");
        }
        sc.close();
    }
}
