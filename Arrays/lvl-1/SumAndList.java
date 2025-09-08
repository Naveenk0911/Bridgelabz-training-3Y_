import java.util.Scanner;

public class SumAndList {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Define a double array with a maximum size of 10.
        double[] numbers = new double[10];

        // A variable to keep track of the number of valid entries.
        int index = 0;

        // A variable to store the total sum of the numbers.
        double total = 0.0;

        System.out.println("Enter up to 10 positive numbers. Enter 0 or a negative number to stop.");

        // Use an infinite loop to get user input until a break condition is met.
        while (true) {
            // Check if the array is full.
            if (index >= numbers.length) {
                System.out.println("Maximum number of entries reached.");
                break;
            }

            try {
                // Prompt the user for a number.
                System.out.print("Enter number " + (index + 1) + ": ");
                double number = scanner.nextDouble();

                // Check for the loop termination condition (0 or a negative number).
                if (number <= 0) {
                    System.out.println("A non-positive number was entered. Stopping input.");
                    break;
                }

                // If the number is valid, store it in the array.
                numbers[index] = number;
                index++;
            } catch (java.util.InputMismatchException e) {
                // Handle cases where the input is not a valid number.
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input from the scanner buffer.
            }
        }

        // Close the scanner to prevent resource leaks.
        scanner.close();

        System.out.println("\n--- Results ---");
        // Display all the numbers that were entered.
        System.out.print("The numbers entered are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + (i == index - 1 ? "" : ", "));
            // Add the number to the total.
            total += numbers[i];
        }
        System.out.println(); // Print a new line for cleaner output.

        // Display the total sum.
        System.out.println("The sum of all numbers is: " + total);
    }
}
