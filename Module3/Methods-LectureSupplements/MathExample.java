
/**
 * Write a description of class MathExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathExample
{
    public static void main(String[] args){
        double root = Math.sqrt(17.0);
        double angle = 1.5;
        double height = Math.sin(angle);
        System.out.println("root is "+root);
        System.out.println("Height is "+height);
    
    }
    public static double min(double a, double b, double c)
    {
        double min1 = Math.min(a,b);
        return Math.min(min1,c);
    }
    public static double max(double a, double b, double c)
    {
        double max1 = Math.max(a,b);
        return Math.max(max1,c);
    }
}
