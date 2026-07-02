package ConditionalStatements;
//Take Length and Breadth as input of rectangle and tell if area is grater or perimeter
import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double l = sc.nextDouble();
        System.out.print("Enter Breadth: ");
        double b = sc.nextDouble();

        double area = l * b;
        double perimeter = 2 * (l + b);
        System.out.println("Area of the rectangle is : "+ area);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
        if (area>perimeter){
            System.out.println("Area of rectangle is greater than the perimeter");
        }
        else{
            System.out.println("Perimeter of rectangle is greater than the area");
        }
    }
}
