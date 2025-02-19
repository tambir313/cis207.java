import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        // Declare constants for the prices of meals
        final double ADULT_MEAL_PRICE = 7.00;
        final double CHILD_MEAL_PRICE = 4.00;

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get the number of adult meals and child meals from the user
        System.out.print("Enter the number of adult meals ordered: ");
        int adultMeals = scanner.nextInt();

        System.out.print("Enter the number of child meals ordered: ");
        int childMeals = scanner.nextInt();

        // Calculate the total money collected for adult meals, child meals, and all meals
        double totalAdultMoney = adultMeals * ADULT_MEAL_PRICE;
        double totalChildMoney = childMeals * CHILD_MEAL_PRICE;
        double totalMoney = totalAdultMoney + totalChildMoney;

        // Display the total money collected for adult meals, child meals, and all meals
        System.out.printf("Total money collected for adult meals: $%.2f%n", totalAdultMoney);
        System.out.printf("Total money collected for child meals: $%.2f%n", totalChildMoney);
        System.out.printf("Total money collected for all meals: $%.2f%n", totalMoney);

        // Close the scanner
        scanner.close();
    }
}
