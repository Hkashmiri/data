
/**
 * Write a description of class ClassC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClassD extends ClassB
{
    private int count;

    public ClassD()
    {
        super();
        count=0;
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
