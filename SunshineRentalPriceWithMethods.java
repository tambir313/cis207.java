import java.util.Scanner;

public class SunshineRentalPriceWithMethods {

    public static void main(String[] args) {
        // First executable statement: Get the rental time in minutes
        int rentalTime = getRentalTime();
        
        // Second executable statement: Display company motto with border
        displayCompanyMotto();
        
        // Third executable statement: Compute rental details and display price
        computeAndDisplayRentalPrice(rentalTime);
    }

    // Method to prompt the user for the rental time in minutes and return the value
    public static int getRentalTime() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rental time in minutes: ");
        return input.nextInt();
    }

    // Method to display the company motto with a border
    public static void displayCompanyMotto() {
        String motto = "Sunshine Seashore Supplies - Your beach rental experts!";
        String border = "*".repeat(motto.length());
        
        System.out.println(border);
        System.out.println(motto);
        System.out.println(border);
    }

    // Method to compute rental details and display the price
    public static void computeAndDisplayRentalPrice(int rentalTime) {
        // Calculate hours and extra minutes
        int hours = rentalTime / 60;
        int extraMinutes = rentalTime % 60;
        
        // Assume the price is $10 per hour
        double pricePerHour = 10.00;
        double totalPrice = hours * pricePerHour + (extraMinutes > 0 ? pricePerHour : 0);
        
        // Display the rental details
        System.out.println("Rental time: " + hours + " hour(s) and " + extraMinutes + " minute(s).");
        System.out.println("The rental price is: $" + totalPrice);
    }
}
