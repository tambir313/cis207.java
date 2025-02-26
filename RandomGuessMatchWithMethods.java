import java.util.Scanner;

public class RandomGuessMatchWithMethods {
    public static void main(String[] args) {
        // Declare final constants for MIN and MAX values
        final int MIN = 1;
        final int MAX = 100;
        
        // Generate a random number between MIN and MAX
        int randomNumber = MIN + (int)(Math.random() * (MAX - MIN + 1));
        
        // Call method to ask the user for their guess and return it
        int userGuess = getUserGuess(MIN, MAX);
        
        // Check if the user's guess is correct
        boolean isGuessCorrect = (userGuess == randomNumber);
        
        // Call method to display the random number, user's guess, and the difference
        displayResults(randomNumber, userGuess, isGuessCorrect);
    }

    // Method to ask the user for their guess
    public static int getUserGuess(int min, int max) {
        Scanner input = new Scanner(System.in);
        
        // Ask the user to guess a value between min and max
        System.out.print("Guess a number between " + min + " and " + max + ": ");
        int guess = input.nextInt();
        
        return guess;
    }

    // Method to display the results
    public static void displayResults(int randomNumber, int userGuess, boolean isGuessCorrect) {
        // Display the random number, the user's guess, and whether they guessed correctly
        System.out.println("The random number was: " + randomNumber);
        System.out.println("Your guess was: " + userGuess);
        
        // Check if the guess was correct or not
        if (isGuessCorrect) {
            System.out.println("Congratulations! You guessed correctly!");
        } else {
            // Calculate how far the guess was from the random number
            int difference = Math.abs(randomNumber - userGuess);
            System.out.println("Your guess was off by: " + difference);
        }
    }
}
