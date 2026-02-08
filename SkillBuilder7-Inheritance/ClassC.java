
/**
 * Write a description of class ClassB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClassC extends ClassB
{
    private int count;

    public ClassC()
    {
        super();
        count = 0;
    }
    
    public void methA()
    {
        super.methA();
    }
    
    public void methB()
    {
        count++;    
    }
    
    public int getCount()
    {
        return count;
    }
}
