import java.util.Scanner;

public class CountSpaces2 {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Step 2: Prompt the user to enter their quote
        System.out.print("Enter your favorite quote: ");
        String quote = scanner.nextLine();
        
        // Step 3: Initialize a counter for spaces
        int spaceCount = 0;
        
        // Step 4: Loop through each character in the quote
        for (int i = 0; i < quote.length(); i++) {
            // If the character is a space, increment the counter
            if (quote.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        
        // Step 5: Display the total number of spaces
        System.out.println("The total number of spaces in your quote is: " + spaceCount);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
