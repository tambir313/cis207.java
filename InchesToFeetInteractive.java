import java.util.Scanner;  // Import Scanner class to get user input

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        // Declare a constant for the number of inches in one foot
        final int INCHES_IN_FOOT = 12;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of inches
        System.out.print("Enter the number of inches: ");
        int inches = scanner.nextInt();  // Read the user's input as an integer

        // Compute the number of feet and the remaining inches
        int feet = inches / INCHES_IN_FOOT;  // Integer division to get full feet
        int remainingInches = inches % INCHES_IN_FOOT;  // Modulus to get the remaining inches

        // Display the result in the format "X feet and Y inches"
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");

        // Close the scanner object
        scanner.close();
    }
}
