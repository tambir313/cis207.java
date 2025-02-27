import java.util.Scanner;

public class YummyEventPriceWithMethods {

    public static void main(String[] args) {
        // First executable statement: Get the number of guests
        int numberOfGuests = getNumberOfGuests();
        
        // Second executable statement: Display company motto with border
        displayCompanyMotto();
        
        // Third executable statement: Compute and display the price of the event
        computeAndDisplayPrice(numberOfGuests);
    }

    // Method to prompt the user for the number of guests and return the value
    public static int getNumberOfGuests() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of guests: ");
        return input.nextInt();
    }

    // Method to display the company motto with a border
    public static void displayCompanyMotto() {
        String motto = "Yummy Catering - We cater to your special events!";
        String border = "*".repeat(motto.length());
        
        System.out.println(border);
        System.out.println(motto);
        System.out.println(border);
    }

    // Method to compute the price based on the number of guests and display the result
    public static void computeAndDisplayPrice(int guests) {
        double pricePerGuest = 20.00; // Example price per guest
        double totalPrice = guests * pricePerGuest;
        
        System.out.println("The total price for the event is: $" + totalPrice);
        
        // Determine if the event is large (more than 50 guests)
        if (guests > 50) {
            System.out.println("This is a large event.");
        } else {
            System.out.println("This is not a large event.");
        }
    }
}
