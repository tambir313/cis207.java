import java.util.Scanner;

public class FixDebugTwo4 {
   public static void main(String[] args) {
      double cost;
      final double TAX = 0.06; // 6% tax
      Scanner input = new Scanner(System.in);

      // Get user input for the cost of purchase
      System.out.print("Enter cost of purchase >> ");
      cost = input.nextDouble();  // Corrected to nextDouble()

      // Output the cost
      System.out.println("Cost is $" + cost);  // Corrected string concatenation

      // Output the tax percentage and the total cost
      System.out.println("With " + (TAX * 100) + "% tax,");  // Corrected tax percentage calculation
      System.out.println("   the total is $" + (cost + cost * TAX));  // Corrected println() typo
   }
}
