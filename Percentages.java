import java.util.Scanner;

public class Percentages {
    
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare two double variables
        double num1, num2;

        // Prompt the user for the first double
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        // Prompt the user for the second double
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        // Call computePercent() with num1 and num2
        computePercent(num1, num2);

        // Call computePercent() with num2 and num1 (reverse order)
        computePercent(num2, num1);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to compute and display the percentage
    public static void computePercent(double firstNum, double secondNum) {
        // Compute the percentage and display the result
        double percent = (firstNum / secondNum) * 100;
        System.out.println(firstNum + " is " + percent + " percent of " + secondNum);
    }
}
