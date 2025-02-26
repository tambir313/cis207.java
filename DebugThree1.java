import java.util.Scanner;

public class DebugThree1 {
    public static void main(String[] args) {
        double check1;
        double check2;
        Scanner input = new Scanner(System.in);

        // Read input for both checks as double (for decimal support)
        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble();

        // Ensure the check amount is positive
        while (check1 < 0) {
            System.out.println("Please enter a valid positive amount for the check.");
            check1 = input.nextDouble();
        }

        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble();

        // Ensure the check amount is positive
        while (check2 < 0) {
            System.out.println("Please enter a valid positive amount for your friend's check.");
            check2 = input.nextDouble();
        }

        // Call calcTip method with the check amounts
        calcTip(check1);
        calcTip(check2);
    }

    // Modified calcTip method that takes a bill amount as parameter
    public static void calcTip(double bill) {
        final double RATE = 0.15;  // Fixed the typo in 'double'
        double tip = bill * RATE;  // Calculating tip

        // Output the calculated tip with two decimal places
        System.out.printf("The tip should be at least $%.2f%n", tip);
    }
}
