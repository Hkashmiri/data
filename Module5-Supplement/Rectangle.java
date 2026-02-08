/**
 * This class represesnts a rectangle with a width, height, located in 2-dimensional space.
 * The rectangle is located in 2-dimensions relative to the top left corner.
 * 
 * @author (You) 
 * @version (0.1)
 */
public class Rectangle
{
    private Point location;
    private double height;
    private double width;
    
    /**
     * Intializes this rectangle to height and width
     * located at the point (0,0).
     */
    public Rectangle(double height, double width)
    {
        this.height = height;
        this.width = width;
        location = new Point();
    }
    
    public Rectangle(double height, double width, Point location)
    {
        this.height = height;
        this.width = width;
        this.location = location;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    /**
     * Returns the location as a Point object for
     * this rectangle
     * 
     * @return Point object
     */
    public Point getLocation()
    {
        return location;
    }
    
    // mutators
    
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    public void setLocation(Point location)
    {
        this.location = location;
    }
}