import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("What's your name?");
        String name = input.nextLine();

        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();

        double eq1 = (4.0 / 3.0);
        double a = (Math.sqrt(5));
        double b = Math.pow(spice, 3);
        double eq2 = Math.pow(2, a / b);
        double eq3 = eq1*eq2;

        System.out.println("Well " + name + ", the spice value resulted in " + eq3);

// Round eq3 to two decimal places
        double convertedValue = Math.round(eq3 * 100.0) / 100.0;

// Correct the formatting in the output
        System.out.printf("And the converted value is %.2f%n", convertedValue);

    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double gallonsPerCan = 1.0;
        final double squareFeetPerGallons = 350.0;

        // Prompt user to input wall's height
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        double wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + (int)wallArea + " square feet");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        double paintNeeded = wallArea / squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons%n", paintNeeded);

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        int cansNeeded = (int) Math.ceil(paintNeeded / gallonsPerCan);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}
