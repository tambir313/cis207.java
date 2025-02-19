import java.util.Scanner;  // Import the Scanner class to take user input

public class MileConversionsInteractive {
    public static void main(String[] args) {
        // Declare constants for the number of inches, feet, and yards in a mile
        final int INCHES_IN_MILE = 63360;
        final int FEET_IN_MILE = 5280;
        final int YARDS_IN_MILE = 1760;

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of miles
        System.out.print("Enter the number of miles: ");
        int miles = scanner.nextInt();  // Read the user input
        
        // Compute the equivalent distance in inches, feet, and yards
        int inches = miles * INCHES_IN_MILE;
        int feet = miles * FEET_IN_MILE;
        int yards = miles * YARDS_IN_MILE;

        // Display the results
        System.out.println(miles + " miles is equal to:");
        System.out.println(inches + " inches.");
        System.out.println(feet + " feet.");
        System.out.println(yards + " yards.");
        
        // Close the scanner object
        scanner.close();
    }
}
