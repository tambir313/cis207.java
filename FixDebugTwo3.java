import java.util.Scanner;

public class FixDebugTwo3 {
   public static void main(String[] args) {
      int a, b;
      int result, remainder;
      Scanner input = new Scanner(System.in);

      // Get user input for two integers
      System.out.print("Enter an integer >> ");
      a = input.nextInt();  // Use nextInt() with parentheses

      System.out.print("Enter another integer >> ");
      b = input.nextInt();  // Use nextInt() with parentheses

      // Calculate the quotient and remainder
      result = a / b;  // Division result (quotient)
      remainder = a % b;  // Modulus result (remainder)

      // Output the results
      System.out.println("Divide " + a + " by " + b);
      System.out.println("Result is " + result);  // Added missing semicolon
      System.out.println("Remainder is " + remainder);
   }
}
