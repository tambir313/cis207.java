public class InchesToFeet {
    public static void main(String[] args) {
        // Declare a constant for the number of inches in one foot
        final int INCHES_IN_FOOT = 12;

        // Declare a variable for the number of inches and assign a value
        int inches = 86; // You can change this value to any number of inches
        
        // Compute the number of feet and the remaining inches
        int feet = inches / INCHES_IN_FOOT;  // Integer division to get full feet
        int remainingInches = inches % INCHES_IN_FOOT;  // Modulus to get the remaining inches

        // Display the result in the format "X feet and Y inches"
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
    }
}
