import java.util.Scanner;

public class FixDebugSix1 {
   public static void main(String args[]) {
      Scanner keyboard = new Scanner(System.in);
      int days;
      double money = 0.01;
      int day = 1;
      
      System.out.print("Enter number of days >> ");
      days = keyboard.nextInt();

      // Corrected loop condition
      while (day <= days) {
         money = 2 * money; // Double the money
         System.out.println("After day " + day + " you have " + money);
         ++day; // Increment day
      }
   }
}
