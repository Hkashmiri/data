
/**
 * Write a description of class RectangleRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RectangleRunner
{
    public static void run()
    {
        Rectangle ar = new Rectangle(10,20,new Point(5,6));
        Point p = ar.getLocation();
        System.out.println(p);
        p.setX(25);
        System.out.println(p);
    }
}
