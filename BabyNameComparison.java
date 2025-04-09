import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for three first names
        System.out.print("Enter the first name: ");
        String name1 = scanner.nextLine();
        
        System.out.print("Enter the second name: ");
        String name2 = scanner.nextLine();
        
        System.out.print("Enter the third name: ");
        String name3 = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Generate all possible two-name combinations
        System.out.println("\nPossible two-name combinations are:");
        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);
        System.out.println(name2 + " " + name1);
        System.out.println(name2 + " " + name3);
        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);
    }
}
