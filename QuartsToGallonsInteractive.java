import java.util.Scanner;  // Import Scanner class to read user input

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        // Declare a constant for the number of quarts in a gallon
        final int QUARTS_IN_GALLON = 4;
        
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of quarts needed
        System.out.print("Enter the number of quarts needed for the job: ");
        int quartsNeeded = scanner.nextInt();  // Read the user input
        
        // Compute the number of gallons and remaining quarts
        int gallons = quartsNeeded / QUARTS_IN_GALLON;  // Integer division for full gallons
        int quartsLeft = quartsNeeded % QUARTS_IN_GALLON;  // Remainder is the leftover quarts
        
        // Display the result
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " +
                           gallons + " gallons plus " + quartsLeft + " quarts.");
        
        // Close the scanner object
        scanner.close();
    }
}
