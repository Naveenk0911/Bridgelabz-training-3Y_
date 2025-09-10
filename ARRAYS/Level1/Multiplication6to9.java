package ARRAYS.Level1;
import java.util.Scanner;

public class Multiplication6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] results = new int[4 * 10]; // 4 numbers × 10 results each
        int index = 0;

        for (int number = 6; number <= 9; number++) {
            for (int i = 1; i <= 10; i++) {
                results[index++] = number * i;
                System.out.println(number + " * " + i + " = " + (number * i));
            }
            System.out.println();
        }

        sc.close();
    }
}