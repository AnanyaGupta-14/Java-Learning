public class Q3TSAofCuboid {
    public static void main(String[] args) {
        double l = 4.5;
        double b = 5.5;
        double h = 6.5;
        double tsa = 2*((l*b)+(b*h)+(h*l));
        System.out.println("Total Surface Area of Cuboid is: " + tsa);
    }
}
