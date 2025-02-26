import java.util.Scanner;

public class BookstoreCredit {
    
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for name and GPA
        String name;
        double gpa;

        // Prompt the user for the student's name
        System.out.print("Enter the student's name: ");
        name = scanner.nextLine();

        // Prompt the user for the student's GPA
        System.out.print("Enter the student's GPA: ");
        gpa = scanner.nextDouble();

        // Call the method to display the credit message
        displayCredit(name, gpa);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to compute and display the bookstore credit message
    public static void displayCredit(String name, double gpa) {
        // Compute the bookstore credit (10 times the GPA)
        double credit = gpa * 10;

        // Display the descriptive message
        System.out.println(name + " has a GPA of " + gpa + " and will receive a bookstore credit of $" + credit + ".");
    }
}
