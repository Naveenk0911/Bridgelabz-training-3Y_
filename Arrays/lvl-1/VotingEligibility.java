import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.print("Enter the age of student " + (i + 1) + ": ");
                    int age = scanner.nextInt();
                    studentAges[i] = age;
                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number for the age.");
                    scanner.next();
                }
            }
        }
        scanner.close();
        System.out.println("\n--- Voting Eligibility Results ---");
        for (int age : studentAges) {
            if (age < 0) {
                System.out.println("Invalid age entered: " + age + ". Age cannot be a negative number.");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
    }
}
