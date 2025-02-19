import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        // Declare constants for prices and production costs
        final double ADULT_MEAL_PRICE = 7.00;
        final double CHILD_MEAL_PRICE = 4.00;
        final double ADULT_MEAL_COST = 4.35;
        final double CHILD_MEAL_COST = 3.10;

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

        // Calculate the total cost to produce adult and child meals
        double totalAdultCost = adultMeals * ADULT_MEAL_COST;
        double totalChildCost = childMeals * CHILD_MEAL_COST;
        double totalCost = totalAdultCost + totalChildCost;

        // Calculate the total profit for adult meals, child meals, and all meals
        double totalAdultProfit = totalAdultMoney - totalAdultCost;
        double totalChildProfit = totalChildMoney - totalChildCost;
        double totalProfit = totalAdultProfit + totalChildProfit;

        // Display the total money collected, total cost, and total profit
        System.out.printf("Total money collected for adult meals: $%.2f%n", totalAdultMoney);
        System.out.printf("Total money collected for child meals: $%.2f%n", totalChildMoney);
        System.out.printf("Total money collected for all meals: $%.2f%n", totalMoney);
        
        System.out.printf("Total cost to produce adult meals: $%.2f%n", totalAdultCost);
        System.out.printf("Total cost to produce child meals: $%.2f%n", totalChildCost);
        System.out.printf("Total cost to produce all meals: $%.2f%n", totalCost);
        
        System.out.printf("Total profit from adult meals: $%.2f%n", totalAdultProfit);
        System.out.printf("Total profit from child meals: $%.2f%n", totalChildProfit);
        System.out.printf("Total profit from all meals: $%.2f%n", totalProfit);

        // Close the scanner
        scanner.close();
    }
}
