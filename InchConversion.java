import java.util.Scanner;

public class InchConversion {

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare a variable for the input inches
        double inches;

        // Prompt the user to enter a value in inches
        System.out.print("Enter a value in inches: ");
        inches = scanner.nextDouble();

        // Call the methods to convert inches to feet and yards
        convertToFeet(inches);
        convertToYards(inches);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to convert inches to feet
    public static void convertToFeet(double inches) {
        // Convert inches to feet (12 inches in a foot)
        double feet = inches / 12;

        // Display the result
        System.out.println(inches + " inches is equal to " + feet + " feet.");
    }

    // Method to convert inches to yards
    public static void convertToYards(double inches) {
        // Convert inches to yards (3 feet in a yard, 12 inches in a foot)
        double yards = inches / 36;  // 12 inches * 3 feet = 36 inches in a yard

        // Display the result
        System.out.println(inches + " inches is equal to " + yards + " yards.");
    }
}
