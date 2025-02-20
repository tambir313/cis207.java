import java.util.Scanner;

public class FixDebugTwo2 {
   public static void main(String[] args) {
      int a, b;
      Scanner input = new Scanner(System.in);
      
      // Get user input for two integers
      System.out.print("Enter an integer >> ");
      a = input.nextInt();  // Use input.nextInt() to read an integer
      
      System.out.print("Enter another integer >> ");
      b = input.nextInt();  // Use input.nextInt() to read another integer
      
      // Output the results of arithmetic operations
      System.out.println("The sum is " + (a + b));
      System.out.println("The difference is " + (a - b));
      System.out.println("The product is " + (a * b));
   }
}
