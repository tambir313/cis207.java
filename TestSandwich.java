import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        // Create Scanner object to get input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt user for sandwich details
        System.out.print("Enter the type of bread: ");
        String breadType = scanner.nextLine();

        System.out.print("Enter the sandwich filling: ");
        String filling = scanner.nextLine();

        System.out.print("Enter the topping: ");
        String topping = scanner.nextLine();

        // Create Sandwich object using the input from the user
        Sandwich sandwich = new Sandwich(breadType, filling, topping);

        // Display the sandwich details
        s
