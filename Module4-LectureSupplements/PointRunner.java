/**
 * Write a description of class PointRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PointRunner
{
    public static void run()
    {
        Point p = new Point();
        Point q = new Point(10,30);
        Point r = new Point(20,80);
        System.out.println("p = "+p);
        System.out.println("q = "+q);
        System.out.println("Distance from q to the origin is");
            q.distanceTo();
        System.out.println("Distance from r to q is");
            r.distanceTo();
    }
}