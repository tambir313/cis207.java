public class MileConversions {
    public static void main(String[] args) {
        // Declare constants for the number of inches, feet, and yards in a mile
        final int INCHES_IN_MILE = 63360;
        final int FEET_IN_MILE = 5280;
        final int YARDS_IN_MILE = 1760;

        // Declare a variable to represent the number of miles and assign a value
        int miles = 3;  // You can change this value as needed

        // Compute the equivalent distance in inches, feet, and yards
        int inches = miles * INCHES_IN_MILE;
        int feet = miles * FEET_IN_MILE;
        int yards = miles * YARDS_IN_MILE;

        // Display the results
        System.out.println(miles + " miles is equal to:");
        System.out.println(inches + " inches.");
        System.out.println(feet + " feet.");
        System.out.println(yards + " yards.");
    }
}
