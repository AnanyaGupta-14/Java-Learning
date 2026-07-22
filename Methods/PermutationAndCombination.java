package Methods;
import java.util.Scanner;
//take n and r as input and calculate ncr and npr
public class PermutationAndCombination {

    //Normal Method without using functions
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int r = sc.nextInt();

    //     int nFact = 1;
    //     for(int i=1; i<=n; i++){
    //         nFact *= i;
    //     }

    //     int rFact = 1;
    //     for(int i =1; i<=r; i++){
    //         rFact *= i;
    //     }

    //     int nrFact = 1;
    //     for(int i = 1; i<=n-r; i++){
    //         nrFact *= i;
    //     }

    //     int ncr = nFact/(rFact*nrFact);
    //     System.out.println(ncr);
    // }

    public static int fact(int x){
        int f =1;
        for(int i=1; i<=x; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/fact(n-r);
        System.out.println(ncr);
        System.out.println(npr);
    }
}
