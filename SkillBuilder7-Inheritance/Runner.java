
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
    public static void run(){
        ClassE eeObj = new ClassE();
        eeObj.methB();
        eeObj.methB();
        ClassB bbObj = new ClassB();
        bbObj.methB();
        int cnt = eeObj.doSomeCalculation(bbObj);
        System.out.println(cnt);
    }
}
