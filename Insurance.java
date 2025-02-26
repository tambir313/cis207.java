import java.util.Scanner;

public class Insurance {

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for the current year and birth year
        int currentYear, birthYear;

        // Prompt the user for the current year
        System.out.print("Enter the current year: ");
        currentYear = scanner.nextInt();

        // Prompt the user for their birth year
        System.out.print("Enter your birth year: ");
        birthYear = scanner.nextInt();

        // Call the method to calculate the premium
        double premium = calculatePremium(currentYear, birthYear);

        // Display the calculated premium
        System.out.println("The annual premium for your life insurance is: $" + premium);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to calculate the insurance premium
    public static double calculatePremium(int currentYear, int birthYear) {
        // Calculate the customer's age
        int age = currentYear - birthYear;

        // Calculate the decade of the age (e.g., for age 34, decade is 3)
        int decade = age / 10;

        // Calculate the premium using the given formula
        double premium = (decade + 15) * 20;

        return premium;
    }
}
