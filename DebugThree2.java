import java.util.Scanner;

public class DebugThree2 {
    public static void main(String args[]) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        
        // Read the input values into variables a, b, and c
        System.out.print("Enter an integer >> ");
        a = input.nextInt();
        
        System.out.print("Enter a second integer >> ");
        b = input.nextInt();
        
        System.out.print("Enter a third integer >> ");
        c = input.nextInt();
        
        // Call add and subtract methods with correct variable names
        add(a, b);
        add(b, c);
        add(a, c);
        
        subtract(a, b);
        subtract(b, c);
        subtract(a, c);  
    }

    // Corrected add method with proper output and return type
    public static void add(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
    }

    // Corrected subtract method with proper output
    public static void subtract(int a, int b) {
        System.out.println("The difference between " + a + " and " + b + " is " + (a - b));
    }
}
