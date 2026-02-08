
/**
 * Write a description of class DogBone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DogBone
{
    /**
     * Constructor for objects of class DogBone
     */
    public static void makeVisible()
    {
        Circle aCircle = new Circle();
        Circle bCircle = new Circle();
        Circle cCircle = new Circle();
        Circle dCircle = new Circle();
        Circle eCircle = new Circle();
        Circle fCircle = new Circle();
        Square aSquare = new Square();
        Square bSquare = new Square();
        Square cSquare = new Square();
        
        aCircle.changeColor("red");
        bCircle.changeColor("red");
        cCircle.changeColor("red");
        dCircle.changeColor("red");
        eCircle.changeColor("red");
        fCircle.changeColor("red");
        
        aCircle.changeSize(80);
        bCircle.changeSize(80);
        cCircle.changeSize(80);
        dCircle.changeSize(80);
        eCircle.changeSize(80);
        fCircle.changeSize(80);
        aSquare.changeSize(80);
        bSquare.changeSize(80);
        cSquare.changeSize(80);
        
        aCircle.moveVertical(60);
        aCircle.moveHorizontal(-120);
        bCircle.moveVertical(20);
        bCircle.moveHorizontal(-160);
        cCircle.moveVertical(-20);
        cCircle.moveHorizontal(-120);
        dCircle.moveVertical(-20);
        dCircle.moveHorizontal(80);
        eCircle.moveVertical(60);
        eCircle.moveHorizontal(80);
        fCircle.moveVertical(20);
        fCircle.moveHorizontal(120);
        
        aSquare.moveVertical(-10);
        aSquare.moveHorizontal(-40);
        bSquare.moveVertical(-10);
        bSquare.moveHorizontal(-100);
        cSquare.moveVertical(-10);
        cSquare.moveHorizontal(-160);
        
        aCircle.makeVisible();
        bCircle.makeVisible();
        cCircle.makeVisible();
        dCircle.makeVisible();
        eCircle.makeVisible();
        fCircle.makeVisible();
        aSquare.makeVisible();
        bSquare.makeVisible();
        cSquare.makeVisible();
    }
}
