import java.util.Scanner;

public class FormLetterWriter {

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for first and last name
        String firstName, lastName;

        // Prompt the user for the first name
        System.out.print("Enter the first name: ");
        firstName = scanner.nextLine();

        // Prompt the user for the last name
        System.out.print("Enter the last name: ");
        lastName = scanner.nextLine();

        // Test the overloaded methods
        System.out.println();
        displaySalutation(firstName);  // Call the method with one parameter
        System.out.println();  // Add an extra blank line between outputs
        displaySalutation(firstName, lastName);  // Call the method with two parameters

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to display salutation with first name only
    public static void displaySalutation(String firstName) {
        System.out.println("Dear " + firstName + ",");
        System.out.println("Thank you for your recent order.");
    }

    // Overloaded method to display salutation with both first and last name
    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
        System.out.println("Thank you for your recent order.");
    }
}
