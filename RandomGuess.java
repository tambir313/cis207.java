import javax.swing.JOptionPane;  // Step 1: Import JOptionPane for pop-up messages

public class RandomGuess {  // Step 2: This is the name of the program
    public static void main(String[] args) {  // Step 3: The main part of the program that runs first

        // Step 4: Ask the user to think of a number between 1 and 10
        JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10.");

        // Step 5: Generate a random number between 1 and 10
        int randomNumber = 1 + (int)(Math.random() * 10);  // Math.random() gives a random number between 0 and 1, and we adjust it to be between 1 and 10

        // Step 6: Show the random number in a message box
        JOptionPane.showMessageDialog(null, "The number is: " + randomNumber);
    }
}

    
    
    
    

