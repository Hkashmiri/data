import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInt;
        double userDouble;
        char userChar;
        String userString;

        System.out.println("Enter integer:");
        userInt = scanner.nextInt();

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space
        System.out.println("Enter double:");
        userDouble = scanner.nextDouble();

        System.out.println("Enter character:");
        userChar = scanner.next().charAt(0);

        System.out.println("Enter string:");
        userString = scanner.next();
        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);

        // TODO (2): Output the four values in reverse
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);

        // TODO (3): Cast the double to an integer, and output that integer
        int castedInt = (int) userDouble;
        System.out.println(userDouble + " cast to an integer is " + castedInt);
    }
}
