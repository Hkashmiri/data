public class Point
{
    private double x;
    private double y;

    /**
     * Constructor for objects of class Point
     */
    public Point()
    {
        // initialise instance variables
        x = 0;
        y = 0;
    }
    
    /**
     * Value constructor for objects of class Point
     * 
     * @param x x-value of point
     * @param y y-value of point 
     * 
     */
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public void setX(double x)
    {
        this.x = x;
    }
    
    public void setY(double y)
    {
        this.y = y;
    }
    
    public void set(double x, double y)
    {
        setX(x);
        setY(y);
    }
    
    /**
     * This is the distance from the origin at (0,0).
     */
    public double distanceTo()
    {
        double d2 = x*x + y*y;
        return Math.sqrt(d2);
    }
    
    public double distanceTo(Point aPoint)
    {
        double d2 = (x-aPoint.x)*(x-aPoint.x) + 
            (y-aPoint.y)*(y-aPoint.y);
        return Math.sqrt(d2);
    }
    
    public String toString(int x)
    {
        return("r");
    }
}