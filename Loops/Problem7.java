import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to print: ");
        int n = sc.nextInt();

        for(int i=2; i<=(3*n-1); i+=3){
            System.out.println(i+" ");
        }
}
}
