public // Name: Tambir Ahmed
// A Number: A01180474

import java.util.Scanner;

public class ArrayMethodDemo {

    public static void main(String[] args) {
        final int SIZE = 10;
        int[] numbers = new int[SIZE];
        Scanner input = new Scanner(System.in);

        // Prompt user to enter 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Call the methods
        displayAll(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan12(numbers);
        displayAboveAverage(numbers);
    }

    // Method 1: Display all integers
    public static void displayAll(int[] array) {
        System.out.print("\nAll integers: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method 2: Display integers in reverse order
    public static void displayReverse(int[] array) {
        System.out.print("\nIntegers in reverse order: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method 3: Display sum of integers
    public static void displaySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("\nSum of integers: " + sum);
    }

    // Method 4: Display all values less than 12
    public static void displayLessThan12(int[] array) {
        boolean found = false;
        System.out.print("\nValues less than 12: ");
        for (int num : array) {
            if (num < 12) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    // Method 5: Display values greater than average
    public static void displayAboveAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;
        System.out.println("\nAverage value: " + average);
        System.out.print("Values above average: ");
        boolean found = false;
        for (int num : array) {
            if (num > average) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }
}
 {
    
}
