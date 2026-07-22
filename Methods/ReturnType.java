package Methods;

public class ReturnType {
    public static int ananya(int a){
        System.out.println("Hello");
        System.out.println("Byeee");
        if(a>0) return 4;
        else return 5;
    }

    public static void main(String[] args) {
        int x = ananya(2);
        System.out.println(4+x);
        ananya(-6); //stand alone call 
    }
}
