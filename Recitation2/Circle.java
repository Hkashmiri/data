import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Actor
{
    private static final int MAX_RADIUS = 40;
    //private GreenfootImage image;
    //private int radius;
    private int increment;
    private int maxRadius;
    private void init(int radius){
        GreenfootImage image = new GreenfootImage(MAX_RADIUS*2,MAX_RADIUS*2);
        //radius = 0;
        increment = 0;
        maxRadius = MAX_RADIUS;
        image.setColor(Color.RED);
        //image.fillOval(0,0,radius*2, radius*2);
        setImage(image);
    }
    
    public Circle()
    {
        init(MAX_RADIUS);
    }
    public Circle(int radius){
        init(radius);
    }
    private void pulsate(){
        increment = (increment +1) % (2*MAX_RADIUS+1);
        //radius = (radius + 1) % MAX_RADIUS; // decreasing
        //radius = Math.abs(increment - MAX_RADIUS); //increasing
        GreenfootImage image = getImage();
        image.clear();
        //image.fillOval(MAX_RADIUS-radius, MAX_RADIUS-radius, 2*radius, 2*radius);
        setImage(image);
    }
    private void moveIt(){
        //this should be my own code
    }
    /**
     * Act - do whatever the Circle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        pulsate();
        move(1);
    }
}
