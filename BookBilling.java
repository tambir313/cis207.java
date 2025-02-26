import java.util.Scanner;

public class BookBilling {

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for quantity and coupon
        int quantity;
        double couponValue;

        // Prompt the user for the quantity of books ordered
        System.out.print("Enter the quantity of photo books ordered: ");
        quantity = scanner.nextInt();

        // Prompt the user for the coupon value
        System.out.print("Enter the coupon value (0 if none): ");
        couponValue = scanner.nextDouble();

        // Call the overloaded computeBill methods and display the results
        System.out.println("\nTotal with no parameters: $" + computeBill());
        System.out.println("Total for " + quantity + " books: $" + computeBill(quantity));
        System.out.println("Total with coupon: $" + computeBill(quantity, couponValue));

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method with no parameters to compute the price of one book with tax
    public static double computeBill() {
        double pricePerBook = 14.99;
        double taxRate = 0.08;
        double total = pricePerBook + (pricePerBook * taxRate);
        return total;
    }

    // Method with one parameter (quantity ordered) to compute the total price with tax
    public static double computeBill(int quantity) {
        double pricePerBook = 14.99;
        double taxRate = 0.08;
        double total = (pricePerBook * quantity) + ((pricePerBook * quantity) * taxRate);
        return total;
    }

    // Method with two parameters (quantity ordered and coupon value) to compute the total price with tax
    public static double computeBill(int quantity, double couponValue) {
        double pricePerBook = 14.99;
        double taxRate = 0.08;
        double subtotal = pricePerBook * quantity;
        double discount = subtotal - couponValue; // Apply coupon discount
        double total = discount + (discount * taxRate); // Add tax to the discounted total
        return total;
    }
}
