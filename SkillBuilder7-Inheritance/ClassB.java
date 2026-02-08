import java.io.OutputStream;
/**
 * Abstract class ClassA - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class ClassB extends ClassA
{
    private int count;

    public ClassB()
    {
        super();
        count = 0;
    }

    public void methB()
    {
        count++;
    }
    
    public void methB(int inc)
    {
        count += inc;
    }
}
