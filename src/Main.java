import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean validInput = false;

        // Loop for inputting width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next(); // Clear the invalid input
            }
        } while (!validInput);

        validInput = false; // Reset flag for the next input

        // Loop for inputting height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next(); // Clear the invalid input
            }
        } while (!validInput);

        // Calculate area of the rectangle
        double area = width * height;
        // Calculate perimeter of the rectangle
        double perimeter = 2 * (width + height);
        // Calculate length of the diagonal using Pythagorean theorem
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        // Output the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal of the rectangle: " + diagonal);

        in.close();
    }
}
