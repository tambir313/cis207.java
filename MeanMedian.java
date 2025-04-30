// Tambir Ahmed
// A01180474

import java.util.Scanner;
import java.util.Arrays; // Needed to sort the array

public class MeanMedian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store 9 integers
        int[] numbers = new int[9];

        // Prompt the user to enter 9 integers
        System.out.println("Enter 9 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Display the values entered
        System.out.println("\nYou entered:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Calculate and display the mean (average)
        double mean = calculateMean(numbers);
        System.out.printf("\n\nMean (average): %.2f\n", mean);

        // Calculate and display the median (middle value)
        int median = calculateMedian(numbers);
        System.out.println("Median (middle value): " + median);

        input.close();
    }

    // Method to calculate the mean
    public static double calculateMean(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    // Method to calculate the median
    public static int calculateMedian(int[] arr) {
        Arrays.sort(arr); // Sort the array first
        return arr[arr.length / 2]; // Return the middle element (since it's 9 elements, index 4)
    }
}
