package ConditionalStatements;
// Take (x,y) as input and tell whether lie on 1st or 2nd or 3rd or 4th or on x-axis or on y-axis or on origin
import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x co-ordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter the y co-ordinate: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("Lies on origin");
        }
        else if(x==0){
            System.out.println("Lies of y-axis");
        }
        else if(y==0){
            System.out.println("Lies on x-axis");
        }
        else if(x>0 && y>0){
            System.out.println("Lies on 1st quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("Lies on 2nd quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("Lies on 3rd quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("Lies on 4th quadrant");
        }
        sc.close();
    }
}
