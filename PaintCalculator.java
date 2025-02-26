import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for room dimensions
        double length, width, height;

        // Prompt the user for the room's length, width, and height
        System.out.print("Enter the length of the room (in feet): ");
        length = scanner.nextDouble();
        
        System.out.print("Enter the width of the room (in feet): ");
        width = scanner.nextDouble();
        
        System.out.print("Enter the height of the room (in feet): ");
        height = scanner.nextDouble();

        // Call the method to calculate the total price of paint
        double totalPrice = calculatePaintPrice(length, width, height);

        // Display the final price
        System.out.println("The total cost to paint the room is: $" + totalPrice);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to calculate the total price of paint
    public static double calculatePaintPrice(double length, double width, double height) {
        // Calculate the wall area of the room
        double wallArea = calculateWallArea(length, width, height);

        // Calculate the number of gallons of paint needed
        double gallonsNeeded = calculateGallons(wallArea);

        // Calculate the price of the paint (paint costs $32 per gallon)
        double price = gallonsNeeded * 32;

        // Return the total price
        return price;
    }

    // Method to calculate the wall area of the room
    public static double calculateWallArea(double length, double width, double height) {
        // Area of the four walls = 2 * height * (length + width)
        double wallArea = 2 * height * (length + width);
        return wallArea;
    }

    // Method to calculate the number of gallons of paint needed
    public static double calculateGallons(double wallArea) {
        // Each gallon of paint covers 350 square feet
        double gallonsNeeded = wallArea / 350;
        return gallonsNeeded;
    }
}
