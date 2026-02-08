
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square
{
    public static double getAreaOfSquare(double length) {
        return length*length;
    }

    public static void areaOfSquare(double length) {
        System.out.println("area is " + length*length); 
    }

    public static void main(String[] args) {
        double length = 4;    
        areaOfSquare(length);
    }

}
