package ConditionalStatements;

import java.util.Scanner;

public class TernaryInVariable {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();

        // int a;
        // if(num>=0) a =100;
        // else a=0;
        // System.out.println(a);

        int a = (num>=0) ? 100 : 0;
        System.out.println(a);
}
}
