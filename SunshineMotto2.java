public class SunshineMotto2 {
    public static void main(String[] args) {
        String motto = "Sunshine Seashore makes it fun in the sun.";
        int borderLength = motto.length() + 4; // 2 for spaces and 2 for extra border characters

        // Print top border
        for (int i = 0; i < borderLength; i++) {
            System.out.print("S");
        }
        System.out.println();

        // Print motto with side borders
        System.out.println("S " + motto + " S");

        // Print bottom border
        for (int i = 0; i < borderLength; i++) {
            System.out.print("S");
        }
        System.out.println();
    }
}
