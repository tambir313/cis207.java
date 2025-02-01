public class Triangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle
        
        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" "); // Space
            }
            // Print 't' characters
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("t"); // 't' character
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
