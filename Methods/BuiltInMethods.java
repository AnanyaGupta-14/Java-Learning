package Methods;

public class BuiltInMethods {
    public static void main(String[] args){
        System.out.println("Square root Function:");
        System.out.println(Math.sqrt(100));
        
        System.out.println("Cube root function");
        System.out.println(Math.cbrt(100));

        System.out.println("Absolute function");
        System.out.println(Math.abs(-100));
        System.out.println(Math.abs(100));

        System.out.println("Floor Function");
        System.out.println(Math.floor(6.8));
        System.out.println(Math.floor(-7.2));

        System.out.println("Ceil Function");
        System.out.println(Math.ceil(4.0002));

        System.out.println("Min-Max Function");
        System.out.println(Math.max(12,34));
        System.out.println(Math.min(12,34));

        System.out.println("Print Maximum of 3 numbers");
        int a=3, b=7, c =19;
        System.out.println("Max num is:");
        System.out.println(Math.max(Math.max(a,b),c));

        System.out.println("Print Maximum of 4 numbers");
        int x=3, y=7, w =19, z= 4;
        int e = Math.max(x,y);
        int f = Math.max(w,z);
        System.out.println("Max num is:");
        System.out.println(Math.max(e,f));

        System.out.println("Power function");
        System.out.println(Math.pow(4,2));
    }
}
