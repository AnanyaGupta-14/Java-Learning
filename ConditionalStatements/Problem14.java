package ConditionalStatements;

import java.util.Scanner;

//Printing greatest of three using ternary variable
public class Problem14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 NUmbers: ");
        System.out.print("Enter 1st: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd: ");
        int c = sc.nextInt();

        int num = (a>b) ? ((a>c)? a: c):((b>c)? b: c);
        System.out.println(num);
        
}
}
