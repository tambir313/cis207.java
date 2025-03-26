import java.util.Scanner;

public class EvenOdd {
    
    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0; // Returns true if the number is even
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        
        System.out.print("Please enter an integer: "); // Prompt the user for input
        int userInput = scanner.nextInt(); // Read the integer input
        
        // Call the isEven method and store the result
        boolean even = isEven(userInput);
        
        // Display the result
        if (even) {
            System.out.println(userInput + " is even.");
        } else {
            System.out.println(userInput + " is odd.");
        }
        
        scanner.close(); // Close the scanner
    }
}