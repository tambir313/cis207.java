import java.util.Scanner;

public class NumbersDemo {
    
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare two integer variables
        int num1, num2;

        // Prompt the user for the first integer
        System.out.print("Enter the first integer: ");
        num1 = scanner.nextInt();

        // Prompt the user for the second integer
        System.out.print("Enter the second integer: ");
        num2 = scanner.nextInt();

        // Call the methods for the first number
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);

        // Call the methods for the second number
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to display twice the number
    public static void displayTwiceTheNumber(int number) {
        System.out.println("Twice the number: " + (number * 2));
    }

    // Method to display the number plus five
    public static void displayNumberPlusFive(int number) {
        System.out.println("Number plus five: " + (number + 5));
    }

    // Method to display the number squared
    public static void displayNumberSquared(int number) {
        System.out.println("Number squared: " + (number * number));
    }
}
