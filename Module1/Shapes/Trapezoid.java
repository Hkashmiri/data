
/**
 * Write a description of class Trapezoid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trapezoid
{
   public static void makeVisible() 
   {
       Triangle leftTriangle = new Triangle();
       Triangle rightTriangle = new Triangle();
       Square leftSquare = new Square();
       Square rightSquare = new Square();
       
       leftSquare.changeColor("green");
       rightSquare.changeColor("green");
       
       leftTriangle.changeSize(60,60);
       rightTriangle.changeSize(60,60);
       
       leftTriangle.moveVertical(-140);
       leftTriangle.moveHorizontal(-180);
       rightTriangle.moveVertical(-140);
       rightTriangle.moveHorizontal(-60);
       
       leftSquare.moveVertical(-120);
       leftSquare.moveHorizontal(-280);
       rightSquare.moveVertical(-120);
       rightSquare.moveHorizontal(-220);
       
       leftTriangle.makeVisible();
       rightTriangle.makeVisible();
       leftSquare.makeVisible();
       rightSquare.makeVisible();
   }
}
