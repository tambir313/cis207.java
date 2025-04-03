import java.util.Scanner;

public class FixDebugSix4 {
    public static void main(String[] args) {
        int high, low;
        int howManyBetween;
        double half, midPoint;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number >> ");
        low = input.nextInt();  // Corrected typo
        
        System.out.print("Enter a larger number >> ");
        high = input.nextInt();

        // Ensure the high number is actually greater than the low number
        while(low >= high) {
            System.out.println("The number you entered for a high number, " +
                high + ", is not more than " + low);
            System.out.print("Enter a number higher than " + low + " >> ");
            high = input.nextInt();
        }
        
        howManyBetween = high - low;  // Calculate the difference
        half = howManyBetween / 2.0;  // Ensure the division is a floating-point division
        midPoint = low + half;  // Calculate the midpoint
        
        System.out.println(midPoint + " is halfway between " + low + " and " + high);
    }
}
