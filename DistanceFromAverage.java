// Name: Tambir Ahmed
// A Number: A01180474

// DistanceFromAverage.java

/*
import java.util.Scanner; // Import the Scanner class for reading user input

public class DistanceFromAverage { // Declare the main class
    public static void main(String[] args) { // Main method where execution starts
        final int MAX_VALUES = 15; // Define the maximum number of values the user can enter
        double[] values = new double[MAX_VALUES]; // Create an array to store the double values
        int count = 0; // Variable to count how many numbers the user has entered
        double input; // Variable to hold each input value

        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("Enter up to 15 double values (enter 99999 to stop):"); // Prompt the user

        input = scanner.nextDouble(); // Read the first input from the user

        // Start a loop to read values until 99999 is entered or max values are reached
        while (input != 99999 && count < MAX_VALUES) {
            values[count] = input; // Store the entered value in the array
            count++; // Increment the count of entered numbers
            if (count < MAX_VALUES) { // Check if there's still space for more input
                input = scanner.nextDouble(); // Read the next input
            }
        }

        if (count == 0) { // Check if no numbers were entered
            System.out.println("Error: No numbers were entered."); // Display error message
        } else {
            double total = 0; // Variable to hold the sum of all entered values

            // Loop to calculate the total sum of entered values
            for (int i = 0; i < count; i++) {
                total += values[i]; // Add each value to the total
            }

            double average = total / count; // Calculate the average

            // Display the number of values entered and the calculated average
            System.out.println("Number of values entered: " + count);
            System.out.println("Average: " + average);

            // Loop to display each value and its distance from the average
            for (int i = 0; i < count; i++) {
                double distance = Math.abs(values[i] - average); // Calculate absolute difference
                System.out.println("Value: " + values[i] + ", Distance from average: " + distance); // Display result
            }
        }
    }
}
*/

