
/**
 * Write a description of class Point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Point
{
    // fields
    private double x;
    private double y;
    
    /**
     * Default constructor that intializes this point at (0,0).
     */
    public Point()
    {
        setX(0);
        setY(0);
    }
    
    /**
     * Value constructor that intializes this point at (x,y).
     * 
     * @param x An integer representing the x-coordinate of this point.
     * @param y An integer representing the y-coordinate of this point.
     * 
     */
    public Point(double x, double y)
    {
        setX(x);
        setY(y);
    }
    
    public Point(Point aPoint)
    {
        x = aPoint.x;
        y = aPoint.y;
    }
    
    // accessor methods
    
    /**
     * Returns the x-coordinate value of this point.
     */
    public double getX()
    {
        return x;
    }
    
    /**
     * Returns the y-coordinate value of this point.
     */
    public double getY()
    {
        return y;
    }
    
    /**
     * Returns the distance from the origin (0,0) to this point.
     */
    public double distanceTo()
    {
        return distanceTo(new Point());
    }
    
    /**
     * Returns the distance from this point to the point aPoint.
     * 
     * @param aPoint The instance of Point to which we are calculating the distance.
     */
    public double distanceTo(Point aPoint)
    {
        return Math.sqrt((x-aPoint.x)*(x-aPoint.x) + 
                         (y-aPoint.y)*(y-aPoint.y));
    }
    
    //mutators
    
    /**
     * Sets the x-coordinate value of this point.
     * 
     * @param x The new x-coordinate value for this point.
     */
    public void setX(double x)
    {
        this.x = x;
    }
    
    /**
     * Sets the y-coordinate value of this point.
     * 
     * @param y The new y-coordinate value for this point.
     */
    public void setY(double y)
    {
        this.y = y;
    }
    
    /**
     * moves this point from (x,y) to (x+dx,y+dy).
     * 
     * @param dx The integer value by which to translate this point along it's x-coordinate.
     * @param dy The interger value by which to translate this point along it's y-coordinate.
     */
    public void translate(double dx, double dy)
    {
        x += dx;
        y += dy;
    }
    
    /**
     * Returns a string representation of this point.
     */
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
}