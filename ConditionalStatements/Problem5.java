package ConditionalStatements;
//TAke cost price and selling prics and tell if it is profit or loss or no profit and no loss also tell how much profit or loss
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price:");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price:");
        double sp = sc.nextDouble();

        //METHOD 1
        // if(sp>cp) System.out.println("Profit is :" + (sp-cp));
        // if(cp>sp) System.out.println("Loss is : " + (cp - sp));
        // if(cp==sp) System.out.println("No Profit No Loss");

        //METHOD 2
        if(sp>cp) System.out.println("Profit is :" + (sp-cp));
        else if(cp>sp) System.out.println("Loss is : " + (cp - sp));
        else System.out.println("No Profit No Loss");
        
        sc.close();
    }
}
