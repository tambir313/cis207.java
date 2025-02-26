import java.util.Scanner;

public class MadLibWithMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask the user for inputs
        System.out.print("Enter the name of an animal: ");
        String animal = input.nextLine();
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        input.nextLine(); // Consume the newline character left by nextInt()
        
        System.out.print("Enter a direction (e.g., north, south, east, west): ");
        String direction = input.nextLine();
        
        // Call the method to display the Mad Lib
        displayStory(animal, number, direction);
    }

    // Method to display the story with the user-provided words
    public static void displayStory(String animal, int number, String direction) {
        // Print the short story/nursery rhyme with the inserted words
        System.out.println("\nHere is your Mad Lib story:");
        System.out.println("Hickory Dickory Dock,");
        System.out.println("The " + animal + " ran up the clock.");
        System.out.println("The clock struck " + number + ",");
        System.out.println("The " + animal + " ran " + direction + ".");
        System.out.println("Hickory Dickory Dock.");
    }
}
