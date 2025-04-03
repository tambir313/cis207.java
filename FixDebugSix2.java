import java.util.Scanner;

public class FixDebugSix2 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        char letter;
        int a;
        final int min;
        final int MAX = 122;
        final int NUMBERLINE = 20;
        int lines = 0;  // Set to 0, since you will increment after each letter is printed.
        
        System.out.println("Enter a Unicode value to start.");
        System.out.print("For example, A is 65 >> ");
        min = keyboard.nextInt();
        
        for (a = min; a <= MAX; a++) {
            letter = (char) a;
            System.out.print("  " + letter);
            
            lines++;  // Increment after each character
            
            if (lines == NUMBERLINE) {
                lines = 0;  // Reset the line count
                System.out.println();  // Print a new line
            }
        }
        
        System.out.println("\nEnd of application");
    }
}

