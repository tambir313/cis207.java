public class YummyMotto2 {
    public static void main(String[] args) {
        String motto = "Yummy makes the food that makes it a party.";
        int borderLength = motto.length() + 4; // Adding space for the border

        // Print the top border of asterisks
        for (int i = 0; i < borderLength; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line

        // Print the motto with asterisks on the sides
        System.out.println("* " + motto + " *");

        // Print the bottom border of asterisks
        for (int i = 0; i < borderLength; i++) {
            System.out.print("*");
        }
    }
}
