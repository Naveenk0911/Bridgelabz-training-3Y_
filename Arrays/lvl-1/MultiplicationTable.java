import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.print("Enter an integer to create its multiplication table: ");
                number = scanner.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        }
        int[] multiplicationResults = new int[10];
        System.out.println("\n--- Multiplication Table for " + number + " ---");
        for (int i = 1; i <= 10; i++) {
            multiplicationResults[i - 1] = number * i;
        }
        for (int i = 0; i < multiplicationResults.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResults[i]);
        }
        scanner.close();
    }
}
