package Methods;

public class Syntax {
    // public static void girl(){
    //     System.out.println("Hello from girl function");
    //     System.out.println("Printing numbers:");
    //     for(int i=1; i<=10; i++)
    //         System.out.print(i);
    // }
    // public static void ananya(){
    //     System.out.println("HEllo");
    //     girl();
    // }
    // public static void main(String[] args) {
    //     ananya();
    //     System.out.println("HEllo Ananya");
    //     girl();
    // }
    public static void dog(){
        cat();
        System.out.println("dog");
    }
    
    public static void main(String[] args) {
        animal();
    }

    public static void cat(){
        System.out.println("cat");
    }
    public static void animal(){
        cat();
        dog();
        System.out.println("animal");
        dog();
    }

}
