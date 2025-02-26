import java.util.Scanner;

public class DebugThree4 {
   public static void main(String args[]) {
      int credits1;
      int credits2;
      final double RATE = 75.84;
      Scanner input = new Scanner(System.in);
      
      // Fixed the typo in 'input'
      System.out.print("Enter credits for first student >> ");
      credits1 = input.nextInt();
      
      // Fixed the missing quote in the string
      System.out.print("Enter credits for second student >> ");
      credits2 = input.nextInt();
      
      // Ensure that both method calls pass the correct number of arguments
      computeTuitionBill(credits1, RATE, 1);
      computeTuitionBill(credits2, RATE, 2); // Added the third parameter (student number)
   }

   // Fixed the extra parenthesis and adjusted for correct calculation
   public static void computeTuitionBill(int c, double r, int student) {
      System.out.println("Total due for student #" + student +
         " is $" + (r * c));  // Corrected the parenthesis
   }
}
