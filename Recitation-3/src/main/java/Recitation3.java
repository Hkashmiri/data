import java.util.Scanner;


public class Recitation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter x:");
        double x = scanner.nextDouble();
        System.out.println("Enter y:");
        double y = scanner.nextDouble();


        Circle circle16 = new Circle(new Point(x, y), 16.0);
        Circle circle40 = new Circle(new Point(14.0, 12.0), 40.0);


        if (circle16.intersects(circle40)) {
            System.out.println("Circles intersect!");
        } else {
            System.out.println("Circles do not intersect!");
        }


    }
}
