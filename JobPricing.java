import java.util.Scanner;

public class JobPricing {

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String jobName;
        double materialCost;
        int workHours;
        int travelHours;

        // Prompt the user for the job name
        System.out.print("Enter the job name: ");
        jobName = scanner.nextLine();

        // Prompt the user for the cost of materials
        System.out.print("Enter the cost of materials: $");
        materialCost = scanner.nextDouble();

        // Prompt the user for the number of work hours
        System.out.print("Enter the number of hours of work required: ");
        workHours = scanner.nextInt();

        // Prompt the user for the number of travel hours
        System.out.print("Enter the number of hours of travel time: ");
        travelHours = scanner.nextInt();

        // Call the method to compute the estimate for the job
        double estimatedPrice = computeEstimate(materialCost, workHours, travelHours);

        // Display the job name and the estimated price
        System.out.println("The estimated price for the job '" + jobName + "' is: $" + estimatedPrice);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to compute the job estimate
    public static double computeEstimate(double materialCost, int workHours, int travelHours) {
        // Constants for the pricing structure
        final double WORK_HOUR_COST = 35;  // Cost per work hour
        final double TRAVEL_HOUR_COST = 12; // Cost per travel hour

        // Calculate the total cost: materials + work hours cost + travel hours cost
        double totalCost = materialCost + (workHours * WORK_HOUR_COST) + (travelHours * TRAVEL_HOUR_COST);
        
        return totalCost;
    }
}
