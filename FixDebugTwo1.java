import java.util.Scanner;

public class FixDebugTwo1 {
   public static void main(String[] args) {
      int oneInt;
      double oneDouble;
      String oneString;
      Scanner input = new Scanner(System.in);
      
      // Getting the integer input
      System.out.print("Enter an integer >> ");
      oneInt = input.nextInt();  // Use nextInt() for integers

      // Getting the double input
      System.out.print("Enter a double >> ");
      oneDouble = input.nextDouble();  // Use nextDouble() for doubles

      // Consume the leftover newline character
      input.nextLine();

      // Getting the string input
      System.out.print("Enter a string >> ");
      oneString = input.nextLine();

      // Display the results
      System.out.print("The int is ");
      System.out.println(oneInt);
      System.out.print("The double is ");
      System.out.println(oneDouble);
      System.out.print("The String is ");
      System.out.println(oneString);
   }
}
