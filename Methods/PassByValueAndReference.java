package Methods;

public class PassByValueAndReference {
    public static void change(int x){
        x = 10;
    }

    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}

// public class PassByValueAndReference {
//     public static int change(int x){
//         x = 10;
//         return x;
//     }

//     public static void main(String[] args) {
//         int x = 6;
//         System.out.println(x);
//         change(x);
//         int a = change(x);
//         System.out.println(a);
//     }
// }
