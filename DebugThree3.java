import java.util.Scanner;

public class DebugThree3 {
   public static void main(String args[]) {
      String name;
      name = getName();  // Fixed the missing semicolon
      displayGreeting(name);  // Fixed the typo with 'namme' to 'name'
   }

   // Fixed return type from 'void' to 'String', fixed typos
   public static String getName() {
      String name;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter name: ");  // Fixed 'System.in.print' to 'System.out.print'
      name = input.nextLine();  // Fixed 'nexlLine()' to 'nextLine()'
      return name;  // Fixed 'namer' to 'name'
   }

   // Added the return type 'void' and fixed print statement typo
   public static void displayGreeting(String name) {
      System.out.println("Hello, " + name + "!");  // Fixed 'System.outprintln' to 'System.out.println'
   }
}
