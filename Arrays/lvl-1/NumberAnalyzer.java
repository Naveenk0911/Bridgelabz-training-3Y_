import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                    System.out.print("Enter number " + (i + 1) + ": ");
                    numbers[i] = scanner.nextInt();
                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); 
                }
            }
        }
        System.out.println("\n--- Analysis of Numbers ---");
        for (int number : numbers) {
            if (number > 0) {
                System.out.print("The number " + number + " is positive and ");
                if (number % 2 == 0) {
                    System.out.println("is even.");
                } else {
                    System.out.println("is odd.");
                }
            } else if (number < 0) {
                System.out.println("The number " + number + " is negative.");
            } else {
                System.out.println("The number " + number + " is zero.");
            }
        }
        System.out.println("\n--- Comparing First and Last Elements ---");
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];

        System.out.print("The first number (" + firstElement + ") is ");
        if (firstElement == lastElement) {
            System.out.println("equal to the last number (" + lastElement + ").");
        } else if (firstElement > lastElement) {
            System.out.println("greater than the last number (" + lastElement + ").");
        } else {
            System.out.println("less than the last number (" + lastElement + ").");
        }
        scanner.close();
    }
}
