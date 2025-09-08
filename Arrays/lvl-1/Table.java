import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Array to store results for 6, 7, 8, 9
        int[] multiplicationResult = new int[4];
        
        // Loop to calculate multiplication
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }
        
        // Display result
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
        
        sc.close();
    }
}
