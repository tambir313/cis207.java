import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        // Declare constants for prices
        final double DOZEN_COST = 3.25;
        final double SINGLE_EGG_COST = 0.45;
        final int EGGS_IN_DOZEN = 12;

        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of eggs they want to buy
        System.out.print("Enter the number of eggs you want to order: ");
        int totalEggs = scanner.nextInt();

        // Calculate the number of dozens and loose eggs
        int dozens = totalEggs / EGGS_IN_DOZEN;  // Calculate how many dozens
        int looseEggs = totalEggs % EGGS_IN_DOZEN;  // Calculate the remaining loose eggs

        // Calculate the cost of dozens and loose eggs
        double totalCost = (dozens * DOZEN_COST) + (looseEggs * SINGLE_EGG_COST);

        // Display the result with explanation
        System.out.printf("You ordered %d eggs. ", totalEggs);
        if (dozens > 0) {
            System.out.printf("That’s %d dozen at $%.2f per dozen", dozens, DOZEN_COST);
            if (looseEggs > 0) {
                System.out.printf(" and ");
            }
        }
        if (looseEggs > 0) {
            System.out.printf("%d loose egg%s at $%.2f each", looseEggs, looseEggs > 1 ? "s" : "", SINGLE_EGG_COST);
        }
        System.out.printf(" for a total of $%.2f.%n", totalCost);

        // Close the scanner
        scanner.close();
    }
}

